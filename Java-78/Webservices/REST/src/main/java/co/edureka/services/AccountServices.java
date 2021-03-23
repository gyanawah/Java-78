package co.edureka.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/account")
public class AccountServices {
	
 @POST
 @Path("/newaccount")
 @Produces("text/html")
 public String createNewAccount(@FormParam("acno") String acno, @FormParam("name") String name, @FormParam("bal") String bal) {
	 //logic to save Account details in DB;
	 String responseMsg = "<h2>A/C No: "+acno+"<br>Name: "+name+"<br>Balance: "+bal+"</h2>";
	 return responseMsg;
 }
}
