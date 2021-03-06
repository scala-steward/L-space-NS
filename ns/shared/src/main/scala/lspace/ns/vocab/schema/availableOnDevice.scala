package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object availableOnDevice extends PropertyDef(
        iri = "http://schema.org/availableOnDevice",
        iris = Set("http://schema.org/availableOnDevice"),
        label = "availableOnDevice",
        comment = """Device required to run the application. Used in cases where a specific make/model is required to run the application.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}