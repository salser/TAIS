/*
 * generated by Xtext 2.23.0
 */
grammar InternalDFD;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package co.edu.javeriana.dfd.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package co.edu.javeriana.dfd.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import co.edu.javeriana.dfd.services.DFDGrammarAccess;

}
@parser::members {
	private DFDGrammarAccess grammarAccess;

	public void setGrammarAccess(DFDGrammarAccess grammarAccess) {
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
}

// Entry rule entryRuleDFD
entryRuleDFD
:
{ before(grammarAccess.getDFDRule()); }
	 ruleDFD
{ after(grammarAccess.getDFDRule()); } 
	 EOF 
;

// Rule DFD
ruleDFD 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDFDAccess().getGroup()); }
		(rule__DFD__Group__0)
		{ after(grammarAccess.getDFDAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleElemento
entryRuleElemento
:
{ before(grammarAccess.getElementoRule()); }
	 ruleElemento
{ after(grammarAccess.getElementoRule()); } 
	 EOF 
;

// Rule Elemento
ruleElemento 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getElementoAccess().getAlternatives()); }
		(rule__Elemento__Alternatives)
		{ after(grammarAccess.getElementoAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFlujo
entryRuleFlujo
:
{ before(grammarAccess.getFlujoRule()); }
	 ruleFlujo
{ after(grammarAccess.getFlujoRule()); } 
	 EOF 
;

// Rule Flujo
ruleFlujo 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFlujoAccess().getGroup()); }
		(rule__Flujo__Group__0)
		{ after(grammarAccess.getFlujoAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProceso
entryRuleProceso
:
{ before(grammarAccess.getProcesoRule()); }
	 ruleProceso
{ after(grammarAccess.getProcesoRule()); } 
	 EOF 
;

// Rule Proceso
ruleProceso 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProcesoAccess().getGroup()); }
		(rule__Proceso__Group__0)
		{ after(grammarAccess.getProcesoAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntidadExterna
entryRuleEntidadExterna
:
{ before(grammarAccess.getEntidadExternaRule()); }
	 ruleEntidadExterna
{ after(grammarAccess.getEntidadExternaRule()); } 
	 EOF 
;

// Rule EntidadExterna
ruleEntidadExterna 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntidadExternaAccess().getGroup()); }
		(rule__EntidadExterna__Group__0)
		{ after(grammarAccess.getEntidadExternaAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAlmacen
entryRuleAlmacen
:
{ before(grammarAccess.getAlmacenRule()); }
	 ruleAlmacen
{ after(grammarAccess.getAlmacenRule()); } 
	 EOF 
;

// Rule Almacen
ruleAlmacen 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAlmacenAccess().getGroup()); }
		(rule__Almacen__Group__0)
		{ after(grammarAccess.getAlmacenAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Elemento__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getElementoAccess().getProcesoParserRuleCall_0()); }
		ruleProceso
		{ after(grammarAccess.getElementoAccess().getProcesoParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getElementoAccess().getEntidadExternaParserRuleCall_1()); }
		ruleEntidadExterna
		{ after(grammarAccess.getElementoAccess().getEntidadExternaParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getElementoAccess().getAlmacenParserRuleCall_2()); }
		ruleAlmacen
		{ after(grammarAccess.getElementoAccess().getAlmacenParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getGroup_0()); }
		(rule__EString__Group_0__0)
		{ after(grammarAccess.getEStringAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getGroup_1()); }
		(rule__EString__Group_1__0)
		{ after(grammarAccess.getEStringAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFD__Group__0__Impl
	rule__DFD__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFDAccess().getDFDAction_0()); }
	()
	{ after(grammarAccess.getDFDAccess().getDFDAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFD__Group__1__Impl
	rule__DFD__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFDAccess().getDFDKeyword_1()); }
	'DFD'
	{ after(grammarAccess.getDFDAccess().getDFDKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFD__Group__2__Impl
	rule__DFD__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFDAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getDFDAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFD__Group__3__Impl
	rule__DFD__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFDAccess().getGroup_3()); }
	(rule__DFD__Group_3__0)?
	{ after(grammarAccess.getDFDAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFD__Group__4__Impl
	rule__DFD__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFDAccess().getGroup_4()); }
	(rule__DFD__Group_4__0)?
	{ after(grammarAccess.getDFDAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFD__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFDAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getDFDAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DFD__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFD__Group_3__0__Impl
	rule__DFD__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFDAccess().getFlujoKeyword_3_0()); }
	'flujo'
	{ after(grammarAccess.getDFDAccess().getFlujoKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFD__Group_3__1__Impl
	rule__DFD__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFDAccess().getLeftCurlyBracketKeyword_3_1()); }
	'{'
	{ after(grammarAccess.getDFDAccess().getLeftCurlyBracketKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFD__Group_3__2__Impl
	rule__DFD__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFDAccess().getFlujoAssignment_3_2()); }
	(rule__DFD__FlujoAssignment_3_2)
	{ after(grammarAccess.getDFDAccess().getFlujoAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFD__Group_3__3__Impl
	rule__DFD__Group_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFDAccess().getGroup_3_3()); }
	(rule__DFD__Group_3_3__0)*
	{ after(grammarAccess.getDFDAccess().getGroup_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group_3__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFD__Group_3__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group_3__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFDAccess().getRightCurlyBracketKeyword_3_4()); }
	'}'
	{ after(grammarAccess.getDFDAccess().getRightCurlyBracketKeyword_3_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DFD__Group_3_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFD__Group_3_3__0__Impl
	rule__DFD__Group_3_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group_3_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFDAccess().getCommaKeyword_3_3_0()); }
	','
	{ after(grammarAccess.getDFDAccess().getCommaKeyword_3_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group_3_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFD__Group_3_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group_3_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFDAccess().getFlujoAssignment_3_3_1()); }
	(rule__DFD__FlujoAssignment_3_3_1)
	{ after(grammarAccess.getDFDAccess().getFlujoAssignment_3_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DFD__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFD__Group_4__0__Impl
	rule__DFD__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFDAccess().getElementoKeyword_4_0()); }
	'elemento'
	{ after(grammarAccess.getDFDAccess().getElementoKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFD__Group_4__1__Impl
	rule__DFD__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFDAccess().getLeftCurlyBracketKeyword_4_1()); }
	'{'
	{ after(grammarAccess.getDFDAccess().getLeftCurlyBracketKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFD__Group_4__2__Impl
	rule__DFD__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFDAccess().getElementoAssignment_4_2()); }
	(rule__DFD__ElementoAssignment_4_2)
	{ after(grammarAccess.getDFDAccess().getElementoAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFD__Group_4__3__Impl
	rule__DFD__Group_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFDAccess().getGroup_4_3()); }
	(rule__DFD__Group_4_3__0)*
	{ after(grammarAccess.getDFDAccess().getGroup_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group_4__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFD__Group_4__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group_4__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFDAccess().getRightCurlyBracketKeyword_4_4()); }
	'}'
	{ after(grammarAccess.getDFDAccess().getRightCurlyBracketKeyword_4_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DFD__Group_4_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFD__Group_4_3__0__Impl
	rule__DFD__Group_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group_4_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFDAccess().getCommaKeyword_4_3_0()); }
	','
	{ after(grammarAccess.getDFDAccess().getCommaKeyword_4_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group_4_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFD__Group_4_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__Group_4_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFDAccess().getElementoAssignment_4_3_1()); }
	(rule__DFD__ElementoAssignment_4_3_1)
	{ after(grammarAccess.getDFDAccess().getElementoAssignment_4_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Flujo__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Flujo__Group__0__Impl
	rule__Flujo__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Flujo__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlujoAccess().getFlujoAction_0()); }
	()
	{ after(grammarAccess.getFlujoAccess().getFlujoAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Flujo__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Flujo__Group__1__Impl
	rule__Flujo__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Flujo__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlujoAccess().getFlujoKeyword_1()); }
	'Flujo'
	{ after(grammarAccess.getFlujoAccess().getFlujoKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Flujo__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Flujo__Group__2__Impl
	rule__Flujo__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Flujo__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlujoAccess().getNameAssignment_2()); }
	(rule__Flujo__NameAssignment_2)
	{ after(grammarAccess.getFlujoAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Flujo__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Flujo__Group__3__Impl
	rule__Flujo__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Flujo__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlujoAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getFlujoAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Flujo__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Flujo__Group__4__Impl
	rule__Flujo__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Flujo__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlujoAccess().getAnteriorKeyword_4()); }
	'anterior'
	{ after(grammarAccess.getFlujoAccess().getAnteriorKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Flujo__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Flujo__Group__5__Impl
	rule__Flujo__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Flujo__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlujoAccess().getAnteriorAssignment_5()); }
	(rule__Flujo__AnteriorAssignment_5)
	{ after(grammarAccess.getFlujoAccess().getAnteriorAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Flujo__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Flujo__Group__6__Impl
	rule__Flujo__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Flujo__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlujoAccess().getNombreKeyword_6()); }
	'nombre'
	{ after(grammarAccess.getFlujoAccess().getNombreKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Flujo__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Flujo__Group__7__Impl
	rule__Flujo__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Flujo__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlujoAccess().getNombreAssignment_7()); }
	(rule__Flujo__NombreAssignment_7)
	{ after(grammarAccess.getFlujoAccess().getNombreAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Flujo__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Flujo__Group__8__Impl
	rule__Flujo__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Flujo__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlujoAccess().getSiguienteKeyword_8()); }
	'siguiente'
	{ after(grammarAccess.getFlujoAccess().getSiguienteKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Flujo__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Flujo__Group__9__Impl
	rule__Flujo__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Flujo__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlujoAccess().getSiguienteAssignment_9()); }
	(rule__Flujo__SiguienteAssignment_9)
	{ after(grammarAccess.getFlujoAccess().getSiguienteAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Flujo__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Flujo__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Flujo__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlujoAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getFlujoAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EString__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EString__Group_0__0__Impl
	rule__EString__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEStringAccess().getEStringAction_0_0()); }
	()
	{ after(grammarAccess.getEStringAccess().getEStringAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EString__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0_1()); }
	RULE_STRING
	{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EString__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EString__Group_1__0__Impl
	rule__EString__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEStringAccess().getEStringAction_1_0()); }
	()
	{ after(grammarAccess.getEStringAccess().getEStringAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EString__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Proceso__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Proceso__Group__0__Impl
	rule__Proceso__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Proceso__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcesoAccess().getProcesoAction_0()); }
	()
	{ after(grammarAccess.getProcesoAccess().getProcesoAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Proceso__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Proceso__Group__1__Impl
	rule__Proceso__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Proceso__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcesoAccess().getProcesoKeyword_1()); }
	'Proceso'
	{ after(grammarAccess.getProcesoAccess().getProcesoKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Proceso__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Proceso__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Proceso__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcesoAccess().getNameAssignment_2()); }
	(rule__Proceso__NameAssignment_2)
	{ after(grammarAccess.getProcesoAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EntidadExterna__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntidadExterna__Group__0__Impl
	rule__EntidadExterna__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EntidadExterna__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntidadExternaAccess().getEntidadExternaAction_0()); }
	()
	{ after(grammarAccess.getEntidadExternaAccess().getEntidadExternaAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntidadExterna__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntidadExterna__Group__1__Impl
	rule__EntidadExterna__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EntidadExterna__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntidadExternaAccess().getEntidadExternaKeyword_1()); }
	'EntidadExterna'
	{ after(grammarAccess.getEntidadExternaAccess().getEntidadExternaKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntidadExterna__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntidadExterna__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EntidadExterna__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntidadExternaAccess().getNameAssignment_2()); }
	(rule__EntidadExterna__NameAssignment_2)
	{ after(grammarAccess.getEntidadExternaAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Almacen__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Almacen__Group__0__Impl
	rule__Almacen__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Almacen__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlmacenAccess().getAlmacenAction_0()); }
	()
	{ after(grammarAccess.getAlmacenAccess().getAlmacenAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Almacen__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Almacen__Group__1__Impl
	rule__Almacen__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Almacen__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlmacenAccess().getAlmacenKeyword_1()); }
	'Almacen'
	{ after(grammarAccess.getAlmacenAccess().getAlmacenKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Almacen__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Almacen__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Almacen__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlmacenAccess().getNameAssignment_2()); }
	(rule__Almacen__NameAssignment_2)
	{ after(grammarAccess.getAlmacenAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DFD__FlujoAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDFDAccess().getFlujoFlujoParserRuleCall_3_2_0()); }
		ruleFlujo
		{ after(grammarAccess.getDFDAccess().getFlujoFlujoParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__FlujoAssignment_3_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDFDAccess().getFlujoFlujoParserRuleCall_3_3_1_0()); }
		ruleFlujo
		{ after(grammarAccess.getDFDAccess().getFlujoFlujoParserRuleCall_3_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__ElementoAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDFDAccess().getElementoElementoParserRuleCall_4_2_0()); }
		ruleElemento
		{ after(grammarAccess.getDFDAccess().getElementoElementoParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFD__ElementoAssignment_4_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDFDAccess().getElementoElementoParserRuleCall_4_3_1_0()); }
		ruleElemento
		{ after(grammarAccess.getDFDAccess().getElementoElementoParserRuleCall_4_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Flujo__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFlujoAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getFlujoAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Flujo__AnteriorAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFlujoAccess().getAnteriorEStringParserRuleCall_5_0()); }
		ruleEString
		{ after(grammarAccess.getFlujoAccess().getAnteriorEStringParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Flujo__NombreAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFlujoAccess().getNombreEStringParserRuleCall_7_0()); }
		ruleEString
		{ after(grammarAccess.getFlujoAccess().getNombreEStringParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Flujo__SiguienteAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFlujoAccess().getSiguienteEStringParserRuleCall_9_0()); }
		ruleEString
		{ after(grammarAccess.getFlujoAccess().getSiguienteEStringParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Proceso__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProcesoAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getProcesoAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntidadExterna__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntidadExternaAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getEntidadExternaAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Almacen__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAlmacenAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getAlmacenAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
