package org.ronal.ejercicioInter;

public class IPhone extends Electronico {
String color;
String modelo;

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

    @Override
    public String getFabricante() {
        return "";
    }
}
