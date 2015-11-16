/*
 * generated by Xtext
 */
grammar InternalWhileCpp;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.example.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.services.WhileCppGrammarAccess;

}

@parser::members {

 	private WhileCppGrammarAccess grammarAccess;
 	
    public InternalWhileCppParser(TokenStream input, WhileCppGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Program";	
   	}
   	
   	@Override
   	protected WhileCppGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	 iv_ruleProgram=ruleProgram 
	 { $current=$iv_ruleProgram.current; } 
	 EOF 
;

// Rule Program
ruleProgram returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getProgramAccess().getFonctionsFunctionParserRuleCall_0()); 
	    }
		lv_fonctions_0_0=ruleFunction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProgramRule());
	        }
       		add(
       			$current, 
       			"fonctions",
        		lv_fonctions_0_0, 
        		"Function");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleFunction
entryRuleFunction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFunctionRule()); }
	 iv_ruleFunction=ruleFunction 
	 { $current=$iv_ruleFunction.current; } 
	 EOF 
;

// Rule Function
ruleFunction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='function' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
    }
(
(
		lv_nom_1_0=RULE_SYMBOL
		{
			newLeafNode(lv_nom_1_0, grammarAccess.getFunctionAccess().getNomSYMBOLTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"nom",
        		lv_nom_1_0, 
        		"SYMBOL");
	    }

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionAccess().getDefinitionDefinitionParserRuleCall_3_0()); 
	    }
		lv_definition_3_0=ruleDefinition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionRule());
	        }
       		set(
       			$current, 
       			"definition",
        		lv_definition_3_0, 
        		"Definition");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleDefinition
entryRuleDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDefinitionRule()); }
	 iv_ruleDefinition=ruleDefinition 
	 { $current=$iv_ruleDefinition.current; } 
	 EOF 
;

// Rule Definition
ruleDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='read' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getReadKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDefinitionAccess().getInputsInputParserRuleCall_1_0()); 
	    }
		lv_inputs_1_0=ruleInput		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDefinitionRule());
	        }
       		set(
       			$current, 
       			"inputs",
        		lv_inputs_1_0, 
        		"Input");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='%' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getPercentSignKeyword_2());
    }
((((
(
ruleCommand
)
)	';' 
))=>
(
		{ 
	        newCompositeNode(grammarAccess.getDefinitionAccess().getCommandesCommandsParserRuleCall_3_0()); 
	    }
		lv_commandes_3_0=ruleCommands		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDefinitionRule());
	        }
       		set(
       			$current, 
       			"commandes",
        		lv_commandes_3_0, 
        		"Commands");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4='%' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getPercentSignKeyword_4());
    }
	otherlv_5='write' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getWriteKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDefinitionAccess().getOutputsOutputParserRuleCall_6_0()); 
	    }
		lv_outputs_6_0=ruleOutput		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDefinitionRule());
	        }
       		set(
       			$current, 
       			"outputs",
        		lv_outputs_6_0, 
        		"Output");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleInput
entryRuleInput returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInputRule()); }
	 iv_ruleInput=ruleInput 
	 { $current=$iv_ruleInput.current; } 
	 EOF 
;

// Rule Input
ruleInput returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
(
		lv_varIn_0_0=RULE_VARIABLE
		{
			newLeafNode(lv_varIn_0_0, grammarAccess.getInputAccess().getVarInVARIABLETerminalRuleCall_0_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInputRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"varIn",
        		lv_varIn_0_0, 
        		"VARIABLE");
	    }

)
)	otherlv_1=',' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getInputAccess().getCommaKeyword_0_1());
    }
)*(
(
		lv_varIn_2_0=RULE_VARIABLE
		{
			newLeafNode(lv_varIn_2_0, grammarAccess.getInputAccess().getVarInVARIABLETerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInputRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"varIn",
        		lv_varIn_2_0, 
        		"VARIABLE");
	    }

)
))
;





// Entry rule entryRuleOutput
entryRuleOutput returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOutputRule()); }
	 iv_ruleOutput=ruleOutput 
	 { $current=$iv_ruleOutput.current; } 
	 EOF 
;

