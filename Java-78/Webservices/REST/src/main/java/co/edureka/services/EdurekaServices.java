package co.edureka.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/edureka")
public class EdurekaServices {
 @GET
 @Produces("text/html")
 public String localService() {
	 String responseMsg = "<h2>Welcome to Customer Service - INDIA</h2>";
	 return responseMsg;
 }
 
 @GET
 @Path("/intl")
 @Produces("text/html") 
 public String internationalService() {
	 String responseMsg = "<h2>Welcome to Customer Service - USA</h2>";
	 return responseMsg;	 
 } 
 
 @GET
 @Path("{name}/{course}")
 @Produces("text/html")
 public String enquiry(@PathParam("name") String name, @PathParam("course") String course) {
  String responseMsg = "<h2>Customer Name - " + name + "<br>Course Name - " + course + "</h2>";	;	 
  return responseMsg;	
 }
 
 
 @GET
 @Path("/enquiry")
 @Produces("text/html")
 public String processingEnquiry(@QueryParam("name") String name, @QueryParam("course") String course ) {
	 String responseMsg ="<h2>Enquiry from <ins>"+name+"</ins> for Course: <ins>"+course+"</ins></h2>";
	 return responseMsg;
 }

 
}
