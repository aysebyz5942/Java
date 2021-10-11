
package com.mycompany.harffrekans;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// bir cumlede harfler ne kadar sıklıkta gecer bulan prog
public class Main {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("cumle gir:");
        String cumle=scanner.nextLine();
        Map<Character,Integer> frekans= new TreeMap<Character,Integer>();
        
        for(int i=0;i<cumle.length();i++){
            char c=cumle.charAt(i);
            if(frekans.containsKey(c)){  // charactere sahio ise onceden 
                frekans.replace(c, frekans.get(c)+1);
            }
            else { // character once karsılasmadıysak
                frekans.put(c, 1); // character bir defa gecti
               
            }
        }
        for(Map.Entry<Character,Integer> entry: frekans.entrySet()){
            System.out.println("karakter: "+ entry.getKey() + " " +entry.getValue() + " kadar geciyor...");
        }
        
        
    }
    
}
