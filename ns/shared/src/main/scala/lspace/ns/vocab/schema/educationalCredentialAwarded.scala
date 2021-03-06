package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object educationalCredentialAwarded extends PropertyDef(
        iri = "http://schema.org/educationalCredentialAwarded",
        iris = Set("http://schema.org/educationalCredentialAwarded"),
        label = "educationalCredentialAwarded",
        comment = """A description of the qualification, award, certificate, diploma or other educational credential awarded as a consequence of successful completion of this course.""",
        `@extends` = List(),
        `@range` = List(URL.ontology, EducationalOccupationalCredential.ontology, `@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}