package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPerformanceUpdateInputModelPerformanceInstanceRecordContactCenterServiceStatistics
 */
public class BQPerformanceUpdateInputModelPerformanceInstanceRecordContactCenterServiceStatistics   {
  private String contactCenterServiceStatisticType = null;

  private String contactCenterServiceStatisticValue = null;

  private String contactCenterServiceStatisticInterpretation = null;

  private String contactCenterServiceStatisticRecommendation = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of activity that is tracked and analyzed (e.g. wait time, average handle time, dropped call ratio, resolution rate) 
   * @return contactCenterServiceStatisticType
  **/

  public String getContactCenterServiceStatisticType() {
    return contactCenterServiceStatisticType;
  }

  public void setContactCenterServiceStatisticType(String contactCenterServiceStatisticType) {
    this.contactCenterServiceStatisticType = contactCenterServiceStatisticType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The statistical analysis that can include historical and trended views of the activity 
   * @return contactCenterServiceStatisticValue
  **/

  public String getContactCenterServiceStatisticValue() {
    return contactCenterServiceStatisticValue;
  }

  public void setContactCenterServiceStatisticValue(String contactCenterServiceStatisticValue) {
    this.contactCenterServiceStatisticValue = contactCenterServiceStatisticValue;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The evaluation of the root cause or comparative assessments of the analysis 
   * @return contactCenterServiceStatisticInterpretation
  **/

  public String getContactCenterServiceStatisticInterpretation() {
    return contactCenterServiceStatisticInterpretation;
  }

  public void setContactCenterServiceStatisticInterpretation(String contactCenterServiceStatisticInterpretation) {
    this.contactCenterServiceStatisticInterpretation = contactCenterServiceStatisticInterpretation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Service/configuration amendment recommendations arising from the statistical analysis 
   * @return contactCenterServiceStatisticRecommendation
  **/

  public String getContactCenterServiceStatisticRecommendation() {
    return contactCenterServiceStatisticRecommendation;
  }

  public void setContactCenterServiceStatisticRecommendation(String contactCenterServiceStatisticRecommendation) {
    this.contactCenterServiceStatisticRecommendation = contactCenterServiceStatisticRecommendation;
  }


}

