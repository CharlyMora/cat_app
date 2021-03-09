/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cat_app;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class Inicio {
    public static void main(String[] args) throws IOException {
        int opcion_menu = -1;
        String[] botones={
        "1. ver gatos",
        "2. salir"
        };
        
        do{
            String opcion = (String) JOptionPane.showInputDialog(null,"Gatitos java","menu principal", JOptionPane.INFORMATION_MESSAGE,
                    null, botones, botones[0]);
            
            for(int i =0; i<botones.length; i++){
                if(opcion.equals(botones[i])){
                    opcion_menu=i;
                }
            }
            
            switch(opcion_menu){
                case 0:
                    GatosService.verGatos();
                    break;
                default:
                    break;
            }
        }while(opcion_menu != 1);
        
        
    }
}
