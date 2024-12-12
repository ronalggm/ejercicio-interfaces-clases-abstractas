package org.ronal.ejercicioInter;

import org.ronal.ejercicioInter.Interfaces.IElectronico;

abstract class Electronico extends Producto implements IElectronico {
    String fabricante;

    public Electronico(double precioVenta) {
        super(precioVenta);
    }

    @Override
    public String getFabricante() {
        return "Fabricante:" + this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
