class M33
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
		 static int test()
	{
		System.out.println("from test being");
		boolean b = true;
		if (b)
		{
			return 100;
		}
		System.out.println("from test end");
		return 200;
	}
}
