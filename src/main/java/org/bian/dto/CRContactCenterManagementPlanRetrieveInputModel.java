package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRContactCenterManagementPlanRetrieveInputModelContactCenterManagementPlanInstanceAnalysis;
import org.bian.dto.CRContactCenterManagementPlanRetrieveInputModelContactCenterManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRContactCenterManagementPlanRetrieveInputModel
 */
public class CRContactCenterManagementPlanRetrieveInputModel   {
  private Object contactCenterManagementPlanRetrieveActionTaskRecord = null;

  private String contactCenterManagementPlanRetrieveActionRequest = null;

  private CRContactCenterManagementPlanRetrieveInputModelContactCenterManagementPlanInstanceReportRecord contactCenterManagementPlanInstanceReportRecord = null;

  private CRContactCenterManagementPlanRetrieveInputModelContactCenterManagementPlanInstanceAnalysis contactCenterManagementPlanInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return contactCenterManagementPlanRetrieveActionRequest
  **/

  public String getContactCenterManagementPlanRetrieveActionRequest() {
    return contactCenterManagementPlanRetrieveActionRequest;
  }

  public void setContactCenterManagementPlanRetrieveActionRequest(String contactCenterManagementPlanRetrieveActionRequest) {
    this.contactCenterManagementPlanRetrieveActionRequest = contactCenterManagementPlanRetrieveActionRequest;
  }


  /**
   * Get contactCenterManagementPlanInstanceReportRecord
   * @return contactCenterManagementPlanInstanceReportRecord
  **/

  public CRContactCenterManagementPlanRetrieveInputModelContactCenterManagementPlanInstanceReportRecord getContactCenterManagementPlanInstanceReportRecord() {
    return contactCenterManagementPlanInstanceReportRecord;
  }

  public void setContactCenterManagementPlanInstanceReportRecord(CRContactCenterManagementPlanRetrieveInputModelContactCenterManagementPlanInstanceReportRecord contactCenterManagementPlanInstanceReportRecord) {
    this.contactCenterManagementPlanInstanceReportRecord = contactCenterManagementPlanInstanceReportRecord;
  }


  /**
   * Get contactCenterManagementPlanInstanceAnalysis
   * @return contactCenterManagementPlanInstanceAnalysis
  **/

  public CRContactCenterManagementPlanRetrieveInputModelContactCenterManagementPlanInstanceAnalysis getContactCenterManagementPlanInstanceAnalysis() {
    return contactCenterManagementPlanInstanceAnalysis;
  }

  public void setContactCenterManagementPlanInstanceAnalysis(CRContactCenterManagementPlanRetrieveInputModelContactCenterManagementPlanInstanceAnalysis contactCenterManagementPlanInstanceAnalysis) {
    this.contactCenterManagementPlanInstanceAnalysis = contactCenterManagementPlanInstanceAnalysis;
  }


}

