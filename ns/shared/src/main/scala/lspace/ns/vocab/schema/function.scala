package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object function extends PropertyDef(
        iri = "http://schema.org/function",
        iris = Set("http://schema.org/function"),
        label = "function",
        comment = """Function of the anatomical structure.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}