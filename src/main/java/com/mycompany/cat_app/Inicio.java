/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cat_app;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class Inicio {
    public static void main(String[] args) {
        int opcion_menu = -1;
        String[] botones={
        "1. ver gatos",
        "2. salir"
        };
        
        do{
            String opcion = (String) JOptionPane.showInputDialog(null,"Gatitos java","menu principal", JOptionPane.INFORMATION_MESSAGE,null, botones, botones[0]);
            
        }while(opcion_menu != 1);
        
        
    }
}
