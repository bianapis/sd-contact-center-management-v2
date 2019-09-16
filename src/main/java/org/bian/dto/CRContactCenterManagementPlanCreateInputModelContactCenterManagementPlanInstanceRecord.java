package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRContactCenterManagementPlanCreateInputModelContactCenterManagementPlanInstanceRecord
 */
public class CRContactCenterManagementPlanCreateInputModelContactCenterManagementPlanInstanceRecord   {
  private String contactCenterManagementPlanPeriod = null;

  private String contactCenterUsagePoliciesAndGuidelines = null;

  private String contactCenterServicePerformanceGoals = null;

  private String contactCenterServiceSchedule = null;

  private String contactCenterServiceOperatingConfiguration = null;

  private String contactCenterResourcePlan = null;

  private String contactCenterTrainingPlan = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The time period addressed by the management plan (typically this will include setting the default daily operating goals and arrangements for the contact center that is periodically updated) 
   * @return contactCenterManagementPlanPeriod
  **/

  public String getContactCenterManagementPlanPeriod() {
    return contactCenterManagementPlanPeriod;
  }

  public void setContactCenterManagementPlanPeriod(String contactCenterManagementPlanPeriod) {
    this.contactCenterManagementPlanPeriod = contactCenterManagementPlanPeriod;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The policies and guidelines for contact center employees and service users 
   * @return contactCenterUsagePoliciesAndGuidelines
  **/

  public String getContactCenterUsagePoliciesAndGuidelines() {
    return contactCenterUsagePoliciesAndGuidelines;
  }

  public void setContactCenterUsagePoliciesAndGuidelines(String contactCenterUsagePoliciesAndGuidelines) {
    this.contactCenterUsagePoliciesAndGuidelines = contactCenterUsagePoliciesAndGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The target and actual service performance goals that are tracked by contact center management 
   * @return contactCenterServicePerformanceGoals
  **/

  public String getContactCenterServicePerformanceGoals() {
    return contactCenterServicePerformanceGoals;
  }

  public void setContactCenterServicePerformanceGoals(String contactCenterServicePerformanceGoals) {
    this.contactCenterServicePerformanceGoals = contactCenterServicePerformanceGoals;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The target and actual contact center service schedule - recording planned and actual service availability and outages (includes any partial service access constraints or restrictions for a 24/7 service)  
   * @return contactCenterServiceSchedule
  **/

  public String getContactCenterServiceSchedule() {
    return contactCenterServiceSchedule;
  }

  public void setContactCenterServiceSchedule(String contactCenterServiceSchedule) {
    this.contactCenterServiceSchedule = contactCenterServiceSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default contact center operational configuration (Note this can include some latitude for position assignment changes to be made during day to day operations with service calls to the Contact Center Operations service domain) 
   * @return contactCenterServiceOperatingConfiguration
  **/

  public String getContactCenterServiceOperatingConfiguration() {
    return contactCenterServiceOperatingConfiguration;
  }

  public void setContactCenterServiceOperatingConfiguration(String contactCenterServiceOperatingConfiguration) {
    this.contactCenterServiceOperatingConfiguration = contactCenterServiceOperatingConfiguration;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the number and skill profile of the contact center staff (target and actual) 
   * @return contactCenterResourcePlan
  **/

  public String getContactCenterResourcePlan() {
    return contactCenterResourcePlan;
  }

  public void setContactCenterResourcePlan(String contactCenterResourcePlan) {
    this.contactCenterResourcePlan = contactCenterResourcePlan;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of staff training and certification activity 
   * @return contactCenterTrainingPlan
  **/

  public String getContactCenterTrainingPlan() {
    return contactCenterTrainingPlan;
  }

  public void setContactCenterTrainingPlan(String contactCenterTrainingPlan) {
    this.contactCenterTrainingPlan = contactCenterTrainingPlan;
  }


}

