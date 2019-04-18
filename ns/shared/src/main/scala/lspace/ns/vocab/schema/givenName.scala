package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object givenName
    extends PropertyDef(
      iri = "http://schema.org/givenName",
      iris = Set("http://schema.org/givenName"),
      label = "givenName",
      comment =
        """Given name. In the U.S., the first name of a Person. This can be used along with familyName instead of the name property.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
