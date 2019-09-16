package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRContactCenterManagementPlanRetrieveInputModelContactCenterManagementPlanInstanceReportRecord
 */
public class CRContactCenterManagementPlanRetrieveInputModelContactCenterManagementPlanInstanceReportRecord   {
  private String contactCenterManagementPlanInstanceReportReference = null;

  private String contactCenterManagementPlanInstanceReportType = null;

  private String contactCenterManagementPlanInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return contactCenterManagementPlanInstanceReportReference
  **/

  public String getContactCenterManagementPlanInstanceReportReference() {
    return contactCenterManagementPlanInstanceReportReference;
  }

  public void setContactCenterManagementPlanInstanceReportReference(String contactCenterManagementPlanInstanceReportReference) {
    this.contactCenterManagementPlanInstanceReportReference = contactCenterManagementPlanInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return contactCenterManagementPlanInstanceReportType
  **/

  public String getContactCenterManagementPlanInstanceReportType() {
    return contactCenterManagementPlanInstanceReportType;
  }

  public void setContactCenterManagementPlanInstanceReportType(String contactCenterManagementPlanInstanceReportType) {
    this.contactCenterManagementPlanInstanceReportType = contactCenterManagementPlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return contactCenterManagementPlanInstanceReportParameters
  **/

  public String getContactCenterManagementPlanInstanceReportParameters() {
    return contactCenterManagementPlanInstanceReportParameters;
  }

  public void setContactCenterManagementPlanInstanceReportParameters(String contactCenterManagementPlanInstanceReportParameters) {
    this.contactCenterManagementPlanInstanceReportParameters = contactCenterManagementPlanInstanceReportParameters;
  }


}

