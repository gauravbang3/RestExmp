package com.java4s;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/customers")
public class JsonFromRestfu {
	 @GET
	    @Path("/{cusNo}")
	    @Produces(MediaType.APPLICATION_JSON)
	    public Customer produceCustomerDetailsinJSON(@PathParam("cusNo") int no) {
	 
	        /*
	         * I AM PASSING CUST.NO AS AN INPUT, SO WRITE SOME BACKEND RELATED STUFF AND
	         * FIND THE CUSTOMER DETAILS WITH THAT ID. AND FINALLY SET THOSE RETRIEVED VALUES TO
	         * THE CUSTOMER OBJECT AND RETURN IT, HOWEVER IT WILL RETURN IN JSON FORMAT :-)
	         * */
	        
	        Customer cust = new Customer();        
	            cust .setCustNo(no);
	            cust .setCustName("Java4s");
	            cust .setCustCountry("India");
	        return cust;
}}
