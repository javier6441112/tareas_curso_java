/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conextion_base_datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author user
 */
public class estudiantesDAO {




    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    conexion acceso = new conexion();

    public void listar() {

        String sql = "select * from estudiante";

        try {

//           
            //Inicializa la base de datos
            con = acceso.Conectar();//accede a  la base de datos
            ps = con.prepareStatement(sql);// ejecuta la consulta
            rs = ps.executeQuery();// guarda el resultado
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " - " + rs.getString(2)+ " - " + rs.getString(3)
                + " - " + rs.getString(4)+ " - " + rs.getString(5));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void crear(estudiantes datos) {

        String sql = "insert into estudiante(nombre,apellido,edad,nota) values (?,?,?,?);";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, datos.nombre);
            ps.setString(2, datos.apellido);
            ps.setInt(3, datos.edad);
             ps.setDouble(4, datos.nota);

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void modificar(estudiantes mod) {

        String sql = "update estudiante set nombre=?, apellido=?, edad=?, nota=? where id_estudiantes =?   ;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
          
            ps.setString(1, mod.nombre);
            ps.setString(2, mod.apellido);
            ps.setInt(3, mod.edad);
            ps.setDouble(4, mod.nota);
            ps.setInt(5, mod.id_estudiantes);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void eliminar(estudiantes elim) {
        String sql = "delete from estudiante where id_estudiantes=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, elim.id_estudiantes);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

  

//    public static void main(String[] args) {
//        estudiantes es = new estudiantes();
//        
//    
//        
//
//        es.listar();
//        es.crear(new ingresar("carlos","enrique",32,70));
//        System.out.println("+++++++++++++++++++++++++++");
//        es.listar();
//        System.out.println("+++++++++++++++++++++++++++");
//        es.modificar(new ingresar("azu","vasquez",45,67,2));
//        es.listar();
//        System.out.println("+++++++++++++++++++++++++++");
//        es.eliminar(new ingresar(5));
//         es.listar();
//
//    }
}


