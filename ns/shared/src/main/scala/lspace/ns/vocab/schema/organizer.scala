package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object organizer
    extends PropertyDef(
      iri = "http://schema.org/organizer",
      iris = Set("http://schema.org/organizer"),
      label = "organizer",
      comment = """An organizer of an Event.""",
      `@extends` = () => List(),
      `@range` = () => List(Person.ontology, Organization.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}