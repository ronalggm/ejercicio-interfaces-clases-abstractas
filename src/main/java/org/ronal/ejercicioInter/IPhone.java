package org.ronal.ejercicioInter;

import org.ronal.ejercicioInter.Interfaces.IElectronico;

public class IPhone extends Electronico {
    String color;
    String modelo;

    public IPhone(int precio, String modelo, String color) {
        super(precio);
        this.modelo = modelo;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


}
