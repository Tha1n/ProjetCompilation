package org.xtext.example.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.services.WhileCppGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalWhileCppParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL", "RULE_VARIABLE", "RULE_LC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'for'", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "':='", "'do'", "'od'", "'if'", "'then'", "'fi'", "'else'", "'foreach'", "'in'", "'('", "')'", "'=?'", "'nop'", "'while'", "'nil'", "'cons'", "'list'", "'hd'", "'tl'", "'and'", "'or'", "'not'"
    };
    public static final int RULE_LC=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_VARIABLE=5;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_SYMBOL=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalWhileCppParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWhileCppParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWhileCppParser.tokenNames; }
    public String getGrammarFileName() { return "../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g"; }


     
     	private WhileCppGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(WhileCppGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleProgram"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:61:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:62:1: ( ruleProgram EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:63:1: ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram67);
            ruleProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:70:1: ruleProgram : ( ( rule__Program__FonctionsAssignment )* ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:74:2: ( ( ( rule__Program__FonctionsAssignment )* ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:75:1: ( ( rule__Program__FonctionsAssignment )* )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:75:1: ( ( rule__Program__FonctionsAssignment )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:76:1: ( rule__Program__FonctionsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getFonctionsAssignment()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:77:1: ( rule__Program__FonctionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:77:2: rule__Program__FonctionsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Program__FonctionsAssignment_in_ruleProgram100);
            	    rule__Program__FonctionsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getFonctionsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFunction"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:89:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:90:1: ( ruleFunction EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:91:1: ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction128);
            ruleFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction135); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:98:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:102:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:103:1: ( ( rule__Function__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:103:1: ( ( rule__Function__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:104:1: ( rule__Function__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:105:1: ( rule__Function__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:105:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_ruleFunction161);
            rule__Function__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDefinition"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:117:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:118:1: ( ruleDefinition EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:119:1: ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition188);
            ruleDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition195); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:126:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:130:2: ( ( ( rule__Definition__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:131:1: ( ( rule__Definition__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:131:1: ( ( rule__Definition__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:132:1: ( rule__Definition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:133:1: ( rule__Definition__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:133:2: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_rule__Definition__Group__0_in_ruleDefinition221);
            rule__Definition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleInput"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:145:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:146:1: ( ruleInput EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:147:1: ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput248);
            ruleInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput255); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:154:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:158:2: ( ( ( rule__Input__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:159:1: ( ( rule__Input__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:159:1: ( ( rule__Input__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:160:1: ( rule__Input__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:161:1: ( rule__Input__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:161:2: rule__Input__Group__0
            {
            pushFollow(FOLLOW_rule__Input__Group__0_in_ruleInput281);
            rule__Input__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:173:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:174:1: ( ruleOutput EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:175:1: ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_entryRuleOutput308);
            ruleOutput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutput315); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:182:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:186:2: ( ( ( rule__Output__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:187:1: ( ( rule__Output__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:187:1: ( ( rule__Output__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:188:1: ( rule__Output__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:189:1: ( rule__Output__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:189:2: rule__Output__Group__0
            {
            pushFollow(FOLLOW_rule__Output__Group__0_in_ruleOutput341);
            rule__Output__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleVars"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:201:1: entryRuleVars : ruleVars EOF ;
    public final void entryRuleVars() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:202:1: ( ruleVars EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:203:1: ruleVars EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsRule()); 
            }
            pushFollow(FOLLOW_ruleVars_in_entryRuleVars368);
            ruleVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVars375); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVars"


    // $ANTLR start "ruleVars"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:210:1: ruleVars : ( ( rule__Vars__Group__0 ) ) ;
    public final void ruleVars() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:214:2: ( ( ( rule__Vars__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:215:1: ( ( rule__Vars__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:215:1: ( ( rule__Vars__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:216:1: ( rule__Vars__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:217:1: ( rule__Vars__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:217:2: rule__Vars__Group__0
            {
            pushFollow(FOLLOW_rule__Vars__Group__0_in_ruleVars401);
            rule__Vars__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVars"


    // $ANTLR start "entryRuleCommands"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:229:1: entryRuleCommands : ruleCommands EOF ;
    public final void entryRuleCommands() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:230:1: ( ruleCommands EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:231:1: ruleCommands EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsRule()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_entryRuleCommands428);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommands435); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommands"


    // $ANTLR start "ruleCommands"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:238:1: ruleCommands : ( ( rule__Commands__Group__0 ) ) ;
    public final void ruleCommands() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:242:2: ( ( ( rule__Commands__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:243:1: ( ( rule__Commands__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:243:1: ( ( rule__Commands__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:244:1: ( rule__Commands__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:245:1: ( rule__Commands__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:245:2: rule__Commands__Group__0
            {
            pushFollow(FOLLOW_rule__Commands__Group__0_in_ruleCommands461);
            rule__Commands__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleCommand"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:257:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:258:1: ( ruleCommand EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:259:1: ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand488);
            ruleCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand495); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:266:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:270:2: ( ( ( rule__Command__Alternatives ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:271:1: ( ( rule__Command__Alternatives ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:271:1: ( ( rule__Command__Alternatives ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:272:1: ( rule__Command__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getAlternatives()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:273:1: ( rule__Command__Alternatives )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:273:2: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_rule__Command__Alternatives_in_ruleCommand521);
            rule__Command__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleCommandWhile"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:285:1: entryRuleCommandWhile : ruleCommandWhile EOF ;
    public final void entryRuleCommandWhile() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:286:1: ( ruleCommandWhile EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:287:1: ruleCommandWhile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileRule()); 
            }
            pushFollow(FOLLOW_ruleCommandWhile_in_entryRuleCommandWhile548);
            ruleCommandWhile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandWhileRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandWhile555); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommandWhile"


    // $ANTLR start "ruleCommandWhile"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:294:1: ruleCommandWhile : ( ( rule__CommandWhile__Group__0 ) ) ;
    public final void ruleCommandWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:298:2: ( ( ( rule__CommandWhile__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:299:1: ( ( rule__CommandWhile__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:299:1: ( ( rule__CommandWhile__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:300:1: ( rule__CommandWhile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:301:1: ( rule__CommandWhile__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:301:2: rule__CommandWhile__Group__0
            {
            pushFollow(FOLLOW_rule__CommandWhile__Group__0_in_ruleCommandWhile581);
            rule__CommandWhile__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandWhileAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommandWhile"


    // $ANTLR start "entryRuleCommandIf"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:313:1: entryRuleCommandIf : ruleCommandIf EOF ;
    public final void entryRuleCommandIf() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:314:1: ( ruleCommandIf EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:315:1: ruleCommandIf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfRule()); 
            }
            pushFollow(FOLLOW_ruleCommandIf_in_entryRuleCommandIf608);
            ruleCommandIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandIf615); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommandIf"


    // $ANTLR start "ruleCommandIf"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:322:1: ruleCommandIf : ( ( rule__CommandIf__Group__0 ) ) ;
    public final void ruleCommandIf() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:326:2: ( ( ( rule__CommandIf__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:327:1: ( ( rule__CommandIf__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:327:1: ( ( rule__CommandIf__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:328:1: ( rule__CommandIf__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:329:1: ( rule__CommandIf__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:329:2: rule__CommandIf__Group__0
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__0_in_ruleCommandIf641);
            rule__CommandIf__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommandIf"


    // $ANTLR start "entryRuleCommandForEach"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:341:1: entryRuleCommandForEach : ruleCommandForEach EOF ;
    public final void entryRuleCommandForEach() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:342:1: ( ruleCommandForEach EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:343:1: ruleCommandForEach EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachRule()); 
            }
            pushFollow(FOLLOW_ruleCommandForEach_in_entryRuleCommandForEach668);
            ruleCommandForEach();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandForEachRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandForEach675); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommandForEach"


    // $ANTLR start "ruleCommandForEach"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:350:1: ruleCommandForEach : ( ( rule__CommandForEach__Group__0 ) ) ;
    public final void ruleCommandForEach() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:354:2: ( ( ( rule__CommandForEach__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:355:1: ( ( rule__CommandForEach__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:355:1: ( ( rule__CommandForEach__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:356:1: ( rule__CommandForEach__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:357:1: ( rule__CommandForEach__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:357:2: rule__CommandForEach__Group__0
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__0_in_ruleCommandForEach701);
            rule__CommandForEach__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandForEachAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommandForEach"


    // $ANTLR start "entryRuleExprs"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:369:1: entryRuleExprs : ruleExprs EOF ;
    public final void entryRuleExprs() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:370:1: ( ruleExprs EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:371:1: ruleExprs EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsRule()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_entryRuleExprs728);
            ruleExprs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprs735); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprs"


    // $ANTLR start "ruleExprs"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:378:1: ruleExprs : ( ( rule__Exprs__Group__0 ) ) ;
    public final void ruleExprs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:382:2: ( ( ( rule__Exprs__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:383:1: ( ( rule__Exprs__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:383:1: ( ( rule__Exprs__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:384:1: ( rule__Exprs__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:385:1: ( rule__Exprs__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:385:2: rule__Exprs__Group__0
            {
            pushFollow(FOLLOW_rule__Exprs__Group__0_in_ruleExprs761);
            rule__Exprs__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprs"


    // $ANTLR start "entryRuleExpr"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:397:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:398:1: ( ruleExpr EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:399:1: ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr788);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr795); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:406:1: ruleExpr : ( ( rule__Expr__Alternatives ) ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:410:2: ( ( ( rule__Expr__Alternatives ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:411:1: ( ( rule__Expr__Alternatives ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:411:1: ( ( rule__Expr__Alternatives ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:412:1: ( rule__Expr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getAlternatives()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:413:1: ( rule__Expr__Alternatives )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:413:2: rule__Expr__Alternatives
            {
            pushFollow(FOLLOW_rule__Expr__Alternatives_in_ruleExpr821);
            rule__Expr__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleExprSimple"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:425:1: entryRuleExprSimple : ruleExprSimple EOF ;
    public final void entryRuleExprSimple() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:426:1: ( ruleExprSimple EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:427:1: ruleExprSimple EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleRule()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_entryRuleExprSimple848);
            ruleExprSimple();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprSimple855); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprSimple"


    // $ANTLR start "ruleExprSimple"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:434:1: ruleExprSimple : ( ( rule__ExprSimple__Alternatives ) ) ;
    public final void ruleExprSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:438:2: ( ( ( rule__ExprSimple__Alternatives ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:439:1: ( ( rule__ExprSimple__Alternatives ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:439:1: ( ( rule__ExprSimple__Alternatives ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:440:1: ( rule__ExprSimple__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getAlternatives()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:441:1: ( rule__ExprSimple__Alternatives )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:441:2: rule__ExprSimple__Alternatives
            {
            pushFollow(FOLLOW_rule__ExprSimple__Alternatives_in_ruleExprSimple881);
            rule__ExprSimple__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprSimple"


    // $ANTLR start "entryRuleExprAnd"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:453:1: entryRuleExprAnd : ruleExprAnd EOF ;
    public final void entryRuleExprAnd() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:454:1: ( ruleExprAnd EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:455:1: ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_entryRuleExprAnd908);
            ruleExprAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAnd915); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprAnd"


    // $ANTLR start "ruleExprAnd"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:462:1: ruleExprAnd : ( ( rule__ExprAnd__Group__0 ) ) ;
    public final void ruleExprAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:466:2: ( ( ( rule__ExprAnd__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:467:1: ( ( rule__ExprAnd__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:467:1: ( ( rule__ExprAnd__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:468:1: ( rule__ExprAnd__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:469:1: ( rule__ExprAnd__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:469:2: rule__ExprAnd__Group__0
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group__0_in_ruleExprAnd941);
            rule__ExprAnd__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprAnd"


    // $ANTLR start "entryRuleExprOr"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:481:1: entryRuleExprOr : ruleExprOr EOF ;
    public final void entryRuleExprOr() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:482:1: ( ruleExprOr EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:483:1: ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_entryRuleExprOr968);
            ruleExprOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprOr975); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprOr"


    // $ANTLR start "ruleExprOr"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:490:1: ruleExprOr : ( ( rule__ExprOr__Group__0 ) ) ;
    public final void ruleExprOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:494:2: ( ( ( rule__ExprOr__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:495:1: ( ( rule__ExprOr__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:495:1: ( ( rule__ExprOr__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:496:1: ( rule__ExprOr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:497:1: ( rule__ExprOr__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:497:2: rule__ExprOr__Group__0
            {
            pushFollow(FOLLOW_rule__ExprOr__Group__0_in_ruleExprOr1001);
            rule__ExprOr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprOr"


    // $ANTLR start "entryRuleExprNot"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:509:1: entryRuleExprNot : ruleExprNot EOF ;
    public final void entryRuleExprNot() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:510:1: ( ruleExprNot EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:511:1: ruleExprNot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotRule()); 
            }
            pushFollow(FOLLOW_ruleExprNot_in_entryRuleExprNot1028);
            ruleExprNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprNot1035); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprNot"


    // $ANTLR start "ruleExprNot"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:518:1: ruleExprNot : ( ( rule__ExprNot__Group__0 ) ) ;
    public final void ruleExprNot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:522:2: ( ( ( rule__ExprNot__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:523:1: ( ( rule__ExprNot__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:523:1: ( ( rule__ExprNot__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:524:1: ( rule__ExprNot__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:525:1: ( rule__ExprNot__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:525:2: rule__ExprNot__Group__0
            {
            pushFollow(FOLLOW_rule__ExprNot__Group__0_in_ruleExprNot1061);
            rule__ExprNot__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprNot"


    // $ANTLR start "entryRuleExprEq"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:537:1: entryRuleExprEq : ruleExprEq EOF ;
    public final void entryRuleExprEq() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:538:1: ( ruleExprEq EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:539:1: ruleExprEq EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqRule()); 
            }
            pushFollow(FOLLOW_ruleExprEq_in_entryRuleExprEq1088);
            ruleExprEq();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprEq1095); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprEq"


    // $ANTLR start "ruleExprEq"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:546:1: ruleExprEq : ( ( rule__ExprEq__Alternatives ) ) ;
    public final void ruleExprEq() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:550:2: ( ( ( rule__ExprEq__Alternatives ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:551:1: ( ( rule__ExprEq__Alternatives ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:551:1: ( ( rule__ExprEq__Alternatives ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:552:1: ( rule__ExprEq__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getAlternatives()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:553:1: ( rule__ExprEq__Alternatives )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:553:2: rule__ExprEq__Alternatives
            {
            pushFollow(FOLLOW_rule__ExprEq__Alternatives_in_ruleExprEq1121);
            rule__ExprEq__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprEq"


    // $ANTLR start "rule__Command__Alternatives"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:565:1: rule__Command__Alternatives : ( ( ( rule__Command__NopAssignment_0 ) ) | ( ( rule__Command__Group_1__0 ) ) | ( ( rule__Command__CmdWhileAssignment_2 ) ) | ( ( rule__Command__CmdIfAssignment_3 ) ) | ( ( rule__Command__CmdForEachAssignment_4 ) ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:569:1: ( ( ( rule__Command__NopAssignment_0 ) ) | ( ( rule__Command__Group_1__0 ) ) | ( ( rule__Command__CmdWhileAssignment_2 ) ) | ( ( rule__Command__CmdIfAssignment_3 ) ) | ( ( rule__Command__CmdForEachAssignment_4 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt2=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt2=2;
                }
                break;
            case 14:
            case 35:
                {
                alt2=3;
                }
                break;
            case 25:
                {
                alt2=4;
                }
                break;
            case 29:
                {
                alt2=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:570:1: ( ( rule__Command__NopAssignment_0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:570:1: ( ( rule__Command__NopAssignment_0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:571:1: ( rule__Command__NopAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getNopAssignment_0()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:572:1: ( rule__Command__NopAssignment_0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:572:2: rule__Command__NopAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Command__NopAssignment_0_in_rule__Command__Alternatives1157);
                    rule__Command__NopAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getNopAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:576:6: ( ( rule__Command__Group_1__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:576:6: ( ( rule__Command__Group_1__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:577:1: ( rule__Command__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getGroup_1()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:578:1: ( rule__Command__Group_1__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:578:2: rule__Command__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_1__0_in_rule__Command__Alternatives1175);
                    rule__Command__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:582:6: ( ( rule__Command__CmdWhileAssignment_2 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:582:6: ( ( rule__Command__CmdWhileAssignment_2 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:583:1: ( rule__Command__CmdWhileAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getCmdWhileAssignment_2()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:584:1: ( rule__Command__CmdWhileAssignment_2 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:584:2: rule__Command__CmdWhileAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Command__CmdWhileAssignment_2_in_rule__Command__Alternatives1193);
                    rule__Command__CmdWhileAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getCmdWhileAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:588:6: ( ( rule__Command__CmdIfAssignment_3 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:588:6: ( ( rule__Command__CmdIfAssignment_3 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:589:1: ( rule__Command__CmdIfAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getCmdIfAssignment_3()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:590:1: ( rule__Command__CmdIfAssignment_3 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:590:2: rule__Command__CmdIfAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Command__CmdIfAssignment_3_in_rule__Command__Alternatives1211);
                    rule__Command__CmdIfAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getCmdIfAssignment_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:594:6: ( ( rule__Command__CmdForEachAssignment_4 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:594:6: ( ( rule__Command__CmdForEachAssignment_4 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:595:1: ( rule__Command__CmdForEachAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getCmdForEachAssignment_4()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:596:1: ( rule__Command__CmdForEachAssignment_4 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:596:2: rule__Command__CmdForEachAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Command__CmdForEachAssignment_4_in_rule__Command__Alternatives1229);
                    rule__Command__CmdForEachAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getCmdForEachAssignment_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Alternatives"


    // $ANTLR start "rule__CommandWhile__Alternatives_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:605:1: rule__CommandWhile__Alternatives_0 : ( ( ( rule__CommandWhile__WAssignment_0_0 ) ) | ( 'for' ) );
    public final void rule__CommandWhile__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:609:1: ( ( ( rule__CommandWhile__WAssignment_0_0 ) ) | ( 'for' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==35) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:610:1: ( ( rule__CommandWhile__WAssignment_0_0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:610:1: ( ( rule__CommandWhile__WAssignment_0_0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:611:1: ( rule__CommandWhile__WAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandWhileAccess().getWAssignment_0_0()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:612:1: ( rule__CommandWhile__WAssignment_0_0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:612:2: rule__CommandWhile__WAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__CommandWhile__WAssignment_0_0_in_rule__CommandWhile__Alternatives_01262);
                    rule__CommandWhile__WAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandWhileAccess().getWAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:616:6: ( 'for' )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:616:6: ( 'for' )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:617:1: 'for'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandWhileAccess().getForKeyword_0_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__CommandWhile__Alternatives_01281); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandWhileAccess().getForKeyword_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__Alternatives_0"


    // $ANTLR start "rule__Expr__Alternatives"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:629:1: rule__Expr__Alternatives : ( ( ( rule__Expr__Group_0__0 ) ) | ( ( rule__Expr__ExprAndAssignment_1 ) ) );
    public final void rule__Expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:633:1: ( ( ( rule__Expr__Group_0__0 ) ) | ( ( rule__Expr__ExprAndAssignment_1 ) ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 36:
                {
                int LA4_1 = input.LA(2);

                if ( (synpred7_InternalWhileCpp()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_VARIABLE:
                {
                int LA4_2 = input.LA(2);

                if ( (synpred7_InternalWhileCpp()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_SYMBOL:
                {
                int LA4_3 = input.LA(2);

                if ( (synpred7_InternalWhileCpp()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                int LA4_4 = input.LA(2);

                if ( (synpred7_InternalWhileCpp()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            case 43:
                {
                alt4=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:634:1: ( ( rule__Expr__Group_0__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:634:1: ( ( rule__Expr__Group_0__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:635:1: ( rule__Expr__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getGroup_0()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:636:1: ( rule__Expr__Group_0__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:636:2: rule__Expr__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Expr__Group_0__0_in_rule__Expr__Alternatives1315);
                    rule__Expr__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:640:6: ( ( rule__Expr__ExprAndAssignment_1 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:640:6: ( ( rule__Expr__ExprAndAssignment_1 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:641:1: ( rule__Expr__ExprAndAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getExprAndAssignment_1()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:642:1: ( rule__Expr__ExprAndAssignment_1 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:642:2: rule__Expr__ExprAndAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Expr__ExprAndAssignment_1_in_rule__Expr__Alternatives1333);
                    rule__Expr__ExprAndAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprAccess().getExprAndAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Alternatives"


    // $ANTLR start "rule__ExprSimple__Alternatives"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:651:1: rule__ExprSimple__Alternatives : ( ( ( rule__ExprSimple__Alternatives_0 ) ) | ( ( rule__ExprSimple__Group_1__0 ) ) | ( ( rule__ExprSimple__Group_2__0 ) ) | ( ( rule__ExprSimple__Group_3__0 ) ) | ( ( rule__ExprSimple__Group_4__0 ) ) | ( ( rule__ExprSimple__Group_5__0 ) ) );
    public final void rule__ExprSimple__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:655:1: ( ( ( rule__ExprSimple__Alternatives_0 ) ) | ( ( rule__ExprSimple__Group_1__0 ) ) | ( ( rule__ExprSimple__Group_2__0 ) ) | ( ( rule__ExprSimple__Group_3__0 ) ) | ( ( rule__ExprSimple__Group_4__0 ) ) | ( ( rule__ExprSimple__Group_5__0 ) ) )
            int alt5=6;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_SYMBOL && LA5_0<=RULE_VARIABLE)||LA5_0==36) ) {
                alt5=1;
            }
            else if ( (LA5_0==31) ) {
                switch ( input.LA(2) ) {
                case 37:
                    {
                    alt5=2;
                    }
                    break;
                case 38:
                    {
                    alt5=3;
                    }
                    break;
                case 39:
                    {
                    alt5=4;
                    }
                    break;
                case 40:
                    {
                    alt5=5;
                    }
                    break;
                case RULE_SYMBOL:
                    {
                    alt5=6;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:656:1: ( ( rule__ExprSimple__Alternatives_0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:656:1: ( ( rule__ExprSimple__Alternatives_0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:657:1: ( rule__ExprSimple__Alternatives_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getAlternatives_0()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:658:1: ( rule__ExprSimple__Alternatives_0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:658:2: rule__ExprSimple__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Alternatives_0_in_rule__ExprSimple__Alternatives1366);
                    rule__ExprSimple__Alternatives_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getAlternatives_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:662:6: ( ( rule__ExprSimple__Group_1__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:662:6: ( ( rule__ExprSimple__Group_1__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:663:1: ( rule__ExprSimple__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_1()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:664:1: ( rule__ExprSimple__Group_1__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:664:2: rule__ExprSimple__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_1__0_in_rule__ExprSimple__Alternatives1384);
                    rule__ExprSimple__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:668:6: ( ( rule__ExprSimple__Group_2__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:668:6: ( ( rule__ExprSimple__Group_2__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:669:1: ( rule__ExprSimple__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_2()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:670:1: ( rule__ExprSimple__Group_2__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:670:2: rule__ExprSimple__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_2__0_in_rule__ExprSimple__Alternatives1402);
                    rule__ExprSimple__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:674:6: ( ( rule__ExprSimple__Group_3__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:674:6: ( ( rule__ExprSimple__Group_3__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:675:1: ( rule__ExprSimple__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_3()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:676:1: ( rule__ExprSimple__Group_3__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:676:2: rule__ExprSimple__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_3__0_in_rule__ExprSimple__Alternatives1420);
                    rule__ExprSimple__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:680:6: ( ( rule__ExprSimple__Group_4__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:680:6: ( ( rule__ExprSimple__Group_4__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:681:1: ( rule__ExprSimple__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_4()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:682:1: ( rule__ExprSimple__Group_4__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:682:2: rule__ExprSimple__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_4__0_in_rule__ExprSimple__Alternatives1438);
                    rule__ExprSimple__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:686:6: ( ( rule__ExprSimple__Group_5__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:686:6: ( ( rule__ExprSimple__Group_5__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:687:1: ( rule__ExprSimple__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_5()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:688:1: ( rule__ExprSimple__Group_5__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:688:2: rule__ExprSimple__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_5__0_in_rule__ExprSimple__Alternatives1456);
                    rule__ExprSimple__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Alternatives"


    // $ANTLR start "rule__ExprSimple__Alternatives_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:697:1: rule__ExprSimple__Alternatives_0 : ( ( ( rule__ExprSimple__NilAssignment_0_0 ) ) | ( ( rule__ExprSimple__VariAssignment_0_1 ) ) | ( ( rule__ExprSimple__SymbAssignment_0_2 ) ) );
    public final void rule__ExprSimple__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:701:1: ( ( ( rule__ExprSimple__NilAssignment_0_0 ) ) | ( ( rule__ExprSimple__VariAssignment_0_1 ) ) | ( ( rule__ExprSimple__SymbAssignment_0_2 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt6=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt6=2;
                }
                break;
            case RULE_SYMBOL:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:702:1: ( ( rule__ExprSimple__NilAssignment_0_0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:702:1: ( ( rule__ExprSimple__NilAssignment_0_0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:703:1: ( rule__ExprSimple__NilAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getNilAssignment_0_0()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:704:1: ( rule__ExprSimple__NilAssignment_0_0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:704:2: rule__ExprSimple__NilAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__NilAssignment_0_0_in_rule__ExprSimple__Alternatives_01489);
                    rule__ExprSimple__NilAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getNilAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:708:6: ( ( rule__ExprSimple__VariAssignment_0_1 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:708:6: ( ( rule__ExprSimple__VariAssignment_0_1 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:709:1: ( rule__ExprSimple__VariAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getVariAssignment_0_1()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:710:1: ( rule__ExprSimple__VariAssignment_0_1 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:710:2: rule__ExprSimple__VariAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__VariAssignment_0_1_in_rule__ExprSimple__Alternatives_01507);
                    rule__ExprSimple__VariAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getVariAssignment_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:714:6: ( ( rule__ExprSimple__SymbAssignment_0_2 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:714:6: ( ( rule__ExprSimple__SymbAssignment_0_2 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:715:1: ( rule__ExprSimple__SymbAssignment_0_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getSymbAssignment_0_2()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:716:1: ( rule__ExprSimple__SymbAssignment_0_2 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:716:2: rule__ExprSimple__SymbAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__SymbAssignment_0_2_in_rule__ExprSimple__Alternatives_01525);
                    rule__ExprSimple__SymbAssignment_0_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getSymbAssignment_0_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Alternatives_0"


    // $ANTLR start "rule__ExprEq__Alternatives"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:725:1: rule__ExprEq__Alternatives : ( ( ( rule__ExprEq__Group_0__0 ) ) | ( ( rule__ExprEq__Group_1__0 ) ) );
    public final void rule__ExprEq__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:729:1: ( ( ( rule__ExprEq__Group_0__0 ) ) | ( ( rule__ExprEq__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==31) ) {
                int LA7_1 = input.LA(2);

                if ( (synpred15_InternalWhileCpp()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA7_0>=RULE_SYMBOL && LA7_0<=RULE_VARIABLE)||LA7_0==36) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:730:1: ( ( rule__ExprEq__Group_0__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:730:1: ( ( rule__ExprEq__Group_0__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:731:1: ( rule__ExprEq__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprEqAccess().getGroup_0()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:732:1: ( rule__ExprEq__Group_0__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:732:2: rule__ExprEq__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ExprEq__Group_0__0_in_rule__ExprEq__Alternatives1558);
                    rule__ExprEq__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprEqAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:736:6: ( ( rule__ExprEq__Group_1__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:736:6: ( ( rule__ExprEq__Group_1__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:737:1: ( rule__ExprEq__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprEqAccess().getGroup_1()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:738:1: ( rule__ExprEq__Group_1__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:738:2: rule__ExprEq__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprEq__Group_1__0_in_rule__ExprEq__Alternatives1576);
                    rule__ExprEq__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprEqAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Alternatives"


    // $ANTLR start "rule__Function__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:749:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:753:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:754:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__01607);
            rule__Function__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__01610);
            rule__Function__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:761:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:765:1: ( ( 'function' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:766:1: ( 'function' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:766:1: ( 'function' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:767:1: 'function'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__Function__Group__0__Impl1638); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:780:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:784:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:785:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__11669);
            rule__Function__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__11672);
            rule__Function__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:792:1: rule__Function__Group__1__Impl : ( ( rule__Function__NomAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:796:1: ( ( ( rule__Function__NomAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:797:1: ( ( rule__Function__NomAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:797:1: ( ( rule__Function__NomAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:798:1: ( rule__Function__NomAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getNomAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:799:1: ( rule__Function__NomAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:799:2: rule__Function__NomAssignment_1
            {
            pushFollow(FOLLOW_rule__Function__NomAssignment_1_in_rule__Function__Group__1__Impl1699);
            rule__Function__NomAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getNomAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:809:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:813:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:814:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__21729);
            rule__Function__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__21732);
            rule__Function__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:821:1: rule__Function__Group__2__Impl : ( ':' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:825:1: ( ( ':' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:826:1: ( ':' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:826:1: ( ':' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:827:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getColonKeyword_2()); 
            }
            match(input,16,FOLLOW_16_in_rule__Function__Group__2__Impl1760); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getColonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:840:1: rule__Function__Group__3 : rule__Function__Group__3__Impl ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:844:1: ( rule__Function__Group__3__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:845:2: rule__Function__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__31791);
            rule__Function__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:851:1: rule__Function__Group__3__Impl : ( ( rule__Function__DefinitionAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:855:1: ( ( ( rule__Function__DefinitionAssignment_3 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:856:1: ( ( rule__Function__DefinitionAssignment_3 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:856:1: ( ( rule__Function__DefinitionAssignment_3 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:857:1: ( rule__Function__DefinitionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getDefinitionAssignment_3()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:858:1: ( rule__Function__DefinitionAssignment_3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:858:2: rule__Function__DefinitionAssignment_3
            {
            pushFollow(FOLLOW_rule__Function__DefinitionAssignment_3_in_rule__Function__Group__3__Impl1818);
            rule__Function__DefinitionAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getDefinitionAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Definition__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:876:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:880:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:881:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__01856);
            rule__Definition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__01859);
            rule__Definition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__0"


    // $ANTLR start "rule__Definition__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:888:1: rule__Definition__Group__0__Impl : ( 'read' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:892:1: ( ( 'read' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:893:1: ( 'read' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:893:1: ( 'read' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:894:1: 'read'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getReadKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Definition__Group__0__Impl1887); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getReadKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__0__Impl"


    // $ANTLR start "rule__Definition__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:907:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:911:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:912:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__11918);
            rule__Definition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__11921);
            rule__Definition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__1"


    // $ANTLR start "rule__Definition__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:919:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__InputsAssignment_1 ) ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:923:1: ( ( ( rule__Definition__InputsAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:924:1: ( ( rule__Definition__InputsAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:924:1: ( ( rule__Definition__InputsAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:925:1: ( rule__Definition__InputsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getInputsAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:926:1: ( rule__Definition__InputsAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:926:2: rule__Definition__InputsAssignment_1
            {
            pushFollow(FOLLOW_rule__Definition__InputsAssignment_1_in_rule__Definition__Group__1__Impl1948);
            rule__Definition__InputsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getInputsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__1__Impl"


    // $ANTLR start "rule__Definition__Group__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:936:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl rule__Definition__Group__3 ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:940:1: ( rule__Definition__Group__2__Impl rule__Definition__Group__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:941:2: rule__Definition__Group__2__Impl rule__Definition__Group__3
            {
            pushFollow(FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__21978);
            rule__Definition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__21981);
            rule__Definition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__2"


    // $ANTLR start "rule__Definition__Group__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:948:1: rule__Definition__Group__2__Impl : ( '%' ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:952:1: ( ( '%' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:953:1: ( '%' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:953:1: ( '%' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:954:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getPercentSignKeyword_2()); 
            }
            match(input,18,FOLLOW_18_in_rule__Definition__Group__2__Impl2009); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getPercentSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__2__Impl"


    // $ANTLR start "rule__Definition__Group__3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:967:1: rule__Definition__Group__3 : rule__Definition__Group__3__Impl rule__Definition__Group__4 ;
    public final void rule__Definition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:971:1: ( rule__Definition__Group__3__Impl rule__Definition__Group__4 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:972:2: rule__Definition__Group__3__Impl rule__Definition__Group__4
            {
            pushFollow(FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__32040);
            rule__Definition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__4_in_rule__Definition__Group__32043);
            rule__Definition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__3"


    // $ANTLR start "rule__Definition__Group__3__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:979:1: rule__Definition__Group__3__Impl : ( ( rule__Definition__CommandesAssignment_3 ) ) ;
    public final void rule__Definition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:983:1: ( ( ( rule__Definition__CommandesAssignment_3 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:984:1: ( ( rule__Definition__CommandesAssignment_3 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:984:1: ( ( rule__Definition__CommandesAssignment_3 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:985:1: ( rule__Definition__CommandesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getCommandesAssignment_3()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:986:1: ( rule__Definition__CommandesAssignment_3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:986:2: rule__Definition__CommandesAssignment_3
            {
            pushFollow(FOLLOW_rule__Definition__CommandesAssignment_3_in_rule__Definition__Group__3__Impl2070);
            rule__Definition__CommandesAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getCommandesAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__3__Impl"


    // $ANTLR start "rule__Definition__Group__4"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:996:1: rule__Definition__Group__4 : rule__Definition__Group__4__Impl rule__Definition__Group__5 ;
    public final void rule__Definition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1000:1: ( rule__Definition__Group__4__Impl rule__Definition__Group__5 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1001:2: rule__Definition__Group__4__Impl rule__Definition__Group__5
            {
            pushFollow(FOLLOW_rule__Definition__Group__4__Impl_in_rule__Definition__Group__42100);
            rule__Definition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__5_in_rule__Definition__Group__42103);
            rule__Definition__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__4"


    // $ANTLR start "rule__Definition__Group__4__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1008:1: rule__Definition__Group__4__Impl : ( '%' ) ;
    public final void rule__Definition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1012:1: ( ( '%' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1013:1: ( '%' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1013:1: ( '%' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1014:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getPercentSignKeyword_4()); 
            }
            match(input,18,FOLLOW_18_in_rule__Definition__Group__4__Impl2131); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getPercentSignKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__4__Impl"


    // $ANTLR start "rule__Definition__Group__5"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1027:1: rule__Definition__Group__5 : rule__Definition__Group__5__Impl rule__Definition__Group__6 ;
    public final void rule__Definition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1031:1: ( rule__Definition__Group__5__Impl rule__Definition__Group__6 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1032:2: rule__Definition__Group__5__Impl rule__Definition__Group__6
            {
            pushFollow(FOLLOW_rule__Definition__Group__5__Impl_in_rule__Definition__Group__52162);
            rule__Definition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__6_in_rule__Definition__Group__52165);
            rule__Definition__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__5"


    // $ANTLR start "rule__Definition__Group__5__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1039:1: rule__Definition__Group__5__Impl : ( 'write' ) ;
    public final void rule__Definition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1043:1: ( ( 'write' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1044:1: ( 'write' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1044:1: ( 'write' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1045:1: 'write'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getWriteKeyword_5()); 
            }
            match(input,19,FOLLOW_19_in_rule__Definition__Group__5__Impl2193); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getWriteKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__5__Impl"


    // $ANTLR start "rule__Definition__Group__6"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1058:1: rule__Definition__Group__6 : rule__Definition__Group__6__Impl ;
    public final void rule__Definition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1062:1: ( rule__Definition__Group__6__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1063:2: rule__Definition__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__6__Impl_in_rule__Definition__Group__62224);
            rule__Definition__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__6"


    // $ANTLR start "rule__Definition__Group__6__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1069:1: rule__Definition__Group__6__Impl : ( ( rule__Definition__OutputsAssignment_6 ) ) ;
    public final void rule__Definition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1073:1: ( ( ( rule__Definition__OutputsAssignment_6 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1074:1: ( ( rule__Definition__OutputsAssignment_6 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1074:1: ( ( rule__Definition__OutputsAssignment_6 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1075:1: ( rule__Definition__OutputsAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getOutputsAssignment_6()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1076:1: ( rule__Definition__OutputsAssignment_6 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1076:2: rule__Definition__OutputsAssignment_6
            {
            pushFollow(FOLLOW_rule__Definition__OutputsAssignment_6_in_rule__Definition__Group__6__Impl2251);
            rule__Definition__OutputsAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getOutputsAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__6__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1100:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1104:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1105:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__02295);
            rule__Input__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group__1_in_rule__Input__Group__02298);
            rule__Input__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1112:1: rule__Input__Group__0__Impl : ( ( rule__Input__Group_0__0 )* ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1116:1: ( ( ( rule__Input__Group_0__0 )* ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1117:1: ( ( rule__Input__Group_0__0 )* )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1117:1: ( ( rule__Input__Group_0__0 )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1118:1: ( rule__Input__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1119:1: ( rule__Input__Group_0__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_VARIABLE) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==20) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1119:2: rule__Input__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Input__Group_0__0_in_rule__Input__Group__0__Impl2325);
            	    rule__Input__Group_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1129:1: rule__Input__Group__1 : rule__Input__Group__1__Impl ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1133:1: ( rule__Input__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1134:2: rule__Input__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__12356);
            rule__Input__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1140:1: rule__Input__Group__1__Impl : ( ( rule__Input__VarInAssignment_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1144:1: ( ( ( rule__Input__VarInAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1145:1: ( ( rule__Input__VarInAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1145:1: ( ( rule__Input__VarInAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1146:1: ( rule__Input__VarInAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVarInAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1147:1: ( rule__Input__VarInAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1147:2: rule__Input__VarInAssignment_1
            {
            pushFollow(FOLLOW_rule__Input__VarInAssignment_1_in_rule__Input__Group__1__Impl2383);
            rule__Input__VarInAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getVarInAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group_0__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1161:1: rule__Input__Group_0__0 : rule__Input__Group_0__0__Impl rule__Input__Group_0__1 ;
    public final void rule__Input__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1165:1: ( rule__Input__Group_0__0__Impl rule__Input__Group_0__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1166:2: rule__Input__Group_0__0__Impl rule__Input__Group_0__1
            {
            pushFollow(FOLLOW_rule__Input__Group_0__0__Impl_in_rule__Input__Group_0__02417);
            rule__Input__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_0__1_in_rule__Input__Group_0__02420);
            rule__Input__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_0__0"


    // $ANTLR start "rule__Input__Group_0__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1173:1: rule__Input__Group_0__0__Impl : ( ( rule__Input__VarInAssignment_0_0 ) ) ;
    public final void rule__Input__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1177:1: ( ( ( rule__Input__VarInAssignment_0_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1178:1: ( ( rule__Input__VarInAssignment_0_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1178:1: ( ( rule__Input__VarInAssignment_0_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1179:1: ( rule__Input__VarInAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVarInAssignment_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1180:1: ( rule__Input__VarInAssignment_0_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1180:2: rule__Input__VarInAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Input__VarInAssignment_0_0_in_rule__Input__Group_0__0__Impl2447);
            rule__Input__VarInAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getVarInAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_0__0__Impl"


    // $ANTLR start "rule__Input__Group_0__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1190:1: rule__Input__Group_0__1 : rule__Input__Group_0__1__Impl ;
    public final void rule__Input__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1194:1: ( rule__Input__Group_0__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1195:2: rule__Input__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_0__1__Impl_in_rule__Input__Group_0__12477);
            rule__Input__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_0__1"


    // $ANTLR start "rule__Input__Group_0__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1201:1: rule__Input__Group_0__1__Impl : ( ',' ) ;
    public final void rule__Input__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1205:1: ( ( ',' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1206:1: ( ',' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1206:1: ( ',' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1207:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getCommaKeyword_0_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Input__Group_0__1__Impl2505); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getCommaKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_0__1__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1224:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1228:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1229:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__02540);
            rule__Output__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group__1_in_rule__Output__Group__02543);
            rule__Output__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0"


    // $ANTLR start "rule__Output__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1236:1: rule__Output__Group__0__Impl : ( ( rule__Output__Group_0__0 )* ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1240:1: ( ( ( rule__Output__Group_0__0 )* ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1241:1: ( ( rule__Output__Group_0__0 )* )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1241:1: ( ( rule__Output__Group_0__0 )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1242:1: ( rule__Output__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1243:1: ( rule__Output__Group_0__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_VARIABLE) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==20) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1243:2: rule__Output__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Output__Group_0__0_in_rule__Output__Group__0__Impl2570);
            	    rule__Output__Group_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0__Impl"


    // $ANTLR start "rule__Output__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1253:1: rule__Output__Group__1 : rule__Output__Group__1__Impl ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1257:1: ( rule__Output__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1258:2: rule__Output__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__12601);
            rule__Output__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1"


    // $ANTLR start "rule__Output__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1264:1: rule__Output__Group__1__Impl : ( ( rule__Output__VarOutAssignment_1 ) ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1268:1: ( ( ( rule__Output__VarOutAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1269:1: ( ( rule__Output__VarOutAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1269:1: ( ( rule__Output__VarOutAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1270:1: ( rule__Output__VarOutAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVarOutAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1271:1: ( rule__Output__VarOutAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1271:2: rule__Output__VarOutAssignment_1
            {
            pushFollow(FOLLOW_rule__Output__VarOutAssignment_1_in_rule__Output__Group__1__Impl2628);
            rule__Output__VarOutAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getVarOutAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1__Impl"


    // $ANTLR start "rule__Output__Group_0__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1285:1: rule__Output__Group_0__0 : rule__Output__Group_0__0__Impl rule__Output__Group_0__1 ;
    public final void rule__Output__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1289:1: ( rule__Output__Group_0__0__Impl rule__Output__Group_0__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1290:2: rule__Output__Group_0__0__Impl rule__Output__Group_0__1
            {
            pushFollow(FOLLOW_rule__Output__Group_0__0__Impl_in_rule__Output__Group_0__02662);
            rule__Output__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group_0__1_in_rule__Output__Group_0__02665);
            rule__Output__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_0__0"


    // $ANTLR start "rule__Output__Group_0__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1297:1: rule__Output__Group_0__0__Impl : ( ( rule__Output__VarOutAssignment_0_0 ) ) ;
    public final void rule__Output__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1301:1: ( ( ( rule__Output__VarOutAssignment_0_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1302:1: ( ( rule__Output__VarOutAssignment_0_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1302:1: ( ( rule__Output__VarOutAssignment_0_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1303:1: ( rule__Output__VarOutAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVarOutAssignment_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1304:1: ( rule__Output__VarOutAssignment_0_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1304:2: rule__Output__VarOutAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Output__VarOutAssignment_0_0_in_rule__Output__Group_0__0__Impl2692);
            rule__Output__VarOutAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getVarOutAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_0__0__Impl"


    // $ANTLR start "rule__Output__Group_0__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1314:1: rule__Output__Group_0__1 : rule__Output__Group_0__1__Impl ;
    public final void rule__Output__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1318:1: ( rule__Output__Group_0__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1319:2: rule__Output__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group_0__1__Impl_in_rule__Output__Group_0__12722);
            rule__Output__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_0__1"


    // $ANTLR start "rule__Output__Group_0__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1325:1: rule__Output__Group_0__1__Impl : ( ',' ) ;
    public final void rule__Output__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1329:1: ( ( ',' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1330:1: ( ',' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1330:1: ( ',' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1331:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getCommaKeyword_0_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Output__Group_0__1__Impl2750); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getCommaKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_0__1__Impl"


    // $ANTLR start "rule__Vars__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1348:1: rule__Vars__Group__0 : rule__Vars__Group__0__Impl rule__Vars__Group__1 ;
    public final void rule__Vars__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1352:1: ( rule__Vars__Group__0__Impl rule__Vars__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1353:2: rule__Vars__Group__0__Impl rule__Vars__Group__1
            {
            pushFollow(FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__02785);
            rule__Vars__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__02788);
            rule__Vars__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group__0"


    // $ANTLR start "rule__Vars__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1360:1: rule__Vars__Group__0__Impl : ( ( rule__Vars__Group_0__0 )* ) ;
    public final void rule__Vars__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1364:1: ( ( ( rule__Vars__Group_0__0 )* ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1365:1: ( ( rule__Vars__Group_0__0 )* )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1365:1: ( ( rule__Vars__Group_0__0 )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1366:1: ( rule__Vars__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getGroup_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1367:1: ( rule__Vars__Group_0__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_VARIABLE) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==20) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1367:2: rule__Vars__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Vars__Group_0__0_in_rule__Vars__Group__0__Impl2815);
            	    rule__Vars__Group_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group__0__Impl"


    // $ANTLR start "rule__Vars__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1377:1: rule__Vars__Group__1 : rule__Vars__Group__1__Impl ;
    public final void rule__Vars__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1381:1: ( rule__Vars__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1382:2: rule__Vars__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__12846);
            rule__Vars__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group__1"


    // $ANTLR start "rule__Vars__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1388:1: rule__Vars__Group__1__Impl : ( ( rule__Vars__VarGenAssignment_1 ) ) ;
    public final void rule__Vars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1392:1: ( ( ( rule__Vars__VarGenAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1393:1: ( ( rule__Vars__VarGenAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1393:1: ( ( rule__Vars__VarGenAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1394:1: ( rule__Vars__VarGenAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVarGenAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1395:1: ( rule__Vars__VarGenAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1395:2: rule__Vars__VarGenAssignment_1
            {
            pushFollow(FOLLOW_rule__Vars__VarGenAssignment_1_in_rule__Vars__Group__1__Impl2873);
            rule__Vars__VarGenAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getVarGenAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group__1__Impl"


    // $ANTLR start "rule__Vars__Group_0__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1409:1: rule__Vars__Group_0__0 : rule__Vars__Group_0__0__Impl rule__Vars__Group_0__1 ;
    public final void rule__Vars__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1413:1: ( rule__Vars__Group_0__0__Impl rule__Vars__Group_0__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1414:2: rule__Vars__Group_0__0__Impl rule__Vars__Group_0__1
            {
            pushFollow(FOLLOW_rule__Vars__Group_0__0__Impl_in_rule__Vars__Group_0__02907);
            rule__Vars__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group_0__1_in_rule__Vars__Group_0__02910);
            rule__Vars__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_0__0"


    // $ANTLR start "rule__Vars__Group_0__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1421:1: rule__Vars__Group_0__0__Impl : ( ( rule__Vars__VarGenAssignment_0_0 ) ) ;
    public final void rule__Vars__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1425:1: ( ( ( rule__Vars__VarGenAssignment_0_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1426:1: ( ( rule__Vars__VarGenAssignment_0_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1426:1: ( ( rule__Vars__VarGenAssignment_0_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1427:1: ( rule__Vars__VarGenAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVarGenAssignment_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1428:1: ( rule__Vars__VarGenAssignment_0_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1428:2: rule__Vars__VarGenAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Vars__VarGenAssignment_0_0_in_rule__Vars__Group_0__0__Impl2937);
            rule__Vars__VarGenAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getVarGenAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_0__0__Impl"


    // $ANTLR start "rule__Vars__Group_0__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1438:1: rule__Vars__Group_0__1 : rule__Vars__Group_0__1__Impl ;
    public final void rule__Vars__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1442:1: ( rule__Vars__Group_0__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1443:2: rule__Vars__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group_0__1__Impl_in_rule__Vars__Group_0__12967);
            rule__Vars__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_0__1"


    // $ANTLR start "rule__Vars__Group_0__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1449:1: rule__Vars__Group_0__1__Impl : ( ',' ) ;
    public final void rule__Vars__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1453:1: ( ( ',' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1454:1: ( ',' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1454:1: ( ',' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1455:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getCommaKeyword_0_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Vars__Group_0__1__Impl2995); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getCommaKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_0__1__Impl"


    // $ANTLR start "rule__Commands__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1472:1: rule__Commands__Group__0 : rule__Commands__Group__0__Impl rule__Commands__Group__1 ;
    public final void rule__Commands__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1476:1: ( rule__Commands__Group__0__Impl rule__Commands__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1477:2: rule__Commands__Group__0__Impl rule__Commands__Group__1
            {
            pushFollow(FOLLOW_rule__Commands__Group__0__Impl_in_rule__Commands__Group__03030);
            rule__Commands__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group__1_in_rule__Commands__Group__03033);
            rule__Commands__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group__0"


    // $ANTLR start "rule__Commands__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1484:1: rule__Commands__Group__0__Impl : ( ( rule__Commands__Group_0__0 )* ) ;
    public final void rule__Commands__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1488:1: ( ( ( rule__Commands__Group_0__0 )* ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1489:1: ( ( rule__Commands__Group_0__0 )* )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1489:1: ( ( rule__Commands__Group_0__0 )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1490:1: ( rule__Commands__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getGroup_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1491:1: ( rule__Commands__Group_0__0 )*
            loop11:
            do {
                int alt11=2;
                switch ( input.LA(1) ) {
                case 34:
                    {
                    int LA11_1 = input.LA(2);

                    if ( (synpred19_InternalWhileCpp()) ) {
                        alt11=1;
                    }


                    }
                    break;
                case RULE_VARIABLE:
                    {
                    int LA11_2 = input.LA(2);

                    if ( (synpred19_InternalWhileCpp()) ) {
                        alt11=1;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA11_3 = input.LA(2);

                    if ( (synpred19_InternalWhileCpp()) ) {
                        alt11=1;
                    }


                    }
                    break;
                case 14:
                    {
                    int LA11_4 = input.LA(2);

                    if ( (synpred19_InternalWhileCpp()) ) {
                        alt11=1;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA11_5 = input.LA(2);

                    if ( (synpred19_InternalWhileCpp()) ) {
                        alt11=1;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA11_6 = input.LA(2);

                    if ( (synpred19_InternalWhileCpp()) ) {
                        alt11=1;
                    }


                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1491:2: rule__Commands__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Commands__Group_0__0_in_rule__Commands__Group__0__Impl3060);
            	    rule__Commands__Group_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group__0__Impl"


    // $ANTLR start "rule__Commands__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1501:1: rule__Commands__Group__1 : rule__Commands__Group__1__Impl ;
    public final void rule__Commands__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1505:1: ( rule__Commands__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1506:2: rule__Commands__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Commands__Group__1__Impl_in_rule__Commands__Group__13091);
            rule__Commands__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group__1"


    // $ANTLR start "rule__Commands__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1512:1: rule__Commands__Group__1__Impl : ( ( rule__Commands__CommandeAssignment_1 ) ) ;
    public final void rule__Commands__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1516:1: ( ( ( rule__Commands__CommandeAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1517:1: ( ( rule__Commands__CommandeAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1517:1: ( ( rule__Commands__CommandeAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1518:1: ( rule__Commands__CommandeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCommandeAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1519:1: ( rule__Commands__CommandeAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1519:2: rule__Commands__CommandeAssignment_1
            {
            pushFollow(FOLLOW_rule__Commands__CommandeAssignment_1_in_rule__Commands__Group__1__Impl3118);
            rule__Commands__CommandeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getCommandeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group__1__Impl"


    // $ANTLR start "rule__Commands__Group_0__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1533:1: rule__Commands__Group_0__0 : rule__Commands__Group_0__0__Impl ;
    public final void rule__Commands__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1537:1: ( rule__Commands__Group_0__0__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1538:2: rule__Commands__Group_0__0__Impl
            {
            pushFollow(FOLLOW_rule__Commands__Group_0__0__Impl_in_rule__Commands__Group_0__03152);
            rule__Commands__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group_0__0"


    // $ANTLR start "rule__Commands__Group_0__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1544:1: rule__Commands__Group_0__0__Impl : ( ( rule__Commands__Group_0_0__0 ) ) ;
    public final void rule__Commands__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1548:1: ( ( ( rule__Commands__Group_0_0__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1549:1: ( ( rule__Commands__Group_0_0__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1549:1: ( ( rule__Commands__Group_0_0__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1550:1: ( rule__Commands__Group_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getGroup_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1551:1: ( rule__Commands__Group_0_0__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1551:2: rule__Commands__Group_0_0__0
            {
            pushFollow(FOLLOW_rule__Commands__Group_0_0__0_in_rule__Commands__Group_0__0__Impl3179);
            rule__Commands__Group_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getGroup_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group_0__0__Impl"


    // $ANTLR start "rule__Commands__Group_0_0__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1563:1: rule__Commands__Group_0_0__0 : rule__Commands__Group_0_0__0__Impl rule__Commands__Group_0_0__1 ;
    public final void rule__Commands__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1567:1: ( rule__Commands__Group_0_0__0__Impl rule__Commands__Group_0_0__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1568:2: rule__Commands__Group_0_0__0__Impl rule__Commands__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__Commands__Group_0_0__0__Impl_in_rule__Commands__Group_0_0__03211);
            rule__Commands__Group_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group_0_0__1_in_rule__Commands__Group_0_0__03214);
            rule__Commands__Group_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group_0_0__0"


    // $ANTLR start "rule__Commands__Group_0_0__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1575:1: rule__Commands__Group_0_0__0__Impl : ( ( rule__Commands__CommandeAssignment_0_0_0 ) ) ;
    public final void rule__Commands__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1579:1: ( ( ( rule__Commands__CommandeAssignment_0_0_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1580:1: ( ( rule__Commands__CommandeAssignment_0_0_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1580:1: ( ( rule__Commands__CommandeAssignment_0_0_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1581:1: ( rule__Commands__CommandeAssignment_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCommandeAssignment_0_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1582:1: ( rule__Commands__CommandeAssignment_0_0_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1582:2: rule__Commands__CommandeAssignment_0_0_0
            {
            pushFollow(FOLLOW_rule__Commands__CommandeAssignment_0_0_0_in_rule__Commands__Group_0_0__0__Impl3241);
            rule__Commands__CommandeAssignment_0_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getCommandeAssignment_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group_0_0__0__Impl"


    // $ANTLR start "rule__Commands__Group_0_0__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1592:1: rule__Commands__Group_0_0__1 : rule__Commands__Group_0_0__1__Impl ;
    public final void rule__Commands__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1596:1: ( rule__Commands__Group_0_0__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1597:2: rule__Commands__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Commands__Group_0_0__1__Impl_in_rule__Commands__Group_0_0__13271);
            rule__Commands__Group_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group_0_0__1"


    // $ANTLR start "rule__Commands__Group_0_0__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1603:1: rule__Commands__Group_0_0__1__Impl : ( ';' ) ;
    public final void rule__Commands__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1607:1: ( ( ';' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1608:1: ( ';' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1608:1: ( ';' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1609:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getSemicolonKeyword_0_0_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__Commands__Group_0_0__1__Impl3299); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getSemicolonKeyword_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group_0_0__1__Impl"


    // $ANTLR start "rule__Command__Group_1__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1626:1: rule__Command__Group_1__0 : rule__Command__Group_1__0__Impl rule__Command__Group_1__1 ;
    public final void rule__Command__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1630:1: ( rule__Command__Group_1__0__Impl rule__Command__Group_1__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1631:2: rule__Command__Group_1__0__Impl rule__Command__Group_1__1
            {
            pushFollow(FOLLOW_rule__Command__Group_1__0__Impl_in_rule__Command__Group_1__03334);
            rule__Command__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__1_in_rule__Command__Group_1__03337);
            rule__Command__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_1__0"


    // $ANTLR start "rule__Command__Group_1__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1638:1: rule__Command__Group_1__0__Impl : ( ( rule__Command__VarsAssignment_1_0 ) ) ;
    public final void rule__Command__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1642:1: ( ( ( rule__Command__VarsAssignment_1_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1643:1: ( ( rule__Command__VarsAssignment_1_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1643:1: ( ( rule__Command__VarsAssignment_1_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1644:1: ( rule__Command__VarsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getVarsAssignment_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1645:1: ( rule__Command__VarsAssignment_1_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1645:2: rule__Command__VarsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Command__VarsAssignment_1_0_in_rule__Command__Group_1__0__Impl3364);
            rule__Command__VarsAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getVarsAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_1__0__Impl"


    // $ANTLR start "rule__Command__Group_1__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1655:1: rule__Command__Group_1__1 : rule__Command__Group_1__1__Impl rule__Command__Group_1__2 ;
    public final void rule__Command__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1659:1: ( rule__Command__Group_1__1__Impl rule__Command__Group_1__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1660:2: rule__Command__Group_1__1__Impl rule__Command__Group_1__2
            {
            pushFollow(FOLLOW_rule__Command__Group_1__1__Impl_in_rule__Command__Group_1__13394);
            rule__Command__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__2_in_rule__Command__Group_1__13397);
            rule__Command__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_1__1"


    // $ANTLR start "rule__Command__Group_1__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1667:1: rule__Command__Group_1__1__Impl : ( ':=' ) ;
    public final void rule__Command__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1671:1: ( ( ':=' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1672:1: ( ':=' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1672:1: ( ':=' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1673:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getColonEqualsSignKeyword_1_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__Command__Group_1__1__Impl3425); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getColonEqualsSignKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_1__1__Impl"


    // $ANTLR start "rule__Command__Group_1__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1686:1: rule__Command__Group_1__2 : rule__Command__Group_1__2__Impl ;
    public final void rule__Command__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1690:1: ( rule__Command__Group_1__2__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1691:2: rule__Command__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_1__2__Impl_in_rule__Command__Group_1__23456);
            rule__Command__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_1__2"


    // $ANTLR start "rule__Command__Group_1__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1697:1: rule__Command__Group_1__2__Impl : ( ( rule__Command__ExprsAssignment_1_2 ) ) ;
    public final void rule__Command__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1701:1: ( ( ( rule__Command__ExprsAssignment_1_2 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1702:1: ( ( rule__Command__ExprsAssignment_1_2 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1702:1: ( ( rule__Command__ExprsAssignment_1_2 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1703:1: ( rule__Command__ExprsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExprsAssignment_1_2()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1704:1: ( rule__Command__ExprsAssignment_1_2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1704:2: rule__Command__ExprsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Command__ExprsAssignment_1_2_in_rule__Command__Group_1__2__Impl3483);
            rule__Command__ExprsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExprsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_1__2__Impl"


    // $ANTLR start "rule__CommandWhile__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1720:1: rule__CommandWhile__Group__0 : rule__CommandWhile__Group__0__Impl rule__CommandWhile__Group__1 ;
    public final void rule__CommandWhile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1724:1: ( rule__CommandWhile__Group__0__Impl rule__CommandWhile__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1725:2: rule__CommandWhile__Group__0__Impl rule__CommandWhile__Group__1
            {
            pushFollow(FOLLOW_rule__CommandWhile__Group__0__Impl_in_rule__CommandWhile__Group__03519);
            rule__CommandWhile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandWhile__Group__1_in_rule__CommandWhile__Group__03522);
            rule__CommandWhile__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__Group__0"


    // $ANTLR start "rule__CommandWhile__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1732:1: rule__CommandWhile__Group__0__Impl : ( ( rule__CommandWhile__Alternatives_0 ) ) ;
    public final void rule__CommandWhile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1736:1: ( ( ( rule__CommandWhile__Alternatives_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1737:1: ( ( rule__CommandWhile__Alternatives_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1737:1: ( ( rule__CommandWhile__Alternatives_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1738:1: ( rule__CommandWhile__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getAlternatives_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1739:1: ( rule__CommandWhile__Alternatives_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1739:2: rule__CommandWhile__Alternatives_0
            {
            pushFollow(FOLLOW_rule__CommandWhile__Alternatives_0_in_rule__CommandWhile__Group__0__Impl3549);
            rule__CommandWhile__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandWhileAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__Group__0__Impl"


    // $ANTLR start "rule__CommandWhile__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1749:1: rule__CommandWhile__Group__1 : rule__CommandWhile__Group__1__Impl rule__CommandWhile__Group__2 ;
    public final void rule__CommandWhile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1753:1: ( rule__CommandWhile__Group__1__Impl rule__CommandWhile__Group__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1754:2: rule__CommandWhile__Group__1__Impl rule__CommandWhile__Group__2
            {
            pushFollow(FOLLOW_rule__CommandWhile__Group__1__Impl_in_rule__CommandWhile__Group__13579);
            rule__CommandWhile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandWhile__Group__2_in_rule__CommandWhile__Group__13582);
            rule__CommandWhile__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__Group__1"


    // $ANTLR start "rule__CommandWhile__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1761:1: rule__CommandWhile__Group__1__Impl : ( ( rule__CommandWhile__ExprAssignment_1 ) ) ;
    public final void rule__CommandWhile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1765:1: ( ( ( rule__CommandWhile__ExprAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1766:1: ( ( rule__CommandWhile__ExprAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1766:1: ( ( rule__CommandWhile__ExprAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1767:1: ( rule__CommandWhile__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getExprAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1768:1: ( rule__CommandWhile__ExprAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1768:2: rule__CommandWhile__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__CommandWhile__ExprAssignment_1_in_rule__CommandWhile__Group__1__Impl3609);
            rule__CommandWhile__ExprAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandWhileAccess().getExprAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__Group__1__Impl"


    // $ANTLR start "rule__CommandWhile__Group__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1778:1: rule__CommandWhile__Group__2 : rule__CommandWhile__Group__2__Impl rule__CommandWhile__Group__3 ;
    public final void rule__CommandWhile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1782:1: ( rule__CommandWhile__Group__2__Impl rule__CommandWhile__Group__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1783:2: rule__CommandWhile__Group__2__Impl rule__CommandWhile__Group__3
            {
            pushFollow(FOLLOW_rule__CommandWhile__Group__2__Impl_in_rule__CommandWhile__Group__23639);
            rule__CommandWhile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandWhile__Group__3_in_rule__CommandWhile__Group__23642);
            rule__CommandWhile__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__Group__2"


    // $ANTLR start "rule__CommandWhile__Group__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1790:1: rule__CommandWhile__Group__2__Impl : ( 'do' ) ;
    public final void rule__CommandWhile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1794:1: ( ( 'do' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1795:1: ( 'do' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1795:1: ( 'do' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1796:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getDoKeyword_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__CommandWhile__Group__2__Impl3670); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandWhileAccess().getDoKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__Group__2__Impl"


    // $ANTLR start "rule__CommandWhile__Group__3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1809:1: rule__CommandWhile__Group__3 : rule__CommandWhile__Group__3__Impl rule__CommandWhile__Group__4 ;
    public final void rule__CommandWhile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1813:1: ( rule__CommandWhile__Group__3__Impl rule__CommandWhile__Group__4 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1814:2: rule__CommandWhile__Group__3__Impl rule__CommandWhile__Group__4
            {
            pushFollow(FOLLOW_rule__CommandWhile__Group__3__Impl_in_rule__CommandWhile__Group__33701);
            rule__CommandWhile__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandWhile__Group__4_in_rule__CommandWhile__Group__33704);
            rule__CommandWhile__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__Group__3"


    // $ANTLR start "rule__CommandWhile__Group__3__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1821:1: rule__CommandWhile__Group__3__Impl : ( ( rule__CommandWhile__CmdsAssignment_3 ) ) ;
    public final void rule__CommandWhile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1825:1: ( ( ( rule__CommandWhile__CmdsAssignment_3 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1826:1: ( ( rule__CommandWhile__CmdsAssignment_3 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1826:1: ( ( rule__CommandWhile__CmdsAssignment_3 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1827:1: ( rule__CommandWhile__CmdsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getCmdsAssignment_3()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1828:1: ( rule__CommandWhile__CmdsAssignment_3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1828:2: rule__CommandWhile__CmdsAssignment_3
            {
            pushFollow(FOLLOW_rule__CommandWhile__CmdsAssignment_3_in_rule__CommandWhile__Group__3__Impl3731);
            rule__CommandWhile__CmdsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandWhileAccess().getCmdsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__Group__3__Impl"


    // $ANTLR start "rule__CommandWhile__Group__4"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1838:1: rule__CommandWhile__Group__4 : rule__CommandWhile__Group__4__Impl ;
    public final void rule__CommandWhile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1842:1: ( rule__CommandWhile__Group__4__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1843:2: rule__CommandWhile__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CommandWhile__Group__4__Impl_in_rule__CommandWhile__Group__43761);
            rule__CommandWhile__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__Group__4"


    // $ANTLR start "rule__CommandWhile__Group__4__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1849:1: rule__CommandWhile__Group__4__Impl : ( 'od' ) ;
    public final void rule__CommandWhile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1853:1: ( ( 'od' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1854:1: ( 'od' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1854:1: ( 'od' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1855:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getOdKeyword_4()); 
            }
            match(input,24,FOLLOW_24_in_rule__CommandWhile__Group__4__Impl3789); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandWhileAccess().getOdKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__Group__4__Impl"


    // $ANTLR start "rule__CommandIf__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1878:1: rule__CommandIf__Group__0 : rule__CommandIf__Group__0__Impl rule__CommandIf__Group__1 ;
    public final void rule__CommandIf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1882:1: ( rule__CommandIf__Group__0__Impl rule__CommandIf__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1883:2: rule__CommandIf__Group__0__Impl rule__CommandIf__Group__1
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__0__Impl_in_rule__CommandIf__Group__03830);
            rule__CommandIf__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandIf__Group__1_in_rule__CommandIf__Group__03833);
            rule__CommandIf__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group__0"


    // $ANTLR start "rule__CommandIf__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1890:1: rule__CommandIf__Group__0__Impl : ( 'if' ) ;
    public final void rule__CommandIf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1894:1: ( ( 'if' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1895:1: ( 'if' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1895:1: ( 'if' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1896:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getIfKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__CommandIf__Group__0__Impl3861); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfAccess().getIfKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group__0__Impl"


    // $ANTLR start "rule__CommandIf__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1909:1: rule__CommandIf__Group__1 : rule__CommandIf__Group__1__Impl rule__CommandIf__Group__2 ;
    public final void rule__CommandIf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1913:1: ( rule__CommandIf__Group__1__Impl rule__CommandIf__Group__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1914:2: rule__CommandIf__Group__1__Impl rule__CommandIf__Group__2
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__1__Impl_in_rule__CommandIf__Group__13892);
            rule__CommandIf__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandIf__Group__2_in_rule__CommandIf__Group__13895);
            rule__CommandIf__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group__1"


    // $ANTLR start "rule__CommandIf__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1921:1: rule__CommandIf__Group__1__Impl : ( ( rule__CommandIf__CondAssignment_1 ) ) ;
    public final void rule__CommandIf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1925:1: ( ( ( rule__CommandIf__CondAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1926:1: ( ( rule__CommandIf__CondAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1926:1: ( ( rule__CommandIf__CondAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1927:1: ( rule__CommandIf__CondAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getCondAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1928:1: ( rule__CommandIf__CondAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1928:2: rule__CommandIf__CondAssignment_1
            {
            pushFollow(FOLLOW_rule__CommandIf__CondAssignment_1_in_rule__CommandIf__Group__1__Impl3922);
            rule__CommandIf__CondAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfAccess().getCondAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group__1__Impl"


    // $ANTLR start "rule__CommandIf__Group__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1938:1: rule__CommandIf__Group__2 : rule__CommandIf__Group__2__Impl rule__CommandIf__Group__3 ;
    public final void rule__CommandIf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1942:1: ( rule__CommandIf__Group__2__Impl rule__CommandIf__Group__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1943:2: rule__CommandIf__Group__2__Impl rule__CommandIf__Group__3
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__2__Impl_in_rule__CommandIf__Group__23952);
            rule__CommandIf__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandIf__Group__3_in_rule__CommandIf__Group__23955);
            rule__CommandIf__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group__2"


    // $ANTLR start "rule__CommandIf__Group__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1950:1: rule__CommandIf__Group__2__Impl : ( 'then' ) ;
    public final void rule__CommandIf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1954:1: ( ( 'then' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1955:1: ( 'then' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1955:1: ( 'then' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1956:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getThenKeyword_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__CommandIf__Group__2__Impl3983); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfAccess().getThenKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group__2__Impl"


    // $ANTLR start "rule__CommandIf__Group__3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1969:1: rule__CommandIf__Group__3 : rule__CommandIf__Group__3__Impl rule__CommandIf__Group__4 ;
    public final void rule__CommandIf__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1973:1: ( rule__CommandIf__Group__3__Impl rule__CommandIf__Group__4 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1974:2: rule__CommandIf__Group__3__Impl rule__CommandIf__Group__4
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__3__Impl_in_rule__CommandIf__Group__34014);
            rule__CommandIf__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandIf__Group__4_in_rule__CommandIf__Group__34017);
            rule__CommandIf__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group__3"


    // $ANTLR start "rule__CommandIf__Group__3__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1981:1: rule__CommandIf__Group__3__Impl : ( ( rule__CommandIf__CmdsThenAssignment_3 ) ) ;
    public final void rule__CommandIf__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1985:1: ( ( ( rule__CommandIf__CmdsThenAssignment_3 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1986:1: ( ( rule__CommandIf__CmdsThenAssignment_3 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1986:1: ( ( rule__CommandIf__CmdsThenAssignment_3 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1987:1: ( rule__CommandIf__CmdsThenAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getCmdsThenAssignment_3()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1988:1: ( rule__CommandIf__CmdsThenAssignment_3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1988:2: rule__CommandIf__CmdsThenAssignment_3
            {
            pushFollow(FOLLOW_rule__CommandIf__CmdsThenAssignment_3_in_rule__CommandIf__Group__3__Impl4044);
            rule__CommandIf__CmdsThenAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfAccess().getCmdsThenAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group__3__Impl"


    // $ANTLR start "rule__CommandIf__Group__4"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1998:1: rule__CommandIf__Group__4 : rule__CommandIf__Group__4__Impl rule__CommandIf__Group__5 ;
    public final void rule__CommandIf__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2002:1: ( rule__CommandIf__Group__4__Impl rule__CommandIf__Group__5 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2003:2: rule__CommandIf__Group__4__Impl rule__CommandIf__Group__5
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__4__Impl_in_rule__CommandIf__Group__44074);
            rule__CommandIf__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandIf__Group__5_in_rule__CommandIf__Group__44077);
            rule__CommandIf__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group__4"


    // $ANTLR start "rule__CommandIf__Group__4__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2010:1: rule__CommandIf__Group__4__Impl : ( ( rule__CommandIf__Group_4__0 )? ) ;
    public final void rule__CommandIf__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2014:1: ( ( ( rule__CommandIf__Group_4__0 )? ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2015:1: ( ( rule__CommandIf__Group_4__0 )? )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2015:1: ( ( rule__CommandIf__Group_4__0 )? )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2016:1: ( rule__CommandIf__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getGroup_4()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2017:1: ( rule__CommandIf__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2017:2: rule__CommandIf__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__CommandIf__Group_4__0_in_rule__CommandIf__Group__4__Impl4104);
                    rule__CommandIf__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group__4__Impl"


    // $ANTLR start "rule__CommandIf__Group__5"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2027:1: rule__CommandIf__Group__5 : rule__CommandIf__Group__5__Impl ;
    public final void rule__CommandIf__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2031:1: ( rule__CommandIf__Group__5__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2032:2: rule__CommandIf__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__5__Impl_in_rule__CommandIf__Group__54135);
            rule__CommandIf__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group__5"


    // $ANTLR start "rule__CommandIf__Group__5__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2038:1: rule__CommandIf__Group__5__Impl : ( 'fi' ) ;
    public final void rule__CommandIf__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2042:1: ( ( 'fi' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2043:1: ( 'fi' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2043:1: ( 'fi' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2044:1: 'fi'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getFiKeyword_5()); 
            }
            match(input,27,FOLLOW_27_in_rule__CommandIf__Group__5__Impl4163); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfAccess().getFiKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group__5__Impl"


    // $ANTLR start "rule__CommandIf__Group_4__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2069:1: rule__CommandIf__Group_4__0 : rule__CommandIf__Group_4__0__Impl rule__CommandIf__Group_4__1 ;
    public final void rule__CommandIf__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2073:1: ( rule__CommandIf__Group_4__0__Impl rule__CommandIf__Group_4__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2074:2: rule__CommandIf__Group_4__0__Impl rule__CommandIf__Group_4__1
            {
            pushFollow(FOLLOW_rule__CommandIf__Group_4__0__Impl_in_rule__CommandIf__Group_4__04206);
            rule__CommandIf__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandIf__Group_4__1_in_rule__CommandIf__Group_4__04209);
            rule__CommandIf__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group_4__0"


    // $ANTLR start "rule__CommandIf__Group_4__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2081:1: rule__CommandIf__Group_4__0__Impl : ( 'else' ) ;
    public final void rule__CommandIf__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2085:1: ( ( 'else' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2086:1: ( 'else' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2086:1: ( 'else' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2087:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getElseKeyword_4_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__CommandIf__Group_4__0__Impl4237); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfAccess().getElseKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group_4__0__Impl"


    // $ANTLR start "rule__CommandIf__Group_4__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2100:1: rule__CommandIf__Group_4__1 : rule__CommandIf__Group_4__1__Impl ;
    public final void rule__CommandIf__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2104:1: ( rule__CommandIf__Group_4__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2105:2: rule__CommandIf__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__CommandIf__Group_4__1__Impl_in_rule__CommandIf__Group_4__14268);
            rule__CommandIf__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group_4__1"


    // $ANTLR start "rule__CommandIf__Group_4__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2111:1: rule__CommandIf__Group_4__1__Impl : ( ( rule__CommandIf__CmdsElseAssignment_4_1 ) ) ;
    public final void rule__CommandIf__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2115:1: ( ( ( rule__CommandIf__CmdsElseAssignment_4_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2116:1: ( ( rule__CommandIf__CmdsElseAssignment_4_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2116:1: ( ( rule__CommandIf__CmdsElseAssignment_4_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2117:1: ( rule__CommandIf__CmdsElseAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getCmdsElseAssignment_4_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2118:1: ( rule__CommandIf__CmdsElseAssignment_4_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2118:2: rule__CommandIf__CmdsElseAssignment_4_1
            {
            pushFollow(FOLLOW_rule__CommandIf__CmdsElseAssignment_4_1_in_rule__CommandIf__Group_4__1__Impl4295);
            rule__CommandIf__CmdsElseAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfAccess().getCmdsElseAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group_4__1__Impl"


    // $ANTLR start "rule__CommandForEach__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2132:1: rule__CommandForEach__Group__0 : rule__CommandForEach__Group__0__Impl rule__CommandForEach__Group__1 ;
    public final void rule__CommandForEach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2136:1: ( rule__CommandForEach__Group__0__Impl rule__CommandForEach__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2137:2: rule__CommandForEach__Group__0__Impl rule__CommandForEach__Group__1
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__0__Impl_in_rule__CommandForEach__Group__04329);
            rule__CommandForEach__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandForEach__Group__1_in_rule__CommandForEach__Group__04332);
            rule__CommandForEach__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__0"


    // $ANTLR start "rule__CommandForEach__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2144:1: rule__CommandForEach__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__CommandForEach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2148:1: ( ( 'foreach' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2149:1: ( 'foreach' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2149:1: ( 'foreach' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2150:1: 'foreach'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getForeachKeyword_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__CommandForEach__Group__0__Impl4360); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandForEachAccess().getForeachKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__0__Impl"


    // $ANTLR start "rule__CommandForEach__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2163:1: rule__CommandForEach__Group__1 : rule__CommandForEach__Group__1__Impl rule__CommandForEach__Group__2 ;
    public final void rule__CommandForEach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2167:1: ( rule__CommandForEach__Group__1__Impl rule__CommandForEach__Group__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2168:2: rule__CommandForEach__Group__1__Impl rule__CommandForEach__Group__2
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__1__Impl_in_rule__CommandForEach__Group__14391);
            rule__CommandForEach__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandForEach__Group__2_in_rule__CommandForEach__Group__14394);
            rule__CommandForEach__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__1"


    // $ANTLR start "rule__CommandForEach__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2175:1: rule__CommandForEach__Group__1__Impl : ( ( rule__CommandForEach__ElemAssignment_1 ) ) ;
    public final void rule__CommandForEach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2179:1: ( ( ( rule__CommandForEach__ElemAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2180:1: ( ( rule__CommandForEach__ElemAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2180:1: ( ( rule__CommandForEach__ElemAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2181:1: ( rule__CommandForEach__ElemAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getElemAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2182:1: ( rule__CommandForEach__ElemAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2182:2: rule__CommandForEach__ElemAssignment_1
            {
            pushFollow(FOLLOW_rule__CommandForEach__ElemAssignment_1_in_rule__CommandForEach__Group__1__Impl4421);
            rule__CommandForEach__ElemAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandForEachAccess().getElemAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__1__Impl"


    // $ANTLR start "rule__CommandForEach__Group__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2192:1: rule__CommandForEach__Group__2 : rule__CommandForEach__Group__2__Impl rule__CommandForEach__Group__3 ;
    public final void rule__CommandForEach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2196:1: ( rule__CommandForEach__Group__2__Impl rule__CommandForEach__Group__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2197:2: rule__CommandForEach__Group__2__Impl rule__CommandForEach__Group__3
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__2__Impl_in_rule__CommandForEach__Group__24451);
            rule__CommandForEach__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandForEach__Group__3_in_rule__CommandForEach__Group__24454);
            rule__CommandForEach__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__2"


    // $ANTLR start "rule__CommandForEach__Group__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2204:1: rule__CommandForEach__Group__2__Impl : ( 'in' ) ;
    public final void rule__CommandForEach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2208:1: ( ( 'in' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2209:1: ( 'in' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2209:1: ( 'in' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2210:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getInKeyword_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__CommandForEach__Group__2__Impl4482); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandForEachAccess().getInKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__2__Impl"


    // $ANTLR start "rule__CommandForEach__Group__3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2223:1: rule__CommandForEach__Group__3 : rule__CommandForEach__Group__3__Impl rule__CommandForEach__Group__4 ;
    public final void rule__CommandForEach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2227:1: ( rule__CommandForEach__Group__3__Impl rule__CommandForEach__Group__4 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2228:2: rule__CommandForEach__Group__3__Impl rule__CommandForEach__Group__4
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__3__Impl_in_rule__CommandForEach__Group__34513);
            rule__CommandForEach__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandForEach__Group__4_in_rule__CommandForEach__Group__34516);
            rule__CommandForEach__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__3"


    // $ANTLR start "rule__CommandForEach__Group__3__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2235:1: rule__CommandForEach__Group__3__Impl : ( ( rule__CommandForEach__EnsembAssignment_3 ) ) ;
    public final void rule__CommandForEach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2239:1: ( ( ( rule__CommandForEach__EnsembAssignment_3 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2240:1: ( ( rule__CommandForEach__EnsembAssignment_3 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2240:1: ( ( rule__CommandForEach__EnsembAssignment_3 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2241:1: ( rule__CommandForEach__EnsembAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getEnsembAssignment_3()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2242:1: ( rule__CommandForEach__EnsembAssignment_3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2242:2: rule__CommandForEach__EnsembAssignment_3
            {
            pushFollow(FOLLOW_rule__CommandForEach__EnsembAssignment_3_in_rule__CommandForEach__Group__3__Impl4543);
            rule__CommandForEach__EnsembAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandForEachAccess().getEnsembAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__3__Impl"


    // $ANTLR start "rule__CommandForEach__Group__4"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2252:1: rule__CommandForEach__Group__4 : rule__CommandForEach__Group__4__Impl rule__CommandForEach__Group__5 ;
    public final void rule__CommandForEach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2256:1: ( rule__CommandForEach__Group__4__Impl rule__CommandForEach__Group__5 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2257:2: rule__CommandForEach__Group__4__Impl rule__CommandForEach__Group__5
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__4__Impl_in_rule__CommandForEach__Group__44573);
            rule__CommandForEach__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandForEach__Group__5_in_rule__CommandForEach__Group__44576);
            rule__CommandForEach__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__4"


    // $ANTLR start "rule__CommandForEach__Group__4__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2264:1: rule__CommandForEach__Group__4__Impl : ( 'do' ) ;
    public final void rule__CommandForEach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2268:1: ( ( 'do' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2269:1: ( 'do' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2269:1: ( 'do' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2270:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getDoKeyword_4()); 
            }
            match(input,23,FOLLOW_23_in_rule__CommandForEach__Group__4__Impl4604); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandForEachAccess().getDoKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__4__Impl"


    // $ANTLR start "rule__CommandForEach__Group__5"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2283:1: rule__CommandForEach__Group__5 : rule__CommandForEach__Group__5__Impl rule__CommandForEach__Group__6 ;
    public final void rule__CommandForEach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2287:1: ( rule__CommandForEach__Group__5__Impl rule__CommandForEach__Group__6 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2288:2: rule__CommandForEach__Group__5__Impl rule__CommandForEach__Group__6
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__5__Impl_in_rule__CommandForEach__Group__54635);
            rule__CommandForEach__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandForEach__Group__6_in_rule__CommandForEach__Group__54638);
            rule__CommandForEach__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__5"


    // $ANTLR start "rule__CommandForEach__Group__5__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2295:1: rule__CommandForEach__Group__5__Impl : ( ( rule__CommandForEach__CmdsAssignment_5 ) ) ;
    public final void rule__CommandForEach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2299:1: ( ( ( rule__CommandForEach__CmdsAssignment_5 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2300:1: ( ( rule__CommandForEach__CmdsAssignment_5 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2300:1: ( ( rule__CommandForEach__CmdsAssignment_5 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2301:1: ( rule__CommandForEach__CmdsAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getCmdsAssignment_5()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2302:1: ( rule__CommandForEach__CmdsAssignment_5 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2302:2: rule__CommandForEach__CmdsAssignment_5
            {
            pushFollow(FOLLOW_rule__CommandForEach__CmdsAssignment_5_in_rule__CommandForEach__Group__5__Impl4665);
            rule__CommandForEach__CmdsAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandForEachAccess().getCmdsAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__5__Impl"


    // $ANTLR start "rule__CommandForEach__Group__6"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2312:1: rule__CommandForEach__Group__6 : rule__CommandForEach__Group__6__Impl ;
    public final void rule__CommandForEach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2316:1: ( rule__CommandForEach__Group__6__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2317:2: rule__CommandForEach__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__6__Impl_in_rule__CommandForEach__Group__64695);
            rule__CommandForEach__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__6"


    // $ANTLR start "rule__CommandForEach__Group__6__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2323:1: rule__CommandForEach__Group__6__Impl : ( 'od' ) ;
    public final void rule__CommandForEach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2327:1: ( ( 'od' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2328:1: ( 'od' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2328:1: ( 'od' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2329:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getOdKeyword_6()); 
            }
            match(input,24,FOLLOW_24_in_rule__CommandForEach__Group__6__Impl4723); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandForEachAccess().getOdKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__6__Impl"


    // $ANTLR start "rule__Exprs__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2356:1: rule__Exprs__Group__0 : rule__Exprs__Group__0__Impl rule__Exprs__Group__1 ;
    public final void rule__Exprs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2360:1: ( rule__Exprs__Group__0__Impl rule__Exprs__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2361:2: rule__Exprs__Group__0__Impl rule__Exprs__Group__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__04768);
            rule__Exprs__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__04771);
            rule__Exprs__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group__0"


    // $ANTLR start "rule__Exprs__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2368:1: rule__Exprs__Group__0__Impl : ( ( rule__Exprs__Group_0__0 )* ) ;
    public final void rule__Exprs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2372:1: ( ( ( rule__Exprs__Group_0__0 )* ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2373:1: ( ( rule__Exprs__Group_0__0 )* )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2373:1: ( ( rule__Exprs__Group_0__0 )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2374:1: ( rule__Exprs__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getGroup_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2375:1: ( rule__Exprs__Group_0__0 )*
            loop13:
            do {
                int alt13=2;
                switch ( input.LA(1) ) {
                case 36:
                    {
                    int LA13_1 = input.LA(2);

                    if ( (synpred21_InternalWhileCpp()) ) {
                        alt13=1;
                    }


                    }
                    break;
                case RULE_VARIABLE:
                    {
                    int LA13_2 = input.LA(2);

                    if ( (synpred21_InternalWhileCpp()) ) {
                        alt13=1;
                    }


                    }
                    break;
                case RULE_SYMBOL:
                    {
                    int LA13_3 = input.LA(2);

                    if ( (synpred21_InternalWhileCpp()) ) {
                        alt13=1;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA13_4 = input.LA(2);

                    if ( (synpred21_InternalWhileCpp()) ) {
                        alt13=1;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA13_5 = input.LA(2);

                    if ( (synpred21_InternalWhileCpp()) ) {
                        alt13=1;
                    }


                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2375:2: rule__Exprs__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Exprs__Group_0__0_in_rule__Exprs__Group__0__Impl4798);
            	    rule__Exprs__Group_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group__0__Impl"


    // $ANTLR start "rule__Exprs__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2385:1: rule__Exprs__Group__1 : rule__Exprs__Group__1__Impl ;
    public final void rule__Exprs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2389:1: ( rule__Exprs__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2390:2: rule__Exprs__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__14829);
            rule__Exprs__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group__1"


    // $ANTLR start "rule__Exprs__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2396:1: rule__Exprs__Group__1__Impl : ( ( rule__Exprs__ExpGenAssignment_1 ) ) ;
    public final void rule__Exprs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2400:1: ( ( ( rule__Exprs__ExpGenAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2401:1: ( ( rule__Exprs__ExpGenAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2401:1: ( ( rule__Exprs__ExpGenAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2402:1: ( rule__Exprs__ExpGenAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExpGenAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2403:1: ( rule__Exprs__ExpGenAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2403:2: rule__Exprs__ExpGenAssignment_1
            {
            pushFollow(FOLLOW_rule__Exprs__ExpGenAssignment_1_in_rule__Exprs__Group__1__Impl4856);
            rule__Exprs__ExpGenAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExpGenAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group__1__Impl"


    // $ANTLR start "rule__Exprs__Group_0__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2417:1: rule__Exprs__Group_0__0 : rule__Exprs__Group_0__0__Impl ;
    public final void rule__Exprs__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2421:1: ( rule__Exprs__Group_0__0__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2422:2: rule__Exprs__Group_0__0__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group_0__0__Impl_in_rule__Exprs__Group_0__04890);
            rule__Exprs__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_0__0"


    // $ANTLR start "rule__Exprs__Group_0__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2428:1: rule__Exprs__Group_0__0__Impl : ( ( rule__Exprs__Group_0_0__0 ) ) ;
    public final void rule__Exprs__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2432:1: ( ( ( rule__Exprs__Group_0_0__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2433:1: ( ( rule__Exprs__Group_0_0__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2433:1: ( ( rule__Exprs__Group_0_0__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2434:1: ( rule__Exprs__Group_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getGroup_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2435:1: ( rule__Exprs__Group_0_0__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2435:2: rule__Exprs__Group_0_0__0
            {
            pushFollow(FOLLOW_rule__Exprs__Group_0_0__0_in_rule__Exprs__Group_0__0__Impl4917);
            rule__Exprs__Group_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getGroup_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_0__0__Impl"


    // $ANTLR start "rule__Exprs__Group_0_0__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2447:1: rule__Exprs__Group_0_0__0 : rule__Exprs__Group_0_0__0__Impl rule__Exprs__Group_0_0__1 ;
    public final void rule__Exprs__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2451:1: ( rule__Exprs__Group_0_0__0__Impl rule__Exprs__Group_0_0__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2452:2: rule__Exprs__Group_0_0__0__Impl rule__Exprs__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group_0_0__0__Impl_in_rule__Exprs__Group_0_0__04949);
            rule__Exprs__Group_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group_0_0__1_in_rule__Exprs__Group_0_0__04952);
            rule__Exprs__Group_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_0_0__0"


    // $ANTLR start "rule__Exprs__Group_0_0__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2459:1: rule__Exprs__Group_0_0__0__Impl : ( ( rule__Exprs__ExpGenAssignment_0_0_0 ) ) ;
    public final void rule__Exprs__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2463:1: ( ( ( rule__Exprs__ExpGenAssignment_0_0_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2464:1: ( ( rule__Exprs__ExpGenAssignment_0_0_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2464:1: ( ( rule__Exprs__ExpGenAssignment_0_0_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2465:1: ( rule__Exprs__ExpGenAssignment_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExpGenAssignment_0_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2466:1: ( rule__Exprs__ExpGenAssignment_0_0_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2466:2: rule__Exprs__ExpGenAssignment_0_0_0
            {
            pushFollow(FOLLOW_rule__Exprs__ExpGenAssignment_0_0_0_in_rule__Exprs__Group_0_0__0__Impl4979);
            rule__Exprs__ExpGenAssignment_0_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExpGenAssignment_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_0_0__0__Impl"


    // $ANTLR start "rule__Exprs__Group_0_0__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2476:1: rule__Exprs__Group_0_0__1 : rule__Exprs__Group_0_0__1__Impl ;
    public final void rule__Exprs__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2480:1: ( rule__Exprs__Group_0_0__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2481:2: rule__Exprs__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group_0_0__1__Impl_in_rule__Exprs__Group_0_0__15009);
            rule__Exprs__Group_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_0_0__1"


    // $ANTLR start "rule__Exprs__Group_0_0__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2487:1: rule__Exprs__Group_0_0__1__Impl : ( ',' ) ;
    public final void rule__Exprs__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2491:1: ( ( ',' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2492:1: ( ',' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2492:1: ( ',' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2493:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getCommaKeyword_0_0_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Exprs__Group_0_0__1__Impl5037); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getCommaKeyword_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_0_0__1__Impl"


    // $ANTLR start "rule__Expr__Group_0__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2510:1: rule__Expr__Group_0__0 : rule__Expr__Group_0__0__Impl ;
    public final void rule__Expr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2514:1: ( rule__Expr__Group_0__0__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2515:2: rule__Expr__Group_0__0__Impl
            {
            pushFollow(FOLLOW_rule__Expr__Group_0__0__Impl_in_rule__Expr__Group_0__05072);
            rule__Expr__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_0__0"


    // $ANTLR start "rule__Expr__Group_0__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2521:1: rule__Expr__Group_0__0__Impl : ( ( rule__Expr__ExprSimpAssignment_0_0 ) ) ;
    public final void rule__Expr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2525:1: ( ( ( rule__Expr__ExprSimpAssignment_0_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2526:1: ( ( rule__Expr__ExprSimpAssignment_0_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2526:1: ( ( rule__Expr__ExprSimpAssignment_0_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2527:1: ( rule__Expr__ExprSimpAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExprSimpAssignment_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2528:1: ( rule__Expr__ExprSimpAssignment_0_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2528:2: rule__Expr__ExprSimpAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Expr__ExprSimpAssignment_0_0_in_rule__Expr__Group_0__0__Impl5099);
            rule__Expr__ExprSimpAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getExprSimpAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_0__0__Impl"


    // $ANTLR start "rule__ExprSimple__Group_1__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2540:1: rule__ExprSimple__Group_1__0 : rule__ExprSimple__Group_1__0__Impl rule__ExprSimple__Group_1__1 ;
    public final void rule__ExprSimple__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2544:1: ( rule__ExprSimple__Group_1__0__Impl rule__ExprSimple__Group_1__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2545:2: rule__ExprSimple__Group_1__0__Impl rule__ExprSimple__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1__0__Impl_in_rule__ExprSimple__Group_1__05131);
            rule__ExprSimple__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_1__1_in_rule__ExprSimple__Group_1__05134);
            rule__ExprSimple__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1__0"


    // $ANTLR start "rule__ExprSimple__Group_1__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2552:1: rule__ExprSimple__Group_1__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2556:1: ( ( '(' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2557:1: ( '(' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2557:1: ( '(' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2558:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ExprSimple__Group_1__0__Impl5162); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1__0__Impl"


    // $ANTLR start "rule__ExprSimple__Group_1__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2571:1: rule__ExprSimple__Group_1__1 : rule__ExprSimple__Group_1__1__Impl rule__ExprSimple__Group_1__2 ;
    public final void rule__ExprSimple__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2575:1: ( rule__ExprSimple__Group_1__1__Impl rule__ExprSimple__Group_1__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2576:2: rule__ExprSimple__Group_1__1__Impl rule__ExprSimple__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1__1__Impl_in_rule__ExprSimple__Group_1__15193);
            rule__ExprSimple__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_1__2_in_rule__ExprSimple__Group_1__15196);
            rule__ExprSimple__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1__1"


    // $ANTLR start "rule__ExprSimple__Group_1__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2583:1: rule__ExprSimple__Group_1__1__Impl : ( ( rule__ExprSimple__ExprConsAssignment_1_1 ) ) ;
    public final void rule__ExprSimple__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2587:1: ( ( ( rule__ExprSimple__ExprConsAssignment_1_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2588:1: ( ( rule__ExprSimple__ExprConsAssignment_1_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2588:1: ( ( rule__ExprSimple__ExprConsAssignment_1_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2589:1: ( rule__ExprSimple__ExprConsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprConsAssignment_1_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2590:1: ( rule__ExprSimple__ExprConsAssignment_1_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2590:2: rule__ExprSimple__ExprConsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprConsAssignment_1_1_in_rule__ExprSimple__Group_1__1__Impl5223);
            rule__ExprSimple__ExprConsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprConsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1__1__Impl"


    // $ANTLR start "rule__ExprSimple__Group_1__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2600:1: rule__ExprSimple__Group_1__2 : rule__ExprSimple__Group_1__2__Impl rule__ExprSimple__Group_1__3 ;
    public final void rule__ExprSimple__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2604:1: ( rule__ExprSimple__Group_1__2__Impl rule__ExprSimple__Group_1__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2605:2: rule__ExprSimple__Group_1__2__Impl rule__ExprSimple__Group_1__3
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1__2__Impl_in_rule__ExprSimple__Group_1__25253);
            rule__ExprSimple__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_1__3_in_rule__ExprSimple__Group_1__25256);
            rule__ExprSimple__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1__2"


    // $ANTLR start "rule__ExprSimple__Group_1__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2612:1: rule__ExprSimple__Group_1__2__Impl : ( ( rule__ExprSimple__ExprConsAttAssignment_1_2 ) ) ;
    public final void rule__ExprSimple__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2616:1: ( ( ( rule__ExprSimple__ExprConsAttAssignment_1_2 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2617:1: ( ( rule__ExprSimple__ExprConsAttAssignment_1_2 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2617:1: ( ( rule__ExprSimple__ExprConsAttAssignment_1_2 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2618:1: ( rule__ExprSimple__ExprConsAttAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprConsAttAssignment_1_2()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2619:1: ( rule__ExprSimple__ExprConsAttAssignment_1_2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2619:2: rule__ExprSimple__ExprConsAttAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprConsAttAssignment_1_2_in_rule__ExprSimple__Group_1__2__Impl5283);
            rule__ExprSimple__ExprConsAttAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprConsAttAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1__2__Impl"


    // $ANTLR start "rule__ExprSimple__Group_1__3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2629:1: rule__ExprSimple__Group_1__3 : rule__ExprSimple__Group_1__3__Impl ;
    public final void rule__ExprSimple__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2633:1: ( rule__ExprSimple__Group_1__3__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2634:2: rule__ExprSimple__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1__3__Impl_in_rule__ExprSimple__Group_1__35313);
            rule__ExprSimple__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1__3"


    // $ANTLR start "rule__ExprSimple__Group_1__3__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2640:1: rule__ExprSimple__Group_1__3__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2644:1: ( ( ')' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2645:1: ( ')' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2645:1: ( ')' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2646:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__ExprSimple__Group_1__3__Impl5341); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1__3__Impl"


    // $ANTLR start "rule__ExprSimple__Group_2__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2667:1: rule__ExprSimple__Group_2__0 : rule__ExprSimple__Group_2__0__Impl rule__ExprSimple__Group_2__1 ;
    public final void rule__ExprSimple__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2671:1: ( rule__ExprSimple__Group_2__0__Impl rule__ExprSimple__Group_2__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2672:2: rule__ExprSimple__Group_2__0__Impl rule__ExprSimple__Group_2__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__0__Impl_in_rule__ExprSimple__Group_2__05380);
            rule__ExprSimple__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__1_in_rule__ExprSimple__Group_2__05383);
            rule__ExprSimple__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_2__0"


    // $ANTLR start "rule__ExprSimple__Group_2__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2679:1: rule__ExprSimple__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2683:1: ( ( '(' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2684:1: ( '(' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2684:1: ( '(' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2685:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ExprSimple__Group_2__0__Impl5411); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_2__0__Impl"


    // $ANTLR start "rule__ExprSimple__Group_2__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2698:1: rule__ExprSimple__Group_2__1 : rule__ExprSimple__Group_2__1__Impl rule__ExprSimple__Group_2__2 ;
    public final void rule__ExprSimple__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2702:1: ( rule__ExprSimple__Group_2__1__Impl rule__ExprSimple__Group_2__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2703:2: rule__ExprSimple__Group_2__1__Impl rule__ExprSimple__Group_2__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__1__Impl_in_rule__ExprSimple__Group_2__15442);
            rule__ExprSimple__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__2_in_rule__ExprSimple__Group_2__15445);
            rule__ExprSimple__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_2__1"


    // $ANTLR start "rule__ExprSimple__Group_2__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2710:1: rule__ExprSimple__Group_2__1__Impl : ( ( rule__ExprSimple__ExprListAssignment_2_1 ) ) ;
    public final void rule__ExprSimple__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2714:1: ( ( ( rule__ExprSimple__ExprListAssignment_2_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2715:1: ( ( rule__ExprSimple__ExprListAssignment_2_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2715:1: ( ( rule__ExprSimple__ExprListAssignment_2_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2716:1: ( rule__ExprSimple__ExprListAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprListAssignment_2_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2717:1: ( rule__ExprSimple__ExprListAssignment_2_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2717:2: rule__ExprSimple__ExprListAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprListAssignment_2_1_in_rule__ExprSimple__Group_2__1__Impl5472);
            rule__ExprSimple__ExprListAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprListAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_2__1__Impl"


    // $ANTLR start "rule__ExprSimple__Group_2__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2727:1: rule__ExprSimple__Group_2__2 : rule__ExprSimple__Group_2__2__Impl rule__ExprSimple__Group_2__3 ;
    public final void rule__ExprSimple__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2731:1: ( rule__ExprSimple__Group_2__2__Impl rule__ExprSimple__Group_2__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2732:2: rule__ExprSimple__Group_2__2__Impl rule__ExprSimple__Group_2__3
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__2__Impl_in_rule__ExprSimple__Group_2__25502);
            rule__ExprSimple__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__3_in_rule__ExprSimple__Group_2__25505);
            rule__ExprSimple__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_2__2"


    // $ANTLR start "rule__ExprSimple__Group_2__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2739:1: rule__ExprSimple__Group_2__2__Impl : ( ( rule__ExprSimple__ExprListAttAssignment_2_2 ) ) ;
    public final void rule__ExprSimple__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2743:1: ( ( ( rule__ExprSimple__ExprListAttAssignment_2_2 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2744:1: ( ( rule__ExprSimple__ExprListAttAssignment_2_2 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2744:1: ( ( rule__ExprSimple__ExprListAttAssignment_2_2 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2745:1: ( rule__ExprSimple__ExprListAttAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprListAttAssignment_2_2()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2746:1: ( rule__ExprSimple__ExprListAttAssignment_2_2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2746:2: rule__ExprSimple__ExprListAttAssignment_2_2
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprListAttAssignment_2_2_in_rule__ExprSimple__Group_2__2__Impl5532);
            rule__ExprSimple__ExprListAttAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprListAttAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_2__2__Impl"


    // $ANTLR start "rule__ExprSimple__Group_2__3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2756:1: rule__ExprSimple__Group_2__3 : rule__ExprSimple__Group_2__3__Impl ;
    public final void rule__ExprSimple__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2760:1: ( rule__ExprSimple__Group_2__3__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2761:2: rule__ExprSimple__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__3__Impl_in_rule__ExprSimple__Group_2__35562);
            rule__ExprSimple__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_2__3"


    // $ANTLR start "rule__ExprSimple__Group_2__3__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2767:1: rule__ExprSimple__Group_2__3__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2771:1: ( ( ')' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2772:1: ( ')' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2772:1: ( ')' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2773:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__ExprSimple__Group_2__3__Impl5590); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_2__3__Impl"


    // $ANTLR start "rule__ExprSimple__Group_3__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2794:1: rule__ExprSimple__Group_3__0 : rule__ExprSimple__Group_3__0__Impl rule__ExprSimple__Group_3__1 ;
    public final void rule__ExprSimple__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2798:1: ( rule__ExprSimple__Group_3__0__Impl rule__ExprSimple__Group_3__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2799:2: rule__ExprSimple__Group_3__0__Impl rule__ExprSimple__Group_3__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__0__Impl_in_rule__ExprSimple__Group_3__05629);
            rule__ExprSimple__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__1_in_rule__ExprSimple__Group_3__05632);
            rule__ExprSimple__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_3__0"


    // $ANTLR start "rule__ExprSimple__Group_3__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2806:1: rule__ExprSimple__Group_3__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2810:1: ( ( '(' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2811:1: ( '(' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2811:1: ( '(' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2812:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ExprSimple__Group_3__0__Impl5660); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_3__0__Impl"


    // $ANTLR start "rule__ExprSimple__Group_3__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2825:1: rule__ExprSimple__Group_3__1 : rule__ExprSimple__Group_3__1__Impl rule__ExprSimple__Group_3__2 ;
    public final void rule__ExprSimple__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2829:1: ( rule__ExprSimple__Group_3__1__Impl rule__ExprSimple__Group_3__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2830:2: rule__ExprSimple__Group_3__1__Impl rule__ExprSimple__Group_3__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__1__Impl_in_rule__ExprSimple__Group_3__15691);
            rule__ExprSimple__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__2_in_rule__ExprSimple__Group_3__15694);
            rule__ExprSimple__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_3__1"


    // $ANTLR start "rule__ExprSimple__Group_3__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2837:1: rule__ExprSimple__Group_3__1__Impl : ( ( rule__ExprSimple__ExprHeadAssignment_3_1 ) ) ;
    public final void rule__ExprSimple__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2841:1: ( ( ( rule__ExprSimple__ExprHeadAssignment_3_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2842:1: ( ( rule__ExprSimple__ExprHeadAssignment_3_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2842:1: ( ( rule__ExprSimple__ExprHeadAssignment_3_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2843:1: ( rule__ExprSimple__ExprHeadAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprHeadAssignment_3_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2844:1: ( rule__ExprSimple__ExprHeadAssignment_3_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2844:2: rule__ExprSimple__ExprHeadAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprHeadAssignment_3_1_in_rule__ExprSimple__Group_3__1__Impl5721);
            rule__ExprSimple__ExprHeadAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprHeadAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_3__1__Impl"


    // $ANTLR start "rule__ExprSimple__Group_3__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2854:1: rule__ExprSimple__Group_3__2 : rule__ExprSimple__Group_3__2__Impl rule__ExprSimple__Group_3__3 ;
    public final void rule__ExprSimple__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2858:1: ( rule__ExprSimple__Group_3__2__Impl rule__ExprSimple__Group_3__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2859:2: rule__ExprSimple__Group_3__2__Impl rule__ExprSimple__Group_3__3
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__2__Impl_in_rule__ExprSimple__Group_3__25751);
            rule__ExprSimple__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__3_in_rule__ExprSimple__Group_3__25754);
            rule__ExprSimple__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_3__2"


    // $ANTLR start "rule__ExprSimple__Group_3__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2866:1: rule__ExprSimple__Group_3__2__Impl : ( ( rule__ExprSimple__ExprHeadAttAssignment_3_2 ) ) ;
    public final void rule__ExprSimple__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2870:1: ( ( ( rule__ExprSimple__ExprHeadAttAssignment_3_2 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2871:1: ( ( rule__ExprSimple__ExprHeadAttAssignment_3_2 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2871:1: ( ( rule__ExprSimple__ExprHeadAttAssignment_3_2 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2872:1: ( rule__ExprSimple__ExprHeadAttAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprHeadAttAssignment_3_2()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2873:1: ( rule__ExprSimple__ExprHeadAttAssignment_3_2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2873:2: rule__ExprSimple__ExprHeadAttAssignment_3_2
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprHeadAttAssignment_3_2_in_rule__ExprSimple__Group_3__2__Impl5781);
            rule__ExprSimple__ExprHeadAttAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprHeadAttAssignment_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_3__2__Impl"


    // $ANTLR start "rule__ExprSimple__Group_3__3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2883:1: rule__ExprSimple__Group_3__3 : rule__ExprSimple__Group_3__3__Impl ;
    public final void rule__ExprSimple__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2887:1: ( rule__ExprSimple__Group_3__3__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2888:2: rule__ExprSimple__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__3__Impl_in_rule__ExprSimple__Group_3__35811);
            rule__ExprSimple__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_3__3"


    // $ANTLR start "rule__ExprSimple__Group_3__3__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2894:1: rule__ExprSimple__Group_3__3__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2898:1: ( ( ')' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2899:1: ( ')' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2899:1: ( ')' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2900:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__ExprSimple__Group_3__3__Impl5839); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_3__3__Impl"


    // $ANTLR start "rule__ExprSimple__Group_4__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2921:1: rule__ExprSimple__Group_4__0 : rule__ExprSimple__Group_4__0__Impl rule__ExprSimple__Group_4__1 ;
    public final void rule__ExprSimple__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2925:1: ( rule__ExprSimple__Group_4__0__Impl rule__ExprSimple__Group_4__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2926:2: rule__ExprSimple__Group_4__0__Impl rule__ExprSimple__Group_4__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__0__Impl_in_rule__ExprSimple__Group_4__05878);
            rule__ExprSimple__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__1_in_rule__ExprSimple__Group_4__05881);
            rule__ExprSimple__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_4__0"


    // $ANTLR start "rule__ExprSimple__Group_4__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2933:1: rule__ExprSimple__Group_4__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2937:1: ( ( '(' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2938:1: ( '(' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2938:1: ( '(' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2939:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_4_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ExprSimple__Group_4__0__Impl5909); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_4__0__Impl"


    // $ANTLR start "rule__ExprSimple__Group_4__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2952:1: rule__ExprSimple__Group_4__1 : rule__ExprSimple__Group_4__1__Impl rule__ExprSimple__Group_4__2 ;
    public final void rule__ExprSimple__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2956:1: ( rule__ExprSimple__Group_4__1__Impl rule__ExprSimple__Group_4__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2957:2: rule__ExprSimple__Group_4__1__Impl rule__ExprSimple__Group_4__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__1__Impl_in_rule__ExprSimple__Group_4__15940);
            rule__ExprSimple__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__2_in_rule__ExprSimple__Group_4__15943);
            rule__ExprSimple__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_4__1"


    // $ANTLR start "rule__ExprSimple__Group_4__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2964:1: rule__ExprSimple__Group_4__1__Impl : ( ( rule__ExprSimple__ExprTailAssignment_4_1 ) ) ;
    public final void rule__ExprSimple__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2968:1: ( ( ( rule__ExprSimple__ExprTailAssignment_4_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2969:1: ( ( rule__ExprSimple__ExprTailAssignment_4_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2969:1: ( ( rule__ExprSimple__ExprTailAssignment_4_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2970:1: ( rule__ExprSimple__ExprTailAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprTailAssignment_4_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2971:1: ( rule__ExprSimple__ExprTailAssignment_4_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2971:2: rule__ExprSimple__ExprTailAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprTailAssignment_4_1_in_rule__ExprSimple__Group_4__1__Impl5970);
            rule__ExprSimple__ExprTailAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprTailAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_4__1__Impl"


    // $ANTLR start "rule__ExprSimple__Group_4__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2981:1: rule__ExprSimple__Group_4__2 : rule__ExprSimple__Group_4__2__Impl rule__ExprSimple__Group_4__3 ;
    public final void rule__ExprSimple__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2985:1: ( rule__ExprSimple__Group_4__2__Impl rule__ExprSimple__Group_4__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2986:2: rule__ExprSimple__Group_4__2__Impl rule__ExprSimple__Group_4__3
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__2__Impl_in_rule__ExprSimple__Group_4__26000);
            rule__ExprSimple__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__3_in_rule__ExprSimple__Group_4__26003);
            rule__ExprSimple__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_4__2"


    // $ANTLR start "rule__ExprSimple__Group_4__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2993:1: rule__ExprSimple__Group_4__2__Impl : ( ( rule__ExprSimple__ExprTailAttAssignment_4_2 ) ) ;
    public final void rule__ExprSimple__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2997:1: ( ( ( rule__ExprSimple__ExprTailAttAssignment_4_2 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2998:1: ( ( rule__ExprSimple__ExprTailAttAssignment_4_2 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2998:1: ( ( rule__ExprSimple__ExprTailAttAssignment_4_2 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2999:1: ( rule__ExprSimple__ExprTailAttAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprTailAttAssignment_4_2()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3000:1: ( rule__ExprSimple__ExprTailAttAssignment_4_2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3000:2: rule__ExprSimple__ExprTailAttAssignment_4_2
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprTailAttAssignment_4_2_in_rule__ExprSimple__Group_4__2__Impl6030);
            rule__ExprSimple__ExprTailAttAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprTailAttAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_4__2__Impl"


    // $ANTLR start "rule__ExprSimple__Group_4__3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3010:1: rule__ExprSimple__Group_4__3 : rule__ExprSimple__Group_4__3__Impl ;
    public final void rule__ExprSimple__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3014:1: ( rule__ExprSimple__Group_4__3__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3015:2: rule__ExprSimple__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__3__Impl_in_rule__ExprSimple__Group_4__36060);
            rule__ExprSimple__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_4__3"


    // $ANTLR start "rule__ExprSimple__Group_4__3__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3021:1: rule__ExprSimple__Group_4__3__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3025:1: ( ( ')' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3026:1: ( ')' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3026:1: ( ')' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3027:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_4_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__ExprSimple__Group_4__3__Impl6088); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_4__3__Impl"


    // $ANTLR start "rule__ExprSimple__Group_5__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3048:1: rule__ExprSimple__Group_5__0 : rule__ExprSimple__Group_5__0__Impl rule__ExprSimple__Group_5__1 ;
    public final void rule__ExprSimple__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3052:1: ( rule__ExprSimple__Group_5__0__Impl rule__ExprSimple__Group_5__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3053:2: rule__ExprSimple__Group_5__0__Impl rule__ExprSimple__Group_5__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_5__0__Impl_in_rule__ExprSimple__Group_5__06127);
            rule__ExprSimple__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_5__1_in_rule__ExprSimple__Group_5__06130);
            rule__ExprSimple__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_5__0"


    // $ANTLR start "rule__ExprSimple__Group_5__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3060:1: rule__ExprSimple__Group_5__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3064:1: ( ( '(' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3065:1: ( '(' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3065:1: ( '(' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3066:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ExprSimple__Group_5__0__Impl6158); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_5__0__Impl"


    // $ANTLR start "rule__ExprSimple__Group_5__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3079:1: rule__ExprSimple__Group_5__1 : rule__ExprSimple__Group_5__1__Impl rule__ExprSimple__Group_5__2 ;
    public final void rule__ExprSimple__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3083:1: ( rule__ExprSimple__Group_5__1__Impl rule__ExprSimple__Group_5__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3084:2: rule__ExprSimple__Group_5__1__Impl rule__ExprSimple__Group_5__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_5__1__Impl_in_rule__ExprSimple__Group_5__16189);
            rule__ExprSimple__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_5__2_in_rule__ExprSimple__Group_5__16192);
            rule__ExprSimple__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_5__1"


    // $ANTLR start "rule__ExprSimple__Group_5__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3091:1: rule__ExprSimple__Group_5__1__Impl : ( ( rule__ExprSimple__NomSymbAssignment_5_1 ) ) ;
    public final void rule__ExprSimple__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3095:1: ( ( ( rule__ExprSimple__NomSymbAssignment_5_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3096:1: ( ( rule__ExprSimple__NomSymbAssignment_5_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3096:1: ( ( rule__ExprSimple__NomSymbAssignment_5_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3097:1: ( rule__ExprSimple__NomSymbAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getNomSymbAssignment_5_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3098:1: ( rule__ExprSimple__NomSymbAssignment_5_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3098:2: rule__ExprSimple__NomSymbAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__NomSymbAssignment_5_1_in_rule__ExprSimple__Group_5__1__Impl6219);
            rule__ExprSimple__NomSymbAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getNomSymbAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_5__1__Impl"


    // $ANTLR start "rule__ExprSimple__Group_5__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3108:1: rule__ExprSimple__Group_5__2 : rule__ExprSimple__Group_5__2__Impl rule__ExprSimple__Group_5__3 ;
    public final void rule__ExprSimple__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3112:1: ( rule__ExprSimple__Group_5__2__Impl rule__ExprSimple__Group_5__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3113:2: rule__ExprSimple__Group_5__2__Impl rule__ExprSimple__Group_5__3
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_5__2__Impl_in_rule__ExprSimple__Group_5__26249);
            rule__ExprSimple__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_5__3_in_rule__ExprSimple__Group_5__26252);
            rule__ExprSimple__Group_5__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_5__2"


    // $ANTLR start "rule__ExprSimple__Group_5__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3120:1: rule__ExprSimple__Group_5__2__Impl : ( ( rule__ExprSimple__SymbAttAssignment_5_2 ) ) ;
    public final void rule__ExprSimple__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3124:1: ( ( ( rule__ExprSimple__SymbAttAssignment_5_2 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3125:1: ( ( rule__ExprSimple__SymbAttAssignment_5_2 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3125:1: ( ( rule__ExprSimple__SymbAttAssignment_5_2 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3126:1: ( rule__ExprSimple__SymbAttAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getSymbAttAssignment_5_2()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3127:1: ( rule__ExprSimple__SymbAttAssignment_5_2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3127:2: rule__ExprSimple__SymbAttAssignment_5_2
            {
            pushFollow(FOLLOW_rule__ExprSimple__SymbAttAssignment_5_2_in_rule__ExprSimple__Group_5__2__Impl6279);
            rule__ExprSimple__SymbAttAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getSymbAttAssignment_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_5__2__Impl"


    // $ANTLR start "rule__ExprSimple__Group_5__3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3137:1: rule__ExprSimple__Group_5__3 : rule__ExprSimple__Group_5__3__Impl ;
    public final void rule__ExprSimple__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3141:1: ( rule__ExprSimple__Group_5__3__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3142:2: rule__ExprSimple__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_5__3__Impl_in_rule__ExprSimple__Group_5__36309);
            rule__ExprSimple__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_5__3"


    // $ANTLR start "rule__ExprSimple__Group_5__3__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3148:1: rule__ExprSimple__Group_5__3__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3152:1: ( ( ')' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3153:1: ( ')' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3153:1: ( ')' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3154:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_5_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__ExprSimple__Group_5__3__Impl6337); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_5_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_5__3__Impl"


    // $ANTLR start "rule__ExprAnd__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3175:1: rule__ExprAnd__Group__0 : rule__ExprAnd__Group__0__Impl rule__ExprAnd__Group__1 ;
    public final void rule__ExprAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3179:1: ( rule__ExprAnd__Group__0__Impl rule__ExprAnd__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3180:2: rule__ExprAnd__Group__0__Impl rule__ExprAnd__Group__1
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group__0__Impl_in_rule__ExprAnd__Group__06376);
            rule__ExprAnd__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprAnd__Group__1_in_rule__ExprAnd__Group__06379);
            rule__ExprAnd__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group__0"


    // $ANTLR start "rule__ExprAnd__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3187:1: rule__ExprAnd__Group__0__Impl : ( ( rule__ExprAnd__ExprOrAssignment_0 ) ) ;
    public final void rule__ExprAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3191:1: ( ( ( rule__ExprAnd__ExprOrAssignment_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3192:1: ( ( rule__ExprAnd__ExprOrAssignment_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3192:1: ( ( rule__ExprAnd__ExprOrAssignment_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3193:1: ( rule__ExprAnd__ExprOrAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprOrAssignment_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3194:1: ( rule__ExprAnd__ExprOrAssignment_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3194:2: rule__ExprAnd__ExprOrAssignment_0
            {
            pushFollow(FOLLOW_rule__ExprAnd__ExprOrAssignment_0_in_rule__ExprAnd__Group__0__Impl6406);
            rule__ExprAnd__ExprOrAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getExprOrAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group__0__Impl"


    // $ANTLR start "rule__ExprAnd__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3204:1: rule__ExprAnd__Group__1 : rule__ExprAnd__Group__1__Impl ;
    public final void rule__ExprAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3208:1: ( rule__ExprAnd__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3209:2: rule__ExprAnd__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group__1__Impl_in_rule__ExprAnd__Group__16436);
            rule__ExprAnd__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group__1"


    // $ANTLR start "rule__ExprAnd__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3215:1: rule__ExprAnd__Group__1__Impl : ( ( rule__ExprAnd__Group_1__0 )? ) ;
    public final void rule__ExprAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3219:1: ( ( ( rule__ExprAnd__Group_1__0 )? ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3220:1: ( ( rule__ExprAnd__Group_1__0 )? )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3220:1: ( ( rule__ExprAnd__Group_1__0 )? )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3221:1: ( rule__ExprAnd__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getGroup_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3222:1: ( rule__ExprAnd__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3222:2: rule__ExprAnd__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprAnd__Group_1__0_in_rule__ExprAnd__Group__1__Impl6463);
                    rule__ExprAnd__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group__1__Impl"


    // $ANTLR start "rule__ExprAnd__Group_1__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3236:1: rule__ExprAnd__Group_1__0 : rule__ExprAnd__Group_1__0__Impl rule__ExprAnd__Group_1__1 ;
    public final void rule__ExprAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3240:1: ( rule__ExprAnd__Group_1__0__Impl rule__ExprAnd__Group_1__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3241:2: rule__ExprAnd__Group_1__0__Impl rule__ExprAnd__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__0__Impl_in_rule__ExprAnd__Group_1__06498);
            rule__ExprAnd__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__1_in_rule__ExprAnd__Group_1__06501);
            rule__ExprAnd__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group_1__0"


    // $ANTLR start "rule__ExprAnd__Group_1__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3248:1: rule__ExprAnd__Group_1__0__Impl : ( ( rule__ExprAnd__ExprAndAssignment_1_0 ) ) ;
    public final void rule__ExprAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3252:1: ( ( ( rule__ExprAnd__ExprAndAssignment_1_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3253:1: ( ( rule__ExprAnd__ExprAndAssignment_1_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3253:1: ( ( rule__ExprAnd__ExprAndAssignment_1_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3254:1: ( rule__ExprAnd__ExprAndAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprAndAssignment_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3255:1: ( rule__ExprAnd__ExprAndAssignment_1_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3255:2: rule__ExprAnd__ExprAndAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ExprAnd__ExprAndAssignment_1_0_in_rule__ExprAnd__Group_1__0__Impl6528);
            rule__ExprAnd__ExprAndAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getExprAndAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group_1__0__Impl"


    // $ANTLR start "rule__ExprAnd__Group_1__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3265:1: rule__ExprAnd__Group_1__1 : rule__ExprAnd__Group_1__1__Impl ;
    public final void rule__ExprAnd__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3269:1: ( rule__ExprAnd__Group_1__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3270:2: rule__ExprAnd__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__1__Impl_in_rule__ExprAnd__Group_1__16558);
            rule__ExprAnd__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group_1__1"


    // $ANTLR start "rule__ExprAnd__Group_1__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3276:1: rule__ExprAnd__Group_1__1__Impl : ( ( rule__ExprAnd__ExprAndAttAssignment_1_1 ) ) ;
    public final void rule__ExprAnd__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3280:1: ( ( ( rule__ExprAnd__ExprAndAttAssignment_1_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3281:1: ( ( rule__ExprAnd__ExprAndAttAssignment_1_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3281:1: ( ( rule__ExprAnd__ExprAndAttAssignment_1_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3282:1: ( rule__ExprAnd__ExprAndAttAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprAndAttAssignment_1_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3283:1: ( rule__ExprAnd__ExprAndAttAssignment_1_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3283:2: rule__ExprAnd__ExprAndAttAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExprAnd__ExprAndAttAssignment_1_1_in_rule__ExprAnd__Group_1__1__Impl6585);
            rule__ExprAnd__ExprAndAttAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getExprAndAttAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group_1__1__Impl"


    // $ANTLR start "rule__ExprOr__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3297:1: rule__ExprOr__Group__0 : rule__ExprOr__Group__0__Impl rule__ExprOr__Group__1 ;
    public final void rule__ExprOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3301:1: ( rule__ExprOr__Group__0__Impl rule__ExprOr__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3302:2: rule__ExprOr__Group__0__Impl rule__ExprOr__Group__1
            {
            pushFollow(FOLLOW_rule__ExprOr__Group__0__Impl_in_rule__ExprOr__Group__06619);
            rule__ExprOr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprOr__Group__1_in_rule__ExprOr__Group__06622);
            rule__ExprOr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group__0"


    // $ANTLR start "rule__ExprOr__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3309:1: rule__ExprOr__Group__0__Impl : ( ( rule__ExprOr__ExprNotAssignment_0 ) ) ;
    public final void rule__ExprOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3313:1: ( ( ( rule__ExprOr__ExprNotAssignment_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3314:1: ( ( rule__ExprOr__ExprNotAssignment_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3314:1: ( ( rule__ExprOr__ExprNotAssignment_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3315:1: ( rule__ExprOr__ExprNotAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprNotAssignment_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3316:1: ( rule__ExprOr__ExprNotAssignment_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3316:2: rule__ExprOr__ExprNotAssignment_0
            {
            pushFollow(FOLLOW_rule__ExprOr__ExprNotAssignment_0_in_rule__ExprOr__Group__0__Impl6649);
            rule__ExprOr__ExprNotAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getExprNotAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group__0__Impl"


    // $ANTLR start "rule__ExprOr__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3326:1: rule__ExprOr__Group__1 : rule__ExprOr__Group__1__Impl ;
    public final void rule__ExprOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3330:1: ( rule__ExprOr__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3331:2: rule__ExprOr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprOr__Group__1__Impl_in_rule__ExprOr__Group__16679);
            rule__ExprOr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group__1"


    // $ANTLR start "rule__ExprOr__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3337:1: rule__ExprOr__Group__1__Impl : ( ( rule__ExprOr__Group_1__0 )? ) ;
    public final void rule__ExprOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3341:1: ( ( ( rule__ExprOr__Group_1__0 )? ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3342:1: ( ( rule__ExprOr__Group_1__0 )? )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3342:1: ( ( rule__ExprOr__Group_1__0 )? )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3343:1: ( rule__ExprOr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getGroup_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3344:1: ( rule__ExprOr__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3344:2: rule__ExprOr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprOr__Group_1__0_in_rule__ExprOr__Group__1__Impl6706);
                    rule__ExprOr__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group__1__Impl"


    // $ANTLR start "rule__ExprOr__Group_1__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3358:1: rule__ExprOr__Group_1__0 : rule__ExprOr__Group_1__0__Impl rule__ExprOr__Group_1__1 ;
    public final void rule__ExprOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3362:1: ( rule__ExprOr__Group_1__0__Impl rule__ExprOr__Group_1__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3363:2: rule__ExprOr__Group_1__0__Impl rule__ExprOr__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprOr__Group_1__0__Impl_in_rule__ExprOr__Group_1__06741);
            rule__ExprOr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprOr__Group_1__1_in_rule__ExprOr__Group_1__06744);
            rule__ExprOr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group_1__0"


    // $ANTLR start "rule__ExprOr__Group_1__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3370:1: rule__ExprOr__Group_1__0__Impl : ( ( rule__ExprOr__ExprOrAssignment_1_0 ) ) ;
    public final void rule__ExprOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3374:1: ( ( ( rule__ExprOr__ExprOrAssignment_1_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3375:1: ( ( rule__ExprOr__ExprOrAssignment_1_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3375:1: ( ( rule__ExprOr__ExprOrAssignment_1_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3376:1: ( rule__ExprOr__ExprOrAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprOrAssignment_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3377:1: ( rule__ExprOr__ExprOrAssignment_1_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3377:2: rule__ExprOr__ExprOrAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ExprOr__ExprOrAssignment_1_0_in_rule__ExprOr__Group_1__0__Impl6771);
            rule__ExprOr__ExprOrAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getExprOrAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group_1__0__Impl"


    // $ANTLR start "rule__ExprOr__Group_1__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3387:1: rule__ExprOr__Group_1__1 : rule__ExprOr__Group_1__1__Impl ;
    public final void rule__ExprOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3391:1: ( rule__ExprOr__Group_1__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3392:2: rule__ExprOr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprOr__Group_1__1__Impl_in_rule__ExprOr__Group_1__16801);
            rule__ExprOr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group_1__1"


    // $ANTLR start "rule__ExprOr__Group_1__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3398:1: rule__ExprOr__Group_1__1__Impl : ( ( rule__ExprOr__ExprOrAttAssignment_1_1 ) ) ;
    public final void rule__ExprOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3402:1: ( ( ( rule__ExprOr__ExprOrAttAssignment_1_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3403:1: ( ( rule__ExprOr__ExprOrAttAssignment_1_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3403:1: ( ( rule__ExprOr__ExprOrAttAssignment_1_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3404:1: ( rule__ExprOr__ExprOrAttAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprOrAttAssignment_1_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3405:1: ( rule__ExprOr__ExprOrAttAssignment_1_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3405:2: rule__ExprOr__ExprOrAttAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExprOr__ExprOrAttAssignment_1_1_in_rule__ExprOr__Group_1__1__Impl6828);
            rule__ExprOr__ExprOrAttAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getExprOrAttAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group_1__1__Impl"


    // $ANTLR start "rule__ExprNot__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3419:1: rule__ExprNot__Group__0 : rule__ExprNot__Group__0__Impl rule__ExprNot__Group__1 ;
    public final void rule__ExprNot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3423:1: ( rule__ExprNot__Group__0__Impl rule__ExprNot__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3424:2: rule__ExprNot__Group__0__Impl rule__ExprNot__Group__1
            {
            pushFollow(FOLLOW_rule__ExprNot__Group__0__Impl_in_rule__ExprNot__Group__06862);
            rule__ExprNot__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprNot__Group__1_in_rule__ExprNot__Group__06865);
            rule__ExprNot__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__Group__0"


    // $ANTLR start "rule__ExprNot__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3431:1: rule__ExprNot__Group__0__Impl : ( ( rule__ExprNot__NotAssignment_0 )? ) ;
    public final void rule__ExprNot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3435:1: ( ( ( rule__ExprNot__NotAssignment_0 )? ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3436:1: ( ( rule__ExprNot__NotAssignment_0 )? )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3436:1: ( ( rule__ExprNot__NotAssignment_0 )? )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3437:1: ( rule__ExprNot__NotAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getNotAssignment_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3438:1: ( rule__ExprNot__NotAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==43) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3438:2: rule__ExprNot__NotAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ExprNot__NotAssignment_0_in_rule__ExprNot__Group__0__Impl6892);
                    rule__ExprNot__NotAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getNotAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__Group__0__Impl"


    // $ANTLR start "rule__ExprNot__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3448:1: rule__ExprNot__Group__1 : rule__ExprNot__Group__1__Impl ;
    public final void rule__ExprNot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3452:1: ( rule__ExprNot__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3453:2: rule__ExprNot__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprNot__Group__1__Impl_in_rule__ExprNot__Group__16923);
            rule__ExprNot__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__Group__1"


    // $ANTLR start "rule__ExprNot__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3459:1: rule__ExprNot__Group__1__Impl : ( ( rule__ExprNot__ExprEqAssignment_1 ) ) ;
    public final void rule__ExprNot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3463:1: ( ( ( rule__ExprNot__ExprEqAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3464:1: ( ( rule__ExprNot__ExprEqAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3464:1: ( ( rule__ExprNot__ExprEqAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3465:1: ( rule__ExprNot__ExprEqAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getExprEqAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3466:1: ( rule__ExprNot__ExprEqAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3466:2: rule__ExprNot__ExprEqAssignment_1
            {
            pushFollow(FOLLOW_rule__ExprNot__ExprEqAssignment_1_in_rule__ExprNot__Group__1__Impl6950);
            rule__ExprNot__ExprEqAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getExprEqAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__Group__1__Impl"


    // $ANTLR start "rule__ExprEq__Group_0__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3480:1: rule__ExprEq__Group_0__0 : rule__ExprEq__Group_0__0__Impl rule__ExprEq__Group_0__1 ;
    public final void rule__ExprEq__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3484:1: ( rule__ExprEq__Group_0__0__Impl rule__ExprEq__Group_0__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3485:2: rule__ExprEq__Group_0__0__Impl rule__ExprEq__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__0__Impl_in_rule__ExprEq__Group_0__06984);
            rule__ExprEq__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_0__1_in_rule__ExprEq__Group_0__06987);
            rule__ExprEq__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_0__0"


    // $ANTLR start "rule__ExprEq__Group_0__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3492:1: rule__ExprEq__Group_0__0__Impl : ( '(' ) ;
    public final void rule__ExprEq__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3496:1: ( ( '(' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3497:1: ( '(' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3497:1: ( '(' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3498:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ExprEq__Group_0__0__Impl7015); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_0__0__Impl"


    // $ANTLR start "rule__ExprEq__Group_0__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3511:1: rule__ExprEq__Group_0__1 : rule__ExprEq__Group_0__1__Impl rule__ExprEq__Group_0__2 ;
    public final void rule__ExprEq__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3515:1: ( rule__ExprEq__Group_0__1__Impl rule__ExprEq__Group_0__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3516:2: rule__ExprEq__Group_0__1__Impl rule__ExprEq__Group_0__2
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__1__Impl_in_rule__ExprEq__Group_0__17046);
            rule__ExprEq__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_0__2_in_rule__ExprEq__Group_0__17049);
            rule__ExprEq__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_0__1"


    // $ANTLR start "rule__ExprEq__Group_0__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3523:1: rule__ExprEq__Group_0__1__Impl : ( ( rule__ExprEq__ExprAssignment_0_1 ) ) ;
    public final void rule__ExprEq__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3527:1: ( ( ( rule__ExprEq__ExprAssignment_0_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3528:1: ( ( rule__ExprEq__ExprAssignment_0_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3528:1: ( ( rule__ExprEq__ExprAssignment_0_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3529:1: ( rule__ExprEq__ExprAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExprAssignment_0_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3530:1: ( rule__ExprEq__ExprAssignment_0_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3530:2: rule__ExprEq__ExprAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ExprEq__ExprAssignment_0_1_in_rule__ExprEq__Group_0__1__Impl7076);
            rule__ExprEq__ExprAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getExprAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_0__1__Impl"


    // $ANTLR start "rule__ExprEq__Group_0__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3540:1: rule__ExprEq__Group_0__2 : rule__ExprEq__Group_0__2__Impl ;
    public final void rule__ExprEq__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3544:1: ( rule__ExprEq__Group_0__2__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3545:2: rule__ExprEq__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__2__Impl_in_rule__ExprEq__Group_0__27106);
            rule__ExprEq__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_0__2"


    // $ANTLR start "rule__ExprEq__Group_0__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3551:1: rule__ExprEq__Group_0__2__Impl : ( ')' ) ;
    public final void rule__ExprEq__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3555:1: ( ( ')' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3556:1: ( ')' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3556:1: ( ')' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3557:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__ExprEq__Group_0__2__Impl7134); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getRightParenthesisKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_0__2__Impl"


    // $ANTLR start "rule__ExprEq__Group_1__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3576:1: rule__ExprEq__Group_1__0 : rule__ExprEq__Group_1__0__Impl rule__ExprEq__Group_1__1 ;
    public final void rule__ExprEq__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3580:1: ( rule__ExprEq__Group_1__0__Impl rule__ExprEq__Group_1__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3581:2: rule__ExprEq__Group_1__0__Impl rule__ExprEq__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_1__0__Impl_in_rule__ExprEq__Group_1__07171);
            rule__ExprEq__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_1__1_in_rule__ExprEq__Group_1__07174);
            rule__ExprEq__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_1__0"


    // $ANTLR start "rule__ExprEq__Group_1__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3588:1: rule__ExprEq__Group_1__0__Impl : ( ( rule__ExprEq__ExprSim1Assignment_1_0 ) ) ;
    public final void rule__ExprEq__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3592:1: ( ( ( rule__ExprEq__ExprSim1Assignment_1_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3593:1: ( ( rule__ExprEq__ExprSim1Assignment_1_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3593:1: ( ( rule__ExprEq__ExprSim1Assignment_1_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3594:1: ( rule__ExprEq__ExprSim1Assignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExprSim1Assignment_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3595:1: ( rule__ExprEq__ExprSim1Assignment_1_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3595:2: rule__ExprEq__ExprSim1Assignment_1_0
            {
            pushFollow(FOLLOW_rule__ExprEq__ExprSim1Assignment_1_0_in_rule__ExprEq__Group_1__0__Impl7201);
            rule__ExprEq__ExprSim1Assignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getExprSim1Assignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_1__0__Impl"


    // $ANTLR start "rule__ExprEq__Group_1__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3605:1: rule__ExprEq__Group_1__1 : rule__ExprEq__Group_1__1__Impl rule__ExprEq__Group_1__2 ;
    public final void rule__ExprEq__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3609:1: ( rule__ExprEq__Group_1__1__Impl rule__ExprEq__Group_1__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3610:2: rule__ExprEq__Group_1__1__Impl rule__ExprEq__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_1__1__Impl_in_rule__ExprEq__Group_1__17231);
            rule__ExprEq__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_1__2_in_rule__ExprEq__Group_1__17234);
            rule__ExprEq__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_1__1"


    // $ANTLR start "rule__ExprEq__Group_1__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3617:1: rule__ExprEq__Group_1__1__Impl : ( '=?' ) ;
    public final void rule__ExprEq__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3621:1: ( ( '=?' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3622:1: ( '=?' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3622:1: ( '=?' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3623:1: '=?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_1_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__ExprEq__Group_1__1__Impl7262); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_1__1__Impl"


    // $ANTLR start "rule__ExprEq__Group_1__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3636:1: rule__ExprEq__Group_1__2 : rule__ExprEq__Group_1__2__Impl ;
    public final void rule__ExprEq__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3640:1: ( rule__ExprEq__Group_1__2__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3641:2: rule__ExprEq__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_1__2__Impl_in_rule__ExprEq__Group_1__27293);
            rule__ExprEq__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_1__2"


    // $ANTLR start "rule__ExprEq__Group_1__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3647:1: rule__ExprEq__Group_1__2__Impl : ( ( rule__ExprEq__ExprSim2Assignment_1_2 ) ) ;
    public final void rule__ExprEq__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3651:1: ( ( ( rule__ExprEq__ExprSim2Assignment_1_2 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3652:1: ( ( rule__ExprEq__ExprSim2Assignment_1_2 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3652:1: ( ( rule__ExprEq__ExprSim2Assignment_1_2 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3653:1: ( rule__ExprEq__ExprSim2Assignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExprSim2Assignment_1_2()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3654:1: ( rule__ExprEq__ExprSim2Assignment_1_2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3654:2: rule__ExprEq__ExprSim2Assignment_1_2
            {
            pushFollow(FOLLOW_rule__ExprEq__ExprSim2Assignment_1_2_in_rule__ExprEq__Group_1__2__Impl7320);
            rule__ExprEq__ExprSim2Assignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getExprSim2Assignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_1__2__Impl"


    // $ANTLR start "rule__Program__FonctionsAssignment"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3671:1: rule__Program__FonctionsAssignment : ( ruleFunction ) ;
    public final void rule__Program__FonctionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3675:1: ( ( ruleFunction ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3676:1: ( ruleFunction )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3676:1: ( ruleFunction )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3677:1: ruleFunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getFonctionsFunctionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_rule__Program__FonctionsAssignment7361);
            ruleFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getFonctionsFunctionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__FonctionsAssignment"


    // $ANTLR start "rule__Function__NomAssignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3686:1: rule__Function__NomAssignment_1 : ( RULE_SYMBOL ) ;
    public final void rule__Function__NomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3690:1: ( ( RULE_SYMBOL ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3691:1: ( RULE_SYMBOL )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3691:1: ( RULE_SYMBOL )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3692:1: RULE_SYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getNomSYMBOLTerminalRuleCall_1_0()); 
            }
            match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_rule__Function__NomAssignment_17392); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getNomSYMBOLTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NomAssignment_1"


    // $ANTLR start "rule__Function__DefinitionAssignment_3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3701:1: rule__Function__DefinitionAssignment_3 : ( ruleDefinition ) ;
    public final void rule__Function__DefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3705:1: ( ( ruleDefinition ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3706:1: ( ruleDefinition )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3706:1: ( ruleDefinition )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3707:1: ruleDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getDefinitionDefinitionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleDefinition_in_rule__Function__DefinitionAssignment_37423);
            ruleDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getDefinitionDefinitionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__DefinitionAssignment_3"


    // $ANTLR start "rule__Definition__InputsAssignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3716:1: rule__Definition__InputsAssignment_1 : ( ruleInput ) ;
    public final void rule__Definition__InputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3720:1: ( ( ruleInput ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3721:1: ( ruleInput )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3721:1: ( ruleInput )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3722:1: ruleInput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getInputsInputParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleInput_in_rule__Definition__InputsAssignment_17454);
            ruleInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getInputsInputParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__InputsAssignment_1"


    // $ANTLR start "rule__Definition__CommandesAssignment_3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3731:1: rule__Definition__CommandesAssignment_3 : ( ruleCommands ) ;
    public final void rule__Definition__CommandesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3735:1: ( ( ruleCommands ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3736:1: ( ruleCommands )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3736:1: ( ruleCommands )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3737:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getCommandesCommandsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Definition__CommandesAssignment_37485);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getCommandesCommandsParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__CommandesAssignment_3"


    // $ANTLR start "rule__Definition__OutputsAssignment_6"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3746:1: rule__Definition__OutputsAssignment_6 : ( ruleOutput ) ;
    public final void rule__Definition__OutputsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3750:1: ( ( ruleOutput ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3751:1: ( ruleOutput )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3751:1: ( ruleOutput )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3752:1: ruleOutput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getOutputsOutputParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_rule__Definition__OutputsAssignment_67516);
            ruleOutput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getOutputsOutputParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__OutputsAssignment_6"


    // $ANTLR start "rule__Input__VarInAssignment_0_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3761:1: rule__Input__VarInAssignment_0_0 : ( RULE_VARIABLE ) ;
    public final void rule__Input__VarInAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3765:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3766:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3766:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3767:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVarInVARIABLETerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Input__VarInAssignment_0_07547); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getVarInVARIABLETerminalRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__VarInAssignment_0_0"


    // $ANTLR start "rule__Input__VarInAssignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3776:1: rule__Input__VarInAssignment_1 : ( RULE_VARIABLE ) ;
    public final void rule__Input__VarInAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3780:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3781:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3781:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3782:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVarInVARIABLETerminalRuleCall_1_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Input__VarInAssignment_17578); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getVarInVARIABLETerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__VarInAssignment_1"


    // $ANTLR start "rule__Output__VarOutAssignment_0_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3791:1: rule__Output__VarOutAssignment_0_0 : ( RULE_VARIABLE ) ;
    public final void rule__Output__VarOutAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3795:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3796:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3796:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3797:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVarOutVARIABLETerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Output__VarOutAssignment_0_07609); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getVarOutVARIABLETerminalRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__VarOutAssignment_0_0"


    // $ANTLR start "rule__Output__VarOutAssignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3806:1: rule__Output__VarOutAssignment_1 : ( RULE_VARIABLE ) ;
    public final void rule__Output__VarOutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3810:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3811:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3811:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3812:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVarOutVARIABLETerminalRuleCall_1_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Output__VarOutAssignment_17640); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getVarOutVARIABLETerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__VarOutAssignment_1"


    // $ANTLR start "rule__Vars__VarGenAssignment_0_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3821:1: rule__Vars__VarGenAssignment_0_0 : ( RULE_VARIABLE ) ;
    public final void rule__Vars__VarGenAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3825:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3826:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3826:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3827:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVarGenVARIABLETerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Vars__VarGenAssignment_0_07671); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getVarGenVARIABLETerminalRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__VarGenAssignment_0_0"


    // $ANTLR start "rule__Vars__VarGenAssignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3836:1: rule__Vars__VarGenAssignment_1 : ( RULE_VARIABLE ) ;
    public final void rule__Vars__VarGenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3840:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3841:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3841:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3842:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVarGenVARIABLETerminalRuleCall_1_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Vars__VarGenAssignment_17702); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getVarGenVARIABLETerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__VarGenAssignment_1"


    // $ANTLR start "rule__Commands__CommandeAssignment_0_0_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3851:1: rule__Commands__CommandeAssignment_0_0_0 : ( ruleCommand ) ;
    public final void rule__Commands__CommandeAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3855:1: ( ( ruleCommand ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3856:1: ( ruleCommand )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3856:1: ( ruleCommand )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3857:1: ruleCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCommandeCommandParserRuleCall_0_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_rule__Commands__CommandeAssignment_0_0_07733);
            ruleCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getCommandeCommandParserRuleCall_0_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__CommandeAssignment_0_0_0"


    // $ANTLR start "rule__Commands__CommandeAssignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3866:1: rule__Commands__CommandeAssignment_1 : ( ruleCommand ) ;
    public final void rule__Commands__CommandeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3870:1: ( ( ruleCommand ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3871:1: ( ruleCommand )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3871:1: ( ruleCommand )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3872:1: ruleCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCommandeCommandParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_rule__Commands__CommandeAssignment_17764);
            ruleCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getCommandeCommandParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__CommandeAssignment_1"


    // $ANTLR start "rule__Command__NopAssignment_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3881:1: rule__Command__NopAssignment_0 : ( ( 'nop' ) ) ;
    public final void rule__Command__NopAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3885:1: ( ( ( 'nop' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3886:1: ( ( 'nop' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3886:1: ( ( 'nop' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3887:1: ( 'nop' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNopNopKeyword_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3888:1: ( 'nop' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3889:1: 'nop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNopNopKeyword_0_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Command__NopAssignment_07800); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNopNopKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNopNopKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__NopAssignment_0"


    // $ANTLR start "rule__Command__VarsAssignment_1_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3904:1: rule__Command__VarsAssignment_1_0 : ( ruleVars ) ;
    public final void rule__Command__VarsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3908:1: ( ( ruleVars ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3909:1: ( ruleVars )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3909:1: ( ruleVars )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3910:1: ruleVars
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getVarsVarsParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleVars_in_rule__Command__VarsAssignment_1_07839);
            ruleVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getVarsVarsParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__VarsAssignment_1_0"


    // $ANTLR start "rule__Command__ExprsAssignment_1_2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3919:1: rule__Command__ExprsAssignment_1_2 : ( ruleExprs ) ;
    public final void rule__Command__ExprsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3923:1: ( ( ruleExprs ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3924:1: ( ruleExprs )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3924:1: ( ruleExprs )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3925:1: ruleExprs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExprsExprsParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_rule__Command__ExprsAssignment_1_27870);
            ruleExprs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExprsExprsParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__ExprsAssignment_1_2"


    // $ANTLR start "rule__Command__CmdWhileAssignment_2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3934:1: rule__Command__CmdWhileAssignment_2 : ( ruleCommandWhile ) ;
    public final void rule__Command__CmdWhileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3938:1: ( ( ruleCommandWhile ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3939:1: ( ruleCommandWhile )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3939:1: ( ruleCommandWhile )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3940:1: ruleCommandWhile
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getCmdWhileCommandWhileParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleCommandWhile_in_rule__Command__CmdWhileAssignment_27901);
            ruleCommandWhile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getCmdWhileCommandWhileParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__CmdWhileAssignment_2"


    // $ANTLR start "rule__Command__CmdIfAssignment_3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3949:1: rule__Command__CmdIfAssignment_3 : ( ruleCommandIf ) ;
    public final void rule__Command__CmdIfAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3953:1: ( ( ruleCommandIf ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3954:1: ( ruleCommandIf )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3954:1: ( ruleCommandIf )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3955:1: ruleCommandIf
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getCmdIfCommandIfParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCommandIf_in_rule__Command__CmdIfAssignment_37932);
            ruleCommandIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getCmdIfCommandIfParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__CmdIfAssignment_3"


    // $ANTLR start "rule__Command__CmdForEachAssignment_4"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3964:1: rule__Command__CmdForEachAssignment_4 : ( ruleCommandForEach ) ;
    public final void rule__Command__CmdForEachAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3968:1: ( ( ruleCommandForEach ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3969:1: ( ruleCommandForEach )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3969:1: ( ruleCommandForEach )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3970:1: ruleCommandForEach
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getCmdForEachCommandForEachParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleCommandForEach_in_rule__Command__CmdForEachAssignment_47963);
            ruleCommandForEach();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getCmdForEachCommandForEachParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__CmdForEachAssignment_4"


    // $ANTLR start "rule__CommandWhile__WAssignment_0_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3979:1: rule__CommandWhile__WAssignment_0_0 : ( ( 'while' ) ) ;
    public final void rule__CommandWhile__WAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3983:1: ( ( ( 'while' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3984:1: ( ( 'while' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3984:1: ( ( 'while' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3985:1: ( 'while' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getWWhileKeyword_0_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3986:1: ( 'while' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3987:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getWWhileKeyword_0_0_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__CommandWhile__WAssignment_0_07999); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandWhileAccess().getWWhileKeyword_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandWhileAccess().getWWhileKeyword_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__WAssignment_0_0"


    // $ANTLR start "rule__CommandWhile__ExprAssignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4002:1: rule__CommandWhile__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__CommandWhile__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4006:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4007:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4007:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4008:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getExprExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__CommandWhile__ExprAssignment_18038);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandWhileAccess().getExprExprParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__ExprAssignment_1"


    // $ANTLR start "rule__CommandWhile__CmdsAssignment_3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4017:1: rule__CommandWhile__CmdsAssignment_3 : ( ruleCommands ) ;
    public final void rule__CommandWhile__CmdsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4021:1: ( ( ruleCommands ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4022:1: ( ruleCommands )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4022:1: ( ruleCommands )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4023:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getCmdsCommandsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__CommandWhile__CmdsAssignment_38069);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandWhileAccess().getCmdsCommandsParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__CmdsAssignment_3"


    // $ANTLR start "rule__CommandIf__CondAssignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4032:1: rule__CommandIf__CondAssignment_1 : ( ruleExpr ) ;
    public final void rule__CommandIf__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4036:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4037:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4037:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4038:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getCondExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__CommandIf__CondAssignment_18100);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfAccess().getCondExprParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__CondAssignment_1"


    // $ANTLR start "rule__CommandIf__CmdsThenAssignment_3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4047:1: rule__CommandIf__CmdsThenAssignment_3 : ( ruleCommands ) ;
    public final void rule__CommandIf__CmdsThenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4051:1: ( ( ruleCommands ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4052:1: ( ruleCommands )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4052:1: ( ruleCommands )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4053:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getCmdsThenCommandsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__CommandIf__CmdsThenAssignment_38131);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfAccess().getCmdsThenCommandsParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__CmdsThenAssignment_3"


    // $ANTLR start "rule__CommandIf__CmdsElseAssignment_4_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4062:1: rule__CommandIf__CmdsElseAssignment_4_1 : ( ruleCommands ) ;
    public final void rule__CommandIf__CmdsElseAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4066:1: ( ( ruleCommands ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4067:1: ( ruleCommands )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4067:1: ( ruleCommands )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4068:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getCmdsElseCommandsParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__CommandIf__CmdsElseAssignment_4_18162);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfAccess().getCmdsElseCommandsParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__CmdsElseAssignment_4_1"


    // $ANTLR start "rule__CommandForEach__ElemAssignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4077:1: rule__CommandForEach__ElemAssignment_1 : ( ruleExpr ) ;
    public final void rule__CommandForEach__ElemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4081:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4082:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4082:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4083:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getElemExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__CommandForEach__ElemAssignment_18193);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandForEachAccess().getElemExprParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__ElemAssignment_1"


    // $ANTLR start "rule__CommandForEach__EnsembAssignment_3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4092:1: rule__CommandForEach__EnsembAssignment_3 : ( ruleExpr ) ;
    public final void rule__CommandForEach__EnsembAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4096:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4097:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4097:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4098:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getEnsembExprParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__CommandForEach__EnsembAssignment_38224);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandForEachAccess().getEnsembExprParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__EnsembAssignment_3"


    // $ANTLR start "rule__CommandForEach__CmdsAssignment_5"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4107:1: rule__CommandForEach__CmdsAssignment_5 : ( ruleCommands ) ;
    public final void rule__CommandForEach__CmdsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4111:1: ( ( ruleCommands ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4112:1: ( ruleCommands )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4112:1: ( ruleCommands )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4113:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getCmdsCommandsParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__CommandForEach__CmdsAssignment_58255);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandForEachAccess().getCmdsCommandsParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__CmdsAssignment_5"


    // $ANTLR start "rule__Exprs__ExpGenAssignment_0_0_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4122:1: rule__Exprs__ExpGenAssignment_0_0_0 : ( ruleExpr ) ;
    public final void rule__Exprs__ExpGenAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4126:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4127:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4127:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4128:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExpGenExprParserRuleCall_0_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Exprs__ExpGenAssignment_0_0_08286);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExpGenExprParserRuleCall_0_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__ExpGenAssignment_0_0_0"


    // $ANTLR start "rule__Exprs__ExpGenAssignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4137:1: rule__Exprs__ExpGenAssignment_1 : ( ruleExpr ) ;
    public final void rule__Exprs__ExpGenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4141:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4142:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4142:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4143:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExpGenExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Exprs__ExpGenAssignment_18317);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExpGenExprParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__ExpGenAssignment_1"


    // $ANTLR start "rule__Expr__ExprSimpAssignment_0_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4152:1: rule__Expr__ExprSimpAssignment_0_0 : ( ruleExprSimple ) ;
    public final void rule__Expr__ExprSimpAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4156:1: ( ( ruleExprSimple ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4157:1: ( ruleExprSimple )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4157:1: ( ruleExprSimple )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4158:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExprSimpExprSimpleParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__Expr__ExprSimpAssignment_0_08348);
            ruleExprSimple();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getExprSimpExprSimpleParserRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__ExprSimpAssignment_0_0"


    // $ANTLR start "rule__Expr__ExprAndAssignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4167:1: rule__Expr__ExprAndAssignment_1 : ( ruleExprAnd ) ;
    public final void rule__Expr__ExprAndAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4171:1: ( ( ruleExprAnd ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4172:1: ( ruleExprAnd )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4172:1: ( ruleExprAnd )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4173:1: ruleExprAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExprAndExprAndParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_rule__Expr__ExprAndAssignment_18379);
            ruleExprAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getExprAndExprAndParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__ExprAndAssignment_1"


    // $ANTLR start "rule__ExprSimple__NilAssignment_0_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4182:1: rule__ExprSimple__NilAssignment_0_0 : ( ( 'nil' ) ) ;
    public final void rule__ExprSimple__NilAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4186:1: ( ( ( 'nil' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4187:1: ( ( 'nil' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4187:1: ( ( 'nil' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4188:1: ( 'nil' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getNilNilKeyword_0_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4189:1: ( 'nil' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4190:1: 'nil'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getNilNilKeyword_0_0_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__ExprSimple__NilAssignment_0_08415); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getNilNilKeyword_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getNilNilKeyword_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__NilAssignment_0_0"


    // $ANTLR start "rule__ExprSimple__VariAssignment_0_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4205:1: rule__ExprSimple__VariAssignment_0_1 : ( RULE_VARIABLE ) ;
    public final void rule__ExprSimple__VariAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4209:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4210:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4210:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4211:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getVariVARIABLETerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__ExprSimple__VariAssignment_0_18454); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getVariVARIABLETerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__VariAssignment_0_1"


    // $ANTLR start "rule__ExprSimple__SymbAssignment_0_2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4220:1: rule__ExprSimple__SymbAssignment_0_2 : ( RULE_SYMBOL ) ;
    public final void rule__ExprSimple__SymbAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4224:1: ( ( RULE_SYMBOL ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4225:1: ( RULE_SYMBOL )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4225:1: ( RULE_SYMBOL )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4226:1: RULE_SYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getSymbSYMBOLTerminalRuleCall_0_2_0()); 
            }
            match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_rule__ExprSimple__SymbAssignment_0_28485); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getSymbSYMBOLTerminalRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__SymbAssignment_0_2"


    // $ANTLR start "rule__ExprSimple__ExprConsAssignment_1_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4235:1: rule__ExprSimple__ExprConsAssignment_1_1 : ( ( 'cons' ) ) ;
    public final void rule__ExprSimple__ExprConsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4239:1: ( ( ( 'cons' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4240:1: ( ( 'cons' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4240:1: ( ( 'cons' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4241:1: ( 'cons' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprConsConsKeyword_1_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4242:1: ( 'cons' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4243:1: 'cons'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprConsConsKeyword_1_1_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__ExprSimple__ExprConsAssignment_1_18521); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprConsConsKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprConsConsKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__ExprConsAssignment_1_1"


    // $ANTLR start "rule__ExprSimple__ExprConsAttAssignment_1_2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4258:1: rule__ExprSimple__ExprConsAttAssignment_1_2 : ( ruleExpr ) ;
    public final void rule__ExprSimple__ExprConsAttAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4262:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4263:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4263:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4264:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprConsAttExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprSimple__ExprConsAttAssignment_1_28560);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprConsAttExprParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__ExprConsAttAssignment_1_2"


    // $ANTLR start "rule__ExprSimple__ExprListAssignment_2_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4273:1: rule__ExprSimple__ExprListAssignment_2_1 : ( ( 'list' ) ) ;
    public final void rule__ExprSimple__ExprListAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4277:1: ( ( ( 'list' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4278:1: ( ( 'list' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4278:1: ( ( 'list' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4279:1: ( 'list' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprListListKeyword_2_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4280:1: ( 'list' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4281:1: 'list'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprListListKeyword_2_1_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__ExprSimple__ExprListAssignment_2_18596); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprListListKeyword_2_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprListListKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__ExprListAssignment_2_1"


    // $ANTLR start "rule__ExprSimple__ExprListAttAssignment_2_2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4296:1: rule__ExprSimple__ExprListAttAssignment_2_2 : ( ruleExpr ) ;
    public final void rule__ExprSimple__ExprListAttAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4300:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4301:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4301:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4302:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprListAttExprParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprSimple__ExprListAttAssignment_2_28635);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprListAttExprParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__ExprListAttAssignment_2_2"


    // $ANTLR start "rule__ExprSimple__ExprHeadAssignment_3_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4311:1: rule__ExprSimple__ExprHeadAssignment_3_1 : ( ( 'hd' ) ) ;
    public final void rule__ExprSimple__ExprHeadAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4315:1: ( ( ( 'hd' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4316:1: ( ( 'hd' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4316:1: ( ( 'hd' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4317:1: ( 'hd' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprHeadHdKeyword_3_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4318:1: ( 'hd' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4319:1: 'hd'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprHeadHdKeyword_3_1_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__ExprSimple__ExprHeadAssignment_3_18671); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprHeadHdKeyword_3_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprHeadHdKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__ExprHeadAssignment_3_1"


    // $ANTLR start "rule__ExprSimple__ExprHeadAttAssignment_3_2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4334:1: rule__ExprSimple__ExprHeadAttAssignment_3_2 : ( ruleExpr ) ;
    public final void rule__ExprSimple__ExprHeadAttAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4338:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4339:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4339:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4340:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprHeadAttExprParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprSimple__ExprHeadAttAssignment_3_28710);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprHeadAttExprParserRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__ExprHeadAttAssignment_3_2"


    // $ANTLR start "rule__ExprSimple__ExprTailAssignment_4_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4349:1: rule__ExprSimple__ExprTailAssignment_4_1 : ( ( 'tl' ) ) ;
    public final void rule__ExprSimple__ExprTailAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4353:1: ( ( ( 'tl' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4354:1: ( ( 'tl' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4354:1: ( ( 'tl' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4355:1: ( 'tl' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprTailTlKeyword_4_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4356:1: ( 'tl' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4357:1: 'tl'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprTailTlKeyword_4_1_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__ExprSimple__ExprTailAssignment_4_18746); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprTailTlKeyword_4_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprTailTlKeyword_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__ExprTailAssignment_4_1"


    // $ANTLR start "rule__ExprSimple__ExprTailAttAssignment_4_2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4372:1: rule__ExprSimple__ExprTailAttAssignment_4_2 : ( ruleExpr ) ;
    public final void rule__ExprSimple__ExprTailAttAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4376:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4377:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4377:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4378:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprTailAttExprParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprSimple__ExprTailAttAssignment_4_28785);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprTailAttExprParserRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__ExprTailAttAssignment_4_2"


    // $ANTLR start "rule__ExprSimple__NomSymbAssignment_5_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4387:1: rule__ExprSimple__NomSymbAssignment_5_1 : ( RULE_SYMBOL ) ;
    public final void rule__ExprSimple__NomSymbAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4391:1: ( ( RULE_SYMBOL ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4392:1: ( RULE_SYMBOL )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4392:1: ( RULE_SYMBOL )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4393:1: RULE_SYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getNomSymbSYMBOLTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_rule__ExprSimple__NomSymbAssignment_5_18816); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getNomSymbSYMBOLTerminalRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__NomSymbAssignment_5_1"


    // $ANTLR start "rule__ExprSimple__SymbAttAssignment_5_2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4402:1: rule__ExprSimple__SymbAttAssignment_5_2 : ( ruleExpr ) ;
    public final void rule__ExprSimple__SymbAttAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4406:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4407:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4407:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4408:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getSymbAttExprParserRuleCall_5_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprSimple__SymbAttAssignment_5_28847);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getSymbAttExprParserRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__SymbAttAssignment_5_2"


    // $ANTLR start "rule__ExprAnd__ExprOrAssignment_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4417:1: rule__ExprAnd__ExprOrAssignment_0 : ( ruleExprOr ) ;
    public final void rule__ExprAnd__ExprOrAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4421:1: ( ( ruleExprOr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4422:1: ( ruleExprOr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4422:1: ( ruleExprOr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4423:1: ruleExprOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprOrExprOrParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_rule__ExprAnd__ExprOrAssignment_08878);
            ruleExprOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getExprOrExprOrParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__ExprOrAssignment_0"


    // $ANTLR start "rule__ExprAnd__ExprAndAssignment_1_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4432:1: rule__ExprAnd__ExprAndAssignment_1_0 : ( ( 'and' ) ) ;
    public final void rule__ExprAnd__ExprAndAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4436:1: ( ( ( 'and' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4437:1: ( ( 'and' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4437:1: ( ( 'and' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4438:1: ( 'and' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprAndAndKeyword_1_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4439:1: ( 'and' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4440:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprAndAndKeyword_1_0_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__ExprAnd__ExprAndAssignment_1_08914); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getExprAndAndKeyword_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getExprAndAndKeyword_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__ExprAndAssignment_1_0"


    // $ANTLR start "rule__ExprAnd__ExprAndAttAssignment_1_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4455:1: rule__ExprAnd__ExprAndAttAssignment_1_1 : ( ruleExprAnd ) ;
    public final void rule__ExprAnd__ExprAndAttAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4459:1: ( ( ruleExprAnd ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4460:1: ( ruleExprAnd )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4460:1: ( ruleExprAnd )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4461:1: ruleExprAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprAndAttExprAndParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_rule__ExprAnd__ExprAndAttAssignment_1_18953);
            ruleExprAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getExprAndAttExprAndParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__ExprAndAttAssignment_1_1"


    // $ANTLR start "rule__ExprOr__ExprNotAssignment_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4470:1: rule__ExprOr__ExprNotAssignment_0 : ( ruleExprNot ) ;
    public final void rule__ExprOr__ExprNotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4474:1: ( ( ruleExprNot ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4475:1: ( ruleExprNot )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4475:1: ( ruleExprNot )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4476:1: ruleExprNot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprNotExprNotParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprNot_in_rule__ExprOr__ExprNotAssignment_08984);
            ruleExprNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getExprNotExprNotParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__ExprNotAssignment_0"


    // $ANTLR start "rule__ExprOr__ExprOrAssignment_1_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4485:1: rule__ExprOr__ExprOrAssignment_1_0 : ( ( 'or' ) ) ;
    public final void rule__ExprOr__ExprOrAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4489:1: ( ( ( 'or' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4490:1: ( ( 'or' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4490:1: ( ( 'or' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4491:1: ( 'or' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprOrOrKeyword_1_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4492:1: ( 'or' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4493:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprOrOrKeyword_1_0_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__ExprOr__ExprOrAssignment_1_09020); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getExprOrOrKeyword_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getExprOrOrKeyword_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__ExprOrAssignment_1_0"


    // $ANTLR start "rule__ExprOr__ExprOrAttAssignment_1_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4508:1: rule__ExprOr__ExprOrAttAssignment_1_1 : ( ruleExprOr ) ;
    public final void rule__ExprOr__ExprOrAttAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4512:1: ( ( ruleExprOr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4513:1: ( ruleExprOr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4513:1: ( ruleExprOr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4514:1: ruleExprOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprOrAttExprOrParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_rule__ExprOr__ExprOrAttAssignment_1_19059);
            ruleExprOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getExprOrAttExprOrParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__ExprOrAttAssignment_1_1"


    // $ANTLR start "rule__ExprNot__NotAssignment_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4523:1: rule__ExprNot__NotAssignment_0 : ( ( 'not' ) ) ;
    public final void rule__ExprNot__NotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4527:1: ( ( ( 'not' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4528:1: ( ( 'not' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4528:1: ( ( 'not' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4529:1: ( 'not' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getNotNotKeyword_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4530:1: ( 'not' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4531:1: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getNotNotKeyword_0_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__ExprNot__NotAssignment_09095); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getNotNotKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getNotNotKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__NotAssignment_0"


    // $ANTLR start "rule__ExprNot__ExprEqAssignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4546:1: rule__ExprNot__ExprEqAssignment_1 : ( ruleExprEq ) ;
    public final void rule__ExprNot__ExprEqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4550:1: ( ( ruleExprEq ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4551:1: ( ruleExprEq )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4551:1: ( ruleExprEq )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4552:1: ruleExprEq
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getExprEqExprEqParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprEq_in_rule__ExprNot__ExprEqAssignment_19134);
            ruleExprEq();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getExprEqExprEqParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__ExprEqAssignment_1"


    // $ANTLR start "rule__ExprEq__ExprAssignment_0_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4561:1: rule__ExprEq__ExprAssignment_0_1 : ( ruleExpr ) ;
    public final void rule__ExprEq__ExprAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4565:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4566:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4566:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4567:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExprExprParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprEq__ExprAssignment_0_19165);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getExprExprParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__ExprAssignment_0_1"


    // $ANTLR start "rule__ExprEq__ExprSim1Assignment_1_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4576:1: rule__ExprEq__ExprSim1Assignment_1_0 : ( ruleExprSimple ) ;
    public final void rule__ExprEq__ExprSim1Assignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4580:1: ( ( ruleExprSimple ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4581:1: ( ruleExprSimple )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4581:1: ( ruleExprSimple )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4582:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExprSim1ExprSimpleParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__ExprEq__ExprSim1Assignment_1_09196);
            ruleExprSimple();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getExprSim1ExprSimpleParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__ExprSim1Assignment_1_0"


    // $ANTLR start "rule__ExprEq__ExprSim2Assignment_1_2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4591:1: rule__ExprEq__ExprSim2Assignment_1_2 : ( ruleExprSimple ) ;
    public final void rule__ExprEq__ExprSim2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4595:1: ( ( ruleExprSimple ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4596:1: ( ruleExprSimple )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4596:1: ( ruleExprSimple )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4597:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExprSim2ExprSimpleParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__ExprEq__ExprSim2Assignment_1_29227);
            ruleExprSimple();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getExprSim2ExprSimpleParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__ExprSim2Assignment_1_2"

    // $ANTLR start synpred7_InternalWhileCpp
    public final void synpred7_InternalWhileCpp_fragment() throws RecognitionException {   
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:634:1: ( ( ( rule__Expr__Group_0__0 ) ) )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:634:1: ( ( rule__Expr__Group_0__0 ) )
        {
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:634:1: ( ( rule__Expr__Group_0__0 ) )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:635:1: ( rule__Expr__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExprAccess().getGroup_0()); 
        }
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:636:1: ( rule__Expr__Group_0__0 )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:636:2: rule__Expr__Group_0__0
        {
        pushFollow(FOLLOW_rule__Expr__Group_0__0_in_synpred7_InternalWhileCpp1315);
        rule__Expr__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred7_InternalWhileCpp

    // $ANTLR start synpred15_InternalWhileCpp
    public final void synpred15_InternalWhileCpp_fragment() throws RecognitionException {   
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:730:1: ( ( ( rule__ExprEq__Group_0__0 ) ) )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:730:1: ( ( rule__ExprEq__Group_0__0 ) )
        {
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:730:1: ( ( rule__ExprEq__Group_0__0 ) )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:731:1: ( rule__ExprEq__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExprEqAccess().getGroup_0()); 
        }
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:732:1: ( rule__ExprEq__Group_0__0 )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:732:2: rule__ExprEq__Group_0__0
        {
        pushFollow(FOLLOW_rule__ExprEq__Group_0__0_in_synpred15_InternalWhileCpp1558);
        rule__ExprEq__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred15_InternalWhileCpp

    // $ANTLR start synpred19_InternalWhileCpp
    public final void synpred19_InternalWhileCpp_fragment() throws RecognitionException {   
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1491:2: ( rule__Commands__Group_0__0 )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1491:2: rule__Commands__Group_0__0
        {
        pushFollow(FOLLOW_rule__Commands__Group_0__0_in_synpred19_InternalWhileCpp3060);
        rule__Commands__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalWhileCpp

    // $ANTLR start synpred21_InternalWhileCpp
    public final void synpred21_InternalWhileCpp_fragment() throws RecognitionException {   
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2375:2: ( rule__Exprs__Group_0__0 )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2375:2: rule__Exprs__Group_0__0
        {
        pushFollow(FOLLOW_rule__Exprs__Group_0__0_in_synpred21_InternalWhileCpp4798);
        rule__Exprs__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_InternalWhileCpp

    // Delegated rules

    public final boolean synpred7_InternalWhileCpp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalWhileCpp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalWhileCpp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalWhileCpp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalWhileCpp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalWhileCpp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalWhileCpp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalWhileCpp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__FonctionsAssignment_in_ruleProgram100 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_ruleFunction161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0_in_ruleDefinition221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0_in_ruleInput281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_entryRuleOutput308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutput315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__0_in_ruleOutput341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_entryRuleVars368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVars375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__0_in_ruleVars401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_entryRuleCommands428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommands435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group__0_in_ruleCommands461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Alternatives_in_ruleCommand521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandWhile_in_entryRuleCommandWhile548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandWhile555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__0_in_ruleCommandWhile581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandIf_in_entryRuleCommandIf608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandIf615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__0_in_ruleCommandIf641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandForEach_in_entryRuleCommandForEach668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandForEach675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__0_in_ruleCommandForEach701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_entryRuleExprs728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprs735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__0_in_ruleExprs761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Alternatives_in_ruleExpr821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_entryRuleExprSimple848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprSimple855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Alternatives_in_ruleExprSimple881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_entryRuleExprAnd908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAnd915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__0_in_ruleExprAnd941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_entryRuleExprOr968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprOr975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__0_in_ruleExprOr1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_entryRuleExprNot1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprNot1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__Group__0_in_ruleExprNot1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEq_in_entryRuleExprEq1088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEq1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Alternatives_in_ruleExprEq1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NopAssignment_0_in_rule__Command__Alternatives1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__0_in_rule__Command__Alternatives1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__CmdWhileAssignment_2_in_rule__Command__Alternatives1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__CmdIfAssignment_3_in_rule__Command__Alternatives1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__CmdForEachAssignment_4_in_rule__Command__Alternatives1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__WAssignment_0_0_in_rule__CommandWhile__Alternatives_01262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CommandWhile__Alternatives_01281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_0__0_in_rule__Expr__Alternatives1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExprAndAssignment_1_in_rule__Expr__Alternatives1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Alternatives_0_in_rule__ExprSimple__Alternatives1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__0_in_rule__ExprSimple__Alternatives1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__0_in_rule__ExprSimple__Alternatives1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__0_in_rule__ExprSimple__Alternatives1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__0_in_rule__ExprSimple__Alternatives1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_5__0_in_rule__ExprSimple__Alternatives1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__NilAssignment_0_0_in_rule__ExprSimple__Alternatives_01489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__VariAssignment_0_1_in_rule__ExprSimple__Alternatives_01507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__SymbAssignment_0_2_in_rule__ExprSimple__Alternatives_01525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__0_in_rule__ExprEq__Alternatives1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__0_in_rule__ExprEq__Alternatives1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__01607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__01610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Function__Group__0__Impl1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__11669 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__11672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NomAssignment_1_in_rule__Function__Group__1__Impl1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__21729 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__21732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Function__Group__2__Impl1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__31791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__DefinitionAssignment_3_in_rule__Function__Group__3__Impl1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__01856 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__01859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Definition__Group__0__Impl1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__11918 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__11921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__InputsAssignment_1_in_rule__Definition__Group__1__Impl1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__21978 = new BitSet(new long[]{0x0000000C22004020L});
    public static final BitSet FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__21981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Definition__Group__2__Impl2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__32040 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Definition__Group__4_in_rule__Definition__Group__32043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__CommandesAssignment_3_in_rule__Definition__Group__3__Impl2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__4__Impl_in_rule__Definition__Group__42100 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Definition__Group__5_in_rule__Definition__Group__42103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Definition__Group__4__Impl2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__5__Impl_in_rule__Definition__Group__52162 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Definition__Group__6_in_rule__Definition__Group__52165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Definition__Group__5__Impl2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__6__Impl_in_rule__Definition__Group__62224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__OutputsAssignment_6_in_rule__Definition__Group__6__Impl2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__02295 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Input__Group__1_in_rule__Input__Group__02298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_0__0_in_rule__Input__Group__0__Impl2325 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__12356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__VarInAssignment_1_in_rule__Input__Group__1__Impl2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_0__0__Impl_in_rule__Input__Group_0__02417 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Input__Group_0__1_in_rule__Input__Group_0__02420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__VarInAssignment_0_0_in_rule__Input__Group_0__0__Impl2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_0__1__Impl_in_rule__Input__Group_0__12477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Input__Group_0__1__Impl2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__02540 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Output__Group__1_in_rule__Output__Group__02543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_0__0_in_rule__Output__Group__0__Impl2570 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__12601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__VarOutAssignment_1_in_rule__Output__Group__1__Impl2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_0__0__Impl_in_rule__Output__Group_0__02662 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Output__Group_0__1_in_rule__Output__Group_0__02665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__VarOutAssignment_0_0_in_rule__Output__Group_0__0__Impl2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_0__1__Impl_in_rule__Output__Group_0__12722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Output__Group_0__1__Impl2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__02785 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__02788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_0__0_in_rule__Vars__Group__0__Impl2815 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__12846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__VarGenAssignment_1_in_rule__Vars__Group__1__Impl2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_0__0__Impl_in_rule__Vars__Group_0__02907 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Vars__Group_0__1_in_rule__Vars__Group_0__02910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__VarGenAssignment_0_0_in_rule__Vars__Group_0__0__Impl2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_0__1__Impl_in_rule__Vars__Group_0__12967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Vars__Group_0__1__Impl2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group__0__Impl_in_rule__Commands__Group__03030 = new BitSet(new long[]{0x0000000C22004020L});
    public static final BitSet FOLLOW_rule__Commands__Group__1_in_rule__Commands__Group__03033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_0__0_in_rule__Commands__Group__0__Impl3060 = new BitSet(new long[]{0x0000000C22004022L});
    public static final BitSet FOLLOW_rule__Commands__Group__1__Impl_in_rule__Commands__Group__13091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__CommandeAssignment_1_in_rule__Commands__Group__1__Impl3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_0__0__Impl_in_rule__Commands__Group_0__03152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_0_0__0_in_rule__Commands__Group_0__0__Impl3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_0_0__0__Impl_in_rule__Commands__Group_0_0__03211 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Commands__Group_0_0__1_in_rule__Commands__Group_0_0__03214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__CommandeAssignment_0_0_0_in_rule__Commands__Group_0_0__0__Impl3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_0_0__1__Impl_in_rule__Commands__Group_0_0__13271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Commands__Group_0_0__1__Impl3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__0__Impl_in_rule__Command__Group_1__03334 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Command__Group_1__1_in_rule__Command__Group_1__03337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__VarsAssignment_1_0_in_rule__Command__Group_1__0__Impl3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__1__Impl_in_rule__Command__Group_1__13394 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__Command__Group_1__2_in_rule__Command__Group_1__13397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Command__Group_1__1__Impl3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__2__Impl_in_rule__Command__Group_1__23456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExprsAssignment_1_2_in_rule__Command__Group_1__2__Impl3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__0__Impl_in_rule__CommandWhile__Group__03519 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__1_in_rule__CommandWhile__Group__03522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Alternatives_0_in_rule__CommandWhile__Group__0__Impl3549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__1__Impl_in_rule__CommandWhile__Group__13579 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__2_in_rule__CommandWhile__Group__13582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__ExprAssignment_1_in_rule__CommandWhile__Group__1__Impl3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__2__Impl_in_rule__CommandWhile__Group__23639 = new BitSet(new long[]{0x0000000C22004020L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__3_in_rule__CommandWhile__Group__23642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CommandWhile__Group__2__Impl3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__3__Impl_in_rule__CommandWhile__Group__33701 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__4_in_rule__CommandWhile__Group__33704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__CmdsAssignment_3_in_rule__CommandWhile__Group__3__Impl3731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__4__Impl_in_rule__CommandWhile__Group__43761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CommandWhile__Group__4__Impl3789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__0__Impl_in_rule__CommandIf__Group__03830 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__1_in_rule__CommandIf__Group__03833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CommandIf__Group__0__Impl3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__1__Impl_in_rule__CommandIf__Group__13892 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__2_in_rule__CommandIf__Group__13895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__CondAssignment_1_in_rule__CommandIf__Group__1__Impl3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__2__Impl_in_rule__CommandIf__Group__23952 = new BitSet(new long[]{0x0000000C22004020L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__3_in_rule__CommandIf__Group__23955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CommandIf__Group__2__Impl3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__3__Impl_in_rule__CommandIf__Group__34014 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__4_in_rule__CommandIf__Group__34017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__CmdsThenAssignment_3_in_rule__CommandIf__Group__3__Impl4044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__4__Impl_in_rule__CommandIf__Group__44074 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__5_in_rule__CommandIf__Group__44077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group_4__0_in_rule__CommandIf__Group__4__Impl4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__5__Impl_in_rule__CommandIf__Group__54135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CommandIf__Group__5__Impl4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group_4__0__Impl_in_rule__CommandIf__Group_4__04206 = new BitSet(new long[]{0x0000000C22004020L});
    public static final BitSet FOLLOW_rule__CommandIf__Group_4__1_in_rule__CommandIf__Group_4__04209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CommandIf__Group_4__0__Impl4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group_4__1__Impl_in_rule__CommandIf__Group_4__14268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__CmdsElseAssignment_4_1_in_rule__CommandIf__Group_4__1__Impl4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__0__Impl_in_rule__CommandForEach__Group__04329 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__1_in_rule__CommandForEach__Group__04332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CommandForEach__Group__0__Impl4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__1__Impl_in_rule__CommandForEach__Group__14391 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__2_in_rule__CommandForEach__Group__14394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__ElemAssignment_1_in_rule__CommandForEach__Group__1__Impl4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__2__Impl_in_rule__CommandForEach__Group__24451 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__3_in_rule__CommandForEach__Group__24454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CommandForEach__Group__2__Impl4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__3__Impl_in_rule__CommandForEach__Group__34513 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__4_in_rule__CommandForEach__Group__34516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__EnsembAssignment_3_in_rule__CommandForEach__Group__3__Impl4543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__4__Impl_in_rule__CommandForEach__Group__44573 = new BitSet(new long[]{0x0000000C22004020L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__5_in_rule__CommandForEach__Group__44576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CommandForEach__Group__4__Impl4604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__5__Impl_in_rule__CommandForEach__Group__54635 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__6_in_rule__CommandForEach__Group__54638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__CmdsAssignment_5_in_rule__CommandForEach__Group__5__Impl4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__6__Impl_in_rule__CommandForEach__Group__64695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CommandForEach__Group__6__Impl4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__04768 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__04771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0__0_in_rule__Exprs__Group__0__Impl4798 = new BitSet(new long[]{0x0000081080000032L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__14829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__ExpGenAssignment_1_in_rule__Exprs__Group__1__Impl4856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0__0__Impl_in_rule__Exprs__Group_0__04890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0_0__0_in_rule__Exprs__Group_0__0__Impl4917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0_0__0__Impl_in_rule__Exprs__Group_0_0__04949 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0_0__1_in_rule__Exprs__Group_0_0__04952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__ExpGenAssignment_0_0_0_in_rule__Exprs__Group_0_0__0__Impl4979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0_0__1__Impl_in_rule__Exprs__Group_0_0__15009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Exprs__Group_0_0__1__Impl5037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_0__0__Impl_in_rule__Expr__Group_0__05072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExprSimpAssignment_0_0_in_rule__Expr__Group_0__0__Impl5099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__0__Impl_in_rule__ExprSimple__Group_1__05131 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__1_in_rule__ExprSimple__Group_1__05134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ExprSimple__Group_1__0__Impl5162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__1__Impl_in_rule__ExprSimple__Group_1__15193 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__2_in_rule__ExprSimple__Group_1__15196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprConsAssignment_1_1_in_rule__ExprSimple__Group_1__1__Impl5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__2__Impl_in_rule__ExprSimple__Group_1__25253 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__3_in_rule__ExprSimple__Group_1__25256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprConsAttAssignment_1_2_in_rule__ExprSimple__Group_1__2__Impl5283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__3__Impl_in_rule__ExprSimple__Group_1__35313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ExprSimple__Group_1__3__Impl5341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__0__Impl_in_rule__ExprSimple__Group_2__05380 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__1_in_rule__ExprSimple__Group_2__05383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ExprSimple__Group_2__0__Impl5411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__1__Impl_in_rule__ExprSimple__Group_2__15442 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__2_in_rule__ExprSimple__Group_2__15445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprListAssignment_2_1_in_rule__ExprSimple__Group_2__1__Impl5472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__2__Impl_in_rule__ExprSimple__Group_2__25502 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__3_in_rule__ExprSimple__Group_2__25505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprListAttAssignment_2_2_in_rule__ExprSimple__Group_2__2__Impl5532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__3__Impl_in_rule__ExprSimple__Group_2__35562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ExprSimple__Group_2__3__Impl5590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__0__Impl_in_rule__ExprSimple__Group_3__05629 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__1_in_rule__ExprSimple__Group_3__05632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ExprSimple__Group_3__0__Impl5660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__1__Impl_in_rule__ExprSimple__Group_3__15691 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__2_in_rule__ExprSimple__Group_3__15694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprHeadAssignment_3_1_in_rule__ExprSimple__Group_3__1__Impl5721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__2__Impl_in_rule__ExprSimple__Group_3__25751 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__3_in_rule__ExprSimple__Group_3__25754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprHeadAttAssignment_3_2_in_rule__ExprSimple__Group_3__2__Impl5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__3__Impl_in_rule__ExprSimple__Group_3__35811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ExprSimple__Group_3__3__Impl5839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__0__Impl_in_rule__ExprSimple__Group_4__05878 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__1_in_rule__ExprSimple__Group_4__05881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ExprSimple__Group_4__0__Impl5909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__1__Impl_in_rule__ExprSimple__Group_4__15940 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__2_in_rule__ExprSimple__Group_4__15943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprTailAssignment_4_1_in_rule__ExprSimple__Group_4__1__Impl5970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__2__Impl_in_rule__ExprSimple__Group_4__26000 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__3_in_rule__ExprSimple__Group_4__26003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprTailAttAssignment_4_2_in_rule__ExprSimple__Group_4__2__Impl6030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__3__Impl_in_rule__ExprSimple__Group_4__36060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ExprSimple__Group_4__3__Impl6088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_5__0__Impl_in_rule__ExprSimple__Group_5__06127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_5__1_in_rule__ExprSimple__Group_5__06130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ExprSimple__Group_5__0__Impl6158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_5__1__Impl_in_rule__ExprSimple__Group_5__16189 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_5__2_in_rule__ExprSimple__Group_5__16192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__NomSymbAssignment_5_1_in_rule__ExprSimple__Group_5__1__Impl6219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_5__2__Impl_in_rule__ExprSimple__Group_5__26249 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_5__3_in_rule__ExprSimple__Group_5__26252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__SymbAttAssignment_5_2_in_rule__ExprSimple__Group_5__2__Impl6279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_5__3__Impl_in_rule__ExprSimple__Group_5__36309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ExprSimple__Group_5__3__Impl6337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__0__Impl_in_rule__ExprAnd__Group__06376 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__1_in_rule__ExprAnd__Group__06379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__ExprOrAssignment_0_in_rule__ExprAnd__Group__0__Impl6406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__1__Impl_in_rule__ExprAnd__Group__16436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__0_in_rule__ExprAnd__Group__1__Impl6463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__0__Impl_in_rule__ExprAnd__Group_1__06498 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__1_in_rule__ExprAnd__Group_1__06501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__ExprAndAssignment_1_0_in_rule__ExprAnd__Group_1__0__Impl6528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__1__Impl_in_rule__ExprAnd__Group_1__16558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__ExprAndAttAssignment_1_1_in_rule__ExprAnd__Group_1__1__Impl6585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__0__Impl_in_rule__ExprOr__Group__06619 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__1_in_rule__ExprOr__Group__06622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__ExprNotAssignment_0_in_rule__ExprOr__Group__0__Impl6649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__1__Impl_in_rule__ExprOr__Group__16679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__0_in_rule__ExprOr__Group__1__Impl6706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__0__Impl_in_rule__ExprOr__Group_1__06741 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__1_in_rule__ExprOr__Group_1__06744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__ExprOrAssignment_1_0_in_rule__ExprOr__Group_1__0__Impl6771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__1__Impl_in_rule__ExprOr__Group_1__16801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__ExprOrAttAssignment_1_1_in_rule__ExprOr__Group_1__1__Impl6828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__Group__0__Impl_in_rule__ExprNot__Group__06862 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__ExprNot__Group__1_in_rule__ExprNot__Group__06865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__NotAssignment_0_in_rule__ExprNot__Group__0__Impl6892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__Group__1__Impl_in_rule__ExprNot__Group__16923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__ExprEqAssignment_1_in_rule__ExprNot__Group__1__Impl6950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__0__Impl_in_rule__ExprEq__Group_0__06984 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__1_in_rule__ExprEq__Group_0__06987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ExprEq__Group_0__0__Impl7015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__1__Impl_in_rule__ExprEq__Group_0__17046 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__2_in_rule__ExprEq__Group_0__17049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__ExprAssignment_0_1_in_rule__ExprEq__Group_0__1__Impl7076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__2__Impl_in_rule__ExprEq__Group_0__27106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ExprEq__Group_0__2__Impl7134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__0__Impl_in_rule__ExprEq__Group_1__07171 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__1_in_rule__ExprEq__Group_1__07174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__ExprSim1Assignment_1_0_in_rule__ExprEq__Group_1__0__Impl7201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__1__Impl_in_rule__ExprEq__Group_1__17231 = new BitSet(new long[]{0x0000001080000030L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__2_in_rule__ExprEq__Group_1__17234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ExprEq__Group_1__1__Impl7262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__2__Impl_in_rule__ExprEq__Group_1__27293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__ExprSim2Assignment_1_2_in_rule__ExprEq__Group_1__2__Impl7320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__Program__FonctionsAssignment7361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_rule__Function__NomAssignment_17392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__Function__DefinitionAssignment_37423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_rule__Definition__InputsAssignment_17454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Definition__CommandesAssignment_37485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_rule__Definition__OutputsAssignment_67516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Input__VarInAssignment_0_07547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Input__VarInAssignment_17578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Output__VarOutAssignment_0_07609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Output__VarOutAssignment_17640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Vars__VarGenAssignment_0_07671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Vars__VarGenAssignment_17702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Commands__CommandeAssignment_0_0_07733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Commands__CommandeAssignment_17764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Command__NopAssignment_07800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_rule__Command__VarsAssignment_1_07839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_rule__Command__ExprsAssignment_1_27870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandWhile_in_rule__Command__CmdWhileAssignment_27901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandIf_in_rule__Command__CmdIfAssignment_37932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandForEach_in_rule__Command__CmdForEachAssignment_47963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__CommandWhile__WAssignment_0_07999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__CommandWhile__ExprAssignment_18038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__CommandWhile__CmdsAssignment_38069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__CommandIf__CondAssignment_18100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__CommandIf__CmdsThenAssignment_38131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__CommandIf__CmdsElseAssignment_4_18162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__CommandForEach__ElemAssignment_18193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__CommandForEach__EnsembAssignment_38224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__CommandForEach__CmdsAssignment_58255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Exprs__ExpGenAssignment_0_0_08286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Exprs__ExpGenAssignment_18317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__Expr__ExprSimpAssignment_0_08348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_rule__Expr__ExprAndAssignment_18379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ExprSimple__NilAssignment_0_08415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__ExprSimple__VariAssignment_0_18454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_rule__ExprSimple__SymbAssignment_0_28485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ExprSimple__ExprConsAssignment_1_18521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprSimple__ExprConsAttAssignment_1_28560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ExprSimple__ExprListAssignment_2_18596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprSimple__ExprListAttAssignment_2_28635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ExprSimple__ExprHeadAssignment_3_18671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprSimple__ExprHeadAttAssignment_3_28710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ExprSimple__ExprTailAssignment_4_18746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprSimple__ExprTailAttAssignment_4_28785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_rule__ExprSimple__NomSymbAssignment_5_18816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprSimple__SymbAttAssignment_5_28847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_rule__ExprAnd__ExprOrAssignment_08878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ExprAnd__ExprAndAssignment_1_08914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_rule__ExprAnd__ExprAndAttAssignment_1_18953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_rule__ExprOr__ExprNotAssignment_08984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ExprOr__ExprOrAssignment_1_09020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_rule__ExprOr__ExprOrAttAssignment_1_19059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ExprNot__NotAssignment_09095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEq_in_rule__ExprNot__ExprEqAssignment_19134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprEq__ExprAssignment_0_19165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__ExprEq__ExprSim1Assignment_1_09196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__ExprEq__ExprSim2Assignment_1_29227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_0__0_in_synpred7_InternalWhileCpp1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__0_in_synpred15_InternalWhileCpp1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_0__0_in_synpred19_InternalWhileCpp3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0__0_in_synpred21_InternalWhileCpp4798 = new BitSet(new long[]{0x0000000000000002L});

}