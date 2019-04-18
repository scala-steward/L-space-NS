package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MedicalRiskScore
    extends OntologyDef(
      iri = "http://schema.org/MedicalRiskScore",
      iris = Set("http://schema.org/MedicalRiskScore"),
      label = "MedicalRiskScore",
      comment =
        """A simple system that adds up the number of risk factors to yield a score that is associated with prognosis, e.g. CHAD score, TIMI risk score.""",
      `@extends` = () => List(MedicalRiskEstimator.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MedicalRiskEstimator.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.MedicalRiskEstimator.Properties {}
}
