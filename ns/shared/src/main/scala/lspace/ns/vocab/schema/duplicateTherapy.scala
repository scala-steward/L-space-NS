package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object duplicateTherapy extends PropertyDef(
        iri = "http://schema.org/duplicateTherapy",
        iris = Set("http://schema.org/duplicateTherapy"),
        label = "duplicateTherapy",
        comment = """A therapy that duplicates or overlaps this one.""",
        `@extends` = List(),
        `@range` = List(MedicalTherapy.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}