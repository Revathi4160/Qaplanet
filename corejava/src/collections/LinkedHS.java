package collections;
import java.util.*;
public class LinkedHS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet<String> lhs=new LinkedHashSet<String>();
lhs.add("sushmita");
lhs.add("lalita");
lhs.add("mahesh");
lhs.add("revathi");
lhs.add("mahesh");

//using iterator interface...
		Iterator itr=lhs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
	}
	}
}
