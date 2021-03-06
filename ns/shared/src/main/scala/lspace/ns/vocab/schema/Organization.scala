package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Organization extends OntologyDef(
        iri = "http://schema.org/Organization",
        iris = Set("http://schema.org/Organization"),
        label = "Organization",
        comment = """An organization such as a school, NGO, corporation, club, etc.""",
        `@extends` = List(Thing.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Thing.Properties{
lazy val actionableFeedbackPolicy = lspace.ns.vocab.schema.actionableFeedbackPolicy.property
lazy val address = lspace.ns.vocab.schema.address.property
lazy val aggregateRating = lspace.ns.vocab.schema.aggregateRating.property
lazy val alumni = lspace.ns.vocab.schema.alumni.property
lazy val areaServed = lspace.ns.vocab.schema.areaServed.property
lazy val award = lspace.ns.vocab.schema.award.property
lazy val brand = lspace.ns.vocab.schema.brand.property
lazy val contactPoint = lspace.ns.vocab.schema.contactPoint.property
lazy val correctionsPolicy = lspace.ns.vocab.schema.correctionsPolicy.property
lazy val department = lspace.ns.vocab.schema.department.property
lazy val dissolutionDate = lspace.ns.vocab.schema.dissolutionDate.property
lazy val diversityPolicy = lspace.ns.vocab.schema.diversityPolicy.property
lazy val diversityStaffingReport = lspace.ns.vocab.schema.diversityStaffingReport.property
lazy val duns = lspace.ns.vocab.schema.duns.property
lazy val email = lspace.ns.vocab.schema.email.property
lazy val employee = lspace.ns.vocab.schema.employee.property
lazy val ethicsPolicy = lspace.ns.vocab.schema.ethicsPolicy.property
lazy val event = lspace.ns.vocab.schema.event.property
lazy val faxNumber = lspace.ns.vocab.schema.faxNumber.property
lazy val founder = lspace.ns.vocab.schema.founder.property
lazy val foundingDate = lspace.ns.vocab.schema.foundingDate.property
lazy val foundingLocation = lspace.ns.vocab.schema.foundingLocation.property
lazy val funder = lspace.ns.vocab.schema.funder.property
lazy val globalLocationNumber = lspace.ns.vocab.schema.globalLocationNumber.property
lazy val hasOfferCatalog = lspace.ns.vocab.schema.hasOfferCatalog.property
lazy val hasPOS = lspace.ns.vocab.schema.hasPOS.property
lazy val isicV4 = lspace.ns.vocab.schema.isicV4.property
lazy val knowsAbout = lspace.ns.vocab.schema.knowsAbout.property
lazy val knowsLanguage = lspace.ns.vocab.schema.knowsLanguage.property
lazy val legalName = lspace.ns.vocab.schema.legalName.property
lazy val leiCode = lspace.ns.vocab.schema.leiCode.property
lazy val location = lspace.ns.vocab.schema.location.property
lazy val logo = lspace.ns.vocab.schema.logo.property
lazy val makesOffer = lspace.ns.vocab.schema.makesOffer.property
lazy val member = lspace.ns.vocab.schema.member.property
lazy val memberOf = lspace.ns.vocab.schema.memberOf.property
lazy val naics = lspace.ns.vocab.schema.naics.property
lazy val numberOfEmployees = lspace.ns.vocab.schema.numberOfEmployees.property
lazy val ownershipFundingInfo = lspace.ns.vocab.schema.ownershipFundingInfo.property
lazy val owns = lspace.ns.vocab.schema.owns.property
lazy val parentOrganization = lspace.ns.vocab.schema.parentOrganization.property
lazy val publishingPrinciples = lspace.ns.vocab.schema.publishingPrinciples.property
lazy val review = lspace.ns.vocab.schema.review.property
lazy val seeks = lspace.ns.vocab.schema.seeks.property
lazy val slogan = lspace.ns.vocab.schema.slogan.property
lazy val sponsor = lspace.ns.vocab.schema.sponsor.property
lazy val subOrganization = lspace.ns.vocab.schema.subOrganization.property
lazy val taxID = lspace.ns.vocab.schema.taxID.property
lazy val telephone = lspace.ns.vocab.schema.telephone.property
lazy val unnamedSourcesPolicy = lspace.ns.vocab.schema.unnamedSourcesPolicy.property
lazy val vatID = lspace.ns.vocab.schema.vatID.property
}
override lazy val properties: List[LProperty] = List(actionableFeedbackPolicy, address, aggregateRating, alumni, areaServed, award, brand, contactPoint, correctionsPolicy, department, dissolutionDate, diversityPolicy, diversityStaffingReport, duns, email, employee, ethicsPolicy, event, faxNumber, founder, foundingDate, foundingLocation, funder, globalLocationNumber, hasOfferCatalog, hasPOS, isicV4, knowsAbout, knowsLanguage, legalName, leiCode, location, logo, makesOffer, member, memberOf, naics, numberOfEmployees, ownershipFundingInfo, owns, parentOrganization, publishingPrinciples, review, seeks, slogan, sponsor, subOrganization, taxID, telephone, unnamedSourcesPolicy, vatID)
trait Properties extends lspace.ns.vocab.schema.Thing.Properties{
lazy val actionableFeedbackPolicy = lspace.ns.vocab.schema.actionableFeedbackPolicy.property
lazy val address = lspace.ns.vocab.schema.address.property
lazy val aggregateRating = lspace.ns.vocab.schema.aggregateRating.property
lazy val alumni = lspace.ns.vocab.schema.alumni.property
lazy val areaServed = lspace.ns.vocab.schema.areaServed.property
lazy val award = lspace.ns.vocab.schema.award.property
lazy val brand = lspace.ns.vocab.schema.brand.property
lazy val contactPoint = lspace.ns.vocab.schema.contactPoint.property
lazy val correctionsPolicy = lspace.ns.vocab.schema.correctionsPolicy.property
lazy val department = lspace.ns.vocab.schema.department.property
lazy val dissolutionDate = lspace.ns.vocab.schema.dissolutionDate.property
lazy val diversityPolicy = lspace.ns.vocab.schema.diversityPolicy.property
lazy val diversityStaffingReport = lspace.ns.vocab.schema.diversityStaffingReport.property
lazy val duns = lspace.ns.vocab.schema.duns.property
lazy val email = lspace.ns.vocab.schema.email.property
lazy val employee = lspace.ns.vocab.schema.employee.property
lazy val ethicsPolicy = lspace.ns.vocab.schema.ethicsPolicy.property
lazy val event = lspace.ns.vocab.schema.event.property
lazy val faxNumber = lspace.ns.vocab.schema.faxNumber.property
lazy val founder = lspace.ns.vocab.schema.founder.property
lazy val foundingDate = lspace.ns.vocab.schema.foundingDate.property
lazy val foundingLocation = lspace.ns.vocab.schema.foundingLocation.property
lazy val funder = lspace.ns.vocab.schema.funder.property
lazy val globalLocationNumber = lspace.ns.vocab.schema.globalLocationNumber.property
lazy val hasOfferCatalog = lspace.ns.vocab.schema.hasOfferCatalog.property
lazy val hasPOS = lspace.ns.vocab.schema.hasPOS.property
lazy val isicV4 = lspace.ns.vocab.schema.isicV4.property
lazy val knowsAbout = lspace.ns.vocab.schema.knowsAbout.property
lazy val knowsLanguage = lspace.ns.vocab.schema.knowsLanguage.property
lazy val legalName = lspace.ns.vocab.schema.legalName.property
lazy val leiCode = lspace.ns.vocab.schema.leiCode.property
lazy val location = lspace.ns.vocab.schema.location.property
lazy val logo = lspace.ns.vocab.schema.logo.property
lazy val makesOffer = lspace.ns.vocab.schema.makesOffer.property
lazy val member = lspace.ns.vocab.schema.member.property
lazy val memberOf = lspace.ns.vocab.schema.memberOf.property
lazy val naics = lspace.ns.vocab.schema.naics.property
lazy val numberOfEmployees = lspace.ns.vocab.schema.numberOfEmployees.property
lazy val ownershipFundingInfo = lspace.ns.vocab.schema.ownershipFundingInfo.property
lazy val owns = lspace.ns.vocab.schema.owns.property
lazy val parentOrganization = lspace.ns.vocab.schema.parentOrganization.property
lazy val publishingPrinciples = lspace.ns.vocab.schema.publishingPrinciples.property
lazy val review = lspace.ns.vocab.schema.review.property
lazy val seeks = lspace.ns.vocab.schema.seeks.property
lazy val slogan = lspace.ns.vocab.schema.slogan.property
lazy val sponsor = lspace.ns.vocab.schema.sponsor.property
lazy val subOrganization = lspace.ns.vocab.schema.subOrganization.property
lazy val taxID = lspace.ns.vocab.schema.taxID.property
lazy val telephone = lspace.ns.vocab.schema.telephone.property
lazy val unnamedSourcesPolicy = lspace.ns.vocab.schema.unnamedSourcesPolicy.property
lazy val vatID = lspace.ns.vocab.schema.vatID.property
}
}