package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object tool
    extends PropertyDef(
      iri = "http://schema.org/tool",
      iris = Set("http://schema.org/tool"),
      label = "tool",
      comment =
        """A sub property of instrument. An object used (but not consumed) when performing instructions or a direction.""",
      `@extends` = () => List(instrument.property),
      `@range` = () => List(Text.ontology, HowToTool.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.instrument.Properties
}
