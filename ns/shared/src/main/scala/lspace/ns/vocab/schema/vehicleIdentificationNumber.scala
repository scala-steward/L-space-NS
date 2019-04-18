package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object vehicleIdentificationNumber
    extends PropertyDef(
      iri = "http://schema.org/vehicleIdentificationNumber",
      iris = Set("http://schema.org/vehicleIdentificationNumber"),
      label = "vehicleIdentificationNumber",
      comment =
        """The Vehicle Identification Number (VIN) is a unique serial number used by the automotive industry to identify individual motor vehicles.""",
      `@extends` = () => List(serialNumber.property),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.serialNumber.Properties
}
