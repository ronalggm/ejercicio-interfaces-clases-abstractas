package org.ronal.ejercicioInter;

import org.ronal.ejercicioInter.Interfaces.Iproducto;

abstract class Producto implements Iproducto {
    private int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int GetPrecio() {
        return this.precio;
    }
}
