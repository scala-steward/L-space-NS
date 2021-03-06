package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object geoIntersects extends PropertyDef(
        iri = "http://schema.org/geoIntersects",
        iris = Set("http://schema.org/geoIntersects"),
        label = "geoIntersects",
        comment = """Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>.""",
        `@extends` = List(),
        `@range` = List(GeospatialGeometry.ontology, Place.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}