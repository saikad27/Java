import java.util.*;
class Sample{
	public static void main(String[] args){
		
		HashMap hm1 = new HashMap();
		hm1.put("key1","val1");
		hm1.put("key2","val2");
		hm1.put("key3","val3");
		hm1.put("key4","val4");
		
		HashMap hm2 = new HashMap();
		hm2.put("key1","val1");
		hm2.put("key2","val2");
		hm2.put("key3","val3");
		hm2.put("key4","val4");
		
		System.out.println(hm1.equals(hm2));
	}
}
