package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRContactCenterManagementPlanRetrieveInputModelContactCenterManagementPlanInstanceAnalysis
 */
public class CRContactCenterManagementPlanRetrieveInputModelContactCenterManagementPlanInstanceAnalysis   {
  private String contactCenterManagementPlanInstanceAnalysisReference = null;

  private String contactCenterManagementPlanInstanceAnalysisReportType = null;

  private String contactCenterManagementPlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return contactCenterManagementPlanInstanceAnalysisReference
  **/

  public String getContactCenterManagementPlanInstanceAnalysisReference() {
    return contactCenterManagementPlanInstanceAnalysisReference;
  }

  public void setContactCenterManagementPlanInstanceAnalysisReference(String contactCenterManagementPlanInstanceAnalysisReference) {
    this.contactCenterManagementPlanInstanceAnalysisReference = contactCenterManagementPlanInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return contactCenterManagementPlanInstanceAnalysisReportType
  **/

  public String getContactCenterManagementPlanInstanceAnalysisReportType() {
    return contactCenterManagementPlanInstanceAnalysisReportType;
  }

  public void setContactCenterManagementPlanInstanceAnalysisReportType(String contactCenterManagementPlanInstanceAnalysisReportType) {
    this.contactCenterManagementPlanInstanceAnalysisReportType = contactCenterManagementPlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return contactCenterManagementPlanInstanceAnalysisParameters
  **/

  public String getContactCenterManagementPlanInstanceAnalysisParameters() {
    return contactCenterManagementPlanInstanceAnalysisParameters;
  }

  public void setContactCenterManagementPlanInstanceAnalysisParameters(String contactCenterManagementPlanInstanceAnalysisParameters) {
    this.contactCenterManagementPlanInstanceAnalysisParameters = contactCenterManagementPlanInstanceAnalysisParameters;
  }


}

