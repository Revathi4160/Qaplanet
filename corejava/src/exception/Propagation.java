package exception;
public class Propagation {
void a(){
	int x=10;
	System.out.println(x/0);
}
void b(){
	a();
}
void c(){
	b();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Propagation p=new Propagation();
try{
p.c();
	}catch(Exception e){
System.out.println(e);
}
	}
}
