import java.util.*; 
public class GFG
{ 
public static void main(String args[]) 
{ 
HashSet fSet = new HashSet(); 
fSet.add("Raju"); 
fSet.add("Sonu"); 
fSet.add("Moni"); 
fSet.add("Radha"); 
System.out.println("Original HashSet: "+ fSet); 
List list = new ArrayList( fSet); 
Collections.sort(list); 
 System.out.println("HashSet elements " + "in sorted order using List: "+ list); 
} 
}
