package org.acme;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pack_hotel.Faqs;

import static org.junit.jupiter.api.Assertions.*;

class FaqsTest {

    private Faqs faq;

    // Definición de constantes para valores que se repiten
    private static final Long ID_FAQ = 1L;
    private static final String PREGUNTA_FAQ = "¿Cuál es el horario de check-in?";
    private static final String RESPUESTA_FAQ = "El check-in es a partir de las 14:00.";

    @BeforeEach
    void setUp() {
        faq = new Faqs();
        faq.setId(ID_FAQ);
        faq.setPregunta(PREGUNTA_FAQ);
        faq.setRespuesta(RESPUESTA_FAQ);
    }

    @Test
    void testGettersAndSetters() {
        assertEquals(ID_FAQ, faq.getId());
        assertEquals(PREGUNTA_FAQ, faq.getPregunta());
        assertEquals(RESPUESTA_FAQ, faq.getRespuesta());
    }

    @Test
    void testEqualsAndHashCode() {
        Faqs faq2 = new Faqs();
        faq2.setId(ID_FAQ);
        faq2.setPregunta(PREGUNTA_FAQ);
        faq2.setRespuesta(RESPUESTA_FAQ);

        assertEquals(faq, faq2);
        assertEquals(faq.hashCode(), faq2.hashCode());
    }

    @Test
    void testNotEquals() {
        Faqs faqDiferente = new Faqs();
        faqDiferente.setId(2L);
        faqDiferente.setPregunta("¿Cuál es el horario de salida?");
        faqDiferente.setRespuesta("El horario de salida es a las 12:00.");

        assertNotEquals(faq, faqDiferente);
    }

    @Test
    void testToString() {
        String expected = "Faq{id=" + ID_FAQ + ", pregunta='" + PREGUNTA_FAQ + "', respuesta='" + RESPUESTA_FAQ + "'}";
        assertEquals(expected, faq.toString());
    }
}