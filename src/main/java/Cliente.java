public class Cliente {
    private String nombre;
    private String rut;
    private String edad;

    public Cliente(String nombre, String rut, String edad){
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }
    public String getEdad() {
        return edad;
    }
    public String getRut() {
        return rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }
}
