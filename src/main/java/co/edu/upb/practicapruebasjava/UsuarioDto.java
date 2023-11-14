package co.edu.upb.practicapruebasjava;

public class UsuarioDto {

    final Long id;
    final String nombre;

    public UsuarioDto(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

} // public class UsuarioDto
