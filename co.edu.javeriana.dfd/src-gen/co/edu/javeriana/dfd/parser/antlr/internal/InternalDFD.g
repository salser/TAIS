/*
 * generated by Xtext 2.23.0
 */
grammar InternalDFD;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package co.edu.javeriana.dfd.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDFD
entryRuleDFD returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDFDRule()); }
	iv_ruleDFD=ruleDFD
	{ $current=$iv_ruleDFD.current; }
	EOF;

// Rule DFD
ruleDFD returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDFDAccess().getDFDAction_0(),
					$current);
			}
		)
		otherlv_1='DFD'
		{
			newLeafNode(otherlv_1, grammarAccess.getDFDAccess().getDFDKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getDFDAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='flujo'
			{
				newLeafNode(otherlv_3, grammarAccess.getDFDAccess().getFlujoKeyword_3_0());
			}
			otherlv_4='{'
			{
				newLeafNode(otherlv_4, grammarAccess.getDFDAccess().getLeftCurlyBracketKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDFDAccess().getFlujoFlujoParserRuleCall_3_2_0());
					}
					lv_flujo_5_0=ruleFlujo
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDFDRule());
						}
						add(
							$current,
							"flujo",
							lv_flujo_5_0,
							"co.edu.javeriana.dfd.DFD.Flujo");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getDFDAccess().getCommaKeyword_3_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getDFDAccess().getFlujoFlujoParserRuleCall_3_3_1_0());
						}
						lv_flujo_7_0=ruleFlujo
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getDFDRule());
							}
							add(
								$current,
								"flujo",
								lv_flujo_7_0,
								"co.edu.javeriana.dfd.DFD.Flujo");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8='}'
			{
				newLeafNode(otherlv_8, grammarAccess.getDFDAccess().getRightCurlyBracketKeyword_3_4());
			}
		)?
		(
			otherlv_9='elemento'
			{
				newLeafNode(otherlv_9, grammarAccess.getDFDAccess().getElementoKeyword_4_0());
			}
			otherlv_10='{'
			{
				newLeafNode(otherlv_10, grammarAccess.getDFDAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDFDAccess().getElementoElementoParserRuleCall_4_2_0());
					}
					lv_elemento_11_0=ruleElemento
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDFDRule());
						}
						add(
							$current,
							"elemento",
							lv_elemento_11_0,
							"co.edu.javeriana.dfd.DFD.Elemento");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_12=','
				{
					newLeafNode(otherlv_12, grammarAccess.getDFDAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getDFDAccess().getElementoElementoParserRuleCall_4_3_1_0());
						}
						lv_elemento_13_0=ruleElemento
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getDFDRule());
							}
							add(
								$current,
								"elemento",
								lv_elemento_13_0,
								"co.edu.javeriana.dfd.DFD.Elemento");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_14='}'
			{
				newLeafNode(otherlv_14, grammarAccess.getDFDAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		otherlv_15='}'
		{
			newLeafNode(otherlv_15, grammarAccess.getDFDAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleElemento
entryRuleElemento returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementoRule()); }
	iv_ruleElemento=ruleElemento
	{ $current=$iv_ruleElemento.current; }
	EOF;

// Rule Elemento
ruleElemento returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getElementoAccess().getProcesoParserRuleCall_0());
		}
		this_Proceso_0=ruleProceso
		{
			$current = $this_Proceso_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementoAccess().getEntidadExternaParserRuleCall_1());
		}
		this_EntidadExterna_1=ruleEntidadExterna
		{
			$current = $this_EntidadExterna_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementoAccess().getAlmacenParserRuleCall_2());
		}
		this_Almacen_2=ruleAlmacen
		{
			$current = $this_Almacen_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFlujo
entryRuleFlujo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFlujoRule()); }
	iv_ruleFlujo=ruleFlujo
	{ $current=$iv_ruleFlujo.current; }
	EOF;

// Rule Flujo
ruleFlujo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFlujoAccess().getFlujoAction_0(),
					$current);
			}
		)
		otherlv_1='Flujo'
		{
			newLeafNode(otherlv_1, grammarAccess.getFlujoAccess().getFlujoKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFlujoAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFlujoRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"co.edu.javeriana.dfd.DFD.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getFlujoAccess().getLeftCurlyBracketKeyword_3());
		}
		otherlv_4='anterior'
		{
			newLeafNode(otherlv_4, grammarAccess.getFlujoAccess().getAnteriorKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFlujoAccess().getAnteriorEStringParserRuleCall_5_0());
				}
				lv_anterior_5_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFlujoRule());
					}
					set(
						$current,
						"anterior",
						lv_anterior_5_0,
						"co.edu.javeriana.dfd.DFD.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='nombre'
		{
			newLeafNode(otherlv_6, grammarAccess.getFlujoAccess().getNombreKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFlujoAccess().getNombreEStringParserRuleCall_7_0());
				}
				lv_nombre_7_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFlujoRule());
					}
					set(
						$current,
						"nombre",
						lv_nombre_7_0,
						"co.edu.javeriana.dfd.DFD.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='siguiente'
		{
			newLeafNode(otherlv_8, grammarAccess.getFlujoAccess().getSiguienteKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFlujoAccess().getSiguienteEStringParserRuleCall_9_0());
				}
				lv_siguiente_9_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFlujoRule());
					}
					set(
						$current,
						"siguiente",
						lv_siguiente_9_0,
						"co.edu.javeriana.dfd.DFD.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getFlujoAccess().getRightCurlyBracketKeyword_10());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current; }
	EOF;

// Rule EString
ruleEString returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getEStringAccess().getEStringAction_0_0(),
						$current);
				}
			)
			this_STRING_1=RULE_STRING
			{
				newLeafNode(this_STRING_1, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getEStringAccess().getEStringAction_1_0(),
						$current);
				}
			)
			this_ID_3=RULE_ID
			{
				newLeafNode(this_ID_3, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1_1());
			}
		)
	)
;

// Entry rule entryRuleProceso
entryRuleProceso returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProcesoRule()); }
	iv_ruleProceso=ruleProceso
	{ $current=$iv_ruleProceso.current; }
	EOF;

// Rule Proceso
ruleProceso returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getProcesoAccess().getProcesoAction_0(),
					$current);
			}
		)
		otherlv_1='Proceso'
		{
			newLeafNode(otherlv_1, grammarAccess.getProcesoAccess().getProcesoKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProcesoAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProcesoRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"co.edu.javeriana.dfd.DFD.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEntidadExterna
entryRuleEntidadExterna returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntidadExternaRule()); }
	iv_ruleEntidadExterna=ruleEntidadExterna
	{ $current=$iv_ruleEntidadExterna.current; }
	EOF;

// Rule EntidadExterna
ruleEntidadExterna returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getEntidadExternaAccess().getEntidadExternaAction_0(),
					$current);
			}
		)
		otherlv_1='EntidadExterna'
		{
			newLeafNode(otherlv_1, grammarAccess.getEntidadExternaAccess().getEntidadExternaKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntidadExternaAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntidadExternaRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"co.edu.javeriana.dfd.DFD.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAlmacen
entryRuleAlmacen returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAlmacenRule()); }
	iv_ruleAlmacen=ruleAlmacen
	{ $current=$iv_ruleAlmacen.current; }
	EOF;

// Rule Almacen
ruleAlmacen returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getAlmacenAccess().getAlmacenAction_0(),
					$current);
			}
		)
		otherlv_1='Almacen'
		{
			newLeafNode(otherlv_1, grammarAccess.getAlmacenAccess().getAlmacenKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAlmacenAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAlmacenRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"co.edu.javeriana.dfd.DFD.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;