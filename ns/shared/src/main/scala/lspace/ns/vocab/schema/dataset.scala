package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object dataset
    extends PropertyDef(
      iri = "http://schema.org/dataset",
      iris = Set("http://schema.org/dataset"),
      label = "dataset",
      comment = """A dataset contained in this catalog.""",
      `@extends` = () => List(),
      `@range` = () => List()
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
