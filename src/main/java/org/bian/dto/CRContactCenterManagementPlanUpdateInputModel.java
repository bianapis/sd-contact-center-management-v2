package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRContactCenterManagementPlanCreateInputModelContactCenterManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRContactCenterManagementPlanUpdateInputModel
 */
public class CRContactCenterManagementPlanUpdateInputModel   {
  private String contactCenterManagementServicingSessionReference = null;

  private String contactCenterManagementPlanInstanceReference = null;

  private CRContactCenterManagementPlanCreateInputModelContactCenterManagementPlanInstanceRecord contactCenterManagementPlanInstanceRecord = null;

  private Object contactCenterManagementPlanUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return contactCenterManagementPlanUpdateActionTaskRecord
  **/

  public Object getContactCenterManagementPlanUpdateActionTaskRecord() {
    return contactCenterManagementPlanUpdateActionTaskRecord;
  }

  public void setContactCenterManagementPlanUpdateActionTaskRecord(Object contactCenterManagementPlanUpdateActionTaskRecord) {
    this.contactCenterManagementPlanUpdateActionTaskRecord = contactCenterManagementPlanUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

