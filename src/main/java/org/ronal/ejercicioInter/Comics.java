package org.ronal.ejercicioInter;

import java.util.Date;

public class Comics extends Libro {
    String personaje;

    public Comics(double precioVenta
            , Date fechaPublicacion
            , String autor
            , String titulo
            , String editorial
            , String personaje) {
        super(precioVenta
                , fechaPublicacion
                , autor
                , titulo
                , editorial);
        this.personaje = personaje;
    }

}
