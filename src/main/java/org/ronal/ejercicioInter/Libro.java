package org.ronal.ejercicioInter;

import org.ronal.ejercicioInter.Interfaces.ILibro;

import java.util.Date;

public class Libro extends Producto implements ILibro {
    Date fechaPublicacion;
    String autor;
    String titulo;
    String editorial;

    public Libro(double precioVenta
            , Date fechaPublicacion
            , String autor
            , String titulo
            , String editorial){
        super(precioVenta);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;

    }

    @Override
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
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
