
import java.util.ArrayList;
import java.util.List;


public class ArrayListMain {
    
    public static void main(String[] args) {
        
        //ArrayList<String> arraylist = new ArrayList<String>(); böyle tanimlanabilir veya list icinden implemente edilebiiri
        List<String> list = new ArrayList<String>();
        
        // Eleman Ekleme
        list.add("Java");
        list.add("Python");
        list.add("C++");
        // Elemana Erişme
        
        //System.out.println(list.get(0));
       //System.out.println(list.get(2));
       // System.out.println(list.get(4)); // Hata Verir.
        
        System.out.println("*************NORMAL FOR*****************");
        for (int i = 0 ; i < list.size();i++){
            
            System.out.println(list.get(i));//ekrana yazar     
        }
        System.out.println("**********FOR İC İLE ********************");
        
        for (String s : list) {
            System.out.println(s);
            
        }
        System.out.println("************* silme *****************");

        //list.remove("Java");//listeden siller
        list.remove(0); //javayı siler
        for (String s : list) {
            System.out.println(s);
            
        }
    }
    
}
