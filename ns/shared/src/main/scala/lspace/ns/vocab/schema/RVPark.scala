package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object RVPark extends OntologyDef(
        iri = "http://schema.org/RVPark",
        iris = Set("http://schema.org/RVPark"),
        label = "RVPark",
        comment = """A place offering space for "Recreational Vehicles", Caravans, mobile homes and the like.""",
        `@extends` = List(CivicStructure.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CivicStructure.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.CivicStructure.Properties{

}
}