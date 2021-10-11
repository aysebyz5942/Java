/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uzay_oyunu;

import java.awt.HeadlessException;
import javax.swing.JFrame;


public class oyunEkranı extends JFrame {

    public oyunEkranı(String title) throws HeadlessException {
        super(title);
    }
    
    
    public static void main(String[] args){
        oyunEkranı ekran= new oyunEkranı("uzay oyunu");
        ekran.setResizable(false);
        ekran.setFocusable(false);
        ekran.setSize(800, 600);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Oyun oyun= new Oyun();
        oyun.requestFocus();
        oyun.addKeyListener(oyun);//klaviyeden islem alır
        oyun.setFocusable(true);
        oyun.setFocusTraversalKeysEnabled(false);//klavye icin lazım
        
        ekran.add(oyun);
        ekran.setVisible(true);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
