package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Collection
    extends OntologyDef(
      iri = "http://schema.org/Collection",
      iris = Set("http://schema.org/Collection"),
      label = "Collection",
      comment = """A created collection of Creative Works or other artefacts.""",
      `@extends` = () => List(CreativeWork.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWork.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties {}
}
