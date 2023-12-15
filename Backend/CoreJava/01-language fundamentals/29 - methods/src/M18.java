class  M18
{
	public static void main(String[] args) 
	{
		System.out.println("main being");
		test();
		System.out.println("main end"); 
	}
	static void test()
	{
		System.out.println("from test being");
		if (true)
		{
		return;
		}
				System.out.println("from test end");
}
}
