package pack_hotel;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class UsuariosTest {

    @Test
    public void testGettersAndSetters() {
        Usuarios usuario = new Usuarios();
        
        usuario.setId(1L);
        usuario.setRol(2);
        usuario.setEmail("test@example.com");
        usuario.setPassword("password");
        usuario.setPrimer_nombre("Juan");
        usuario.setSegundo_nombre("Carlos");
        usuario.setPrimer_apellido("Perez");
        usuario.setSegundo_apellido("Lopez");
        usuario.setFecha_nacimiento(LocalDate.of(1990, 1, 1));
        usuario.setNacionalidad("Guatemalteca");
        usuario.setPasaporte(123456789L);
        
        assertEquals(1L, usuario.getId());
        assertEquals(2, usuario.getRol());
        assertEquals("test@example.com", usuario.getEmail());
        assertEquals("password", usuario.getPassword());
        assertEquals("Juan", usuario.getPrimer_nombre());
        assertEquals("Carlos", usuario.getSegundo_nombre());
        assertEquals("Perez", usuario.getPrimer_apellido());
        assertEquals("Lopez", usuario.getSegundo_apellido());
        assertEquals(LocalDate.of(1990, 1, 1), usuario.getFecha_nacimiento());
        assertEquals("Guatemalteca", usuario.getNacionalidad());
        assertEquals(123456789L, usuario.getPasaporte());
    }

    @Test
    public void testEqualsAndHashCode() {
        Usuarios usuario1 = new Usuarios();
        Usuarios usuario2 = new Usuarios();
        
        usuario1.setEmail("test@example.com");
        usuario1.setPassword("password");
        
        usuario2.setEmail("test@example.com");
        usuario2.setPassword("password");
        
        assertEquals(usuario1, usuario2);
        assertEquals(usuario1.hashCode(), usuario2.hashCode());
    }

    @Test
    public void testToString() {
        Usuarios usuario = new Usuarios();
        usuario.setId(1L);
        usuario.setRol(2);
        usuario.setEmail("test@example.com");
        usuario.setPassword("password");
        usuario.setPrimer_nombre("Juan");
        usuario.setSegundo_nombre("Carlos");
        usuario.setPrimer_apellido("Perez");
        usuario.setSegundo_apellido("Lopez");
        usuario.setFecha_nacimiento(LocalDate.of(1990, 1, 1));
        usuario.setNacionalidad("Guatemalteca");
        usuario.setPasaporte(123456789L);

        String expected = "Usuarios{id=1, rol=2, email=test@example.com, password=password, " +
                "primer_nombre=Juan, segundo_nombre=Carlos, primer_apellido=Perez, segundo_apellido=Lopez, " +
                "fecha_nacimiento=1990-01-01, nacionalidad=Guatemalteca, pasaporte=123456789}";
        assertEquals(expected, usuario.toString());
    }
}
