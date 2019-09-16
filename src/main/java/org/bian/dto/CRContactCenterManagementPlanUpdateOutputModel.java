package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRContactCenterManagementPlanCreateInputModelContactCenterManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRContactCenterManagementPlanUpdateOutputModel
 */
public class CRContactCenterManagementPlanUpdateOutputModel   {
  private CRContactCenterManagementPlanCreateInputModelContactCenterManagementPlanInstanceRecord contactCenterManagementPlanInstanceRecord = null;

  private String contactCenterManagementPlanUpdateActionTaskReference = null;

  private Object contactCenterManagementPlanUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return contactCenterManagementPlanUpdateActionTaskReference
  **/

  public String getContactCenterManagementPlanUpdateActionTaskReference() {
    return contactCenterManagementPlanUpdateActionTaskReference;
  }

  public void setContactCenterManagementPlanUpdateActionTaskReference(String contactCenterManagementPlanUpdateActionTaskReference) {
    this.contactCenterManagementPlanUpdateActionTaskReference = contactCenterManagementPlanUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

