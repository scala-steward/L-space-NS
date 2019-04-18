package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object iataCode
    extends PropertyDef(
      iri = "http://schema.org/iataCode",
      iris = Set("http://schema.org/iataCode"),
      label = "iataCode",
      comment = """IATA identifier for an airline or airport.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
