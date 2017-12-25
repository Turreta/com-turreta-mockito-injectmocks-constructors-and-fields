package com.turreta.mockito.injectmocks.constructors_and_fields.comturretamockitoinjectmocksconstructorsandfields;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComTurretaMockitoInjectmocksConstructorsAndFieldsApplicationTests {

	@Mock
	Service1 service1;

	@Mock
	Service2 service2;

	@InjectMocks
	SomeTask someTask;

	@Test
	public void contextLoads()
	{
		someTask.execute();
	}

}
