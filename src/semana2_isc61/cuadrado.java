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
public class cuadrado extends figura_geométrica {
    private double lado;

    public cuadrado(double lado, String color, String color_linea) {
        super(color, color_linea);
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado*4 ;
    }

    @Override
    public double calcularArea() {
         return lado*lado;
    }
}
