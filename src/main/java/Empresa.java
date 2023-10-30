import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String direccion;
    private List<Cliente> clientes;
    private List<Vendedor> vendedores;
    private List<Seguro> seguros;

    public Empresa(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.clientes = new ArrayList<>();
        this.vendedores = new ArrayList<>();
        this.seguros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public List<Cliente> getClientes() {
        return clientes;
    }
    public List<Vendedor> getVendedores() {
        return vendedores;
    }
    public List<Seguro> getSeguros() {
        return seguros;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }
    public void setSeguros(List<Seguro> seguros) {
        this.seguros = seguros;
    }

    public boolean clienteExiste(Cliente cliente){
        for(Cliente c : this.clientes) {
            if(cliente.getRut().equals(c.getRut())) {
                return true;
            }
        }
        return false;
    }
    public boolean vendedorExiste(Vendedor vendedor){
        for(Vendedor v : this.vendedores) {
            if(vendedor.getID().equals(v.getID())) {
                return true;
            }
        }
        return false;
    }

    public void agregarCliente(Cliente cliente){
        if(!clienteExiste(cliente)){
            this.clientes.add(cliente);
        }
    }
    public void agregarVendedor(Vendedor vendedor){
        if(!vendedorExiste(vendedor)){
            this.vendedores.add(vendedor);
        }
    }

    public Cliente buscarCliente (String rut){
        for(Cliente cliente : this.clientes){
            if(cliente.getRut().equals(rut))
                return cliente;
        }
        System.out.println("El cliente no existe");
        return null;
    }

}
