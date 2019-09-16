package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRContactCenterManagementPlanExchangeInputModelContactCenterManagementPlanExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRContactCenterManagementPlanExchangeInputModel
 */
public class CRContactCenterManagementPlanExchangeInputModel   {
  private String contactCenterManagementServicingSessionReference = null;

  private String contactCenterManagementPlanInstanceReference = null;

  private Object contactCenterManagementPlanExchangeActionTaskRecord = null;

  private CRContactCenterManagementPlanExchangeInputModelContactCenterManagementPlanExchangeActionRequest contactCenterManagementPlanExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return contactCenterManagementServicingSessionReference
  **/

  public String getContactCenterManagementServicingSessionReference() {
    return contactCenterManagementServicingSessionReference;
  }

  public void setContactCenterManagementServicingSessionReference(String contactCenterManagementServicingSessionReference) {
    this.contactCenterManagementServicingSessionReference = contactCenterManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Contact Center Management Plan instance 
   * @return contactCenterManagementPlanInstanceReference
  **/

  public String getContactCenterManagementPlanInstanceReference() {
    return contactCenterManagementPlanInstanceReference;
  }

  public void setContactCenterManagementPlanInstanceReference(String contactCenterManagementPlanInstanceReference) {
    this.contactCenterManagementPlanInstanceReference = contactCenterManagementPlanInstanceReference;
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
   * Get contactCenterManagementPlanExchangeActionRequest
   * @return contactCenterManagementPlanExchangeActionRequest
  **/

  public CRContactCenterManagementPlanExchangeInputModelContactCenterManagementPlanExchangeActionRequest getContactCenterManagementPlanExchangeActionRequest() {
    return contactCenterManagementPlanExchangeActionRequest;
  }

  public void setContactCenterManagementPlanExchangeActionRequest(CRContactCenterManagementPlanExchangeInputModelContactCenterManagementPlanExchangeActionRequest contactCenterManagementPlanExchangeActionRequest) {
    this.contactCenterManagementPlanExchangeActionRequest = contactCenterManagementPlanExchangeActionRequest;
  }


}

