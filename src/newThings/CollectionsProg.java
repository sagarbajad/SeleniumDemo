package newThings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionsProg {

public static void main(String[] args) {	
	
	ArrayList <String> a=new ArrayList<String>();
	a.add("Sagar");
	a.add("Sagar");
	a.add("bajad");
	System.out.println(a);
	a.add(0, "Mr.");
	System.out.println(a); //[Mr., Sagar, Sagar, bajad]
	a.remove(1);
	System.out.println(a); // [Mr., Sagar, bajad]

	System.out.println(a.get(2));
	System.out.println(a.contains("Testing"));
	System.out.println(a.indexOf("Sagar"));
	System.out.println(a.isEmpty());
	System.out.println(a.size());

	HashSet<String> h=new HashSet<String>();
	h.add("India");
	h.add("US");
	h.add("UK");
	h.add("Africa");
	h.add("India");
	System.out.println(h); //[UK, Africa, US, India]
	System.out.println(h.size()); //4

	Iterator<String> i=h.iterator(); //to traverse
	System.out.println(i.next()); //UK
	System.out.println(i.next()); //Africa

	while(i.hasNext()) {
		
	System.out.println(i.next());
	
}

/*UK
Africa
US
India
*/

	HashMap<Integer, String> hm=new HashMap<Integer, String>();
	hm.put(0,"Sagar");
	hm.put(1,"Bitti");
	hm.put(2,"Goli");
	System.out.println(hm);
	System.out.println(hm.get(2));

	Set s=hm.entrySet();
	Iterator it=s.iterator();
	while(it.hasNext()) {
	Map.Entry mp=((Map.Entry)(it.next()));
	System.out.println(mp.getKey());
	System.out.println(mp.getValue());
}

}
		
}
