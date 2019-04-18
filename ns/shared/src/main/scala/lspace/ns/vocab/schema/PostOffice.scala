package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object PostOffice
    extends OntologyDef(
      iri = "http://schema.org/PostOffice",
      iris = Set("http://schema.org/PostOffice"),
      label = "PostOffice",
      comment = """A post office.""",
      `@extends` = () => List(GovernmentOffice.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.GovernmentOffice.Properties {

    override lazy val events    = lspace.ns.vocab.schema.events.property
    override lazy val slogan    = lspace.ns.vocab.schema.slogan.property
    override lazy val event     = lspace.ns.vocab.schema.event.property
    override lazy val logo      = lspace.ns.vocab.schema.logo.property
    override lazy val telephone = lspace.ns.vocab.schema.telephone.property
    override lazy val isicV4    = lspace.ns.vocab.schema.isicV4.property
    override lazy val review    = lspace.ns.vocab.schema.review.property
  }
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.GovernmentOffice.Properties {

    override lazy val events    = lspace.ns.vocab.schema.events.property
    override lazy val slogan    = lspace.ns.vocab.schema.slogan.property
    override lazy val event     = lspace.ns.vocab.schema.event.property
    override lazy val logo      = lspace.ns.vocab.schema.logo.property
    override lazy val telephone = lspace.ns.vocab.schema.telephone.property
    override lazy val isicV4    = lspace.ns.vocab.schema.isicV4.property
    override lazy val review    = lspace.ns.vocab.schema.review.property
  }
}