// Rule Output
ruleOutput returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
(
		lv_varOut_0_0=RULE_VARIABLE
		{
			newLeafNode(lv_varOut_0_0, grammarAccess.getOutputAccess().getVarOutVARIABLETerminalRuleCall_0_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOutputRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"varOut",
        		lv_varOut_0_0, 
        		"VARIABLE");
	    }

)
)	otherlv_1=',' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getCommaKeyword_0_1());
    }
)*(
(
		lv_varOut_2_0=RULE_VARIABLE
		{
			newLeafNode(lv_varOut_2_0, grammarAccess.getOutputAccess().getVarOutVARIABLETerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOutputRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"varOut",
        		lv_varOut_2_0, 
        		"VARIABLE");
	    }

)
))
;





// Entry rule entryRuleVars
entryRuleVars returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVarsRule()); }
	 iv_ruleVars=ruleVars 
	 { $current=$iv_ruleVars.current; } 
	 EOF 
;

// Rule Vars
ruleVars returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
(
		lv_varGen_0_0=RULE_VARIABLE
		{
			newLeafNode(lv_varGen_0_0, grammarAccess.getVarsAccess().getVarGenVARIABLETerminalRuleCall_0_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVarsRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"varGen",
        		lv_varGen_0_0, 
        		"VARIABLE");
	    }

)
)	otherlv_1=',' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getVarsAccess().getCommaKeyword_0_1());
    }
)*(
(
		lv_varGen_2_0=RULE_VARIABLE
		{
			newLeafNode(lv_varGen_2_0, grammarAccess.getVarsAccess().getVarGenVARIABLETerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVarsRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"varGen",
        		lv_varGen_2_0, 
        		"VARIABLE");
	    }

)
))
;





// Entry rule entryRuleCommands
entryRuleCommands returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCommandsRule()); }
	 iv_ruleCommands=ruleCommands 
	 { $current=$iv_ruleCommands.current; } 
	 EOF 
;

// Rule Commands
ruleCommands returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((((
(
ruleCommand
)
)	';' 
))=>((
(
		{ 
	        newCompositeNode(grammarAccess.getCommandsAccess().getCommandeCommandParserRuleCall_0_0_0_0()); 
	    }
		lv_commande_0_0=ruleCommand		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandsRule());
	        }
       		add(
       			$current, 
       			"commande",
        		lv_commande_0_0, 
        		"Command");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1=';' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getSemicolonKeyword_0_0_1());
    }
))*(
(
		{ 
	        newCompositeNode(grammarAccess.getCommandsAccess().getCommandeCommandParserRuleCall_1_0()); 
	    }
		lv_commande_2_0=ruleCommand		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandsRule());
	        }
       		add(
       			$current, 
       			"commande",
        		lv_commande_2_0, 
        		"Command");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleCommand
entryRuleCommand returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCommandRule()); }
	 iv_ruleCommand=ruleCommand 
	 { $current=$iv_ruleCommand.current; } 
	 EOF 
;

// Rule Command
ruleCommand returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_nop_0_0=	'nop' 
    {
        newLeafNode(lv_nop_0_0, grammarAccess.getCommandAccess().getNopNopKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCommandRule());
	        }
       		setWithLastConsumed($current, "nop", lv_nop_0_0, "nop");
	    }

)
)
    |((
(
		{ 
	        newCompositeNode(grammarAccess.getCommandAccess().getVarsVarsParserRuleCall_1_0_0()); 
	    }
		lv_vars_1_0=ruleVars		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandRule());
	        }
       		set(
       			$current, 
       			"vars",
        		lv_vars_1_0, 
        		"Vars");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=':=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getCommandAccess().getColonEqualsSignKeyword_1_1());
    }
((((
(
ruleExpr
)
)	',' 
))=>
(
		{ 
	        newCompositeNode(grammarAccess.getCommandAccess().getExprsExprsParserRuleCall_1_2_0()); 
	    }
		lv_exprs_3_0=ruleExprs		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandRule());
	        }
       		set(
       			$current, 
       			"exprs",
        		lv_exprs_3_0, 
        		"Exprs");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getCommandAccess().getCmdWhileCommandWhileParserRuleCall_2_0()); 
	    }
		lv_cmdWhile_4_0=ruleCommandWhile		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandRule());
	        }
       		set(
       			$current, 
       			"cmdWhile",
        		lv_cmdWhile_4_0, 
        		"CommandWhile");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getCommandAccess().getCmdIfCommandIfParserRuleCall_3_0()); 
	    }
		lv_cmdIf_5_0=ruleCommandIf		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandRule());
	        }
       		set(
       			$current, 
       			"cmdIf",
        		lv_cmdIf_5_0, 
        		"CommandIf");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getCommandAccess().getCmdForEachCommandForEachParserRuleCall_4_0()); 
	    }
		lv_cmdForEach_6_0=ruleCommandForEach		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandRule());
	        }
       		set(
       			$current, 
       			"cmdForEach",
        		lv_cmdForEach_6_0, 
        		"CommandForEach");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleCommandWhile
