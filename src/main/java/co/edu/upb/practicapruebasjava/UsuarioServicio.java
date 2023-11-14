package co.edu.upb.practicapruebasjava;

import java.util.HashMap;

public class UsuarioServicio {

    private final HashMap<Long, UsuarioDto> usuarios = new HashMap<>();

    public UsuarioDto crearUsuario(Long id, String nombre) {
        usuarios.put(id, new UsuarioDto(id, nombre));
        return usuarios.get(id);
    } // public UsuarioDto crearUsuario(Long id, String nombre) 

    public UsuarioDto obtenerUsuario(Long id) {
        return usuarios.get(id);
    } // public UsuarioDto obtenerUsuario(Long id)

    public UsuarioDto actualizarUsuario(Long id, String nombre) {
        return usuarios.put(id, new UsuarioDto(id, nombre));
    } // public UsuarioDto actualizarUsuario(Long id, String nombre) 

} // public class UsuarioServicio
