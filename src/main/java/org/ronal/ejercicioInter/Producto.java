package org.ronal.ejercicioInter;

import org.ronal.ejercicioInter.Interfaces.Iproducto;

abstract class Producto implements Iproducto {
    private int precio;
    private double precioVenta;

    public Producto(double precioVenta) {
        this.precioVenta = precioVenta;
    }


    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return this.precio;
    }

    @Override
    public double getPrecioVenta() {
        return this.precioVenta;
    }

}
