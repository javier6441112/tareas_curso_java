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
public class menu {
 String nombre_menu;
    String apellido_menu;
    int edad_menu;
    double nota_menu;
    int id_estudiantes_menu;
    public void menu() {
        
         while (true) {
           estudiantesDAO es = new estudiantesDAO();
        Scanner sp = new Scanner(System.in);
             System.out.println("");
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("ver base de datos                1");
        System.out.println("crear nuevo usuario              2");
        System.out.println("modificar datos                  3");
        System.out.println("eliminar usuario                 4");
        System.out.println("salir                            5");
        System.out.println("++++++++++++++++++++++++++++++++++");

        switch (sp.nextInt()) {
            case 1:
                
               es.listar();

                break;
                
            case 2:
                System.out.println("ingrese el nombre: ");
                nombre_menu = sp.next();
               System.out.println("ingrese el apellido: " );
                apellido_menu = sp.next();
               System.out.println("ingrese la edad: ");
                edad_menu = sp.nextInt();
               System.out.println("ingrese la nota: ");
                nota_menu = sp.nextDouble();
                es.crear(new estudiantes(nombre_menu,apellido_menu,edad_menu,nota_menu));
                es.listar();

                break;
            case 3:
               es.listar();
                System.out.println("ingrese el id del estudiante a modificar: ");
                id_estudiantes_menu = sp.nextInt();
                  System.out.println("ingrese el nombre: ");
                nombre_menu = sp.next();
               System.out.println("ingrese el apellido: " );
                apellido_menu = sp.next();
               System.out.println("ingrese la edad: ");
                edad_menu = sp.nextInt();
               System.out.println("ingrese la nota: ");
                nota_menu = sp.nextDouble();
                es.modificar(new estudiantes(nombre_menu,apellido_menu,edad_menu,nota_menu,id_estudiantes_menu));
                es.listar();


                break;
            case 4:
                System.out.println("ingrese el id del estudiante a eliminar: ");
                id_estudiantes_menu = sp.nextInt();
                es.eliminar(new estudiantes(id_estudiantes_menu));
                es.listar();

                break;
                case 5:
                    System.exit(0);
                    break;

        }
         }

    }
    public static void main(String[] args) {
        menu ejecutable = new menu();
        ejecutable.menu();
    }
}
