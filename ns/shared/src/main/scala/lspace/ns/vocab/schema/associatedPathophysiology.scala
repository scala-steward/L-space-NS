package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object associatedPathophysiology extends PropertyDef(
        iri = "http://schema.org/associatedPathophysiology",
        iris = Set("http://schema.org/associatedPathophysiology"),
        label = "associatedPathophysiology",
        comment = """If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}