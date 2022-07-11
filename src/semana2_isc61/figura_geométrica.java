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
public abstract class figura_geométrica {
    private  String color;
    private  String color_linea;

    public figura_geométrica(String color, String color_linea) {
        this.color = color;
        this.color_linea = color_linea;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor_linea() {
        return color_linea;
    }

    public void setColor_linea(String color_linea) {
        this.color_linea = color_linea;
    }
    
    public abstract double  calcularPerimetro();
    
    public abstract double  calcularArea();
}
