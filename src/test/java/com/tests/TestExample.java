package com.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import com.common.Common;

public class TestExample {
	
	// tests from jsonplaceholder endpoint //////////////////////////////
	@Test
	public void successGetPost() {
		Common.getPost();
	}
	
	@Test
	public void successCreatePost() {
		Common.createPost("ini titlle", "ini body", 99);
	}
	
	@Test
	public void invalidRequestMethodPut() {
		final String requestMethod = "PUT"; 
		
		final boolean result = Common.invalidRequestMethod(requestMethod, 404);
		assertEquals(result, true, "Unknown/unavailable request method: " + requestMethod);
	}
	
	@Test
	public void invalidRequestMethodPatch() {
		final String requestMethod = "PATCH"; 
		
		final boolean result = Common.invalidRequestMethod(requestMethod, 404);
		assertEquals(result, true, "Unknown/unavailable request method: " + requestMethod);
	}
	
	@Test
	public void invalidRequestMethodDelete() {
		final String requestMethod = "DELETE"; 
		
		final boolean result = Common.invalidRequestMethod(requestMethod, 404);
		assertEquals(result, true, "Unknown/unavailable request method: " + requestMethod);
	}
	
	// end of tests from jsonplaceholder endpoint //////////////////////////////
	
	
	// tests from reqres.in ////////////////////////////////////////////////////
	@Test
	public void getUserFound() {
		final int userID = 1;
		
		Common.getUserReqRes(userID, 200, true);
	}
	
	@Test
	public void getUserNotFound() {
		final int userID = 99;
		
		Common.getUserReqRes(userID, 404, false);
	}
	// end of tests from reqres.in ////////////////////////////////////////////////////
	 
}
