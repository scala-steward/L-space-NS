package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object DriveWheelConfigurationValue
    extends OntologyDef(
      iri = "http://schema.org/DriveWheelConfigurationValue",
      iris = Set("http://schema.org/DriveWheelConfigurationValue"),
      label = "DriveWheelConfigurationValue",
      comment = """A value indicating which roadwheels will receive torque.""",
      `@extends` = () => List(QualitativeValue.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.QualitativeValue.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.QualitativeValue.Properties {}
}
