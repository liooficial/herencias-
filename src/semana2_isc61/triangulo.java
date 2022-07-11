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
public abstract class triangulo extends figura_geométrica {
    public  double lado_base;
    private  double altura;

    public triangulo(double lado_base, double altura, String color, String color_linea) {
        super(color, color_linea);
        this.lado_base = lado_base;
        this.altura = altura;
    }

    public abstract double calcularPerimetro();

    @Override
    public double calcularArea() {
       return lado_base*altura/2;
    }
   
    
}
