package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceUpdateInputModelPerformanceInstanceRecordContactCenterServiceStatistics;

import javax.validation.Valid;
  
/**
 * BQPerformanceUpdateInputModelPerformanceInstanceRecord
 */
public class BQPerformanceUpdateInputModelPerformanceInstanceRecord   {
  private String contactCenterPositionUtilization = null;

  private String contactCenterLoadingProjections = null;

  private BQPerformanceUpdateInputModelPerformanceInstanceRecordContactCenterServiceStatistics contactCenterServiceStatistics = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Record of the contact center position target and actual utilization 
   * @return contactCenterPositionUtilization
  **/

  public String getContactCenterPositionUtilization() {
    return contactCenterPositionUtilization;
  }

  public void setContactCenterPositionUtilization(String contactCenterPositionUtilization) {
    this.contactCenterPositionUtilization = contactCenterPositionUtilization;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Estimated projected contact center resource requirements and utilization and loading based on historical patterns and anticipated activity 
   * @return contactCenterLoadingProjections
  **/

  public String getContactCenterLoadingProjections() {
    return contactCenterLoadingProjections;
  }

  public void setContactCenterLoadingProjections(String contactCenterLoadingProjections) {
    this.contactCenterLoadingProjections = contactCenterLoadingProjections;
  }


  /**
   * Get contactCenterServiceStatistics
   * @return contactCenterServiceStatistics
  **/

  public BQPerformanceUpdateInputModelPerformanceInstanceRecordContactCenterServiceStatistics getContactCenterServiceStatistics() {
    return contactCenterServiceStatistics;
  }

  public void setContactCenterServiceStatistics(BQPerformanceUpdateInputModelPerformanceInstanceRecordContactCenterServiceStatistics contactCenterServiceStatistics) {
    this.contactCenterServiceStatistics = contactCenterServiceStatistics;
  }


}

