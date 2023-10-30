public class Vendedor {
    private String nombre;
    private String rut;
    private String ID;

    public Vendedor(String nombre, String rut, String ID){
        this.nombre = nombre;
        this.rut = rut;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }
    public String getRut() {
        return rut;
    }
    public String getID() {
        return ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
}
