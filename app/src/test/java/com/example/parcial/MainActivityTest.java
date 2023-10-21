package com.example.parcial;

import junit.framework.TestCase;

public class MainActivityTest extends TestCase {
    private Operaciones operaciones;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        operaciones  = new Operaciones();
    }
    public void testCalcularSuma() {
        double resultado = operaciones.calcularSuma(5, 3);
        assertEquals(8, resultado, 0.001);
    }

    public void testCalcularResta() {
        double resultado = operaciones.calcularResta(10, 3);
        assertEquals(7, resultado, 0.001);
    }

    public void testCalcularMultiplicacion() {
        double resultado = operaciones.calcularMultiplicacion(4, 6);
        assertEquals(24, resultado, 0.001);
    }

    public void testCalcularDivision() {
        try {
            operaciones.calcularDivision(8, 0);
            fail("Se esperaba una excepción IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Éxito: Se lanzó la excepción esperada.
        }
    }
}