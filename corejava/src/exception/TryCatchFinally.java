package exception;
public class TryCatchFinally {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
try{
	System.out.println(a/0);
	}
	/*catch(ArithmeticException e){
		System.out.println("Cannot divide a number by 0..");
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println(e);
	}
	catch(IllegalStateException e){
		System.out.println(e);
	}
	catch(NullPointerException e){
		System.out.println(e);
	}*/
	catch(Exception e){
		System.out.println(e);
	}
	finally{
		System.out.println("Executing the finally block!");
	}
	System.out.println("Hello");
	System.out.println("Selenium");

	}

}
