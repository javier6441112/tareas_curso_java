/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conextion_base_datos;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class ingresar {
    String nombre;
    String apellido;
    int edad;
    double nota;
    int id_estudiantes;

    public ingresar(String nombre, String apellido, int edad, double nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public ingresar(String nombre, String apellido, int edad, double nota, int id_estudiantes) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nota = nota;
        this.id_estudiantes = id_estudiantes;
    }

    public ingresar(int id_estudiantes) {
        this.id_estudiantes = id_estudiantes;
    }

    public int getId_estudiante() {
        return id_estudiantes;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiantes = id_estudiante;
    }
public void menu (){
        
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("ver base de datos                1");
        System.out.println("crear nuevo usuario              2");
        System.out.println("modificar datos                  3");
        System.out.println("eliminar usuario                 4");
        System.out.println("++++++++++++++++++++++++++++++++++");
        
        switch ()
    
    
}
}