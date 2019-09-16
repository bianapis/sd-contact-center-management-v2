package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRContactCenterManagementPlanExchangeOutputModel
 */
public class CRContactCenterManagementPlanExchangeOutputModel   {
  private String contactCenterManagementPlanExchangeActionTaskReference = null;

  private Object contactCenterManagementPlanExchangeActionTaskRecord = null;

  private String contactCenterManagementPlanExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Contact Center Management Plan instance exchange service call 
   * @return contactCenterManagementPlanExchangeActionTaskReference
  **/

  public String getContactCenterManagementPlanExchangeActionTaskReference() {
    return contactCenterManagementPlanExchangeActionTaskReference;
  }

  public void setContactCenterManagementPlanExchangeActionTaskReference(String contactCenterManagementPlanExchangeActionTaskReference) {
    this.contactCenterManagementPlanExchangeActionTaskReference = contactCenterManagementPlanExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return contactCenterManagementPlanExchangeActionTaskRecord
  **/

  public Object getContactCenterManagementPlanExchangeActionTaskRecord() {
    return contactCenterManagementPlanExchangeActionTaskRecord;
  }

  public void setContactCenterManagementPlanExchangeActionTaskRecord(Object contactCenterManagementPlanExchangeActionTaskRecord) {
    this.contactCenterManagementPlanExchangeActionTaskRecord = contactCenterManagementPlanExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return contactCenterManagementPlanExchangeActionResponse
  **/

  public String getContactCenterManagementPlanExchangeActionResponse() {
    return contactCenterManagementPlanExchangeActionResponse;
  }

  public void setContactCenterManagementPlanExchangeActionResponse(String contactCenterManagementPlanExchangeActionResponse) {
    this.contactCenterManagementPlanExchangeActionResponse = contactCenterManagementPlanExchangeActionResponse;
  }


}

