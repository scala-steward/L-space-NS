package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object PriceSpecification
    extends OntologyDef(
      iri = "http://schema.org/PriceSpecification",
      iris = Set("http://schema.org/PriceSpecification"),
      label = "PriceSpecification",
      comment =
        """A structured value representing a price or price range. Typically, only the subclasses of this type are used for markup. It is recommended to use <a class="localLink" href="http://schema.org/MonetaryAmount">MonetaryAmount</a> to describe independent amounts of money such as a salary, credit card limits, etc.""",
      `@extends` = () => List(StructuredValue.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.StructuredValue.Properties {
    lazy val eligibleTransactionVolume = lspace.ns.vocab.schema.eligibleTransactionVolume.property
    lazy val price                     = lspace.ns.vocab.schema.price.property
    lazy val maxPrice                  = lspace.ns.vocab.schema.maxPrice.property
    lazy val priceCurrency             = lspace.ns.vocab.schema.priceCurrency.property
    lazy val valueAddedTaxIncluded     = lspace.ns.vocab.schema.valueAddedTaxIncluded.property
    lazy val validThrough              = lspace.ns.vocab.schema.validThrough.property
    lazy val validFrom                 = lspace.ns.vocab.schema.validFrom.property
    lazy val minPrice                  = lspace.ns.vocab.schema.minPrice.property
    lazy val eligibleQuantity          = lspace.ns.vocab.schema.eligibleQuantity.property
  }
  override lazy val properties: List[Property] = List(eligibleTransactionVolume,
                                                      price,
                                                      maxPrice,
                                                      priceCurrency,
                                                      valueAddedTaxIncluded,
                                                      validThrough,
                                                      validFrom,
                                                      minPrice,
                                                      eligibleQuantity)
  trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties {
    lazy val eligibleTransactionVolume = lspace.ns.vocab.schema.eligibleTransactionVolume.property
    lazy val price                     = lspace.ns.vocab.schema.price.property
    lazy val maxPrice                  = lspace.ns.vocab.schema.maxPrice.property
    lazy val priceCurrency             = lspace.ns.vocab.schema.priceCurrency.property
    lazy val valueAddedTaxIncluded     = lspace.ns.vocab.schema.valueAddedTaxIncluded.property
    lazy val validThrough              = lspace.ns.vocab.schema.validThrough.property
    lazy val validFrom                 = lspace.ns.vocab.schema.validFrom.property
    lazy val minPrice                  = lspace.ns.vocab.schema.minPrice.property
    lazy val eligibleQuantity          = lspace.ns.vocab.schema.eligibleQuantity.property
  }
}
