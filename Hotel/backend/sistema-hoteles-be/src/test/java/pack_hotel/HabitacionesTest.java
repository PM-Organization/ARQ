package pack_hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HabitacionesTest {

    private Habitaciones habitacion;

    @BeforeEach
    void setUp() {
        habitacion = new Habitaciones();
        habitacion.setId_habitacion(1L);
        habitacion.setId_hotel(101L);
        habitacion.setDisponible(true);
        habitacion.setNumero_habitacion(205);
        habitacion.setCapacidad_personas(4);
        habitacion.setTipo_habitacion(2);
        habitacion.setPrecioxpersona(50.0);
        habitacion.setPrecioxnoche(200.0);
        habitacion.setValuacion(5);
        habitacion.setEstado("Activo");
    }

    @Test
    void testGettersAndSetters() {
        assertEquals(1L, habitacion.getId_habitacion());
        assertEquals(101L, habitacion.getId_hotel());
        assertTrue(habitacion.isDisponible());
        assertEquals(205, habitacion.getNumero_habitacion());
        assertEquals(4, habitacion.getCapacidad_personas());
        assertEquals(2, habitacion.getTipo_habitacion());
        assertEquals(50.0, habitacion.getPrecioxpersona());
        assertEquals(200.0, habitacion.getPrecioxnoche());
        assertEquals(5, habitacion.getValuacion());
        assertEquals("Activo", habitacion.getEstado());
    }

    @Test
    void testEqualsAndHashCode() {
        Habitaciones habitacion2 = new Habitaciones();
        habitacion2.setId_habitacion(1L);
        habitacion2.setId_hotel(101L);
        habitacion2.setDisponible(true);
        habitacion2.setNumero_habitacion(205);
        habitacion2.setCapacidad_personas(4);
        habitacion2.setTipo_habitacion(2);
        habitacion2.setPrecioxpersona(50.0);
        habitacion2.setPrecioxnoche(200.0);
        habitacion2.setValuacion(5);
        habitacion2.setEstado("Activo");

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
        String expected = "Habitaciones{id_habitacion=1, id_hotel=101, disponible=true, numero_habitacion=205, capacidad_personas=4, tipo_habitacion=2, precioxpersona=50.0, precioxnoche=200.0, valuacion=5}";
        assertEquals(expected, habitacion.toString());
    }
}
