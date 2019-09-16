package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRContactCenterManagementPlanRetrieveOutputModelContactCenterManagementPlanInstanceReportRecord
 */
public class CRContactCenterManagementPlanRetrieveOutputModelContactCenterManagementPlanInstanceReportRecord   {
  private String contactCenterManagementPlanInstanceReportData = null;

  private String contactCenterManagementPlanInstanceReportType = null;

  private Object contactCenterManagementPlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return contactCenterManagementPlanInstanceReportData
  **/

  public String getContactCenterManagementPlanInstanceReportData() {
    return contactCenterManagementPlanInstanceReportData;
  }

  public void setContactCenterManagementPlanInstanceReportData(String contactCenterManagementPlanInstanceReportData) {
    this.contactCenterManagementPlanInstanceReportData = contactCenterManagementPlanInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return contactCenterManagementPlanInstanceReport
  **/

  public Object getContactCenterManagementPlanInstanceReport() {
    return contactCenterManagementPlanInstanceReport;
  }

  public void setContactCenterManagementPlanInstanceReport(Object contactCenterManagementPlanInstanceReport) {
    this.contactCenterManagementPlanInstanceReport = contactCenterManagementPlanInstanceReport;
  }


}

