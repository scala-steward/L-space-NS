package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object iswcCode
    extends PropertyDef(
      iri = "http://schema.org/iswcCode",
      iris = Set("http://schema.org/iswcCode"),
      label = "iswcCode",
      comment = """The International Standard Musical Work Code for the composition.""",
      `@extends` = () => List(),
      `@range` = () => List(`@string`, Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
