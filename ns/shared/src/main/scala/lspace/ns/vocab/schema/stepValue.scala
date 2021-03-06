package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object stepValue extends PropertyDef(
        iri = "http://schema.org/stepValue",
        iris = Set("http://schema.org/stepValue"),
        label = "stepValue",
        comment = """The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.""",
        `@extends` = List(),
        `@range` = List(`@number`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}