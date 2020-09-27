package co.edu.javeriana.dfd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.edu.javeriana.dfd.services.DFDGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDFDParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DFD'", "'{'", "'flujo'", "','", "'}'", "'elemento'", "'Flujo'", "'anterior'", "'nombre'", "'siguiente'", "'Proceso'", "'EntidadExterna'", "'Almacen'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDFDParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDFDParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDFDParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDFD.g"; }



     	private DFDGrammarAccess grammarAccess;

        public InternalDFDParser(TokenStream input, DFDGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DFD";
       	}

       	@Override
       	protected DFDGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDFD"
    // InternalDFD.g:64:1: entryRuleDFD returns [EObject current=null] : iv_ruleDFD= ruleDFD EOF ;
    public final EObject entryRuleDFD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDFD = null;


        try {
            // InternalDFD.g:64:44: (iv_ruleDFD= ruleDFD EOF )
            // InternalDFD.g:65:2: iv_ruleDFD= ruleDFD EOF
            {
             newCompositeNode(grammarAccess.getDFDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDFD=ruleDFD();

            state._fsp--;

             current =iv_ruleDFD; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDFD"


    // $ANTLR start "ruleDFD"
    // InternalDFD.g:71:1: ruleDFD returns [EObject current=null] : ( () otherlv_1= 'DFD' otherlv_2= '{' (otherlv_3= 'flujo' otherlv_4= '{' ( (lv_flujo_5_0= ruleFlujo ) ) (otherlv_6= ',' ( (lv_flujo_7_0= ruleFlujo ) ) )* otherlv_8= '}' )? (otherlv_9= 'elemento' otherlv_10= '{' ( (lv_elemento_11_0= ruleElemento ) ) (otherlv_12= ',' ( (lv_elemento_13_0= ruleElemento ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleDFD() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_flujo_5_0 = null;

        EObject lv_flujo_7_0 = null;

        EObject lv_elemento_11_0 = null;

        EObject lv_elemento_13_0 = null;



        	enterRule();

        try {
            // InternalDFD.g:77:2: ( ( () otherlv_1= 'DFD' otherlv_2= '{' (otherlv_3= 'flujo' otherlv_4= '{' ( (lv_flujo_5_0= ruleFlujo ) ) (otherlv_6= ',' ( (lv_flujo_7_0= ruleFlujo ) ) )* otherlv_8= '}' )? (otherlv_9= 'elemento' otherlv_10= '{' ( (lv_elemento_11_0= ruleElemento ) ) (otherlv_12= ',' ( (lv_elemento_13_0= ruleElemento ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalDFD.g:78:2: ( () otherlv_1= 'DFD' otherlv_2= '{' (otherlv_3= 'flujo' otherlv_4= '{' ( (lv_flujo_5_0= ruleFlujo ) ) (otherlv_6= ',' ( (lv_flujo_7_0= ruleFlujo ) ) )* otherlv_8= '}' )? (otherlv_9= 'elemento' otherlv_10= '{' ( (lv_elemento_11_0= ruleElemento ) ) (otherlv_12= ',' ( (lv_elemento_13_0= ruleElemento ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalDFD.g:78:2: ( () otherlv_1= 'DFD' otherlv_2= '{' (otherlv_3= 'flujo' otherlv_4= '{' ( (lv_flujo_5_0= ruleFlujo ) ) (otherlv_6= ',' ( (lv_flujo_7_0= ruleFlujo ) ) )* otherlv_8= '}' )? (otherlv_9= 'elemento' otherlv_10= '{' ( (lv_elemento_11_0= ruleElemento ) ) (otherlv_12= ',' ( (lv_elemento_13_0= ruleElemento ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalDFD.g:79:3: () otherlv_1= 'DFD' otherlv_2= '{' (otherlv_3= 'flujo' otherlv_4= '{' ( (lv_flujo_5_0= ruleFlujo ) ) (otherlv_6= ',' ( (lv_flujo_7_0= ruleFlujo ) ) )* otherlv_8= '}' )? (otherlv_9= 'elemento' otherlv_10= '{' ( (lv_elemento_11_0= ruleElemento ) ) (otherlv_12= ',' ( (lv_elemento_13_0= ruleElemento ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalDFD.g:79:3: ()
            // InternalDFD.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDFDAccess().getDFDAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDFDAccess().getDFDKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDFDAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDFD.g:94:3: (otherlv_3= 'flujo' otherlv_4= '{' ( (lv_flujo_5_0= ruleFlujo ) ) (otherlv_6= ',' ( (lv_flujo_7_0= ruleFlujo ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDFD.g:95:4: otherlv_3= 'flujo' otherlv_4= '{' ( (lv_flujo_5_0= ruleFlujo ) ) (otherlv_6= ',' ( (lv_flujo_7_0= ruleFlujo ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getDFDAccess().getFlujoKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getDFDAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalDFD.g:103:4: ( (lv_flujo_5_0= ruleFlujo ) )
                    // InternalDFD.g:104:5: (lv_flujo_5_0= ruleFlujo )
                    {
                    // InternalDFD.g:104:5: (lv_flujo_5_0= ruleFlujo )
                    // InternalDFD.g:105:6: lv_flujo_5_0= ruleFlujo
                    {

                    						newCompositeNode(grammarAccess.getDFDAccess().getFlujoFlujoParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_flujo_5_0=ruleFlujo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDFDRule());
                    						}
                    						add(
                    							current,
                    							"flujo",
                    							lv_flujo_5_0,
                    							"co.edu.javeriana.dfd.DFD.Flujo");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDFD.g:122:4: (otherlv_6= ',' ( (lv_flujo_7_0= ruleFlujo ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDFD.g:123:5: otherlv_6= ',' ( (lv_flujo_7_0= ruleFlujo ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getDFDAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDFD.g:127:5: ( (lv_flujo_7_0= ruleFlujo ) )
                    	    // InternalDFD.g:128:6: (lv_flujo_7_0= ruleFlujo )
                    	    {
                    	    // InternalDFD.g:128:6: (lv_flujo_7_0= ruleFlujo )
                    	    // InternalDFD.g:129:7: lv_flujo_7_0= ruleFlujo
                    	    {

                    	    							newCompositeNode(grammarAccess.getDFDAccess().getFlujoFlujoParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_flujo_7_0=ruleFlujo();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDFDRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"flujo",
                    	    								lv_flujo_7_0,
                    	    								"co.edu.javeriana.dfd.DFD.Flujo");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getDFDAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDFD.g:152:3: (otherlv_9= 'elemento' otherlv_10= '{' ( (lv_elemento_11_0= ruleElemento ) ) (otherlv_12= ',' ( (lv_elemento_13_0= ruleElemento ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDFD.g:153:4: otherlv_9= 'elemento' otherlv_10= '{' ( (lv_elemento_11_0= ruleElemento ) ) (otherlv_12= ',' ( (lv_elemento_13_0= ruleElemento ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getDFDAccess().getElementoKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getDFDAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDFD.g:161:4: ( (lv_elemento_11_0= ruleElemento ) )
                    // InternalDFD.g:162:5: (lv_elemento_11_0= ruleElemento )
                    {
                    // InternalDFD.g:162:5: (lv_elemento_11_0= ruleElemento )
                    // InternalDFD.g:163:6: lv_elemento_11_0= ruleElemento
                    {

                    						newCompositeNode(grammarAccess.getDFDAccess().getElementoElementoParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_elemento_11_0=ruleElemento();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDFDRule());
                    						}
                    						add(
                    							current,
                    							"elemento",
                    							lv_elemento_11_0,
                    							"co.edu.javeriana.dfd.DFD.Elemento");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDFD.g:180:4: (otherlv_12= ',' ( (lv_elemento_13_0= ruleElemento ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalDFD.g:181:5: otherlv_12= ',' ( (lv_elemento_13_0= ruleElemento ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getDFDAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDFD.g:185:5: ( (lv_elemento_13_0= ruleElemento ) )
                    	    // InternalDFD.g:186:6: (lv_elemento_13_0= ruleElemento )
                    	    {
                    	    // InternalDFD.g:186:6: (lv_elemento_13_0= ruleElemento )
                    	    // InternalDFD.g:187:7: lv_elemento_13_0= ruleElemento
                    	    {

                    	    							newCompositeNode(grammarAccess.getDFDAccess().getElementoElementoParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_elemento_13_0=ruleElemento();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDFDRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elemento",
                    	    								lv_elemento_13_0,
                    	    								"co.edu.javeriana.dfd.DFD.Elemento");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getDFDAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getDFDAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDFD"


    // $ANTLR start "entryRuleElemento"
    // InternalDFD.g:218:1: entryRuleElemento returns [EObject current=null] : iv_ruleElemento= ruleElemento EOF ;
    public final EObject entryRuleElemento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElemento = null;


        try {
            // InternalDFD.g:218:49: (iv_ruleElemento= ruleElemento EOF )
            // InternalDFD.g:219:2: iv_ruleElemento= ruleElemento EOF
            {
             newCompositeNode(grammarAccess.getElementoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElemento=ruleElemento();

            state._fsp--;

             current =iv_ruleElemento; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElemento"


    // $ANTLR start "ruleElemento"
    // InternalDFD.g:225:1: ruleElemento returns [EObject current=null] : (this_Proceso_0= ruleProceso | this_EntidadExterna_1= ruleEntidadExterna | this_Almacen_2= ruleAlmacen ) ;
    public final EObject ruleElemento() throws RecognitionException {
        EObject current = null;

        EObject this_Proceso_0 = null;

        EObject this_EntidadExterna_1 = null;

        EObject this_Almacen_2 = null;



        	enterRule();

        try {
            // InternalDFD.g:231:2: ( (this_Proceso_0= ruleProceso | this_EntidadExterna_1= ruleEntidadExterna | this_Almacen_2= ruleAlmacen ) )
            // InternalDFD.g:232:2: (this_Proceso_0= ruleProceso | this_EntidadExterna_1= ruleEntidadExterna | this_Almacen_2= ruleAlmacen )
            {
            // InternalDFD.g:232:2: (this_Proceso_0= ruleProceso | this_EntidadExterna_1= ruleEntidadExterna | this_Almacen_2= ruleAlmacen )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDFD.g:233:3: this_Proceso_0= ruleProceso
                    {

                    			newCompositeNode(grammarAccess.getElementoAccess().getProcesoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Proceso_0=ruleProceso();

                    state._fsp--;


                    			current = this_Proceso_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDFD.g:242:3: this_EntidadExterna_1= ruleEntidadExterna
                    {

                    			newCompositeNode(grammarAccess.getElementoAccess().getEntidadExternaParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntidadExterna_1=ruleEntidadExterna();

                    state._fsp--;


                    			current = this_EntidadExterna_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDFD.g:251:3: this_Almacen_2= ruleAlmacen
                    {

                    			newCompositeNode(grammarAccess.getElementoAccess().getAlmacenParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Almacen_2=ruleAlmacen();

                    state._fsp--;


                    			current = this_Almacen_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElemento"


    // $ANTLR start "entryRuleFlujo"
    // InternalDFD.g:263:1: entryRuleFlujo returns [EObject current=null] : iv_ruleFlujo= ruleFlujo EOF ;
    public final EObject entryRuleFlujo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlujo = null;


        try {
            // InternalDFD.g:263:46: (iv_ruleFlujo= ruleFlujo EOF )
            // InternalDFD.g:264:2: iv_ruleFlujo= ruleFlujo EOF
            {
             newCompositeNode(grammarAccess.getFlujoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFlujo=ruleFlujo();

            state._fsp--;

             current =iv_ruleFlujo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFlujo"


    // $ANTLR start "ruleFlujo"
    // InternalDFD.g:270:1: ruleFlujo returns [EObject current=null] : ( () otherlv_1= 'Flujo' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'anterior' ( (lv_anterior_5_0= ruleEString ) ) otherlv_6= 'nombre' ( (lv_nombre_7_0= ruleEString ) ) otherlv_8= 'siguiente' ( (lv_siguiente_9_0= ruleEString ) ) otherlv_10= '}' ) ;
    public final EObject ruleFlujo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_name_2_0 = null;

        EObject lv_anterior_5_0 = null;

        EObject lv_nombre_7_0 = null;

        EObject lv_siguiente_9_0 = null;



        	enterRule();

        try {
            // InternalDFD.g:276:2: ( ( () otherlv_1= 'Flujo' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'anterior' ( (lv_anterior_5_0= ruleEString ) ) otherlv_6= 'nombre' ( (lv_nombre_7_0= ruleEString ) ) otherlv_8= 'siguiente' ( (lv_siguiente_9_0= ruleEString ) ) otherlv_10= '}' ) )
            // InternalDFD.g:277:2: ( () otherlv_1= 'Flujo' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'anterior' ( (lv_anterior_5_0= ruleEString ) ) otherlv_6= 'nombre' ( (lv_nombre_7_0= ruleEString ) ) otherlv_8= 'siguiente' ( (lv_siguiente_9_0= ruleEString ) ) otherlv_10= '}' )
            {
            // InternalDFD.g:277:2: ( () otherlv_1= 'Flujo' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'anterior' ( (lv_anterior_5_0= ruleEString ) ) otherlv_6= 'nombre' ( (lv_nombre_7_0= ruleEString ) ) otherlv_8= 'siguiente' ( (lv_siguiente_9_0= ruleEString ) ) otherlv_10= '}' )
            // InternalDFD.g:278:3: () otherlv_1= 'Flujo' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'anterior' ( (lv_anterior_5_0= ruleEString ) ) otherlv_6= 'nombre' ( (lv_nombre_7_0= ruleEString ) ) otherlv_8= 'siguiente' ( (lv_siguiente_9_0= ruleEString ) ) otherlv_10= '}'
            {
            // InternalDFD.g:278:3: ()
            // InternalDFD.g:279:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFlujoAccess().getFlujoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getFlujoAccess().getFlujoKeyword_1());
            		
            // InternalDFD.g:289:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDFD.g:290:4: (lv_name_2_0= ruleEString )
            {
            // InternalDFD.g:290:4: (lv_name_2_0= ruleEString )
            // InternalDFD.g:291:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFlujoAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFlujoRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"co.edu.javeriana.dfd.DFD.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getFlujoAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getFlujoAccess().getAnteriorKeyword_4());
            		
            // InternalDFD.g:316:3: ( (lv_anterior_5_0= ruleEString ) )
            // InternalDFD.g:317:4: (lv_anterior_5_0= ruleEString )
            {
            // InternalDFD.g:317:4: (lv_anterior_5_0= ruleEString )
            // InternalDFD.g:318:5: lv_anterior_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFlujoAccess().getAnteriorEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_anterior_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFlujoRule());
            					}
            					set(
            						current,
            						"anterior",
            						lv_anterior_5_0,
            						"co.edu.javeriana.dfd.DFD.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getFlujoAccess().getNombreKeyword_6());
            		
            // InternalDFD.g:339:3: ( (lv_nombre_7_0= ruleEString ) )
            // InternalDFD.g:340:4: (lv_nombre_7_0= ruleEString )
            {
            // InternalDFD.g:340:4: (lv_nombre_7_0= ruleEString )
            // InternalDFD.g:341:5: lv_nombre_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFlujoAccess().getNombreEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_13);
            lv_nombre_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFlujoRule());
            					}
            					set(
            						current,
            						"nombre",
            						lv_nombre_7_0,
            						"co.edu.javeriana.dfd.DFD.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getFlujoAccess().getSiguienteKeyword_8());
            		
            // InternalDFD.g:362:3: ( (lv_siguiente_9_0= ruleEString ) )
            // InternalDFD.g:363:4: (lv_siguiente_9_0= ruleEString )
            {
            // InternalDFD.g:363:4: (lv_siguiente_9_0= ruleEString )
            // InternalDFD.g:364:5: lv_siguiente_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFlujoAccess().getSiguienteEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
            lv_siguiente_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFlujoRule());
            					}
            					set(
            						current,
            						"siguiente",
            						lv_siguiente_9_0,
            						"co.edu.javeriana.dfd.DFD.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getFlujoAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlujo"


    // $ANTLR start "entryRuleEString"
    // InternalDFD.g:389:1: entryRuleEString returns [EObject current=null] : iv_ruleEString= ruleEString EOF ;
    public final EObject entryRuleEString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEString = null;


        try {
            // InternalDFD.g:389:48: (iv_ruleEString= ruleEString EOF )
            // InternalDFD.g:390:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDFD.g:396:1: ruleEString returns [EObject current=null] : ( ( () this_STRING_1= RULE_STRING ) | ( () this_ID_3= RULE_ID ) ) ;
    public final EObject ruleEString() throws RecognitionException {
        EObject current = null;

        Token this_STRING_1=null;
        Token this_ID_3=null;


        	enterRule();

        try {
            // InternalDFD.g:402:2: ( ( ( () this_STRING_1= RULE_STRING ) | ( () this_ID_3= RULE_ID ) ) )
            // InternalDFD.g:403:2: ( ( () this_STRING_1= RULE_STRING ) | ( () this_ID_3= RULE_ID ) )
            {
            // InternalDFD.g:403:2: ( ( () this_STRING_1= RULE_STRING ) | ( () this_ID_3= RULE_ID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDFD.g:404:3: ( () this_STRING_1= RULE_STRING )
                    {
                    // InternalDFD.g:404:3: ( () this_STRING_1= RULE_STRING )
                    // InternalDFD.g:405:4: () this_STRING_1= RULE_STRING
                    {
                    // InternalDFD.g:405:4: ()
                    // InternalDFD.g:406:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEStringAccess().getEStringAction_0_0(),
                    						current);
                    				

                    }

                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    				newLeafNode(this_STRING_1, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDFD.g:418:3: ( () this_ID_3= RULE_ID )
                    {
                    // InternalDFD.g:418:3: ( () this_ID_3= RULE_ID )
                    // InternalDFD.g:419:4: () this_ID_3= RULE_ID
                    {
                    // InternalDFD.g:419:4: ()
                    // InternalDFD.g:420:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEStringAccess().getEStringAction_1_0(),
                    						current);
                    				

                    }

                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				newLeafNode(this_ID_3, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleProceso"
    // InternalDFD.g:435:1: entryRuleProceso returns [EObject current=null] : iv_ruleProceso= ruleProceso EOF ;
    public final EObject entryRuleProceso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProceso = null;


        try {
            // InternalDFD.g:435:48: (iv_ruleProceso= ruleProceso EOF )
            // InternalDFD.g:436:2: iv_ruleProceso= ruleProceso EOF
            {
             newCompositeNode(grammarAccess.getProcesoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProceso=ruleProceso();

            state._fsp--;

             current =iv_ruleProceso; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProceso"


    // $ANTLR start "ruleProceso"
    // InternalDFD.g:442:1: ruleProceso returns [EObject current=null] : ( () otherlv_1= 'Proceso' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleProceso() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDFD.g:448:2: ( ( () otherlv_1= 'Proceso' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDFD.g:449:2: ( () otherlv_1= 'Proceso' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDFD.g:449:2: ( () otherlv_1= 'Proceso' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDFD.g:450:3: () otherlv_1= 'Proceso' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDFD.g:450:3: ()
            // InternalDFD.g:451:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProcesoAccess().getProcesoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getProcesoAccess().getProcesoKeyword_1());
            		
            // InternalDFD.g:461:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDFD.g:462:4: (lv_name_2_0= ruleEString )
            {
            // InternalDFD.g:462:4: (lv_name_2_0= ruleEString )
            // InternalDFD.g:463:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProcesoAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcesoRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"co.edu.javeriana.dfd.DFD.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProceso"


    // $ANTLR start "entryRuleEntidadExterna"
    // InternalDFD.g:484:1: entryRuleEntidadExterna returns [EObject current=null] : iv_ruleEntidadExterna= ruleEntidadExterna EOF ;
    public final EObject entryRuleEntidadExterna() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidadExterna = null;


        try {
            // InternalDFD.g:484:55: (iv_ruleEntidadExterna= ruleEntidadExterna EOF )
            // InternalDFD.g:485:2: iv_ruleEntidadExterna= ruleEntidadExterna EOF
            {
             newCompositeNode(grammarAccess.getEntidadExternaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntidadExterna=ruleEntidadExterna();

            state._fsp--;

             current =iv_ruleEntidadExterna; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntidadExterna"


    // $ANTLR start "ruleEntidadExterna"
    // InternalDFD.g:491:1: ruleEntidadExterna returns [EObject current=null] : ( () otherlv_1= 'EntidadExterna' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleEntidadExterna() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDFD.g:497:2: ( ( () otherlv_1= 'EntidadExterna' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDFD.g:498:2: ( () otherlv_1= 'EntidadExterna' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDFD.g:498:2: ( () otherlv_1= 'EntidadExterna' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDFD.g:499:3: () otherlv_1= 'EntidadExterna' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDFD.g:499:3: ()
            // InternalDFD.g:500:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntidadExternaAccess().getEntidadExternaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getEntidadExternaAccess().getEntidadExternaKeyword_1());
            		
            // InternalDFD.g:510:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDFD.g:511:4: (lv_name_2_0= ruleEString )
            {
            // InternalDFD.g:511:4: (lv_name_2_0= ruleEString )
            // InternalDFD.g:512:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEntidadExternaAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntidadExternaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"co.edu.javeriana.dfd.DFD.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntidadExterna"


    // $ANTLR start "entryRuleAlmacen"
    // InternalDFD.g:533:1: entryRuleAlmacen returns [EObject current=null] : iv_ruleAlmacen= ruleAlmacen EOF ;
    public final EObject entryRuleAlmacen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlmacen = null;


        try {
            // InternalDFD.g:533:48: (iv_ruleAlmacen= ruleAlmacen EOF )
            // InternalDFD.g:534:2: iv_ruleAlmacen= ruleAlmacen EOF
            {
             newCompositeNode(grammarAccess.getAlmacenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlmacen=ruleAlmacen();

            state._fsp--;

             current =iv_ruleAlmacen; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlmacen"


    // $ANTLR start "ruleAlmacen"
    // InternalDFD.g:540:1: ruleAlmacen returns [EObject current=null] : ( () otherlv_1= 'Almacen' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleAlmacen() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDFD.g:546:2: ( ( () otherlv_1= 'Almacen' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDFD.g:547:2: ( () otherlv_1= 'Almacen' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDFD.g:547:2: ( () otherlv_1= 'Almacen' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDFD.g:548:3: () otherlv_1= 'Almacen' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDFD.g:548:3: ()
            // InternalDFD.g:549:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAlmacenAccess().getAlmacenAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAlmacenAccess().getAlmacenKeyword_1());
            		
            // InternalDFD.g:559:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDFD.g:560:4: (lv_name_2_0= ruleEString )
            {
            // InternalDFD.g:560:4: (lv_name_2_0= ruleEString )
            // InternalDFD.g:561:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAlmacenAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlmacenRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"co.edu.javeriana.dfd.DFD.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlmacen"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});

}