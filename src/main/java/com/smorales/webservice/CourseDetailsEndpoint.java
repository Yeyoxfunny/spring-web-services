package com.smorales.webservice;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.smorales.dto.CourseDetails;
import com.smorales.dto.GetCourseDetailsRequest;
import com.smorales.dto.GetCourseDetailsResponse;

@Endpoint
public class CourseDetailsEndpoint {

	private static final String NAMESPACE_URI = "http://smorales.com/dto";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetCourseDetailsRequest")
	@ResponsePayload
	public GetCourseDetailsResponse getCourse(@RequestPayload GetCourseDetailsRequest request) {
		CourseDetails courseDetails = new CourseDetails();
		courseDetails.setId(request.getId());
		courseDetails.setName("Spring Web Services");
		courseDetails.setDescription("Create SOAP Services with Spring Boot");
		GetCourseDetailsResponse response = new GetCourseDetailsResponse();
		response.setCourseDetails(courseDetails);
		return response;
	}

}
