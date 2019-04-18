package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Zoo
    extends OntologyDef(
      iri = "http://schema.org/Zoo",
      iris = Set("http://schema.org/Zoo"),
      label = "Zoo",
      comment = """A zoo.""",
      `@extends` = () => List(CivicStructure.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CivicStructure.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.CivicStructure.Properties {}
}
