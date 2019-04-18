package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object caption
    extends PropertyDef(
      iri = "http://schema.org/caption",
      iris = Set("http://schema.org/caption"),
      label = "caption",
      comment =
        """The caption for this object. For downloadable machine formats (closed caption, subtitles etc.) use MediaObject and indicate the <a class="localLink" href="http://schema.org/encodingFormat">encodingFormat</a>.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology, MediaObject.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
