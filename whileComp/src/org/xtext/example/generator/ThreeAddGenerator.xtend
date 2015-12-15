/*
 * generated by Xtext
 */
package org.xtext.example.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.xtext.example.whileCpp.Command
import org.xtext.example.whileCpp.CommandForEach
import org.xtext.example.whileCpp.CommandIf
import org.xtext.example.whileCpp.CommandWhile
import org.xtext.example.whileCpp.Commands
import org.xtext.example.whileCpp.Definition
import org.xtext.example.whileCpp.Expr
import org.xtext.example.whileCpp.ExprAnd
import org.xtext.example.whileCpp.ExprEq
import org.xtext.example.whileCpp.ExprNot
import org.xtext.example.whileCpp.ExprOr
import org.xtext.example.whileCpp.ExprSimple
import org.xtext.example.whileCpp.Exprs
import org.xtext.example.whileCpp.Function
import org.xtext.example.whileCpp.Input
import org.xtext.example.whileCpp.Output
import org.xtext.example.whileCpp.Program
import org.xtext.example.whileCpp.Vars
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.xtext.example.WhileCppStandaloneSetup
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil
import java.io.FileWriter
import java.io.BufferedWriter
import SymboleTable.Fonction
import SymboleTable.Variable
import SymboleTable.FunDictionary
import java.util.Set
import java.util.List
import SymboleTable.Quadruplet

/**
 * Generates code from your model files on save.
 * 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ThreeAddGenerator implements IGenerator {
	
	FunDictionary dico = new FunDictionary();
	 
	def public List<String> getFunctionsNames()
	{
		return dico.listFuncName.toList
	}
	
	def public List<Fonction> getFunctions()
	{
		return dico.functions
	}
	
	def public void resetDico()
	{
		dico = new FunDictionary();
	}
	
	
	def public Set<String> getVariables(int fn)
	{
		return dico.functions.get(fn).listVarName.toSet
	} 

	
	def public String print3a(){
		var res = ""
		for(Fonction f : dico.functions){
			for(Quadruplet q : f.m_quadList){
				res +=(q.toString()+"\n");
			}
		}
		return res
	}	
	
	def public void generate(String in, FunDictionary tab3A)
	{
		//TODO
		resetDico
		val injector = new WhileCppStandaloneSetup().createInjectorAndDoEMFRegistration();
		val resourceSet = injector.getInstance(XtextResourceSet);
		val uri = URI.createURI(in);
		val xtextResource = resourceSet.getResource(uri, true);
		EcoreUtil.resolveAll(xtextResource);
		
		try{
  			/* val fstream = new FileWriter(out)
  			val buff = new BufferedWriter(fstream)
  			for(p: xtextResource.allContents.toIterable.filter(Program))
				buff.write(print3a())
  			buff.close() */
  		}catch (Exception e){
  			//println("Can't write " + out + " - Error: " + e.getMessage())
  		}
		
	}
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		
        resetDico
		for(p: resource.allContents.toIterable.filter(Program)) {
			fsa.generateFile("PP.3a", p.compile())
			}
		print(dico.toString())
	}

	def compile (Program p)
'''«FOR f: p.fonctions»
«f.compile()»
«ENDFOR»
«print3a()»'''
	
	

	
	def compile (Function f)
'''«var newF = new Fonction(f.nom,f.definition.inputs.varIn.size,f.definition.outputs.varOut.size,"nomFonctionCible")»
«IF dico.putFunction(newF)»
«f.definition.compile(newF)»
«ELSE » ERREUR: FONCTION «f.nom » DÉJÀ DÉCLARÉE
«ENDIF»
'''
	
	def compile (Definition d, Fonction f)
	'''«d.inputs.compile(f)»
«d.commandes.compile(f)»
«d.outputs.compile(f)»'''
	
	def compile (Input i, Fonction f)
	'''«FOR in : i.varIn»«f.add(new Variable(in, "input"))»«IF i.varIn.indexOf(in)!=i.varIn.size-1»«ENDIF»«ENDFOR»'''
	
	def compile (Commands c, Fonction f)
	'''«IF c != null»«FOR cm: c.commande»«IF cm != null»«cm.compile(f)»«ENDIF»«ENDFOR»«ELSE»_«ENDIF»'''
		
	def compile (Output o, Fonction f)
	'''«FOR in : o.varOut»«ENDFOR»'''
	
	def compile(Command c, Fonction f)
