package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRContactCenterManagementPlanCreateInputModelContactCenterManagementPlanInstanceRecord;
import org.bian.dto.CRContactCenterManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRContactCenterManagementPlanRequestInputModel
 */
public class CRContactCenterManagementPlanRequestInputModel   {
  private String contactCenterManagementServicingSessionReference = null;

  private String contactCenterManagementPlanInstanceReference = null;

  private CRContactCenterManagementPlanCreateInputModelContactCenterManagementPlanInstanceRecord contactCenterManagementPlanInstanceRecord = null;

  private Object contactCenterManagementPlanRequestActionTaskRecord = null;

  private CRContactCenterManagementPlanRequestInputModelRequestRecordType requestRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return contactCenterManagementPlanRequestActionTaskRecord
  **/

  public Object getContactCenterManagementPlanRequestActionTaskRecord() {
    return contactCenterManagementPlanRequestActionTaskRecord;
  }

  public void setContactCenterManagementPlanRequestActionTaskRecord(Object contactCenterManagementPlanRequestActionTaskRecord) {
    this.contactCenterManagementPlanRequestActionTaskRecord = contactCenterManagementPlanRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRContactCenterManagementPlanRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRContactCenterManagementPlanRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

