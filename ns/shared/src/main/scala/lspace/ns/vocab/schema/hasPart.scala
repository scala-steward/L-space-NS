package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object hasPart extends PropertyDef(
        iri = "http://schema.org/hasPart",
        iris = Set("http://schema.org/hasPart"),
        label = "hasPart",
        comment = """Indicates an item or CreativeWork that is part of this item, or CreativeWork (in some sense).""",
        `@extends` = List(),
        `@range` = List(CreativeWork.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}