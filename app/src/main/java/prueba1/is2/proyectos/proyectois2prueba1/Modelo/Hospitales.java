package prueba1.is2.proyectos.proyectois2prueba1.Modelo;

/**
 * Created by Alex on 23/11/2017.
 */

public class Hospitales {

    public String nombre, ubicacion, horario, diasAtcn, descripcion;
    public int imagen;

    public Hospitales() {
    }

    public Hospitales(String nombre, String ubicacion, String horario, String diasAtcn, String descripcion, int imagen) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.horario = horario;
        this.diasAtcn = diasAtcn;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDiasAtcn() {
        return diasAtcn;
    }

    public void setDiasAtcn(String diasAtcn) {
        this.diasAtcn = diasAtcn;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
