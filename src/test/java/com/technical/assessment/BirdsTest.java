package com.technical.assessment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class BirdsTest {
	Birds bird;

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@BeforeEach
	void init() {
		bird = new Birds();
		System.setOut(new PrintStream(outContent));
	}

	@Test
	@DisplayName("Bird Sing Method")
	void sing() {
		bird.sing();
		assertEquals("I am Singing", outContent.toString().trim());
	}
	
	@Test
	@DisplayName("Bird Walk Method")
	void walk() {
		bird.walk();
		assertEquals("I am walking", outContent.toString().trim());
	}
	
	@Test
	@DisplayName("Bird Fly Method")
	void fly() {
		bird.fly();
		assertEquals("I am flying", outContent.toString().trim());
	}

}
