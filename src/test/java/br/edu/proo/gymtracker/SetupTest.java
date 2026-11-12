package br.edu.proo.gymtracker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;
import org.junit.jupiter.api.Test;

class SetupTest {

    @Test
    void junitFunciona() {
        assertEquals(4, 2 + 2);
    }

    @Test
    @SuppressWarnings("unchecked")
    void mockitoFunciona() {
        List<String> lista = mock(List.class);
        when(lista.size()).thenReturn(3);
        assertEquals(3, lista.size());
    }
}
