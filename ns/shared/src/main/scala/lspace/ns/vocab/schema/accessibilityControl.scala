package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object accessibilityControl
    extends PropertyDef(
      iri = "http://schema.org/accessibilityControl",
      iris = Set("http://schema.org/accessibilityControl"),
      label = "accessibilityControl",
      comment =
        """Identifies input methods that are sufficient to fully control the described resource (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
