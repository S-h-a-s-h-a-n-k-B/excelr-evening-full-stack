class J
{
	public static void main(String[] args) 
	{
		int i = 0;
		while(i < 5)
		{
			
	        System.out.println("loop1 being: " +i);
			int j = 0;
		while(j < 5)
			{
			j++;
				 System.out.println("loop2 being: " + i +","+j);
			if(j > 1)
			{
				continue;
			}
		System.out.println("loop2 end:" + i +","+j);
			}
			System.out.println("loop1 end:" +i);
			i++;
	}
}
}
