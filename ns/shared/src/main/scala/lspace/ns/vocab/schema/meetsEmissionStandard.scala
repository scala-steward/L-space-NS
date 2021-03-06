package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object meetsEmissionStandard extends PropertyDef(
        iri = "http://schema.org/meetsEmissionStandard",
        iris = Set("http://schema.org/meetsEmissionStandard"),
        label = "meetsEmissionStandard",
        comment = """Indicates that the vehicle meets the respective emission standard.""",
        `@extends` = List(),
        `@range` = List(URL.ontology, QualitativeValue.ontology, `@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}