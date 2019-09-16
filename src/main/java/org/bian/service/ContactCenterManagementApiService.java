/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ContactCenterManagementApiService {

	SDContactCenterManagementActivateOutputModel activate(SDContactCenterManagementActivateInputModel request);
	
	SDContactCenterManagementConfigureOutputModel configure(String sdReferenceId, SDContactCenterManagementConfigureInputModel request);
	
	CRContactCenterManagementPlanCreateOutputModel create(String sdReferenceId, CRContactCenterManagementPlanCreateInputModel request);
	
	BQTroubleshootingCreateOutputModel createTroubleshooting(String sdReferenceId, String crReferenceId, BQTroubleshootingCreateInputModel request);
	
	CRContactCenterManagementPlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRContactCenterManagementPlanExchangeInputModel request);
	
	SDContactCenterManagementFeedbackOutputModel feedback(String sdReferenceId, SDContactCenterManagementFeedbackInputModel request);
	
	BQPerformanceRequestOutputModel requestPerformance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceRequestInputModel request);
	
	BQTroubleshootingRequestOutputModel requestTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingRequestInputModel request);
	
	CRContactCenterManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRContactCenterManagementPlanRequestInputModel request);
	
	CRContactCenterManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQPerformanceRetrieveOutputModel retrievePerformance(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTroubleshootingRetrieveOutputModel retrieveTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDContactCenterManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRContactCenterManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRContactCenterManagementPlanUpdateInputModel request);
	
	BQPerformanceUpdateOutputModel updatePerformance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceUpdateInputModel request);
	
	BQTroubleshootingUpdateOutputModel updateTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingUpdateInputModel request);
	
}
