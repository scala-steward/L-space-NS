package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object fuelConsumption extends PropertyDef(
        iri = "http://schema.org/fuelConsumption",
        iris = Set("http://schema.org/fuelConsumption"),
        label = "fuelConsumption",
        comment = """The amount of fuel consumed for traveling a particular distance or temporal duration with the given vehicle (e.g. liters per 100 km).<br/><br/>

<ul>
<li>Note 1: There are unfortunately no standard unit codes for liters per 100 km.  Use <a class="localLink" href="http://schema.org/unitText">unitText</a> to indicate the unit of measurement, e.g. L/100 km.</li>
<li>Note 2: There are two ways of indicating the fuel consumption, <a class="localLink" href="http://schema.org/fuelConsumption">fuelConsumption</a> (e.g. 8 liters per 100 km) and <a class="localLink" href="http://schema.org/fuelEfficiency">fuelEfficiency</a> (e.g. 30 miles per gallon). They are reciprocal.</li>
<li>Note 3: Often, the absolute value is useful only when related to driving speed ("at 80 km/h") or usage pattern ("city traffic"). You can use <a class="localLink" href="http://schema.org/valueReference">valueReference</a> to link the value for the fuel consumption to another value.</li>
</ul>
""",
        `@extends` = List(),
        `@range` = List(QuantitativeValue.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}