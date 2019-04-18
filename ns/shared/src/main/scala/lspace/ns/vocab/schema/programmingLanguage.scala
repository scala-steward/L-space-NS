package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object programmingLanguage
    extends PropertyDef(
      iri = "http://schema.org/programmingLanguage",
      iris = Set("http://schema.org/programmingLanguage"),
      label = "programmingLanguage",
      comment = """The computer programming language.""",
      `@extends` = () => List(),
      `@range` = () => List(ComputerLanguage.ontology, Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
