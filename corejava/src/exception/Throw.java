package exception;
public class Throw {
	void vote(int age){
		if (age<18){
			throw new ArithmeticException();
		}
		else{
			System.out.println("welcome to vote!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Throw t=new Throw();
try{
	t.vote(18);
}catch (ArithmeticException e){
	System.out.println("Invalid voting age!");
}
System.out.println("voting is democracy!");
	}

}
