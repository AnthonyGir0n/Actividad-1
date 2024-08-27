/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Anthony Giron
 */
public class Conexion {
    private final String puerto = "3310";
    private final String bd = "db_empresa2";
    private final String urlConexion  = String.format("jdbc:mysql://127.0.0.1:%s/%sserverTimezone=UTC",puerto,bd);
    private final String usuario = "Root";
    private final String contra = "";
    private final String jdbc = "com.mysql.cj.jdbc.Driver";
    public Connection conexionBD;
    public void abrir_conexion(){
        try{
            Class.forName(jdbc);
            conexionBD = DriverManager.getConnection(urlConexion, usuario, contra);
            System.out.println("Conexion exitosa");
        }catch (ClassNotFoundException | SQLException ex){
        System.out.println("Algo salio mal"+ex.getMessage());}
    }
    public void cerrar_conexion(){
        try{
                        conexionBD.close();

        }catch (SQLException ex){
        System.out.println("Algo salio mal"+ex.getMessage());}
    }
  //  private final String urlConexio = "jdbc:mysql://127.0.0.1:3306/db_empresa2";
    
    /*nombre del servidor 127.0.0.1
    puerto = 3306
    usuario = root
    Contrasena = 
    Driver conexion = com.mysql.cj.jdbc.Driver
    urlConexion = (cadena conexion) :
    tipo conextor (jdbc),mysql,nombre del servidor, puerto, base de datos
    */
    
    
}
