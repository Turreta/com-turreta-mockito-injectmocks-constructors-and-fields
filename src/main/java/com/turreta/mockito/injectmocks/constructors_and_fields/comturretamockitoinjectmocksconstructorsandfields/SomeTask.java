package com.turreta.mockito.injectmocks.constructors_and_fields.comturretamockitoinjectmocksconstructorsandfields;

public class SomeTask
{
	private Service1 service1;

	private Service2 service2;

	/**
	 * Comment out constructor if we want to
	 * inject all mocks directly to fields
	 * via @InjectMocks.
	 *
	 * @param service1
	 */
	public SomeTask(Service1 service1)
	{
		this.service1 = service1;
	}

	public void execute()
	{
		service1.getDataById("001");
		service2.getDataById("001");
	}
}
