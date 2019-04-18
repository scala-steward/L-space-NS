package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object totalPrice
    extends PropertyDef(
      iri = "http://schema.org/totalPrice",
      iris = Set("http://schema.org/totalPrice"),
      label = "totalPrice",
      comment = """The total price for the reservation or ticket, including applicable taxes, shipping, etc.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology, PriceSpecification.ontology, Number.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
