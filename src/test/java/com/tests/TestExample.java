package com.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import com.common.Common;

public class TestExample {
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
	 
}
