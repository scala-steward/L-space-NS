package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object RentAction
    extends OntologyDef(
      iri = "http://schema.org/RentAction",
      iris = Set("http://schema.org/RentAction"),
      label = "RentAction",
      comment =
        """The act of giving money in return for temporary use, but not ownership, of an object such as a vehicle or property. For example, an agent rents a property from a landlord in exchange for a periodic payment.""",
      `@extends` = () => List(TradeAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.TradeAction.Properties {
    lazy val realEstateAgent = lspace.ns.vocab.schema.realEstateAgent.property
  }
  override lazy val properties: List[Property] = List(realEstateAgent)
  trait Properties extends lspace.ns.vocab.schema.TradeAction.Properties {
    lazy val realEstateAgent = lspace.ns.vocab.schema.realEstateAgent.property
  }
}
