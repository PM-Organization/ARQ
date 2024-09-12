package org.acme;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pack_hotel.Tipos_habitacion;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TiposhabitacionTest {

    private Tipos_habitacion tiposHabitacion;

    // Definición de constantes
    private static final Long ID_TIPO = 1L;
    private static final String TIPO_HABITACION = "Deluxe";
    private static final String IMAGEN_URL = "http://example.com/deluxe.jpg";
    private static final List<String> URLS_IMAGENES = List.of("http://example.com/img1.jpg", "http://example.com/img2.jpg");

    @BeforeEach
    void setUp() {
        tiposHabitacion = new Tipos_habitacion();
        tiposHabitacion.setId_tipo(ID_TIPO);
        tiposHabitacion.setTipo(TIPO_HABITACION);
        tiposHabitacion.setImagenUrl(IMAGEN_URL);
        tiposHabitacion.actualizarUrlsImagenes(new ArrayList<>(URLS_IMAGENES));
    }

    @Test
    void testGettersAndSetters() {
        assertEquals(ID_TIPO, tiposHabitacion.getId_tipo());
        assertEquals(TIPO_HABITACION, tiposHabitacion.getTipo());
        assertEquals(IMAGEN_URL, tiposHabitacion.getImagenUrl());
    }

    @Test
    void testEqualsAndHashCode() {
        Tipos_habitacion otroTipoHabitacion = new Tipos_habitacion();
        otroTipoHabitacion.setId_tipo(ID_TIPO);
        otroTipoHabitacion.setTipo(TIPO_HABITACION);

        assertEquals(tiposHabitacion, otroTipoHabitacion);
        assertEquals(tiposHabitacion.hashCode(), otroTipoHabitacion.hashCode());
    }

    @Test
    void testNotEquals() {
        Tipos_habitacion tipoHabitacionDiferente = new Tipos_habitacion();
        tipoHabitacionDiferente.setId_tipo(2L);
        tipoHabitacionDiferente.setTipo("Standard");

        assertNotEquals(tiposHabitacion, tipoHabitacionDiferente);
    }

    @Test
    void testToString() {
        String expected = "Tipos_habitacion{id_tipo=" + ID_TIPO + ", tipo='" + TIPO_HABITACION + "'}";
        assertEquals(expected, tiposHabitacion.toString());
    }
}