package pack_hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UsuariosTest {

    private Usuarios usuario;

    // Definición de constantes para valores que se repiten
    private static final Long ID_USUARIO = 1L;
    private static final int ROL = 1;
    private static final String EMAIL = "test@example.com";
    private static final String PASSWORD = "password123";
    private static final String PRIMER_NOMBRE = "Juan";
    private static final String SEGUNDO_NOMBRE = "Carlos";
    private static final String PRIMER_APELLIDO = "Pérez";
    private static final String SEGUNDO_APELLIDO = "Gómez";
    private static final LocalDate FECHA_NACIMIENTO = LocalDate.of(1990, 1, 1);
    private static final String NACIONALIDAD = "Guatemalteco";
    private static final Long PASAPORTE = 123456789L;

    @BeforeEach
    void setUp() {
        usuario = new Usuarios();
        usuario.setId(ID_USUARIO);
        usuario.setRol(ROL);
        usuario.setEmail(EMAIL);
        usuario.setPassword(PASSWORD);
        usuario.setPrimer_nombre(PRIMER_NOMBRE);
        usuario.setSegundo_nombre(SEGUNDO_NOMBRE);
        usuario.setPrimer_apellido(PRIMER_APELLIDO);
        usuario.setSegundo_apellido(SEGUNDO_APELLIDO);
        usuario.setFecha_nacimiento(FECHA_NACIMIENTO);
        usuario.setNacionalidad(NACIONALIDAD);
        usuario.setPasaporte(PASAPORTE);
    }

    @Test
    void testGettersAndSetters() {
        assertEquals(ID_USUARIO, usuario.getId());
        assertEquals(ROL, usuario.getRol());
        assertEquals(EMAIL, usuario.getEmail());
        assertEquals(PASSWORD, usuario.getPassword());
        assertEquals(PRIMER_NOMBRE, usuario.getPrimer_nombre());
        assertEquals(SEGUNDO_NOMBRE, usuario.getSegundo_nombre());
        assertEquals(PRIMER_APELLIDO, usuario.getPrimer_apellido());
        assertEquals(SEGUNDO_APELLIDO, usuario.getSegundo_apellido());
        assertEquals(FECHA_NACIMIENTO, usuario.getFecha_nacimiento());
        assertEquals(NACIONALIDAD, usuario.getNacionalidad());
        assertEquals(PASAPORTE, usuario.getPasaporte());
    }

    @Test
    void testEqualsAndHashCode() {
        Usuarios usuario2 = new Usuarios();
        usuario2.setId(ID_USUARIO);
        usuario2.setRol(ROL);
        usuario2.setEmail(EMAIL);
        usuario2.setPassword(PASSWORD);
        usuario2.setPrimer_nombre(PRIMER_NOMBRE);
        usuario2.setSegundo_nombre(SEGUNDO_NOMBRE);
        usuario2.setPrimer_apellido(PRIMER_APELLIDO);
        usuario2.setSegundo_apellido(SEGUNDO_APELLIDO);
        usuario2.setFecha_nacimiento(FECHA_NACIMIENTO);
        usuario2.setNacionalidad(NACIONALIDAD);
        usuario2.setPasaporte(PASAPORTE);

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
        String expected = "Usuarios{id=" + ID_USUARIO + ", rol=" + ROL + ", email=" + EMAIL +
                ", password=" + PASSWORD + ", primer_nombre=" + PRIMER_NOMBRE +
                ", segundo_nombre=" + SEGUNDO_NOMBRE + ", primer_apellido=" + PRIMER_APELLIDO +
                ", segundo_apellido=" + SEGUNDO_APELLIDO + ", fecha_nacimiento=" + FECHA_NACIMIENTO +
                ", nacionalidad=" + NACIONALIDAD + ", pasaporte=" + PASAPORTE + "}";
        assertEquals(expected, usuario.toString());
    }
}