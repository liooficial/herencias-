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
public class Triangulo_isoceles extends triangulo {
    private  double lado_derecho;
    private  double lado_izquierdo;

    public Triangulo_isoceles(double lado_derecho, double lado_izquierdo, double lado_base, double altura, String color, String color_linea) {
        super(lado_base, altura, color, color_linea);
        this.lado_derecho = lado_derecho;
        this.lado_izquierdo = lado_izquierdo;
    }

    @Override
    public double calcularPerimetro() {
       return lado_derecho*2+lado_base;
    }
    
    
}