entryRuleCommandWhile returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCommandWhileRule()); }
	 iv_ruleCommandWhile=ruleCommandWhile 
	 { $current=$iv_ruleCommandWhile.current; } 
	 EOF 
;

// Rule CommandWhile
ruleCommandWhile returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
(
		lv_w_0_0=	'while' 
    {
        newLeafNode(lv_w_0_0, grammarAccess.getCommandWhileAccess().getWWhileKeyword_0_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCommandWhileRule());
	        }
       		setWithLastConsumed($current, "w", lv_w_0_0, "while");
	    }

)
)
    |	otherlv_1='for' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getCommandWhileAccess().getForKeyword_0_1());
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getCommandWhileAccess().getExprExprParserRuleCall_1_0()); 
	    }
		lv_expr_2_0=ruleExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandWhileRule());
	        }
       		set(
       			$current, 
       			"expr",
        		lv_expr_2_0, 
        		"Expr");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='do' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getCommandWhileAccess().getDoKeyword_2());
    }
((((
(
ruleCommand
)
)	';' 
))=>
(
		{ 
	        newCompositeNode(grammarAccess.getCommandWhileAccess().getCmdsCommandsParserRuleCall_3_0()); 
	    }
		lv_cmds_4_0=ruleCommands		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandWhileRule());
	        }
       		set(
       			$current, 
       			"cmds",
        		lv_cmds_4_0, 
        		"Commands");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5='od' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getCommandWhileAccess().getOdKeyword_4());
    }
)
;





// Entry rule entryRuleCommandIf
entryRuleCommandIf returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCommandIfRule()); }
	 iv_ruleCommandIf=ruleCommandIf 
	 { $current=$iv_ruleCommandIf.current; } 
	 EOF 
;

// Rule CommandIf
ruleCommandIf returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='if' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getCommandIfAccess().getIfKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCommandIfAccess().getCondExprParserRuleCall_1_0()); 
	    }
		lv_cond_1_0=ruleExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandIfRule());
	        }
       		set(
       			$current, 
       			"cond",
        		lv_cond_1_0, 
        		"Expr");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='then' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getCommandIfAccess().getThenKeyword_2());
    }
((((
(
ruleCommand
)
)	';' 
))=>
(
		{ 
	        newCompositeNode(grammarAccess.getCommandIfAccess().getCmdsThenCommandsParserRuleCall_3_0()); 
	    }
		lv_cmdsThen_3_0=ruleCommands		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandIfRule());
	        }
       		set(
       			$current, 
       			"cmdsThen",
        		lv_cmdsThen_3_0, 
        		"Commands");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4='else' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getCommandIfAccess().getElseKeyword_4_0());
    }
((((
(
ruleCommand
)
)	';' 
))=>
(
		{ 
	        newCompositeNode(grammarAccess.getCommandIfAccess().getCmdsElseCommandsParserRuleCall_4_1_0()); 
	    }
		lv_cmdsElse_5_0=ruleCommands		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandIfRule());
	        }
       		set(
       			$current, 
       			"cmdsElse",
        		lv_cmdsElse_5_0, 
        		"Commands");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_6='fi' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getCommandIfAccess().getFiKeyword_5());
    }
)
;





// Entry rule entryRuleCommandForEach
entryRuleCommandForEach returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCommandForEachRule()); }
	 iv_ruleCommandForEach=ruleCommandForEach 
	 { $current=$iv_ruleCommandForEach.current; } 
	 EOF 
;

// Rule CommandForEach
ruleCommandForEach returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='foreach' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getCommandForEachAccess().getForeachKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCommandForEachAccess().getElemExprParserRuleCall_1_0()); 
	    }
		lv_elem_1_0=ruleExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandForEachRule());
	        }
       		set(
       			$current, 
       			"elem",
        		lv_elem_1_0, 
        		"Expr");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='in' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getCommandForEachAccess().getInKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCommandForEachAccess().getEnsembExprParserRuleCall_3_0()); 
	    }
		lv_ensemb_3_0=ruleExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandForEachRule());
	        }
       		set(
       			$current, 
       			"ensemb",
        		lv_ensemb_3_0, 
        		"Expr");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4='do' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getCommandForEachAccess().getDoKeyword_4());
    }
