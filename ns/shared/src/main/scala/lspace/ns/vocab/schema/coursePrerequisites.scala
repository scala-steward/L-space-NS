package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object coursePrerequisites extends PropertyDef(
        iri = "http://schema.org/coursePrerequisites",
        iris = Set("http://schema.org/coursePrerequisites"),
        label = "coursePrerequisites",
        comment = """Requirements for taking the Course. May be completion of another <a class="localLink" href="http://schema.org/Course">Course</a> or a textual description like "permission of instructor". Requirements may be a pre-requisite competency, referenced using <a class="localLink" href="http://schema.org/AlignmentObject">AlignmentObject</a>.""",
        `@extends` = List(),
        `@range` = List(Course.ontology, `@string`, AlignmentObject.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}