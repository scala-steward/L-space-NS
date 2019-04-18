package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Painting
    extends OntologyDef(
      iri = "http://schema.org/Painting",
      iris = Set("http://schema.org/Painting"),
      label = "Painting",
      comment = """A painting.""",
      `@extends` = () => List(CreativeWork.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWork.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties {}
}
