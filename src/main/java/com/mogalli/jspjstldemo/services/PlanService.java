package com.mogalli.jspjstldemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;

import com.mogalli.jspjstldemo.model.Plan;

@Service
public class PlanService {

	@Autowired
	private RestTemplateBuilder builder;
	private String username = "hariprasad.srinivas@prudential.co.uk";
	private String password = "Kuldubond007";

	public Plan getPlan() {

		return builder.basicAuthorization(username, password).build()
				.getForObject("https://api.browserstack.com/automate/plan.json", Plan.class);

	}
}
