package com.indigoarc;

import org.apache.log4j.Logger;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.segment.QRD;
 
public class PatientLookupService {
	private static Logger LOGGER = Logger.getLogger(PatientLookupService.class);
	
    public String lookupPatient(Message input) throws HL7Exception {
        QRD qrd = (QRD)input.get("QRD");
        String patientId = qrd.getWhoSubjectFilter(0).getIDNumber().getValue();
        
        LOGGER.info("HL7 request:"+patientId);
 
        // find patient data based on the patient id and create a HL7 model object with the response
        String response = "test";
        
        LOGGER.info("HL7 response:"+response);
        return response;
    }
}