package CollectionsBasedProject;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HashMap");
		HashMap <String,Integer> Hm= new HashMap();
		Hm.put("Ravi", 102);
		Hm.put("shiva", 109);
		Hm.put("kiran", 107);
		Hm.put("ganesh ", 110);
		Hm.put("ganesh", 122);
		
		Hm.put("Shital", 105);
		System.out.println(Hm);
		
		System.out.println("***************************************");
		LinkedHashMap<String,Integer> Lhm=  new LinkedHashMap<>();
		System.out.println("LinkedHashMap");
		Lhm.put("Ravi", 102);
		Lhm.put("shiva", 109);
		Lhm.put("kiran", 107);
		Lhm.put("ganesh ", 110);
		Lhm.put("kiran", 109);
		System.out.println(Lhm);
		System.out.println("****************************");
        System.out.println("Identity HashMap");
        IdentityHashMap<String,Integer> IHM= new IdentityHashMap<>();
        IHM.put("ravi", new Integer(4));
        IHM.put("raj", new Integer(4));
        System.out.println(IHM);
        
        System.out.println("************************************");
        System.out.println("HashTable example");
        Hashtable Ht= new Hashtable();
        
        Ht.put("ravi", 10);
        Ht.put("ravi", 11);
        Ht.put("kayyam", 9);
        System.out.println(Ht);

	}

}
