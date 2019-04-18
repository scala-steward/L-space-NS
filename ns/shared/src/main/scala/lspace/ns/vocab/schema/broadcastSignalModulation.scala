package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object broadcastSignalModulation
    extends PropertyDef(
      iri = "http://schema.org/broadcastSignalModulation",
      iris = Set("http://schema.org/broadcastSignalModulation"),
      label = "broadcastSignalModulation",
      comment = """The modulation (e.g. FM, AM, etc) used by a particular broadcast service""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology, QualitativeValue.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
