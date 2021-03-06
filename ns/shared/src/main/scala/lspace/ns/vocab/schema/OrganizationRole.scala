package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object OrganizationRole extends OntologyDef(
        iri = "http://schema.org/OrganizationRole",
        iris = Set("http://schema.org/OrganizationRole"),
        label = "OrganizationRole",
        comment = """A subclass of Role used to describe roles within organizations.""",
        `@extends` = List(Role.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Role.Properties{
lazy val numberedPosition = lspace.ns.vocab.schema.numberedPosition.property
}
override lazy val properties: List[LProperty] = List(numberedPosition)
trait Properties extends lspace.ns.vocab.schema.Role.Properties{
lazy val numberedPosition = lspace.ns.vocab.schema.numberedPosition.property
}
}