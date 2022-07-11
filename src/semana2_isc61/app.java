/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2_isc61;


/**
 *
 * @author liooficial
 */
import java.util.Scanner;
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int s;
        do {
         s=imprimir_menu();
         }while (s !=3);       
                
                
    }
    public static int imprimir_menu(){
        int i;
        String color,color_linea;
        Scanner sc = new Scanner(System.in);
        System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>> ");
        System.out.println("<<menu de  opciones>> ");
        System.out.println("0)circulo");
        System.out.println("1)cuadrado");
        System.out.println("2)triangulo");
        System.out.println("3)salir");
        i=sc.nextInt();
        switch(i) {
            case 0:
                double radio;
                System.out.println("medida de radio:");
                radio=sc.nextDouble();
                System.out.println("color:");
                color=sc.next();
                System.out.println("color de  linea:");
                color_linea=sc.next();
                circulo c =new circulo(radio,color,color_linea);
                imprimircalculos(c);
            break;
            case 1:
                double lado;
                System.out.println("medida de lado:");
                radio=sc.nextDouble();
                System.out.println("color:");
                color=sc.next();
                System.out.println("color de  linea:");
                color_linea=sc.next();
                cuadrado cu= new cuadrado(radio,color,color_linea);
                imprimircalculos(cu);
              
            break;
            case 2:
                imprimir_menu_Triangulo();
            break;
            case 3:
            System.out.println("gracias por ocupar el programa");
            break;
            default:
            System.out.println("opcion invalida");
           
        }
        return i;
    }
    public static void imprimir_menu_Triangulo(){
        int i;
        double lado_base,altura;
         String color,color_linea;
        do {
        Scanner sc = new Scanner(System.in);
         double lado_derecho,lado_izquierdo;
        System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>> ");
        System.out.println("<<menu de  opciones>> ");
        System.out.println("0)Isoseles");
        System.out.println("1)Escaleno");
        System.out.println("2)Equilatero");
        System.out.println("3)regresar");
        i=sc.nextInt();
        switch(i) {
            case 0:
                System.out.println("medida de lado base:");
                lado_base=sc.nextDouble();
                System.out.println("medida de la altura:");
                altura=sc.nextDouble();
                System.out.println("medida de lado derecho:");
                lado_derecho=sc.nextDouble();
                lado_izquierdo=lado_derecho;
                System.out.println("color:");
                color=sc.toString();
                System.out.println("color de  linea:");
                color_linea=sc.toString();
                Triangulo_isoceles ti= new Triangulo_isoceles(lado_derecho,lado_izquierdo,lado_base,altura,color,color_linea);
                imprimircalculos(ti);
            break;
            case 1:
                System.out.println("medida de lado base:");
                lado_base=sc.nextDouble();
                System.out.println("medida de la altura:");
                altura=sc.nextDouble();
                System.out.println("medida de lado derecho:");
                lado_derecho=sc.nextDouble();
                System.out.println("medida de lado izquierdo:");
                lado_izquierdo=sc.nextDouble();
                System.out.println("color:");
                color=sc.toString();
                System.out.println("color de  linea:");
                color_linea=sc.toString();
                Triangulo_Escaleno te= new Triangulo_Escaleno(lado_derecho,lado_izquierdo,lado_base,altura,color,color_linea);
                imprimircalculos(te);
            break;
            case 2:
                System.out.println("medida de lado base:");
                lado_base=sc.nextDouble();
                System.out.println("medida de la altura:");
                altura=sc.nextDouble();
                lado_derecho=lado_base;
                lado_izquierdo=lado_base;
                System.out.println("color:");
                color=sc.toString();
                System.out.println("color de  linea:");
                color_linea=sc.toString();
                Triangulo_rectrangulo tE= new Triangulo_rectrangulo(lado_derecho,lado_izquierdo,lado_base,altura,color,color_linea);
                imprimircalculos(tE);
            break;
            case 3:
            System.out.println("gracias por ocupar el programa");
            break;
            default:
            System.out.println("opcion invalida");
           
        }
       }while (i==3);  
    }
    public static void imprimircalculos(figura_geométrica c){
        System.out.println("perimetro: "+ c.calcularPerimetro());
        System.out.println("area: "+ c.calcularArea());
    }
}
