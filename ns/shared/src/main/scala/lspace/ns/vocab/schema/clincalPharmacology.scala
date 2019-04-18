package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object clincalPharmacology
    extends PropertyDef(
      iri = "http://schema.org/clincalPharmacology",
      iris = Set("http://schema.org/clincalPharmacology"),
      label = "clincalPharmacology",
      comment =
        """Description of the absorption and elimination of drugs, including their concentration (pharmacokinetics, pK) and biological effects (pharmacodynamics, pD).""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
