package pack_hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class RegistroBusquedaTest {

    private RegistroBusqueda registroBusqueda;

    // Definición de constantes
    private static final Long ID = 1L;
    private static final String PARAMETROS_BUSQUEDA = "pais=Guatemala";
    private static final Long USUARIO_ID = 101L;
    private static final LocalDateTime FECHA_HORA = LocalDateTime.now();
    private static final String TIPO_ACCESO = "Web";
    private static final boolean ES_AUTENTICADO = true;

    @BeforeEach
    void setUp() {
        registroBusqueda = new RegistroBusqueda();
        registroBusqueda.setId(ID);
        registroBusqueda.setParametrosBusqueda(PARAMETROS_BUSQUEDA);
        registroBusqueda.setUsuarioId(USUARIO_ID);
        registroBusqueda.setFechaHora(FECHA_HORA);
        registroBusqueda.setTipoAcceso(TIPO_ACCESO);
        registroBusqueda.setEsAutenticado(ES_AUTENTICADO);
    }

    @Test
    void testGettersAndSetters() {
        assertEquals(ID, registroBusqueda.getId());
        assertEquals(PARAMETROS_BUSQUEDA, registroBusqueda.getParametrosBusqueda());
        assertEquals(USUARIO_ID, registroBusqueda.getUsuarioId());
        assertEquals(FECHA_HORA, registroBusqueda.getFechaHora());
        assertEquals(TIPO_ACCESO, registroBusqueda.getTipoAcceso());
        assertTrue(registroBusqueda.getEsAutenticado());
    }

    @Test
    void testEqualsAndHashCode() {
        RegistroBusqueda registroBusqueda2 = new RegistroBusqueda();
        registroBusqueda2.setId(ID);
        registroBusqueda2.setParametrosBusqueda(PARAMETROS_BUSQUEDA);
        registroBusqueda2.setUsuarioId(USUARIO_ID);
        registroBusqueda2.setFechaHora(FECHA_HORA);
        registroBusqueda2.setTipoAcceso(TIPO_ACCESO);
        registroBusqueda2.setEsAutenticado(ES_AUTENTICADO);

        assertEquals(registroBusqueda, registroBusqueda2);
        assertEquals(registroBusqueda.hashCode(), registroBusqueda2.hashCode());
    }

    @Test
    void testNotEquals() {
        RegistroBusqueda registroDiferente = new RegistroBusqueda();
        registroDiferente.setId(2L);
        registroDiferente.setParametrosBusqueda("pais=México");

        assertNotEquals(registroBusqueda, registroDiferente);
    }

    @Test
    void testToString() {
        String expected = "RegistroBusqueda{id=" + ID + 
                          ", parametrosBusqueda='" + PARAMETROS_BUSQUEDA + '\'' +
                          ", usuarioId=" + USUARIO_ID + 
                          ", fechaHora=" + FECHA_HORA +
                          ", tipoAcceso='" + TIPO_ACCESO + '\'' +
                          ", esAutenticado=" + ES_AUTENTICADO + '}';
        assertEquals(expected, registroBusqueda.toString());
    }
}