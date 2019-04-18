package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MusicVenue
    extends OntologyDef(
      iri = "http://schema.org/MusicVenue",
      iris = Set("http://schema.org/MusicVenue"),
      label = "MusicVenue",
      comment = """A music venue.""",
      `@extends` = () => List(CivicStructure.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CivicStructure.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.CivicStructure.Properties {}
}
