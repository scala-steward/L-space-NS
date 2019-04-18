package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object blogPost
    extends PropertyDef(
      iri = "http://schema.org/blogPost",
      iris = Set("http://schema.org/blogPost"),
      label = "blogPost",
      comment = """A posting that is part of this blog.""",
      `@extends` = () => List(),
      `@range` = () => List()
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