((((
(
ruleCommand
)
)	';' 
))=>
(
		{ 
	        newCompositeNode(grammarAccess.getCommandForEachAccess().getCmdsCommandsParserRuleCall_5_0()); 
	    }
		lv_cmds_5_0=ruleCommands		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandForEachRule());
	        }
       		set(
       			$current, 
       			"cmds",
        		lv_cmds_5_0, 
        		"Commands");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6='od' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getCommandForEachAccess().getOdKeyword_6());
    }
)
;





// Entry rule entryRuleExprs
entryRuleExprs returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExprsRule()); }
	 iv_ruleExprs=ruleExprs 
	 { $current=$iv_ruleExprs.current; } 
	 EOF 
;

// Rule Exprs
ruleExprs returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((((
(
ruleExpr
)
)	',' 
))=>((
(
		{ 
	        newCompositeNode(grammarAccess.getExprsAccess().getExpGenExprParserRuleCall_0_0_0_0()); 
	    }
		lv_expGen_0_0=ruleExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprsRule());
	        }
       		add(
       			$current, 
       			"expGen",
        		lv_expGen_0_0, 
        		"Expr");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1=',' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getExprsAccess().getCommaKeyword_0_0_1());
    }
))*(
(
		{ 
	        newCompositeNode(grammarAccess.getExprsAccess().getExpGenExprParserRuleCall_1_0()); 
	    }
		lv_expGen_2_0=ruleExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprsRule());
	        }
       		add(
       			$current, 
       			"expGen",
        		lv_expGen_2_0, 
        		"Expr");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleExpr
entryRuleExpr returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExprRule()); }
	 iv_ruleExpr=ruleExpr 
	 { $current=$iv_ruleExpr.current; } 
	 EOF 
;

// Rule Expr
ruleExpr returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((((
(
ruleExprSimple
)
))=>(
(
		{ 
	        newCompositeNode(grammarAccess.getExprAccess().getExprSimpExprSimpleParserRuleCall_0_0_0()); 
	    }
		lv_exprSimp_0_0=ruleExprSimple		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprRule());
	        }
       		set(
       			$current, 
       			"exprSimp",
        		lv_exprSimp_0_0, 
        		"ExprSimple");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getExprAccess().getExprAndExprAndParserRuleCall_1_0()); 
	    }
		lv_exprAnd_1_0=ruleExprAnd		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprRule());
	        }
       		set(
       			$current, 
       			"exprAnd",
        		lv_exprAnd_1_0, 
        		"ExprAnd");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleExprSimple
entryRuleExprSimple returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExprSimpleRule()); }
	 iv_ruleExprSimple=ruleExprSimple 
	 { $current=$iv_ruleExprSimple.current; } 
	 EOF 
;

// Rule ExprSimple
ruleExprSimple returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
(
		lv_nil_0_0=	'nil' 
    {
        newLeafNode(lv_nil_0_0, grammarAccess.getExprSimpleAccess().getNilNilKeyword_0_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExprSimpleRule());
	        }
       		setWithLastConsumed($current, "nil", lv_nil_0_0, "nil");
	    }

)
)
    |(
(
		lv_vari_1_0=RULE_VARIABLE
		{
			newLeafNode(lv_vari_1_0, grammarAccess.getExprSimpleAccess().getVariVARIABLETerminalRuleCall_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExprSimpleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"vari",
        		lv_vari_1_0, 
        		"VARIABLE");
	    }

)
)
    |(
(
		lv_symb_2_0=RULE_SYMBOL
		{
			newLeafNode(lv_symb_2_0, grammarAccess.getExprSimpleAccess().getSymbSYMBOLTerminalRuleCall_0_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExprSimpleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"symb",
        		lv_symb_2_0, 
        		"SYMBOL");
	    }

)
))
    |(	otherlv_3='(' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_1_0());
    }
