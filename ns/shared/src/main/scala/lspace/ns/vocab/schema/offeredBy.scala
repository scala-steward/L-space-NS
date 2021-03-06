package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object offeredBy extends PropertyDef(
        iri = "http://schema.org/offeredBy",
        iris = Set("http://schema.org/offeredBy"),
        label = "offeredBy",
        comment = """A pointer to the organization or person making the offer.""",
        `@extends` = List(),
        `@range` = List(Person.ontology, Organization.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}