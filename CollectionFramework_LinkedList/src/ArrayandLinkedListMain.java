
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ArrayandLinkedListMain {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> linkedlist  = new LinkedList<Integer>();
        ArrayList<Integer> arraylist =  new ArrayList<Integer>();
        
        zamanhesapla("LinkedList",linkedlist);
        //zamanhesapla("ArrayList",arraylist);
        
        
    }
    public static void zamanhesapla(String veri_tipi,List<Integer> list) {
        
        // Listin sonuna değer ekleme
        long baslangic;
        long bitis;
        
        baslangic = System.currentTimeMillis();//for dan onceki zaman
        
        for (int i = 0 ; i< 1000000 ; i++) {// 1 million sayiyi linked list ve arraylşste eklicez
            
            //list.add(i);// normal hali
            list.add(0,i);//baslangic a ekle duruma
            
        }
        bitis = System.currentTimeMillis();// fordan sonraki zaman
        
        System.out.println(veri_tipi + " ekleme süresi " + (bitis - baslangic) + " ms");
        
        //araylist kaydırıyor list.add(0,i) de performans kaybediyor
        //fakat linklist referens kullandıgı icin ilk ve sonrakini degistirir
        
        
    }
    
}
