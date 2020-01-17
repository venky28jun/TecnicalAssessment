package com.technical.assessment;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.technical.assessment.ButterFly.STAGE;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class AnimalTest {

	Animal bird;
	Animal caterPillar;
	Animal butterfly;

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@BeforeEach
	void init() {
		bird = new Birds();
		caterPillar = new ButterFly(STAGE.CATERPILLAR);
		butterfly = new ButterFly(STAGE.BUTTERFLY);
		System.setOut(new PrintStream(outContent));
	}

	@Nested
	class Bird{
		@Test
		@DisplayName("Animal - Bird Sing Method")
		void sing() {
			assertTrue(bird.sing());
			assertEquals("I am Singing", outContent.toString().trim());
		}

		@Test
		@DisplayName("Animal - Bird Walk Method")
		void walk() {
			assertTrue(bird.walk());
			assertEquals("I am walking", outContent.toString().trim());
		}

		@Test
		@DisplayName("Animal - Bird Fly Method")
		void fly() {
			assertTrue(bird.fly());
			assertEquals("I am flying", outContent.toString().trim());
		}

		@Test
		@DisplayName("Animal - Bird Swim Method")
		void swim() {
			assertFalse(bird.swim());
			assertEquals("I cannot swim", outContent.toString().trim());
		}

	}
	
	@Nested
	class Caterpillar {
		@Test
		@DisplayName("Animal - Caterpillar Sing Method")
		void sing() {
			assertFalse(caterPillar.sing());
			assertEquals("I cannot make sound", outContent.toString().trim());
		}

		@Test
		@DisplayName("Animal - Caterpillar Walk Method")
		void walk() {
			assertTrue(caterPillar.walk());
			assertEquals("I am walking", outContent.toString().trim());
		}

		@Test
		@DisplayName("Animal - Caterpillar Fly Method")
		void fly() {
			assertFalse(caterPillar.fly());
			assertEquals("I cannot Fly.!", outContent.toString().trim());
		}

		@Test
		@DisplayName("Animal - Caterpillar Swim Method")
		void swim() {
			assertFalse(caterPillar.swim());
			assertEquals("I cannot swim", outContent.toString().trim());
		}

	}

	// Butterfly
	////////////
	@Nested
	class Butterfly {
		@Test
		@DisplayName("Animal - Butterfly Sing Method")
		void sing() {
			assertFalse(butterfly.sing());
			assertEquals("I cannot make sound", outContent.toString().trim());
		}

		@Test
		@DisplayName("Animal - Butterfly Walk Method")
		void walk() {
			assertFalse(butterfly.walk());
			assertEquals("I cannot walk", outContent.toString().trim());
		}

		@Test
		@DisplayName("Animal - Butterfly Fly Method")
		void fly() {
			assertTrue(butterfly.fly());
			assertEquals("I am flying", outContent.toString().trim());
		}

		@Test
		@DisplayName("Animal - Butterfly Swim Method")
		void swim() {
			assertFalse(butterfly.swim());
			assertEquals("I cannot swim", outContent.toString().trim());
		}
	}

}
