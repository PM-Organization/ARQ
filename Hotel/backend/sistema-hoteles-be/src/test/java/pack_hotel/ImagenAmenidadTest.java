package pack_hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImagenAmenidadTest {

    private ImagenAmenidad imagenAmenidad;
    private Hoteles hotel;

    // Definición de constantes para valores que se repiten
    private static final Long ID_IMAGEN = 1L;
    private static final Long ID_HOTEL = 10L;
    private static final String NOMBRE_HOTEL = "Hotel Central";
    private static final String URL_IMAGEN = "http://example.com/imagen.jpg";

    @BeforeEach
    void setUp() {
        hotel = new Hoteles();
        hotel.setId_hotel(ID_HOTEL);
        hotel.setNombre(NOMBRE_HOTEL);

        imagenAmenidad = new ImagenAmenidad();
        imagenAmenidad.setIdImagen(ID_IMAGEN);
        imagenAmenidad.setHotel(hotel);
        imagenAmenidad.setUrlImagen(URL_IMAGEN);
    }

    @Test
    void testGettersAndSetters() {
        assertEquals(ID_IMAGEN, imagenAmenidad.getIdImagen());
        assertEquals(hotel, imagenAmenidad.getHotel());
        assertEquals(URL_IMAGEN, imagenAmenidad.getUrlImagen());
    }

    @Test
    void testEqualsAndHashCode() {
        ImagenAmenidad imagenAmenidad2 = new ImagenAmenidad();
        imagenAmenidad2.setIdImagen(ID_IMAGEN);
        imagenAmenidad2.setHotel(hotel);
        imagenAmenidad2.setUrlImagen(URL_IMAGEN);

        assertEquals(imagenAmenidad, imagenAmenidad2);
        assertEquals(imagenAmenidad.hashCode(), imagenAmenidad2.hashCode());
    }

    @Test
    void testNotEquals() {
        ImagenAmenidad imagenDiferente = new ImagenAmenidad();
        imagenDiferente.setIdImagen(2L);
        imagenDiferente.setUrlImagen("http://example.com/otra_imagen.jpg");

        assertNotEquals(imagenAmenidad, imagenDiferente);
    }

    @Test
    void testToString() {
        String expected = "ImagenAmenidad{idImagen=" + ID_IMAGEN + ", hotel=" + hotel.getNombre() + ", urlImagen='" + URL_IMAGEN + "'}";
        assertEquals(expected, imagenAmenidad.toString());
    }
}