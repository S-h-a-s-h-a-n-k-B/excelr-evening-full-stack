class B
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < 2; i++)
		{
		System.out.println("loop1 being:" + i);
		for(int j = 0; j < 5; j++)
			{
			System.out.println("loop2 being:" + j);
			if(j > 2)
				{
    				break;
				}
				System.out.println("loop2 end:" + i);
			}
				System.out.println("loop1 end:" + i);
		}
			System.out.println("main end:");
		}
		}
