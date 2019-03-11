package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object description extends PropertyDef(
        iri = "https://schema.org/description",
        iris = Set("https://schema.org/description"),
        label = "description",
        comment = """A description of the item.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}