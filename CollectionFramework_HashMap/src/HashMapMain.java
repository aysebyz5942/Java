
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class HashMapMain {
    
    /*
    HashMap Sınıfı
    
    1. Değerleri Key(Anahtar) ve Value(Değer) olarak depolar. Her key'e karşılık
    gelen bir tane değer bulunur.
    2. Bir anahtar sadece bir kez varolabilir. Ancak bir değer birden fazla olabilir.
    3. Elementleri tıpkı HashSet gibi ekleme sırasına göre depolamaz. (HashSet gibi)
    
    
    
    */
    public static void main(String[] args) {
        
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        
        hashMap.put(10,"Java");//ekleme key:10 value:java
        hashMap.put(30,"Python");
        hashMap.put(50,"Php");
        hashMap.put(20, "Php");
        hashMap.put(20,"Php");//degismez 
        hashMap.put(50, "Javascript");//50 ye karsılık gelen php yı siler ve yerine javascript yazar

        //System.out.println(list);
        /*System.out.println(hashMap);
        
        System.out.println(hashMap.get(50));
        System.out.println(hashMap.get(10));
        System.out.println(hashMap.get(100));*/// value yokk
        
        for (Map.Entry<Integer,String> entry : hashMap.entrySet()){ //entry icerisindeki getkey ve get value kullanılabilir
            
            System.out.println("Anahtar : " + entry.getKey() + " ------> Değer: " + entry.getValue());
        }
 
    }
}
