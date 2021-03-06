package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object medicineSystem extends PropertyDef(
        iri = "http://schema.org/medicineSystem",
        iris = Set("http://schema.org/medicineSystem"),
        label = "medicineSystem",
        comment = """The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.""",
        `@extends` = List(),
        `@range` = List(MedicineSystem.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}