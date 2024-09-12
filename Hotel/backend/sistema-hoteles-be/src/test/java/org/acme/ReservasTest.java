package org.acme;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pack_hotel.Reservas;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ReservasTest {

    private Reservas reserva;

    // Definición de constantes
    private static final Long ID_RESERVA = 1L;
    private static final Long ID_HOTEL = 101L;
    private static final Long ID_HABITACION = 202L;
    private static final Long ID_USUARIO = 303L;
    private static final Integer CODIGO_RESERVA = 123456;
    private static final Integer PERSONAS_RESERVA = 2;
    private static final LocalDate FECHA_INGRESO = LocalDate.of(2024, 9, 15);
    private static final LocalDate FECHA_SALIDA = LocalDate.of(2024, 9, 20);
    private static final Integer TOTAL_RESERVA = 5000;
    private static final String ESTADO_RESERVA = "Confirmada";
    private static final Integer TIPO_HABITACION = 1;

    @BeforeEach
    void setUp() {
        reserva = new Reservas();
        reserva.setIdReserva(ID_RESERVA);
        reserva.setIdHotel(ID_HOTEL);
        reserva.setIdHabitacion(ID_HABITACION);
        reserva.setIdUsuario(ID_USUARIO);
        reserva.setCodigoReserva(CODIGO_RESERVA);
        reserva.setPersonasReserva(PERSONAS_RESERVA);
        reserva.setFechaIngreso(FECHA_INGRESO);
        reserva.setFechaSalida(FECHA_SALIDA);
        reserva.setTotalReserva(TOTAL_RESERVA);
        reserva.setEstadoReserva(ESTADO_RESERVA);
        reserva.setTipoHabitacion(TIPO_HABITACION);
    }

    @Test
    void testGettersAndSetters() {
        assertEquals(ID_RESERVA, reserva.getIdReserva());
        assertEquals(ID_HOTEL, reserva.getIdHotel());
        assertEquals(ID_HABITACION, reserva.getIdHabitacion());
        assertEquals(ID_USUARIO, reserva.getIdUsuario());
        assertEquals(CODIGO_RESERVA, reserva.getCodigoReserva());
        assertEquals(PERSONAS_RESERVA, reserva.getPersonasReserva());
        assertEquals(FECHA_INGRESO, reserva.getFechaIngreso());
        assertEquals(FECHA_SALIDA, reserva.getFechaSalida());
        assertEquals(TOTAL_RESERVA, reserva.getTotalReserva());
        assertEquals(ESTADO_RESERVA, reserva.getEstadoReserva());
        assertEquals(TIPO_HABITACION, reserva.getTipoHabitacion());
    }

    @Test
    void testEqualsAndHashCode() {
        Reservas reserva2 = new Reservas();
        reserva2.setIdReserva(ID_RESERVA);
        reserva2.setIdHotel(ID_HOTEL);

        assertEquals(reserva, reserva2);
        assertEquals(reserva.hashCode(), reserva2.hashCode());
    }

    @Test
    void testNotEquals() {
        Reservas reservaDiferente = new Reservas();
        reservaDiferente.setIdReserva(2L);
        reservaDiferente.setIdHotel(102L);

        assertNotEquals(reserva, reservaDiferente);
    }

    @Test
    void testToString() {
        String expected = "Reservas{idReserva=" + ID_RESERVA + 
                          ", idHotel=" + ID_HOTEL + 
                          ", idHabitacion=" + ID_HABITACION + 
                          ", idUsuario=" + ID_USUARIO + 
                          ", codigoReserva=" + CODIGO_RESERVA + 
                          ", personasReserva=" + PERSONAS_RESERVA + 
                          ", fechaIngreso=" + FECHA_INGRESO + 
                          ", fechaSalida=" + FECHA_SALIDA + 
                          ", totalReserva=" + TOTAL_RESERVA + 
                          ", estadoReserva='" + ESTADO_RESERVA + '\'' + 
                          ", tipoHabitacion=" + TIPO_HABITACION + 
                          '}';
        assertEquals(expected, reserva.toString());
    }
}