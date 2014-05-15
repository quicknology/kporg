package com.indigoarc;

import org.apache.camel.builder.RouteBuilder;
import org.apache.log4j.Logger;

public class MyRouteBuilder extends RouteBuilder {

	private static Logger LOGGER = Logger.getLogger(MyRouteBuilder.class);
	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		LOGGER.info("MyRouteBuilder called");
		from("hl7listener").to("patientLookupService");
	}

}
