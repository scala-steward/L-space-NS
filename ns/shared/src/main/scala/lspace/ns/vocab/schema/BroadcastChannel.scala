package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object BroadcastChannel
    extends OntologyDef(
      iri = "http://schema.org/BroadcastChannel",
      iris = Set("http://schema.org/BroadcastChannel"),
      label = "BroadcastChannel",
      comment = """A unique instance of a BroadcastService on a CableOrSatelliteService lineup.""",
      `@extends` = () => List(Intangible.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val genre                    = lspace.ns.vocab.schema.genre.property
    lazy val providesBroadcastService = lspace.ns.vocab.schema.providesBroadcastService.property
    lazy val inBroadcastLineup        = lspace.ns.vocab.schema.inBroadcastLineup.property
  }
  override lazy val properties: List[Property] = List(genre, providesBroadcastService, inBroadcastLineup)
  trait Properties extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val genre                    = lspace.ns.vocab.schema.genre.property
    lazy val providesBroadcastService = lspace.ns.vocab.schema.providesBroadcastService.property
    lazy val inBroadcastLineup        = lspace.ns.vocab.schema.inBroadcastLineup.property
  }
}
