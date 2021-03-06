package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object geoRadius extends PropertyDef(
        iri = "http://schema.org/geoRadius",
        iris = Set("http://schema.org/geoRadius"),
        label = "geoRadius",
        comment = """Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).""",
        `@extends` = List(),
        `@range` = List(`@string`, `@number`, Distance.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}