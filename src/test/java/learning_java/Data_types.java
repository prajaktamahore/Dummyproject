package learning_java;

public class Data_types {

	public static void main(String[] args) {
		
	int x=5;
	//int y=20;
	
	/*
	if(x>y) 
	{
		System.out.println("x is greater than y");
	}
	else if (y>x)
	{
		System.out.println("y is greater than x");
	}
	else {
		System.out.println( " x is equal to y");
	}	
	*/
	
	switch (x) {
	case 0:
	{ 
		System.out.println( " vaue of x =0");
		break;
	}
	case 1 :
	{
	System.out.println( "vaue of x =1");
	break;
	}
	case 2: 
	{
		System.out.println( "vaue of x =2");
		break;
	}
	default :
	{
		System.out.println("no value");
	}
	}
	
	}
	
}
