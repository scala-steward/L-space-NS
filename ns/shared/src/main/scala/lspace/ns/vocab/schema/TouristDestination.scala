package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TouristDestination extends OntologyDef(
        iri = "http://schema.org/TouristDestination",
        iris = Set("http://schema.org/TouristDestination"),
        label = "TouristDestination",
        comment = """A tourist destination. In principle any <a class="localLink" href="http://schema.org/Place">Place</a> can be a <a class="localLink" href="http://schema.org/TouristDestination">TouristDestination</a> from a <a class="localLink" href="http://schema.org/City">City</a>, <a class="localLink" href="http://schema.org/Region">Region</a> or <a class="localLink" href="http://schema.org/Country">Country</a> to an <a class="localLink" href="http://schema.org/AmusementPark">AmusementPark</a> or <a class="localLink" href="http://schema.org/Hotel">Hotel</a>. This Type can be used on its own to describe a general <a class="localLink" href="http://schema.org/TouristDestination">TouristDestination</a>, or be used as an <a class="localLink" href="http://schema.org/additionalType">additionalType</a> to add tourist relevant properties to any other <a class="localLink" href="http://schema.org/Place">Place</a>.  A <a class="localLink" href="http://schema.org/TouristDestination">TouristDestination</a> is defined as a <a class="localLink" href="http://schema.org/Place">Place</a> that contains, or is colocated with, one or more <a class="localLink" href="http://schema.org/TouristAttraction">TouristAttraction</a>s, often linked by a similar theme or interest to a particular <a class="localLink" href="http://schema.org/touristType">touristType</a>. The <a href="http://www2.unwto.org/">UNWTO</a> defines Destination (main destination of a tourism trip) as the place visited that is central to the decision to take the trip.
  (See examples below).""",
        `@extends` = List(Place.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Place.Properties{
lazy val includesAttraction = lspace.ns.vocab.schema.includesAttraction.property
lazy val touristType = lspace.ns.vocab.schema.touristType.property
}
override lazy val properties: List[LProperty] = List(includesAttraction, touristType)
trait Properties extends lspace.ns.vocab.schema.Place.Properties{
lazy val includesAttraction = lspace.ns.vocab.schema.includesAttraction.property
lazy val touristType = lspace.ns.vocab.schema.touristType.property
}
}