
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class MapMain {
    
    public static void mapYazdir(Map<Integer,String> map) {

        map.put(10, "C++");
        map.put(5, "Java");
        map.put(1, "Python");
        map.put(2, "Php");
        map.put(100, "C");
        
        /*for (Map.Entry<Integer,String> entry : map.entrySet()) {//set cinsinden bastırma işlemi gerçekleşir
            
            System.out.println("Key : " + entry.getKey() + "Value : " + entry.getValue());
                                         //key yazdırır
        }*/
        
        //System.out.println(map.keySet()); //SADECE ANAHTAR DEGERLER YAZILIR
        
        /*for (Integer key : map.keySet()){
            
            System.out.println("Key : " + key + " Value: " + map.get(key));
            
        }*/
        
        Collection<String> values = map.values(); //referens olustur //anainterface tir methodlar collection dan alır
                                   //map.value() sadece value lar alır
        
        for (String s: values) {
            System.out.println("Değer : " + s);
            
        }
        
        
        
    }
    public static void main(String[] args) {
        Map<Integer,String> hashmap = new HashMap<Integer,String>();
        Map<Integer,String> linkedhashmap = new LinkedHashMap<Integer,String>();
        Map<Integer,String> treemap = new TreeMap<Integer,String>();
        
        System.out.println("********HASHMAP**********");
        mapYazdir(hashmap);
        System.out.println("******************");
        System.out.println("********LİNKEDHASHMAP**********");
        mapYazdir(linkedhashmap);
        System.out.println("******************");
        System.out.println("**********TREEMAP********");
        mapYazdir(treemap);
        System.out.println("******************");
        
    }
}
