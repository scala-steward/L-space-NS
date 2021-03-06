package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object seatRow extends PropertyDef(
        iri = "http://schema.org/seatRow",
        iris = Set("http://schema.org/seatRow"),
        label = "seatRow",
        comment = """The row location of the reserved seat (e.g., B).""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}