(
(
		lv_exprCons_4_0=	'cons' 
    {
        newLeafNode(lv_exprCons_4_0, grammarAccess.getExprSimpleAccess().getExprConsConsKeyword_1_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExprSimpleRule());
	        }
       		setWithLastConsumed($current, "exprCons", lv_exprCons_4_0, "cons");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getExprSimpleAccess().getExprConsAttExprParserRuleCall_1_2_0()); 
	    }
		lv_exprConsAtt_5_0=ruleExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprSimpleRule());
	        }
       		set(
       			$current, 
       			"exprConsAtt",
        		lv_exprConsAtt_5_0, 
        		"Expr");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6=')' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_1_3());
    }
)
    |(	otherlv_7='(' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_2_0());
    }
(
(
		lv_exprList_8_0=	'list' 
    {
        newLeafNode(lv_exprList_8_0, grammarAccess.getExprSimpleAccess().getExprListListKeyword_2_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExprSimpleRule());
	        }
       		setWithLastConsumed($current, "exprList", lv_exprList_8_0, "list");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getExprSimpleAccess().getExprListAttExprParserRuleCall_2_2_0()); 
	    }
		lv_exprListAtt_9_0=ruleExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprSimpleRule());
	        }
       		set(
       			$current, 
       			"exprListAtt",
        		lv_exprListAtt_9_0, 
        		"Expr");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_10=')' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_2_3());
    }
)
    |(	otherlv_11='(' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_3_0());
    }
(
(
		lv_exprHead_12_0=	'hd' 
    {
        newLeafNode(lv_exprHead_12_0, grammarAccess.getExprSimpleAccess().getExprHeadHdKeyword_3_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExprSimpleRule());
	        }
       		setWithLastConsumed($current, "exprHead", lv_exprHead_12_0, "hd");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getExprSimpleAccess().getExprHeadAttExprParserRuleCall_3_2_0()); 
	    }
		lv_exprHeadAtt_13_0=ruleExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprSimpleRule());
	        }
       		set(
       			$current, 
       			"exprHeadAtt",
        		lv_exprHeadAtt_13_0, 
        		"Expr");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_14=')' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_3_3());
    }
)
    |(	otherlv_15='(' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_4_0());
    }
(
(
		lv_exprTail_16_0=	'tl' 
    {
        newLeafNode(lv_exprTail_16_0, grammarAccess.getExprSimpleAccess().getExprTailTlKeyword_4_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExprSimpleRule());
	        }
       		setWithLastConsumed($current, "exprTail", lv_exprTail_16_0, "tl");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getExprSimpleAccess().getExprTailAttExprParserRuleCall_4_2_0()); 
	    }
		lv_exprTailAtt_17_0=ruleExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprSimpleRule());
	        }
       		set(
       			$current, 
       			"exprTailAtt",
        		lv_exprTailAtt_17_0, 
        		"Expr");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_18=')' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_4_3());
    }
)
    |(	otherlv_19='(' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_5_0());
    }
(
(
		lv_nomSymb_20_0=RULE_SYMBOL
		{
			newLeafNode(lv_nomSymb_20_0, grammarAccess.getExprSimpleAccess().getNomSymbSYMBOLTerminalRuleCall_5_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExprSimpleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"nomSymb",
        		lv_nomSymb_20_0, 
        		"SYMBOL");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getExprSimpleAccess().getSymbAttExprParserRuleCall_5_2_0()); 
	    }
		lv_symbAtt_21_0=ruleExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprSimpleRule());
	        }
       		set(
       			$current, 
       			"symbAtt",
        		lv_symbAtt_21_0, 
        		"Expr");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_22=')' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_5_3());
    }
))
;





// Entry rule entryRuleExprAnd
entryRuleExprAnd returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExprAndRule()); }
	 iv_ruleExprAnd=ruleExprAnd 
	 { $current=$iv_ruleExprAnd.current; } 
	 EOF 
;

