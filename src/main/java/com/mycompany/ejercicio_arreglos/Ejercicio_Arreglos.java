package com.mycompany.ejercicio_arreglos;
import java.util.Scanner;

public class Ejercicio_Arreglos {
static Scanner sc = new Scanner(System.in);
    static int opc;
    static int tam = 10;
    static int[] vec = new int[tam];
    static String[] nom = new String[tam];
    static String[] ape = new String[tam];
    static double[] sal = new double[tam];
    static int[] dt = new int[tam];
    static double[] tp = new double[tam];
    public static void main(String[] args) {
        System.out.print("Digite Cantidad de Usuarios: ");
        tam = sc.nextInt();
        System.out.println("");
        System.out.println("");
        menu();
    }
    static void menu() {
        System.out.println("************vectores***********");
        System.out.println("1. capturar");
        System.out.println("2. consultar");
        System.out.println("3. modificar");
        System.out.println("4. eliminar");
        System.out.println("5. salir");
        System.out.print("Digite su opcion:  ");
        opc = sc.nextInt();
        switch (opc) {
            case 1:
                capturar();
                break;
            case 2:
                consultar();
                break;
            default:
                throw new AssertionError();
        }
    }
    static void capturar() {
        for (int i = 0; i < tam; i++) {
            System.out.println("Digite el Nombre " + i);
            nom[i] = sc.next();
            System.out.println("Digite el Apellido " + i);
            ape[i] = sc.next();
            System.out.println("Digite el Salario " + i);
            sal[i] = sc.nextDouble();
            System.out.println("Digite Días Trabajados " + i);
            dt[i] = sc.nextInt();
            /////operacion /////
            tp[i] = (sal[i] / 30) * dt[i];
        }
        menu();
    }
    static void consultar() {
    ///menu consulta
    System.out.println("******************************");
    System.out.println("     MENU CONSULTA    ");
    System.out.println("******************************");
    System.out.println("1. Consulta General");
    System.out.println("2. Consulta Individual");
    System.out.println("3. Impresión");
    System.out.println("4. Salir");
    System.out.println("Digite su opcion ");
    opc = sc.nextInt();
 
    switch (opc) {
        case 1:
            ///consulta general////
            for (int i = 0; i < tam; i++) {
                System.out.println("Empleado: " + i);
                System.out.println("Nombre: " + nom[i]);
                System.out.println("Apellido: " + ape[i]);
                System.out.println("Salario: " + sal[i]);
                System.out.println("Dias trabajados: " + dt[i]);
                System.out.println("Total a Pagar: " + tp[i]);
                System.out.println("");
            }
            consultar();
            break;
 
        case 2:
            int des;  ///inicio
            do {
                System.out.println("digite la posición a consultar: ");
                int pos = sc.nextInt();
                System.out.println("Empleado: " + pos);
                System.out.println("Nombre: " + nom[pos]);
                System.out.println("Apellido: " + ape[pos]);
                System.out.println("Salario: " + sal[pos]);
                System.out.println("Dias trabajados: " + dt[pos]);
                System.out.println("Total a Pagar: " + tp[pos]);
                System.out.println("");
                System.out.println("otra consulta?  1= si   0 = no");
                des = sc.nextInt();
            } while (des != 0); ///condicion
            consultar();
            break;
 
        case 3:
        // Línea divisoria para separar visualmente la tabla
        System.out.println("-------------------------------------------------------------");
 
        // Encabezado con menos espacios y usando tabulaciones
        // %-8s → texto con ancho mínimo de 8 caracteres
        // %-10.2f → número decimal con 2 decimales y ancho mínimo de 10
        System.out.printf("%-8s\t%-12s\t%-10s\t%-4s\t%-12s\n", 
                        "Nombre", "Apellido", "Salario", "Dt", "Total P");
 
        // Línea divisoria
        System.out.println("-------------------------------------------------------------");
 
        // Bucle para imprimir cada empleado
        for (int i = 0; i < tam; i++) {
            System.out.printf("%-8s\t%-12s\t%-10.2f\t%-4d\t%-12.2f\n", 
                            nom[i], ape[i], sal[i], dt[i], tp[i]);
        }
 
        // Línea final
        System.out.println("-------------------------------------------------------------");
 
        // Regresa al menú de consulta
        consultar();
        break;
 
    
        case 4:
            // salir al menú principal
            menu();
            break;
 
        default:
            System.out.println("Opción inválida");
            consultar();
            break;
    }
}
}
