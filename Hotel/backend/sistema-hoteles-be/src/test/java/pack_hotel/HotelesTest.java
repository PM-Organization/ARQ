package pack_hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class HotelesTest {

    private Hoteles hotel;

    @BeforeEach
    void setUp() {
        hotel = new Hoteles();
        hotel.setId_hotel(1L);
        hotel.setId_cadena(10L);
        hotel.setNombre("Hotel Central");
        hotel.setPais("Guatemala");
        hotel.setCiudad("Ciudad de Guatemala");
        hotel.setDireccion("Calle 10");
        hotel.setCheckin(LocalTime.of(14, 0));
        hotel.setCheckout(LocalTime.of(12, 0));
        hotel.setImagenUrl("http://example.com/hotel.jpg");
        hotel.setEstado("Activo");
    }

    @Test
    void testGettersAndSetters() {
        assertEquals(1L, hotel.getId_hotel());
        assertEquals(10L, hotel.getId_cadena());
        assertEquals("Hotel Central", hotel.getNombre());
        assertEquals("Guatemala", hotel.getPais());
        assertEquals("Ciudad de Guatemala", hotel.getCiudad());
        assertEquals("Calle 10", hotel.getDireccion());
        assertEquals(LocalTime.of(14, 0), hotel.getCheckin());
        assertEquals(LocalTime.of(12, 0), hotel.getCheckout());
        assertEquals("http://example.com/hotel.jpg", hotel.getImagenUrl());
        assertEquals("activo", hotel.getEstado());  // El estado se guarda en minúsculas
    }

    @Test
    void testEqualsAndHashCode() {
        Hoteles hotel2 = new Hoteles();
        hotel2.setId_hotel(1L);
        hotel2.setId_cadena(10L);
        hotel2.setNombre("Hotel Central");
        hotel2.setPais("Guatemala");
        hotel2.setCiudad("Ciudad de Guatemala");
        hotel2.setDireccion("Calle 10");
        hotel2.setCheckin(LocalTime.of(14, 0));
        hotel2.setCheckout(LocalTime.of(12, 0));
        hotel2.setImagenUrl("http://example.com/hotel.jpg");
        hotel2.setEstado("activo");

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
        String expected = "Hoteles{id_hotel=1, id_cadena=10, nombre=Hotel Central, pais=Guatemala, ciudad=Ciudad de Guatemala, direccion=Calle 10, checkin=14:00, checkout=12:00}";
        assertEquals(expected, hotel.toString());
    }
}
