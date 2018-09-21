package collections;
import java.util.*;
public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String>ht=new Hashtable<Integer,String>();
		ht.put(100, "Mahesh");
		ht.put(104, "Revathi");
		ht.put(103, "sushmita");
		ht.put(102, "Lalita");
		ht.put(101, "Ajesh");
		ht.put(100, "Rajesh");
		ht.put(101, "Ajay");
		
		for(Map.Entry m:ht.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
	}
	}
}
