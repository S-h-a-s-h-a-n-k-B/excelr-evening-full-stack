class C
{
	public static void main(String[] args) 
	{
		int i;
		for(i = 0; i< 10; i++)
		{
		System.out.println("loop being" + i);
		if(i > 5)
		{
			break;
		}
		System.out.println("some statements");
		}
		System.out.println("loop end" + i);
		}
		System.out.println("main end" + i);
	}
}
