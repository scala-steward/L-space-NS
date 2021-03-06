package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalOrganization extends OntologyDef(
        iri = "http://schema.org/MedicalOrganization",
        iris = Set("http://schema.org/MedicalOrganization"),
        label = "MedicalOrganization",
        comment = """A medical organization (physical or not), such as hospital, institution or clinic.""",
        `@extends` = List(Organization.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Organization.Properties{
lazy val healthPlanNetworkId = lspace.ns.vocab.schema.healthPlanNetworkId.property
lazy val isAcceptingNewPatients = lspace.ns.vocab.schema.isAcceptingNewPatients.property
lazy val medicalSpecialty = lspace.ns.vocab.schema.medicalSpecialty.property
}
override lazy val properties: List[LProperty] = List(healthPlanNetworkId, isAcceptingNewPatients, medicalSpecialty)
trait Properties extends lspace.ns.vocab.schema.Organization.Properties{
lazy val healthPlanNetworkId = lspace.ns.vocab.schema.healthPlanNetworkId.property
lazy val isAcceptingNewPatients = lspace.ns.vocab.schema.isAcceptingNewPatients.property
lazy val medicalSpecialty = lspace.ns.vocab.schema.medicalSpecialty.property
}
}