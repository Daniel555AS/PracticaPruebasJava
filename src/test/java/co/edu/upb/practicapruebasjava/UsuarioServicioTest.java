package co.edu.upb.practicapruebasjava;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

public class UsuarioServicioTest {

    private UsuarioServicio usuarioServicio;

    @Before
    public void setUp() {
        usuarioServicio = new UsuarioServicio();
        usuarioServicio.crearUsuario(0L, "UsuarioPrincipal");
        usuarioServicio.crearUsuario(2L, "UsuarioSecundario");
    } // public void setUp() 

    @Test
    public void testCrearUsuario1() {
        UsuarioDto esperado = new UsuarioDto(1L, "Juan");
        final UsuarioDto resultado = usuarioServicio.crearUsuario(1L, "Juan");
        assertEquals(esperado.id, resultado.id);
        assertEquals(esperado.nombre, resultado.nombre, "Los Nombre NO son Iguales");
    } // public void testCrearUsuario1()

    @Test
    public void testCrearUsuario2() {
        UsuarioDto noEsperado = new UsuarioDto(11L, "Carlos");
        UsuarioDto resultado = usuarioServicio.crearUsuario(5L, "David");
        assertNotEquals(noEsperado.id, resultado.id);
        assertNotEquals(noEsperado.nombre, resultado.nombre);
    } // public void testCrearUsuario2() 

    @Test
    public void testObtenerUsuario() {
        usuarioServicio.crearUsuario(8L, "Daniel");
        assertEquals("UsuarioPrincipal", usuarioServicio.obtenerUsuario(0L).nombre);
        assertEquals("Daniel", usuarioServicio.obtenerUsuario(8L).nombre);
        assertEquals("UsuarioSecundario", usuarioServicio.obtenerUsuario(2L).nombre);
    } // public void testObtenerUsuario() 

} // public class UsuarioServicioTest
