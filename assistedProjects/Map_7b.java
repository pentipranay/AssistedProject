package assistedProjects;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
public class Map_7b {
		public static void main(String[] args) {
			HashMap<Integer,String> hm=new HashMap<Integer,String>();      
		      hm.put(1,"Sanjay");    
		      hm.put(2,"srikanth");    
		      hm.put(3,"sreekanth");         
		      System.out.println("The elements of Hashmap are ");  
		      for(Map.Entry m:hm.entrySet()){
		       System.out.println(m.getKey()+" "+m.getValue());
		       }
		       Hashtable<Integer,String> ht=new Hashtable<Integer,String>();    
			      ht.put(4,"purna");  
			      ht.put(5,"vamshi");  
			      ht.put(6,"nitheesh");  
			      ht.put(7,"sushanth");  
			      System.out.println("\nThe elements of HashTable are ");  
			      for(Map.Entry n:ht.entrySet()){    
			       System.out.println(n.getKey()+" "+n.getValue());  
			      }
			       TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
				      map.put(8,"sai");    
				      map.put(9,"rama");    
				      map.put(10,"suddu");       
				      System.out.println("\nThe elements of TreeMap are ");  
				      for(Map.Entry l:map.entrySet()){    
				       System.out.println(l.getKey()+" "+l.getValue()); 
			      }
		      }
}
