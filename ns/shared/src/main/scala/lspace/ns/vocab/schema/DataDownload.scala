package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object DataDownload
    extends OntologyDef(
      iri = "http://schema.org/DataDownload",
      iris = Set("http://schema.org/DataDownload"),
      label = "DataDownload",
      comment = """A dataset in downloadable form.""",
      `@extends` = () => List(MediaObject.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MediaObject.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.MediaObject.Properties {}
}