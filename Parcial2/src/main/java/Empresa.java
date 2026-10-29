import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String nit;
    private String direccion;
    private List<Sucursal> listaSucursales;
    private List<Prenda> listaPrendas;
    private List<Cliente> listaClientes;
    private List<Vendedor> listaVendedores;

    public Empresa(String nombre, String nit, String direccion) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        listaSucursales = new ArrayList<>();
        listaPrendas = new ArrayList<>();
        listaClientes = new ArrayList<>();
        listaVendedores = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public String getNit() { return nit; }
    public String getDireccion() { return direccion; }
    public List<Sucursal> getListaSucursales() { return listaSucursales; }
    public List<Prenda> getListaPrendas() { return listaPrendas; }
    public List<Cliente> getListaClientes() { return listaClientes; }
    public List<Vendedor> getListaVendedores() { return listaVendedores; }

    // Se utilizan posiciones para buscar objetos sin retornar null.
    public int buscarSucursal(String codigo) {
        int posicion = -1;
        for (int i = 0; i < listaSucursales.size(); i++) {
            if (listaSucursales.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                posicion = i;
            }
        }
        return posicion;
    }

    public int buscarPrenda(String codigo) {
        int posicion = -1;
        for (int i = 0; i < listaPrendas.size(); i++) {
            if (listaPrendas.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                posicion = i;
            }
        }
        return posicion;
    }

    public int buscarCliente(String documento) {
        int posicion = -1;
        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getDocumento().equalsIgnoreCase(documento)) {
                posicion = i;
            }
        }
        return posicion;
    }

    public int buscarVendedor(String documento) {
        int posicion = -1;
        for (int i = 0; i < listaVendedores.size(); i++) {
            if (listaVendedores.get(i).getDocumento().equalsIgnoreCase(documento)) {
                posicion = i;
            }
        }
        return posicion;
    }

    public boolean verificarDocumento(String documento) {
        boolean existe = false;
        if (buscarCliente(documento) >= 0 || buscarVendedor(documento) >= 0) {
            existe = true;
        }
        return existe;
    }

    public boolean verificarVenta(String codigo) {
        boolean existe = false;
        for (Sucursal sucursal : listaSucursales) {
            if (sucursal.verificarVenta(codigo)) {
                existe = true;
            }
        }
        return existe;
    }

    public boolean agregarSucursal(Sucursal sucursal) {
        boolean agregado = false;
        if (buscarSucursal(sucursal.getCodigo()) == -1) {
            listaSucursales.add(sucursal);
            agregado = true;
        }
        return agregado;
    }

    public boolean agregarPrenda(Prenda prenda) {
        boolean agregado = false;
        if (buscarPrenda(prenda.getCodigo()) == -1 && prenda.getPrecioBase() > 0) {
            listaPrendas.add(prenda);
            agregado = true;
        }
        return agregado;
    }

    public boolean agregarCliente(Cliente cliente) {
        boolean agregado = false;
        boolean afiliacionRepetida = false;
        for (Cliente actual : listaClientes) {
            if (actual.getCodigoAfiliacion().equalsIgnoreCase(cliente.getCodigoAfiliacion())) {
                afiliacionRepetida = true;
            }
        }
        if (!verificarDocumento(cliente.getDocumento()) && !afiliacionRepetida) {
            listaClientes.add(cliente);
            agregado = true;
        }
        return agregado;
    }

    // Verificar relaciones usando ciclos sencillos.
    public boolean verificarSucursalRegistrada(Sucursal sucursalBuscada) {
        boolean existe = false;
        for (Sucursal sucursal : listaSucursales) {
            if (sucursal == sucursalBuscada) {
                existe = true;
            }
        }
        return existe;
    }

    public boolean verificarClienteRegistrado(Cliente clienteBuscado) {
        boolean existe = false;
        for (Cliente cliente : listaClientes) {
            if (cliente == clienteBuscado) {
                existe = true;
            }
        }
        return existe;
    }

    public boolean verificarVendedorRegistrado(Vendedor vendedorBuscado) {
        boolean existe = false;
        for (Vendedor vendedor : listaVendedores) {
            if (vendedor == vendedorBuscado) {
                existe = true;
            }
        }
        return existe;
    }

    public boolean agregarVendedor(Vendedor vendedor) {
        boolean agregado = false;
        boolean codigoRepetido = false;
        for (Vendedor actual : listaVendedores) {
            if (actual.getCodigoEmpleado().equalsIgnoreCase(vendedor.getCodigoEmpleado())) {
                codigoRepetido = true;
            }
        }
        boolean sucursalRegistrada = verificarSucursalRegistrada(vendedor.getSucursal());
        boolean documentoRepetido = verificarDocumento(vendedor.getDocumento());
        if (!documentoRepetido && !codigoRepetido && sucursalRegistrada) {
            if (vendedor.getSucursal().agregarVendedor(vendedor)) {
                listaVendedores.add(vendedor);
                agregado = true;
            }
        }
        return agregado;
    }

    public boolean registrarVenta(Venta venta) {
        boolean registrada = false;
        boolean ventaRepetida = verificarVenta(venta.getCodigo());
        boolean sucursalRegistrada = verificarSucursalRegistrada(venta.getSucursal());
        boolean clienteRegistrado = verificarClienteRegistrado(venta.getCliente());
        boolean vendedorRegistrado = verificarVendedorRegistrado(venta.getVendedor());

        if (!ventaRepetida && sucursalRegistrada && clienteRegistrado && vendedorRegistrado) {
            registrada = venta.getSucursal().registrarVenta(venta);
        }
        return registrada;
    }

    public int buscarPrendaMasVendida() {
        int posicion = -1;
        int mayor = 0;
        for (int i = 0; i < listaPrendas.size(); i++) {
            int cantidad = listaPrendas.get(i).calcularUnidadesVendidas();
            if (posicion == -1 || cantidad > mayor) {
                mayor = cantidad;
                posicion = i;
            }
        }
        return posicion;
    }
}
