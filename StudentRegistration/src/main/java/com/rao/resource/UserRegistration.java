package com.rao.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.rao.dto.UserDTO;

@Path("/userRegistration")
public class UserRegistration {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createUser() {
		Response lResponse = null;
		System.out.println("Calling the Resource");
		return lResponse;
	}
	
}
