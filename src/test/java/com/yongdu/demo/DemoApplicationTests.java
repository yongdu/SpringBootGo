package com.yongdu.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private ApplicationContext ctx;
	@Test
	public void contextLoads() {
		System.out.println("there are " + ctx.getBeanDefinitionCount()
								+ " beans in the application context");

		Arrays.stream(ctx.getBeanDefinitionNames()).forEachOrdered(System.out::println);
	}

}
