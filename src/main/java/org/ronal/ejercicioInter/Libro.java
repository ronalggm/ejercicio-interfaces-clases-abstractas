package org.ronal.ejercicioInter;

public class Libro extends Producto {

    public Libro(int precio) {
        super(precio);
    }

    @Override
    public int getPrecio() {
        return 0;
    }

    @Override
    public double getPrecioVenta() {
        return 0;
    }
}
