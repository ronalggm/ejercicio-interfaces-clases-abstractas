package org.ronal.ejercicioInter;

public class TvLcd extends Electronico {
    int pulgadas;
    String marca;


    public TvLcd(int precio, String marca, int pulgadas) {
        super(precio);
        this.pulgadas = pulgadas;
        this.marca = marca;
    }


}
