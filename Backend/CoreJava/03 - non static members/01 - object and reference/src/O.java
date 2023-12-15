class O
{
	int i;
	public static void main(String[] args) 
	{
		O o1 = new O();
		O o2 = o1;
		O o3 = o2;
		O o4 = o3;
		System.out.println(o1.i);
		System.out.println(o2.i);
		System.out.println(o3.i);
		System.out.println(o4.i);
		System.out.println("-------");
		o1.i = 10;
		System.out.println(o1.i);
		System.out.println(o2.i);
		System.out.println(o3.i);
		System.out.println(o4.i);
		System.out.println("-------");
		o2.i  = 20;
       System.out.println(o1.i);
		System.out.println(o2.i);
		System.out.println(o3.i);
		System.out.println(o4.i);
		System.out.println("-------");
		o3.i = 30;
		System.out.println(o1.i);
		System.out.println(o2.i);
		System.out.println(o3.i);
		System.out.println(o4.i);
		System.out.println("-------");
		o4.i = 40;
		System.out.println(o1.i);
		System.out.println(o2.i);
		System.out.println(o3.i);
		System.out.println(o4.i);
		System.out.println("done");
	}
}
/*
-->if an object has at least one referene we call that object as live objcet
-->if an object deosn't have at least one refernce then we call that object as dead object
-->changes made through one refernce would be reflecting to all the references which are pointing to the same object
-->one refernce can only point to one object at ha time but one object can be refered by multiple references
*/
