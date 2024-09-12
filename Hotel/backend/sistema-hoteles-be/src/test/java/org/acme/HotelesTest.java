package org.acme;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pack_hotel.Hoteles;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class HotelesTest {

    private Hoteles hotel;

    // Definición de constantes para los valores que se repiten
    private static final Long ID_HOTEL = 1L;
    private static final Long ID_CADENA = 10L;
    private static final String NOMBRE_HOTEL = "Hotel Central";
    private static final String PAIS = "Guatemala";
    private static final String CIUDAD = "Ciudad de Guatemala";
    private static final String DIRECCION = "Calle 10";
    private static final LocalTime CHECKIN_TIME = LocalTime.of(14, 0);
    private static final LocalTime CHECKOUT_TIME = LocalTime.of(12, 0);
    private static final String IMAGEN_URL = "http://example.com/hotel.jpg";
    private static final String ESTADO_ACTIVO = "Activo";

    @BeforeEach
    void setUp() {
        hotel = new Hoteles();
        hotel.setId_hotel(ID_HOTEL);
        hotel.setId_cadena(ID_CADENA);
        hotel.setNombre(NOMBRE_HOTEL);
        hotel.setPais(PAIS);
        hotel.setCiudad(CIUDAD);
        hotel.setDireccion(DIRECCION);
        hotel.setCheckin(CHECKIN_TIME);
        hotel.setCheckout(CHECKOUT_TIME);
        hotel.setImagenUrl(IMAGEN_URL);
        hotel.setEstado(ESTADO_ACTIVO);
    }

    @Test
    void testGettersAndSetters() {
        assertEquals(ID_HOTEL, hotel.getId_hotel());
        assertEquals(ID_CADENA, hotel.getId_cadena());
        assertEquals(NOMBRE_HOTEL, hotel.getNombre());
        assertEquals(PAIS, hotel.getPais());
        assertEquals(CIUDAD, hotel.getCiudad());
        assertEquals(DIRECCION, hotel.getDireccion());
        assertEquals(CHECKIN_TIME, hotel.getCheckin());
        assertEquals(CHECKOUT_TIME, hotel.getCheckout());
        assertEquals(IMAGEN_URL, hotel.getImagenUrl());
        assertEquals(ESTADO_ACTIVO.toLowerCase(), hotel.getEstado());  // El estado se guarda en minúsculas
    }

    @Test
    void testEqualsAndHashCode() {
        Hoteles hotel2 = new Hoteles();
        hotel2.setId_hotel(ID_HOTEL);
        hotel2.setId_cadena(ID_CADENA);
        hotel2.setNombre(NOMBRE_HOTEL);
        hotel2.setPais(PAIS);
        hotel2.setCiudad(CIUDAD);
        hotel2.setDireccion(DIRECCION);
        hotel2.setCheckin(CHECKIN_TIME);
        hotel2.setCheckout(CHECKOUT_TIME);
        hotel2.setImagenUrl(IMAGEN_URL);
        hotel2.setEstado(ESTADO_ACTIVO.toLowerCase());

        assertEquals(hotel, hotel2);
        assertEquals(hotel.hashCode(), hotel2.hashCode());
    }

    @Test
    void testNotEquals() {
        Hoteles hotelDiferente = new Hoteles();
        hotelDiferente.setId_hotel(2L);
        hotelDiferente.setNombre("Hotel Sur");

        assertNotEquals(hotel, hotelDiferente);
    }

    @Test
    void testToString() {
        String expected = "Hoteles{id_hotel=" + ID_HOTEL + ", id_cadena=" + ID_CADENA + 
                          ", nombre=" + NOMBRE_HOTEL + ", pais=" + PAIS + 
                          ", ciudad=" + CIUDAD + ", direccion=" + DIRECCION + 
                          ", checkin=" + CHECKIN_TIME + ", checkout=" + CHECKOUT_TIME + "}";
        assertEquals(expected, hotel.toString());
    }
}