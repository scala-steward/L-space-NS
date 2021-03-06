package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object characterName extends PropertyDef(
        iri = "http://schema.org/characterName",
        iris = Set("http://schema.org/characterName"),
        label = "characterName",
        comment = """The name of a character played in some acting or performing role, i.e. in a PerformanceRole.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}