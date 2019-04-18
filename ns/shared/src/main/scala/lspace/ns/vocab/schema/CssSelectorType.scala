package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object CssSelectorType
    extends OntologyDef(
      iri = "http://schema.org/CssSelectorType",
      iris = Set("http://schema.org/CssSelectorType"),
      label = "CssSelectorType",
      comment = """Text representing a CSS selector.""",
      `@extends` = () => List(Text.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Text.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Text.Properties {}
}
