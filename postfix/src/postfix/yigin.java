
package postfix;
import java.awt.*; 
import java.io.*;
import java.util.*;

public class yigin {
    public int top=0;
    public void push( int x, int a[], int top){ 
        a[top] = x;
        ++top; 
        this.top=top;
    } 
    public int pop( int a[], int top){
        --top;       
        this.top=top; 
        return a[top]; 
    }
}
