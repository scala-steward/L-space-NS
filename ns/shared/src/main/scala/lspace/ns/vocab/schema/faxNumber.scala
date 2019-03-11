package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object faxNumber extends PropertyDef(
        iri = "https://schema.org/faxNumber",
        iris = Set("https://schema.org/faxNumber"),
        label = "faxNumber",
        comment = """The fax number.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}