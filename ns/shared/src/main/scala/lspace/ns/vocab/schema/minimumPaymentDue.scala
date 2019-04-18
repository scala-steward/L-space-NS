package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object minimumPaymentDue
    extends PropertyDef(
      iri = "http://schema.org/minimumPaymentDue",
      iris = Set("http://schema.org/minimumPaymentDue"),
      label = "minimumPaymentDue",
      comment = """The minimum payment required at this time.""",
      `@extends` = () => List(),
      `@range` = () => List(PriceSpecification.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}