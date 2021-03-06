package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object exerciseType extends PropertyDef(
        iri = "http://schema.org/exerciseType",
        iris = Set("http://schema.org/exerciseType"),
        label = "exerciseType",
        comment = """Type(s) of exercise or activity, such as strength training, flexibility training, aerobics, cardiac rehabilitation, etc.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}