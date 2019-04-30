package com.epam.assignment2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFirst2CharsA {
	
	First2CharsA f2a;
	@BeforeEach
	void init() {
		f2a = new First2CharsA();
	}
	@Test
	void test() {
		String str = f2a.getFirst2Chars("AAunivercity");
		assertEquals("AA", str);
	}

}
