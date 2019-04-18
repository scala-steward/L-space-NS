package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object TechArticle
    extends OntologyDef(
      iri = "http://schema.org/TechArticle",
      iris = Set("http://schema.org/TechArticle"),
      label = "TechArticle",
      comment =
        """A technical article - Example: How-to (task) topics, step-by-step, procedural troubleshooting, specifications, etc.""",
      `@extends` = () => List(Article.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Article.Properties {
    lazy val proficiencyLevel = lspace.ns.vocab.schema.proficiencyLevel.property
    lazy val dependencies     = lspace.ns.vocab.schema.dependencies.property
  }
  override lazy val properties: List[Property] = List(proficiencyLevel, dependencies)
  trait Properties extends lspace.ns.vocab.schema.Article.Properties {
    lazy val proficiencyLevel = lspace.ns.vocab.schema.proficiencyLevel.property
    lazy val dependencies     = lspace.ns.vocab.schema.dependencies.property
  }
}