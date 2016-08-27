package com.my.template.util;

import javax.annotation.Resource;

import com.my.template.common.Testing;

public class TestingUtil {

	@Resource Testing testing;
	public void testUtil(){
		testing.test();
	}
}
