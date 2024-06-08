package Java_Interview;
import java.util.HashMap;
import java.util.Iterator;
class Write {
 public static void main(String[] args) {
    
    String name = "Sireesha Sappanna";
    String str = name.replaceAll("\\s","");
    
 
    
    HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
     for(int i=0; i<str.length() ; i++)
     {
         char key = str.charAt(i);
         if(!hmap.containsKey(key))
         {
             hmap.put(key,1);
         }
         else
         {
             int value = hmap.get(key);
             hmap.put(key,value+1);
         }
     }
     
     
     
     for(int i=0;i<str.length();i++)
     {
     HashMap<Character, Integer> hmap2 = new HashMap<Character,Integer>();
     
     char key = str.charAt(i);
     if(!hmap2.containsKey(key))
     {
     hmap2.put(key,1);
     System.out.print(str.charAt(i));
     System.out.print(hmap.get(str.charAt(i)));
         
     }
     else
     {
           int value = hmap2.get(key);
             hmap2.put(key,value+1);
     }
     
     
    }
     
     
    
    
    
    
 }
}