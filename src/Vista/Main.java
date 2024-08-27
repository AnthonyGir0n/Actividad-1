/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;
import modelo.Conexion;

/**
 *
 * @author Anthony Giron
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //  frm_personas frm = new frm_personas();
       // frm.show();
       Conexion cn = new Conexion();
       cn.abrir_conexion();
       cn.cerrar_conexion();
    }
    
}
