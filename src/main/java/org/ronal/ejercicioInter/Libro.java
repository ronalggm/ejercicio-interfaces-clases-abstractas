package org.ronal.ejercicioInter;

import java.util.Date;

public class Libro extends Producto {
    Date fechaPublicacion;
    String autor;
    String titulo;
    String editorial;

    public Libro(Date fechaPublicacion
            , String autor
            , String titulo
            , String editorial) {
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;

    }


    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
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
