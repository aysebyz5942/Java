
package postfix;
import java.awt.*; 
import java.io.*;
import java.util.*;
public class Postfix {

    public static void main(String[] args) {
        yigin metot =new yigin();
        String str="";
        int x = 0 , a=0,b=0;
        int stk[]=new int[120];
        Scanner oku = new Scanner(System.in); 
        System.out.println("\n Postfixifadeyi giriniz\n");
        str=oku.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '+'){
                b = metot.pop( stk, metot.top);
                a = metot.pop( stk, metot.top);
                metot.push( a + b, stk, metot.top);
                System.out.println("\n a+b="+ (a+b));
            }
            else if(str.charAt(i) == '-'){
                b = metot.pop( stk,metot.top);
                a = metot.pop( stk, metot.top);
                metot.push( a -b, stk,metot.top);
                System.out.println("\n a-b ="+ (a-b));
            }
            else if(str.charAt(i) == '/'){
                b = metot.pop( stk, metot.top); 
                a = metot.pop( stk, metot.top);
                metot.push( a / b, stk, metot.top);
                System.out.println("\na/b= "+ a/b);
            }
            else if(str.charAt(i) == '*'){
                b = metot.pop( stk, metot.top);
                a = metot.pop( stk, metot.top);
                metot.push( a * b, stk, metot.top);
                System.out.println("\n a*b= "+ a*b);
            }
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){  
                x =str.charAt(i)-'0';     
                metot.push( x, stk, metot.top); 
            } 
        } 
        System.out.println("\n Postfixifadesinin işlem sonucu="+ metot.pop( stk, metot.top));
            
    }
    
}
