package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object mainEntity extends PropertyDef(
        iri = "http://schema.org/mainEntity",
        iris = Set("http://schema.org/mainEntity"),
        label = "mainEntity",
        comment = """Indicates the primary entity described in some page or other CreativeWork.""",
        `@extends` = List(about.property),
        `@range` = List(Thing.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.about.Properties
}