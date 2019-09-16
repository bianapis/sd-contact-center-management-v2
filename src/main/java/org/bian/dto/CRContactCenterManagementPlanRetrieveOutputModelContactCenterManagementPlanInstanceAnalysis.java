package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRContactCenterManagementPlanRetrieveOutputModelContactCenterManagementPlanInstanceAnalysis
 */
public class CRContactCenterManagementPlanRetrieveOutputModelContactCenterManagementPlanInstanceAnalysis   {
  private String contactCenterManagementPlanInstanceAnalysisData = null;

  private String contactCenterManagementPlanInstanceAnalysisReportType = null;

  private Object contactCenterManagementPlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return contactCenterManagementPlanInstanceAnalysisData
  **/

  public String getContactCenterManagementPlanInstanceAnalysisData() {
    return contactCenterManagementPlanInstanceAnalysisData;
  }

  public void setContactCenterManagementPlanInstanceAnalysisData(String contactCenterManagementPlanInstanceAnalysisData) {
    this.contactCenterManagementPlanInstanceAnalysisData = contactCenterManagementPlanInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return contactCenterManagementPlanInstanceAnalysisReport
  **/

  public Object getContactCenterManagementPlanInstanceAnalysisReport() {
    return contactCenterManagementPlanInstanceAnalysisReport;
  }

  public void setContactCenterManagementPlanInstanceAnalysisReport(Object contactCenterManagementPlanInstanceAnalysisReport) {
    this.contactCenterManagementPlanInstanceAnalysisReport = contactCenterManagementPlanInstanceAnalysisReport;
  }


}

