class G 
{
	int i;// int i is objective member
	public static void main(String[] args) 
	{
		G g1 = new G();
		System.out.println(g1.i);
	}
}
/* 
object is a real world entity
Ex: employee, dog,chair,fan,student......
->while crting the object all the non-static members of that cls gets loaded to the memory
->in case of non-static variable they will be loaded with there default vaules
->object will stored in heap memory
*/