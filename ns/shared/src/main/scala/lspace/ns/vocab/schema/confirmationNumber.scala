package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object confirmationNumber extends PropertyDef(
        iri = "http://schema.org/confirmationNumber",
        iris = Set("http://schema.org/confirmationNumber"),
        label = "confirmationNumber",
        comment = """A number that confirms the given order or payment has been received.""",
        `@extends` = List(identifier.property),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.identifier.Properties
}