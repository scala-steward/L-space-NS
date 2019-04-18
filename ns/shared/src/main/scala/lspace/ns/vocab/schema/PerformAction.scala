package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object PerformAction
    extends OntologyDef(
      iri = "http://schema.org/PerformAction",
      iris = Set("http://schema.org/PerformAction"),
      label = "PerformAction",
      comment = """The act of participating in performance arts.""",
      `@extends` = () => List(PlayAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.PlayAction.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.PlayAction.Properties {}
}