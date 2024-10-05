package com.digitel.digitel_smartphones;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class DigitelSmartphonesApplicationTests {

	@Test
	void contextLoads() {
	}

}
