package pack_hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UsuariosTest {

    private Usuarios usuario;

    @BeforeEach
    void setUp() {
        usuario = new Usuarios();
        usuario.setId(1L);
        usuario.setRol(1);
        usuario.setEmail("test@example.com");
        usuario.setPassword("password123");
        usuario.setPrimer_nombre("Juan");
        usuario.setSegundo_nombre("Carlos");
        usuario.setPrimer_apellido("Pérez");
        usuario.setSegundo_apellido("Gómez");
        usuario.setFecha_nacimiento(LocalDate.of(1990, 1, 1));
        usuario.setNacionalidad("Guatemalteco");
        usuario.setPasaporte(123456789L);
    }

    @Test
    void testGettersAndSetters() {
        assertEquals(1L, usuario.getId());
        assertEquals(1, usuario.getRol());
        assertEquals("test@example.com", usuario.getEmail());
        assertEquals("password123", usuario.getPassword());
        assertEquals("Juan", usuario.getPrimer_nombre());
        assertEquals("Carlos", usuario.getSegundo_nombre());
        assertEquals("Pérez", usuario.getPrimer_apellido());
        assertEquals("Gómez", usuario.getSegundo_apellido());
        assertEquals(LocalDate.of(1990, 1, 1), usuario.getFecha_nacimiento());
        assertEquals("Guatemalteco", usuario.getNacionalidad());
        assertEquals(123456789L, usuario.getPasaporte());
    }

    @Test
    void testEqualsAndHashCode() {
        Usuarios usuario2 = new Usuarios();
        usuario2.setId(1L);
        usuario2.setRol(1);
        usuario2.setEmail("test@example.com");
        usuario2.setPassword("password123");
        usuario2.setPrimer_nombre("Juan");
        usuario2.setSegundo_nombre("Carlos");
        usuario2.setPrimer_apellido("Pérez");
        usuario2.setSegundo_apellido("Gómez");
        usuario2.setFecha_nacimiento(LocalDate.of(1990, 1, 1));
        usuario2.setNacionalidad("Guatemalteco");
        usuario2.setPasaporte(123456789L);

        assertEquals(usuario, usuario2);
        assertEquals(usuario.hashCode(), usuario2.hashCode());
    }

    @Test
    void testNotEquals() {
        Usuarios usuarioDiferente = new Usuarios();
        usuarioDiferente.setId(2L);
        usuarioDiferente.setEmail("different@example.com");

        assertNotEquals(usuario, usuarioDiferente);
    }

    @Test
    void testToString() {
        String expected = "Usuarios{id=1, rol=1, email=test@example.com, password=password123, primer_nombre=Juan, segundo_nombre=Carlos, primer_apellido=Pérez, segundo_apellido=Gómez, fecha_nacimiento=1990-01-01, nacionalidad=Guatemalteco, pasaporte=123456789}";
        assertEquals(expected, usuario.toString());
    }
}
