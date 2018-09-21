package collections;
import java.util.*;
public class HashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> hs=new HashSet<String>();
	hs.add("sushmita");
	hs.add("lalita");
	hs.add("mahesh");
	hs.add("revathi");
	hs.add("mahesh");
	Iterator itr=hs.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}
}