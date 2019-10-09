package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TrainReservation extends OntologyDef(
        iri = "http://schema.org/TrainReservation",
        iris = Set("http://schema.org/TrainReservation"),
        label = "TrainReservation",
        comment = """A reservation for train travel.<br/><br/>

Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use <a class="localLink" href="http://schema.org/Offer">Offer</a>.""",
        `@extends` = List(Reservation.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Reservation.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Reservation.Properties{

}
}