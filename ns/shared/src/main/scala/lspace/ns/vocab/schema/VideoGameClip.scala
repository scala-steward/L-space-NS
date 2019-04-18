package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object VideoGameClip
    extends OntologyDef(
      iri = "http://schema.org/VideoGameClip",
      iris = Set("http://schema.org/VideoGameClip"),
      label = "VideoGameClip",
      comment = """A short segment/part of a video game.""",
      `@extends` = () => List(Clip.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Clip.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Clip.Properties {}
}
