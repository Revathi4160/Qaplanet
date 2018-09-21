package collections;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>al=new ArrayList<String>();
al.add("Mahesh");
al.add("susmitha");
al.add("revathi");
al.add("ajesh");
al.add("Mahesh");
/*for(String s:al){
	System.out.println(s);
}*/
Iterator itr=al.iterator();
while(itr.hasNext()){
	System.out.println(itr.next());
}
	}

}
