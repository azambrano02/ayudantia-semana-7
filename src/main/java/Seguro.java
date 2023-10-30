public class Seguro {
    Cliente cliente;
    Vendedor vendedor;

    public Seguro(Cliente cliente, Vendedor vendedor) {
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setVendedor(Vendedor vendedor){
        this.vendedor = vendedor;
    }
}
