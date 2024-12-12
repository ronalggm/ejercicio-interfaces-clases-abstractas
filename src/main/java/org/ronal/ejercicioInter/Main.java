package org.ronal.ejercicioInter;

import org.ronal.ejercicioInter.Interfaces.Iproducto;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Iproducto[] productos = new Producto[6];
        productos[0] = new TvLcd(20000, "Sony", 55);

        productos[1] = new Libro(560
                , new Date()
                , "peponcio mujica"
                , "no sea navo"
                , "alfaguara");
        productos[2] = new IPhone(900, "13", "amarillo");

        productos[3] = new Comics(250
                , new Date()
                , "martin goodman"
                , "super man No1"
                , "Marvel"
                ,"superman");
    }


}
