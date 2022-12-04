package utn.credicoop.msventas.controllers.DTOS;

public class MediosDePagoDTO {
    private Long id;

    private String nombre;
    private String contenido; // CVU o informacion para realizar el pago


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
