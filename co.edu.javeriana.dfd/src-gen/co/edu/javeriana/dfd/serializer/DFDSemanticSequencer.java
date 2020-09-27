/*
 * generated by Xtext 2.23.0
 */
package co.edu.javeriana.dfd.serializer;

import co.edu.javeriana.dfd.dFD.Almacen;
import co.edu.javeriana.dfd.dFD.DFD;
import co.edu.javeriana.dfd.dFD.DFDPackage;
import co.edu.javeriana.dfd.dFD.EString;
import co.edu.javeriana.dfd.dFD.EntidadExterna;
import co.edu.javeriana.dfd.dFD.Flujo;
import co.edu.javeriana.dfd.dFD.Proceso;
import co.edu.javeriana.dfd.services.DFDGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DFDSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DFDGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DFDPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DFDPackage.ALMACEN:
				sequence_Almacen(context, (Almacen) semanticObject); 
				return; 
			case DFDPackage.DFD:
				sequence_DFD(context, (DFD) semanticObject); 
				return; 
			case DFDPackage.ESTRING:
				sequence_EString(context, (EString) semanticObject); 
				return; 
			case DFDPackage.ENTIDAD_EXTERNA:
				sequence_EntidadExterna(context, (EntidadExterna) semanticObject); 
				return; 
			case DFDPackage.FLUJO:
				sequence_Flujo(context, (Flujo) semanticObject); 
				return; 
			case DFDPackage.PROCESO:
				sequence_Proceso(context, (Proceso) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Elemento returns Almacen
	 *     Almacen returns Almacen
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Almacen(ISerializationContext context, Almacen semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DFDPackage.Literals.ELEMENTO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DFDPackage.Literals.ELEMENTO__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAlmacenAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DFD returns DFD
	 *
	 * Constraint:
	 *     ((flujo+=Flujo flujo+=Flujo*)? (elemento+=Elemento elemento+=Elemento*)?)
	 */
	protected void sequence_DFD(ISerializationContext context, DFD semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EString returns EString
	 *
	 * Constraint:
	 *     {EString}
	 */
	protected void sequence_EString(ISerializationContext context, EString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Elemento returns EntidadExterna
	 *     EntidadExterna returns EntidadExterna
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_EntidadExterna(ISerializationContext context, EntidadExterna semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DFDPackage.Literals.ELEMENTO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DFDPackage.Literals.ELEMENTO__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEntidadExternaAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Flujo returns Flujo
	 *
	 * Constraint:
	 *     (name=EString anterior=EString nombre=EString siguiente=EString)
	 */
	protected void sequence_Flujo(ISerializationContext context, Flujo semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DFDPackage.Literals.FLUJO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DFDPackage.Literals.FLUJO__NAME));
			if (transientValues.isValueTransient(semanticObject, DFDPackage.Literals.FLUJO__ANTERIOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DFDPackage.Literals.FLUJO__ANTERIOR));
			if (transientValues.isValueTransient(semanticObject, DFDPackage.Literals.FLUJO__NOMBRE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DFDPackage.Literals.FLUJO__NOMBRE));
			if (transientValues.isValueTransient(semanticObject, DFDPackage.Literals.FLUJO__SIGUIENTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DFDPackage.Literals.FLUJO__SIGUIENTE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFlujoAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFlujoAccess().getAnteriorEStringParserRuleCall_5_0(), semanticObject.getAnterior());
		feeder.accept(grammarAccess.getFlujoAccess().getNombreEStringParserRuleCall_7_0(), semanticObject.getNombre());
		feeder.accept(grammarAccess.getFlujoAccess().getSiguienteEStringParserRuleCall_9_0(), semanticObject.getSiguiente());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Elemento returns Proceso
	 *     Proceso returns Proceso
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Proceso(ISerializationContext context, Proceso semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DFDPackage.Literals.ELEMENTO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DFDPackage.Literals.ELEMENTO__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProcesoAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
