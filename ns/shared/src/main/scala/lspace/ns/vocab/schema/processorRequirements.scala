package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object processorRequirements
    extends PropertyDef(
      iri = "http://schema.org/processorRequirements",
      iris = Set("http://schema.org/processorRequirements"),
      label = "processorRequirements",
      comment = """Processor architecture required to run the application (e.g. IA64).""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}