package com.tests;

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
}
