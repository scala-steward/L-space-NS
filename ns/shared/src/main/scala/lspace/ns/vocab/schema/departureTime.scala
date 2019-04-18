package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object departureTime
    extends PropertyDef(
      iri = "http://schema.org/departureTime",
      iris = Set("http://schema.org/departureTime"),
      label = "departureTime",
      comment = """The expected departure time.""",
      `@extends` = () => List(),
      `@range` = () => List(`@datetime`)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
