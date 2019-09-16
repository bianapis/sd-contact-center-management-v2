/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ContactCenterManagementApiServiceImpl implements ContactCenterManagementApiService {

	public SDContactCenterManagementActivateOutputModel activate(SDContactCenterManagementActivateInputModel request){
		return JsonReader.read("activate-SDContactCenterManagementActivateOutputModel.json",new TypeReference<SDContactCenterManagementActivateOutputModel>(){});
	}
	
	public SDContactCenterManagementConfigureOutputModel configure(String sdReferenceId, SDContactCenterManagementConfigureInputModel request){
		return JsonReader.read("configure-SDContactCenterManagementConfigureOutputModel.json",new TypeReference<SDContactCenterManagementConfigureOutputModel>(){});
	}
	
	public CRContactCenterManagementPlanCreateOutputModel create(String sdReferenceId, CRContactCenterManagementPlanCreateInputModel request){
		return JsonReader.read("create-CRContactCenterManagementPlanCreateOutputModel.json",new TypeReference<CRContactCenterManagementPlanCreateOutputModel>(){});
	}
	
	public BQTroubleshootingCreateOutputModel createTroubleshooting(String sdReferenceId, String crReferenceId, BQTroubleshootingCreateInputModel request){
		return JsonReader.read("create-BQTroubleshootingCreateOutputModel.json",new TypeReference<BQTroubleshootingCreateOutputModel>(){});
	}
	
	public CRContactCenterManagementPlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRContactCenterManagementPlanExchangeInputModel request){
		return JsonReader.read("exchange-CRContactCenterManagementPlanExchangeOutputModel.json",new TypeReference<CRContactCenterManagementPlanExchangeOutputModel>(){});
	}
	
	public SDContactCenterManagementFeedbackOutputModel feedback(String sdReferenceId, SDContactCenterManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDContactCenterManagementFeedbackOutputModel.json",new TypeReference<SDContactCenterManagementFeedbackOutputModel>(){});
	}
	
	public BQPerformanceRequestOutputModel requestPerformance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceRequestInputModel request){
		return JsonReader.read("request-BQPerformanceRequestOutputModel.json",new TypeReference<BQPerformanceRequestOutputModel>(){});
	}
	
	public BQTroubleshootingRequestOutputModel requestTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingRequestInputModel request){
		return JsonReader.read("request-BQTroubleshootingRequestOutputModel.json",new TypeReference<BQTroubleshootingRequestOutputModel>(){});
	}
	
	public CRContactCenterManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRContactCenterManagementPlanRequestInputModel request){
		return JsonReader.read("request-CRContactCenterManagementPlanRequestOutputModel.json",new TypeReference<CRContactCenterManagementPlanRequestOutputModel>(){});
	}
	
	public CRContactCenterManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRContactCenterManagementPlanRetrieveOutputModel.json",new TypeReference<CRContactCenterManagementPlanRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQPerformanceRetrieveOutputModel retrievePerformance(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPerformanceRetrieveOutputModel.json",new TypeReference<BQPerformanceRetrieveOutputModel>(){});
	}
	
	public BQTroubleshootingRetrieveOutputModel retrieveTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTroubleshootingRetrieveOutputModel.json",new TypeReference<BQTroubleshootingRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDContactCenterManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDContactCenterManagementRetrieveOutputModel.json",new TypeReference<SDContactCenterManagementRetrieveOutputModel>(){});
	}
	
	public CRContactCenterManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRContactCenterManagementPlanUpdateInputModel request){
		return JsonReader.read("update-CRContactCenterManagementPlanUpdateOutputModel.json",new TypeReference<CRContactCenterManagementPlanUpdateOutputModel>(){});
	}
	
	public BQPerformanceUpdateOutputModel updatePerformance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceUpdateInputModel request){
		return JsonReader.read("update-BQPerformanceUpdateOutputModel.json",new TypeReference<BQPerformanceUpdateOutputModel>(){});
	}
	
	public BQTroubleshootingUpdateOutputModel updateTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingUpdateInputModel request){
		return JsonReader.read("update-BQTroubleshootingUpdateOutputModel.json",new TypeReference<BQTroubleshootingUpdateOutputModel>(){});
	}
	
}
