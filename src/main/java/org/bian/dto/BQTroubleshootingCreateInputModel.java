package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTroubleshootingCreateInputModelTroubleshootingInstanceRecord;
import org.bian.dto.CRContactCenterManagementPlanCreateInputModelContactCenterManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTroubleshootingCreateInputModel
 */
public class BQTroubleshootingCreateInputModel   {
  private CRContactCenterManagementPlanCreateInputModelContactCenterManagementPlanInstanceRecord contactCenterManagementPlanInstanceRecord = null;

  private String contactCenterManagementPlanInstanceReference = null;

  private Object troubleshootingInitiateActionRecord = null;

  private BQTroubleshootingCreateInputModelTroubleshootingInstanceRecord troubleshootingInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Contact Center Management Plan instance 
   * @return contactCenterManagementPlanInstanceReference
  **/

  public String getContactCenterManagementPlanInstanceReference() {
    return contactCenterManagementPlanInstanceReference;
  }

  public void setContactCenterManagementPlanInstanceReference(String contactCenterManagementPlanInstanceReference) {
    this.contactCenterManagementPlanInstanceReference = contactCenterManagementPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return troubleshootingInitiateActionRecord
  **/

  public Object getTroubleshootingInitiateActionRecord() {
    return troubleshootingInitiateActionRecord;
  }

  public void setTroubleshootingInitiateActionRecord(Object troubleshootingInitiateActionRecord) {
    this.troubleshootingInitiateActionRecord = troubleshootingInitiateActionRecord;
  }


  /**
   * Get troubleshootingInstanceRecord
   * @return troubleshootingInstanceRecord
  **/

  public BQTroubleshootingCreateInputModelTroubleshootingInstanceRecord getTroubleshootingInstanceRecord() {
    return troubleshootingInstanceRecord;
  }

  public void setTroubleshootingInstanceRecord(BQTroubleshootingCreateInputModelTroubleshootingInstanceRecord troubleshootingInstanceRecord) {
    this.troubleshootingInstanceRecord = troubleshootingInstanceRecord;
  }


}