// Rule ExprAnd
ruleExprAnd returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getExprAndAccess().getExprOrExprOrParserRuleCall_0_0()); 
	    }
		lv_exprOr_0_0=ruleExprOr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprAndRule());
	        }
       		set(
       			$current, 
       			"exprOr",
        		lv_exprOr_0_0, 
        		"ExprOr");
	        afterParserOrEnumRuleCall();
	    }

)
)((
(
		lv_exprAnd_1_0=	'and' 
    {
        newLeafNode(lv_exprAnd_1_0, grammarAccess.getExprAndAccess().getExprAndAndKeyword_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExprAndRule());
	        }
       		setWithLastConsumed($current, "exprAnd", lv_exprAnd_1_0, "and");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getExprAndAccess().getExprAndAttExprAndParserRuleCall_1_1_0()); 
	    }
		lv_exprAndAtt_2_0=ruleExprAnd		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprAndRule());
	        }
       		set(
       			$current, 
       			"exprAndAtt",
        		lv_exprAndAtt_2_0, 
        		"ExprAnd");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleExprOr
entryRuleExprOr returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExprOrRule()); }
	 iv_ruleExprOr=ruleExprOr 
	 { $current=$iv_ruleExprOr.current; } 
	 EOF 
;

// Rule ExprOr
ruleExprOr returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getExprOrAccess().getExprNotExprNotParserRuleCall_0_0()); 
	    }
		lv_exprNot_0_0=ruleExprNot		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprOrRule());
	        }
       		set(
       			$current, 
       			"exprNot",
        		lv_exprNot_0_0, 
        		"ExprNot");
	        afterParserOrEnumRuleCall();
	    }

)
)((
(
		lv_exprOr_1_0=	'or' 
    {
        newLeafNode(lv_exprOr_1_0, grammarAccess.getExprOrAccess().getExprOrOrKeyword_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExprOrRule());
	        }
       		setWithLastConsumed($current, "exprOr", lv_exprOr_1_0, "or");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getExprOrAccess().getExprOrAttExprOrParserRuleCall_1_1_0()); 
	    }
		lv_exprOrAtt_2_0=ruleExprOr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprOrRule());
	        }
       		set(
       			$current, 
       			"exprOrAtt",
        		lv_exprOrAtt_2_0, 
        		"ExprOr");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleExprNot
entryRuleExprNot returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExprNotRule()); }
	 iv_ruleExprNot=ruleExprNot 
	 { $current=$iv_ruleExprNot.current; } 
	 EOF 
;

// Rule ExprNot
ruleExprNot returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_not_0_0=	'not' 
    {
        newLeafNode(lv_not_0_0, grammarAccess.getExprNotAccess().getNotNotKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExprNotRule());
	        }
       		setWithLastConsumed($current, "not", lv_not_0_0, "not");
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getExprNotAccess().getExprEqExprEqParserRuleCall_1_0()); 
	    }
		lv_exprEq_1_0=ruleExprEq		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprNotRule());
	        }
       		set(
       			$current, 
       			"exprEq",
        		lv_exprEq_1_0, 
        		"ExprEq");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleExprEq
entryRuleExprEq returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExprEqRule()); }
	 iv_ruleExprEq=ruleExprEq 
	 { $current=$iv_ruleExprEq.current; } 
	 EOF 
;

// Rule ExprEq
ruleExprEq returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_0_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExprEqAccess().getExprExprParserRuleCall_0_1_0()); 
	    }
		lv_expr_1_0=ruleExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprEqRule());
	        }
       		set(
       			$current, 
       			"expr",
        		lv_expr_1_0, 
        		"Expr");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=')' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getExprEqAccess().getRightParenthesisKeyword_0_2());
    }
)
    |((
(
		{ 
	        newCompositeNode(grammarAccess.getExprEqAccess().getExprSim1ExprSimpleParserRuleCall_1_0_0()); 
	    }
		lv_exprSim1_3_0=ruleExprSimple		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprEqRule());
	        }
       		set(
       			$current, 
       			"exprSim1",
        		lv_exprSim1_3_0, 
        		"ExprSimple");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4='=?' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExprEqAccess().getExprSim2ExprSimpleParserRuleCall_1_2_0()); 
	    }
		lv_exprSim2_5_0=ruleExprSimple		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprEqRule());
	        }
       		set(
       			$current, 
       			"exprSim2",
        		lv_exprSim2_5_0, 
        		"ExprSimple");
	        afterParserOrEnumRuleCall();
	    }

)
)))
;





RULE_VARIABLE : 'A'..'Z' ('A'..'Z'|'a'..'z'|'0'..'9'|'_')*;

RULE_SYMBOL : 'a'..'z' ('A'..'Z'|'a'..'z'|'0'..'9'|'_')*;

RULE_LC : ('\t'|'\r'|('\r\n'|'\n'));

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


