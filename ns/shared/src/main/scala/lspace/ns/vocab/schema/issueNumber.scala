package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object issueNumber extends PropertyDef(
        iri = "http://schema.org/issueNumber",
        iris = Set("http://schema.org/issueNumber"),
        label = "issueNumber",
        comment = """Identifies the issue of publication; for example, "iii" or "2".""",
        `@extends` = List(position.property),
        `@range` = List(`@string`, `@int`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.position.Properties
}