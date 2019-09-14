
public class Multiplication extends Sum {
@Override
	public float m1() {
	System.out.println("im in multiplication m1 method");
	return 30;
}

public void mul() {
	int a=(int) super.m1();
	/*here we are typecasting to int, coz we have changed the return type 
	 * in the super class for int to float , so the code breaks
	*/
	System.out.println(a*30);
}
	
}
