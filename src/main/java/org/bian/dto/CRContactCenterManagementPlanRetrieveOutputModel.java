package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRContactCenterManagementPlanCreateInputModelContactCenterManagementPlanInstanceRecord;
import org.bian.dto.CRContactCenterManagementPlanRetrieveOutputModelContactCenterManagementPlanInstanceAnalysis;
import org.bian.dto.CRContactCenterManagementPlanRetrieveOutputModelContactCenterManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRContactCenterManagementPlanRetrieveOutputModel
 */
public class CRContactCenterManagementPlanRetrieveOutputModel   {
  private CRContactCenterManagementPlanCreateInputModelContactCenterManagementPlanInstanceRecord contactCenterManagementPlanInstanceRecord = null;

  private String contactCenterManagementPlanRetrieveActionTaskReference = null;

  private Object contactCenterManagementPlanRetrieveActionTaskRecord = null;

  private String contactCenterManagementPlanRetrieveActionResponse = null;

  private CRContactCenterManagementPlanRetrieveOutputModelContactCenterManagementPlanInstanceReportRecord contactCenterManagementPlanInstanceReportRecord = null;

  private CRContactCenterManagementPlanRetrieveOutputModelContactCenterManagementPlanInstanceAnalysis contactCenterManagementPlanInstanceAnalysis = null;


  /**
   * Get contactCenterManagementPlanInstanceRecord
   * @return contactCenterManagementPlanInstanceRecord
  **/

  public CRContactCenterManagementPlanCreateInputModelContactCenterManagementPlanInstanceRecord getContactCenterManagementPlanInstanceRecord() {
    return contactCenterManagementPlanInstanceRecord;
  }

  public void setContactCenterManagementPlanInstanceRecord(CRContactCenterManagementPlanCreateInputModelContactCenterManagementPlanInstanceRecord contactCenterManagementPlanInstanceRecord) {
    this.contactCenterManagementPlanInstanceRecord = contactCenterManagementPlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Contact Center Management Plan instance retrieve service call 
   * @return contactCenterManagementPlanRetrieveActionTaskReference
  **/

  public String getContactCenterManagementPlanRetrieveActionTaskReference() {
    return contactCenterManagementPlanRetrieveActionTaskReference;
  }

  public void setContactCenterManagementPlanRetrieveActionTaskReference(String contactCenterManagementPlanRetrieveActionTaskReference) {
    this.contactCenterManagementPlanRetrieveActionTaskReference = contactCenterManagementPlanRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return contactCenterManagementPlanRetrieveActionTaskRecord
  **/

  public Object getContactCenterManagementPlanRetrieveActionTaskRecord() {
    return contactCenterManagementPlanRetrieveActionTaskRecord;
  }

  public void setContactCenterManagementPlanRetrieveActionTaskRecord(Object contactCenterManagementPlanRetrieveActionTaskRecord) {
    this.contactCenterManagementPlanRetrieveActionTaskRecord = contactCenterManagementPlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return contactCenterManagementPlanRetrieveActionResponse
  **/

  public String getContactCenterManagementPlanRetrieveActionResponse() {
    return contactCenterManagementPlanRetrieveActionResponse;
  }

  public void setContactCenterManagementPlanRetrieveActionResponse(String contactCenterManagementPlanRetrieveActionResponse) {
    this.contactCenterManagementPlanRetrieveActionResponse = contactCenterManagementPlanRetrieveActionResponse;
  }


  /**
   * Get contactCenterManagementPlanInstanceReportRecord
   * @return contactCenterManagementPlanInstanceReportRecord
  **/

  public CRContactCenterManagementPlanRetrieveOutputModelContactCenterManagementPlanInstanceReportRecord getContactCenterManagementPlanInstanceReportRecord() {
    return contactCenterManagementPlanInstanceReportRecord;
  }

  public void setContactCenterManagementPlanInstanceReportRecord(CRContactCenterManagementPlanRetrieveOutputModelContactCenterManagementPlanInstanceReportRecord contactCenterManagementPlanInstanceReportRecord) {
    this.contactCenterManagementPlanInstanceReportRecord = contactCenterManagementPlanInstanceReportRecord;
  }


  /**
   * Get contactCenterManagementPlanInstanceAnalysis
   * @return contactCenterManagementPlanInstanceAnalysis
  **/

  public CRContactCenterManagementPlanRetrieveOutputModelContactCenterManagementPlanInstanceAnalysis getContactCenterManagementPlanInstanceAnalysis() {
    return contactCenterManagementPlanInstanceAnalysis;
  }

  public void setContactCenterManagementPlanInstanceAnalysis(CRContactCenterManagementPlanRetrieveOutputModelContactCenterManagementPlanInstanceAnalysis contactCenterManagementPlanInstanceAnalysis) {
    this.contactCenterManagementPlanInstanceAnalysis = contactCenterManagementPlanInstanceAnalysis;
  }


}

