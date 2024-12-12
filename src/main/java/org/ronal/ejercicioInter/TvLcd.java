package org.ronal.ejercicioInter;

public class TvLcd extends Electronico {
    int pulgadas;
    String marca;


    public TvLcd(int precioVenta, String marca, int pulgadas) {
        super(precioVenta);
        this.pulgadas = pulgadas;
        this.marca = marca;
    }


}
