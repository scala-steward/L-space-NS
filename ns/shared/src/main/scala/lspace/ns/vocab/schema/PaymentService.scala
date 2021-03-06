package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PaymentService extends OntologyDef(
        iri = "http://schema.org/PaymentService",
        iris = Set("http://schema.org/PaymentService"),
        label = "PaymentService",
        comment = """A Service to transfer funds from a person or organization to a beneficiary person or organization.""",
        `@extends` = List(FinancialProduct.ontology)
       ){
object keys extends lspace.ns.vocab.schema.FinancialProduct.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.FinancialProduct.Properties{

}
}