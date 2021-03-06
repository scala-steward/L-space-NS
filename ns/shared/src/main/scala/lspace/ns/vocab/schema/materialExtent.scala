package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object materialExtent extends PropertyDef(
        iri = "http://schema.org/materialExtent",
        iris = Set("http://schema.org/materialExtent"),
        label = "materialExtent",
        comment = """The quantity of the materials being described or an expression of the physical space they occupy.""",
        `@extends` = List(),
        `@range` = List(`@string`, QuantitativeValue.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}