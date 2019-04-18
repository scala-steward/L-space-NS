package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object ReadAction
    extends OntologyDef(
      iri = "http://schema.org/ReadAction",
      iris = Set("http://schema.org/ReadAction"),
      label = "ReadAction",
      comment = """The act of consuming written content.""",
      `@extends` = () => List(ConsumeAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.ConsumeAction.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.ConsumeAction.Properties {}
}
