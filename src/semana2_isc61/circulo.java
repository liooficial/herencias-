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
public class circulo extends figura_geométrica{
  private double radio;
  public static final double pi=3.1416;

    public circulo(double radio, String color, String color_linea) {
        super(color, color_linea);
        this.radio = radio;
    }
  
    @Override
    public double calcularPerimetro() {
        return (pi*radio)*2 ;
    }

    @Override
    public double calcularArea() {
        return pi*radio*radio;
    }
}
