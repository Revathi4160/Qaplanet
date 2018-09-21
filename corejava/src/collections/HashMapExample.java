package collections;
import java.util.*;
public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(100, "Mahesh");
		hm.put(104, "Revathi");
		hm.put(103, "sushmita");
		hm.put(102, "Lalita");
		hm.put(101, "Ajesh");
		hm.put(100, "Rajesh");
		hm.put(101, "Ajay");
	
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
