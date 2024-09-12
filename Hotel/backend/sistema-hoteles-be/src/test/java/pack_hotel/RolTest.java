package pack_hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RolTest {

    private Rol rol;

    // Definición de constantes
    private static final Long ID_ROL = 1L;
    private static final String TIPO_ROL = "Admin";

    @BeforeEach
    void setUp() {
        rol = new Rol();
        rol.setIdRol(ID_ROL);
        rol.setTipo(TIPO_ROL);
    }

    @Test
    void testGettersAndSetters() {
        assertEquals(ID_ROL, rol.getIdRol());
        assertEquals(TIPO_ROL, rol.getTipo());
    }

    @Test
    void testEqualsAndHashCode() {
        Rol rol2 = new Rol();
        rol2.setIdRol(ID_ROL);
        rol2.setTipo(TIPO_ROL);

        assertEquals(rol, rol2);
        assertEquals(rol.hashCode(), rol2.hashCode());
    }

    @Test
    void testNotEquals() {
        Rol rolDiferente = new Rol();
        rolDiferente.setIdRol(2L);
        rolDiferente.setTipo("User");

        assertNotEquals(rol, rolDiferente);
    }

    @Test
    void testToString() {
        String expected = "Rol [idRol=" + ID_ROL + ", tipo=" + TIPO_ROL + "]";
        assertEquals(expected, rol.toString());
    }
}