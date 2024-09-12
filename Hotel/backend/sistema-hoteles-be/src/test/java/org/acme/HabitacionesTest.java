package org.acme;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pack_hotel.Habitaciones;

import static org.junit.jupiter.api.Assertions.*;

class HabitacionesTest {

    private Habitaciones habitacion;
    
    // Definición de constantes para valores que se repiten
    private static final Long ID_HABITACION = 1L;
    private static final Long ID_HOTEL = 101L;
    private static final boolean DISPONIBLE = true;
    private static final int NUMERO_HABITACION = 205;
    private static final int CAPACIDAD_PERSONAS = 4;
    private static final int TIPO_HABITACION = 2;
    private static final double PRECIO_POR_PERSONA = 50.0;
    private static final double PRECIO_POR_NOCHE = 200.0;
    private static final int VALUACION = 5;
    private static final String ESTADO_ACTIVO = "Activo";

    @BeforeEach
    void setUp() {
        habitacion = new Habitaciones();
        habitacion.setId_habitacion(ID_HABITACION);
        habitacion.setId_hotel(ID_HOTEL);
        habitacion.setDisponible(DISPONIBLE);
        habitacion.setNumero_habitacion(NUMERO_HABITACION);
        habitacion.setCapacidad_personas(CAPACIDAD_PERSONAS);
        habitacion.setTipo_habitacion(TIPO_HABITACION);
        habitacion.setPrecioxpersona(PRECIO_POR_PERSONA);
        habitacion.setPrecioxnoche(PRECIO_POR_NOCHE);
        habitacion.setValuacion(VALUACION);
        habitacion.setEstado(ESTADO_ACTIVO);
    }

    @Test
    void testGettersAndSetters() {
        assertEquals(ID_HABITACION, habitacion.getId_habitacion());
        assertEquals(ID_HOTEL, habitacion.getId_hotel());
        assertTrue(habitacion.isDisponible());
        assertEquals(NUMERO_HABITACION, habitacion.getNumero_habitacion());
        assertEquals(CAPACIDAD_PERSONAS, habitacion.getCapacidad_personas());
        assertEquals(TIPO_HABITACION, habitacion.getTipo_habitacion());
        assertEquals(PRECIO_POR_PERSONA, habitacion.getPrecioxpersona());
        assertEquals(PRECIO_POR_NOCHE, habitacion.getPrecioxnoche());
        assertEquals(VALUACION, habitacion.getValuacion());
        assertEquals(ESTADO_ACTIVO, habitacion.getEstado());
    }

    @Test
    void testEqualsAndHashCode() {
        Habitaciones habitacion2 = new Habitaciones();
        habitacion2.setId_habitacion(ID_HABITACION);
        habitacion2.setId_hotel(ID_HOTEL);
        habitacion2.setDisponible(DISPONIBLE);
        habitacion2.setNumero_habitacion(NUMERO_HABITACION);
        habitacion2.setCapacidad_personas(CAPACIDAD_PERSONAS);
        habitacion2.setTipo_habitacion(TIPO_HABITACION);
        habitacion2.setPrecioxpersona(PRECIO_POR_PERSONA);
        habitacion2.setPrecioxnoche(PRECIO_POR_NOCHE);
        habitacion2.setValuacion(VALUACION);
        habitacion2.setEstado(ESTADO_ACTIVO);

        assertEquals(habitacion, habitacion2);
        assertEquals(habitacion.hashCode(), habitacion2.hashCode());
    }

    @Test
    void testNotEquals() {
        Habitaciones habitacionDiferente = new Habitaciones();
        habitacionDiferente.setId_habitacion(2L);
        habitacionDiferente.setNumero_habitacion(206);

        assertNotEquals(habitacion, habitacionDiferente);
    }

    @Test
    void testToString() {
        String expected = "Habitaciones{id_habitacion=" + ID_HABITACION + ", id_hotel=" + ID_HOTEL + 
                          ", disponible=" + DISPONIBLE + ", numero_habitacion=" + NUMERO_HABITACION + 
                          ", capacidad_personas=" + CAPACIDAD_PERSONAS + ", tipo_habitacion=" + TIPO_HABITACION + 
                          ", precioxpersona=" + PRECIO_POR_PERSONA + ", precioxnoche=" + PRECIO_POR_NOCHE + 
                          ", valuacion=" + VALUACION + "}";
        assertEquals(expected, habitacion.toString());
    }
}
