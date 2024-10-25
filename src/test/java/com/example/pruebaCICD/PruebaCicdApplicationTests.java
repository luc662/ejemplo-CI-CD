package com.example.pruebaCICD;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PruebaCicdApplicationTests {

	@Test
	public void testAlwaysPasses() {
		// Este test siempre pasará
		assertTrue(true, "This test always passes!");
	}

}
