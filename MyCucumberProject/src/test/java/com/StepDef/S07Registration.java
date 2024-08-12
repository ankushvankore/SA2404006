package com.StepDef;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.*;

public class S07Registration {
	
	@Given("Open registration page")
	public void open_registration_page() {
	    System.out.println("Launching registration page");
	}

	@When("I enter the data as follows")
	public void i_enter_the_data_as_follows(io.cucumber.datatable.DataTable dataTable) {
	    System.out.println(dataTable);
	    
	    List<List<String>>data = dataTable.asLists();
	    
	    //System.out.println(data.get(0));
	    //System.out.println(data.get(1));
	    
	    System.out.println(data.get(1).get(3));
	    
	    for(List<String>d : data)
	    	System.out.println(d);
	}

	@Then("Registration should success")
	public void registration_should_success() {
	    System.out.println("Registration successful!!!");
	}
	
	@When("Enter following data")
	public void enter_following_data(io.cucumber.datatable.DataTable dataTable) {
	    System.out.println(dataTable);
	    
	    List<Map<String, String>>data = dataTable.asMaps();
	    System.out.println(data);
	    
	    for(Map<String, String> d : data)
	    {
	    	//System.out.println(d);
	    	System.out.println("First Name: " + d.get("FirstName"));
	    	System.out.println("Last Name : " + d.get("LastName"));
	    	System.out.println("Mail Id   : " + d.get("MailId"));
	    	System.out.println("City      : " + d.get("City"));
	    	System.out.println("Mobile No : " + d.get("MNo"));
	    }
	}

	@Then("Registration message should display")
	public void registration_message_should_display() {
	    System.out.println("Registration was successful!!!");
	}

}
