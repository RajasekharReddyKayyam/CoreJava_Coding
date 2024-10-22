package Map;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> m= new HashMap();
		m.put(1,"raj" );
		m.put(2,"shiva");
		m.put(3,"abhi");
		m.put(4,"amul");
		System.out.println(m);
		m.put(2,"raghu");//It will overide value shiva with raghu
		
		System.out.println(m);
		System.out.println(m.size());
	System.out.println(m.entrySet());	

	}

}