'''«switch (c){
	case c.nop!=null : f.addQuad(new Quadruplet("nop","_","_","_"))
	case c.cmdIf!=null : f.addQuad(new Quadruplet("If",c.cmdIf.cmdsThen.compile(f).toString,c.cmdIf.cmdsElse.compile(f).toString,c.cmdIf.cond.compile().toString))
	case c.cmdForEach!=null : c.cmdForEach.compile(f)
	case c.vars!=null && c.exprs!=null : "< := , " + c.vars.compile(f) + ", " + c.exprs.compile() + ",_>"
	case c.cmdWhile!=null : c.cmdWhile.compile(f)
	default : c.class.name
}
»'''



	
	def compile(CommandWhile c, Fonction f)
'''«c.expr.compile()»«c.cmds.compile(f)»
'''
	
	def compile(CommandIf c, Fonction f)
'''«c.cond.compile()» 
«c.cmdsThen.compile(f)»
«c.cmdsElse.compile(f)»'''
	
	def compile(CommandForEach c, Fonction f)
'''«c.elem.compile()»«c.ensemb.compile()»	
«c.cmds.compile(f)»'''
	
	//ajouter la variable dans sa fonction
	def compile(Vars v, Fonction f)
	//TODO Késako Variable intern ????? (Alex)
'''«IF v.eContents.empty»«FOR in : v.varGen»«var vari = new Variable (in.toString, "intern")»«dico.putVariable(vari, f)»«vari.getM_name»«ENDFOR»«ELSE»_«ENDIF»'''
	
	def compile(Exprs e)
'''«FOR in : e.expGen»«in.compile()»«ENDFOR»'''
	
	def compile (Expr ex)
'''«switch(ex){
			case ex.exprSimp!=null : ex.exprSimp.compile()
			case ex.exprAnd!=null : ex.exprAnd.compile()
	    }
	 »'''
	
	def compile (ExprSimple ex)
	 '''«switch(ex){
	 	case ex.nil!=null : "nil"
	 	case ex.vari!=null : ex.vari
	 	case ex.symb!=null : ex.symb
	 	case ex.exprCons!=null :  dico.getFunctions.get(0).addQuad(new Quadruplet("cons", ex.exprCons.exprConsAtt1.compile().toString ,ex.exprCons.exprConsAttList.consList.toString() ," ")) 	 	//case ex.exprList!=null : "(list "+ ex.exprListAtt1.compile(0) + " " + ex.exprListAtt2.compile(0) + ")"
	 	case ex.exprHead!=null : "<hd ,"+ ex.exprHeadAtt.compile() + ">"
	 	case ex.exprTail!=null : "<tl ," + ex.exprTailAtt.compile() +">"
	 	case ex.nomSymb!=null : ""//"(" + ex.nomSymb + ex.symbAtt.compile(0) + ")"
	 }
	 »'''
	
	
	def consListRec(List<Expr> l)'''
	 «IF l.size == 1»«l.head.compile()
	 »«ELSE»«
	 		"<cons " + l.head.compile() + " " + consListRec((l.tail.toList)) + ">"»«
	 ENDIF»'''
	
	def compile (ExprAnd ex)
	'''«ex.exprOr.compile()»«IF ex.exprAnd!=null»«ex.exprAndAtt.compile()»«ENDIF»'''
	
	def compile (ExprOr ex)
	'''«ex.exprNot.compile()»«IF ex.exprOr!=null»«ex.exprOrAtt.compile()»«ENDIF»'''
	
	def compile (ExprNot ex)
	'''«IF ex.not!=null»«ENDIF»«ex.exprEq.compile()»'''
	
	def compile (ExprEq ex)
	'''«IF ex.expr!=null»(«ex.expr.compile()»)«ELSE»«ex.exprSim1.compile()»«ex.exprSim2.compile()»«ENDIF»'''
}

