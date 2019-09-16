package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRContactCenterManagementPlanCreateInputModelContactCenterManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRContactCenterManagementPlanCreateInputModel
 */
public class CRContactCenterManagementPlanCreateInputModel   {
  private String contactCenterManagementServicingSessionReference = null;

  private Object contactCenterManagementPlanCreateActionRecord = null;

  private String contactCenterManagementPlanInstanceStatus = null;

  private CRContactCenterManagementPlanCreateInputModelContactCenterManagementPlanInstanceRecord contactCenterManagementPlanInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return contactCenterManagementPlanCreateActionRecord
  **/

  public Object getContactCenterManagementPlanCreateActionRecord() {
    return contactCenterManagementPlanCreateActionRecord;
  }

  public void setContactCenterManagementPlanCreateActionRecord(Object contactCenterManagementPlanCreateActionRecord) {
    this.contactCenterManagementPlanCreateActionRecord = contactCenterManagementPlanCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Contact Center Management Plan instance (e.g. initialised, pending, active) 
   * @return contactCenterManagementPlanInstanceStatus
  **/

  public String getContactCenterManagementPlanInstanceStatus() {
    return contactCenterManagementPlanInstanceStatus;
  }

  public void setContactCenterManagementPlanInstanceStatus(String contactCenterManagementPlanInstanceStatus) {
    this.contactCenterManagementPlanInstanceStatus = contactCenterManagementPlanInstanceStatus;
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


}

