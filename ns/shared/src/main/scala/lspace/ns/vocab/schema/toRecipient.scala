package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object toRecipient
    extends PropertyDef(
      iri = "http://schema.org/toRecipient",
      iris = Set("http://schema.org/toRecipient"),
      label = "toRecipient",
      comment = """A sub property of recipient. The recipient who was directly sent the message.""",
      `@extends` = () => List(recipient.property),
      `@range` = () => List(Organization.ontology, Person.ontology, Audience.ontology, ContactPoint.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.recipient.Properties
}
