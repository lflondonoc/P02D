import java.time.LocalDate;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Empresa empresa = new Empresa("ModaStyle", "901234567", "Armenia, Quindío");
        Sucursal sucursalInicial = new Sucursal("S01", "Centro", "Calle 20", "Armenia");
        empresa.agregarSucursal(sucursalInicial);

        int opcion;
        do {
            System.out.println("\n========== MODASTYLE ==========");
            System.out.println("1. Registrar prenda");
            System.out.println("2. Registrar cliente");
            System.out.println("3. Registrar vendedor");
            System.out.println("4. Registrar sucursal");
            System.out.println("5. Registrar inventario");
            System.out.println("6. Consultar prendas disponibles");
            System.out.println("7. Registrar venta");
            System.out.println("8. Consultar prendas agotadas");
            System.out.println("9. Consultar ventas por vendedor");
            System.out.println("10. Consultar compras por cliente");
            System.out.println("11. Consultar ingresos de sucursal");
            System.out.println("12. Consultar prenda más vendida");
            System.out.println("13. Calcular precio final");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1: {
                    System.out.print("Código de prenda: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Precio base: ");
                    double precio = scanner.nextDouble();
                    CategoriaPrenda[] categorias = CategoriaPrenda.values();
                    for (int i = 0; i < categorias.length; i++) {
                        System.out.println((i + 1) + ". " + categorias[i]);
                    }
                    System.out.print("Categoría: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();
                    if (numero >= 1 && numero <= categorias.length) {
                        Prenda prenda = new Prenda(codigo, nombre, marca, precio, categorias[numero - 1]);
                        if (empresa.agregarPrenda(prenda)) {
                            System.out.println("Prenda registrada.");
                        } else {
                            System.out.println("Código repetido o precio inválido.");
                        }
                    } else {
                        System.out.println("Categoría incorrecta.");
                    }
                    break;
                }
                case 2: {
                    System.out.print("Documento: ");
                    String documento = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Correo: ");
                    String correo = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Código de afiliación: ");
                    String afiliacion = scanner.nextLine();
                    CategoriaCliente[] categorias = CategoriaCliente.values();
                    for (int i = 0; i < categorias.length; i++) {
                        System.out.println((i + 1) + ". " + categorias[i]);
                    }
                    System.out.print("Categoría: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();
                    if (numero >= 1 && numero <= categorias.length) {
                        Cliente cliente = new Cliente(documento, nombre, correo, telefono,
                                afiliacion, categorias[numero - 1]);
                        if (empresa.agregarCliente(cliente)) {
                            System.out.println("Cliente registrado.");
                        } else {
                            System.out.println("Documento o afiliación repetida.");
                        }
                    } else {
                        System.out.println("Categoría incorrecta.");
                    }
                    break;
                }
                case 3: {
                    for (Sucursal sucursal : empresa.getListaSucursales()) {
                        System.out.println(sucursal);
                    }
                    System.out.print("Código de sucursal: ");
                    String codigoSucursal = scanner.nextLine();
                    boolean encontrada = false;
                    for (Sucursal sucursal : empresa.getListaSucursales()) {
                        if (sucursal.getCodigo().equalsIgnoreCase(codigoSucursal)) {
                            encontrada = true;
                            System.out.print("Documento: ");
                            String documento = scanner.nextLine();
                            System.out.print("Nombre: ");
                            String nombre = scanner.nextLine();
                            System.out.print("Correo: ");
                            String correo = scanner.nextLine();
                            System.out.print("Teléfono: ");
                            String telefono = scanner.nextLine();
                            System.out.print("Código de empleado: ");
                            String codigo = scanner.nextLine();
                            System.out.print("Año de contratación: ");
                            int anio = scanner.nextInt();
                            System.out.print("Mes de contratación: ");
                            int mes = scanner.nextInt();
                            System.out.print("Día de contratación: ");
                            int dia = scanner.nextInt();
                            System.out.print("Salario básico: ");
                            double salario = scanner.nextDouble();
                            scanner.nextLine();
                            if (anio >= 1 && mes >= 1 && mes <= 12 && dia >= 1 && dia <= 28 && salario > 0) {
                                LocalDate fecha = LocalDate.of(anio, mes, dia);
                                Vendedor vendedor = new Vendedor(documento, nombre, correo, telefono,
                                        codigo, fecha, salario, sucursal);
                                if (empresa.agregarVendedor(vendedor)) {
                                    System.out.println("Vendedor registrado.");
                                } else {
                                    System.out.println("Documento o código repetido.");
                                }
                            } else {
                                System.out.println("Datos de fecha o salario incorrectos. Para este ejemplo use días 1 a 28.");
                            }
                            break;
                        }
                    }
                    if (!encontrada) {
                        System.out.println("Sucursal no encontrada.");
                    }
                    break;
                }
                case 4: {
                    System.out.print("Código de sucursal: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = scanner.nextLine();
                    System.out.print("Ciudad: ");
                    String ciudad = scanner.nextLine();
                    Sucursal sucursal = new Sucursal(codigo, nombre, direccion, ciudad);
                    if (empresa.agregarSucursal(sucursal)) {
                        System.out.println("Sucursal registrada.");
                    } else {
                        System.out.println("Código de sucursal repetido.");
                    }
                    break;
                }
                case 5: {
                    System.out.print("Código de sucursal: ");
                    String codigoSucursal = scanner.nextLine();
                    boolean sucursalEncontrada = false;
                    for (Sucursal sucursal : empresa.getListaSucursales()) {
                        if (sucursal.getCodigo().equalsIgnoreCase(codigoSucursal)) {
                            sucursalEncontrada = true;
                            System.out.print("Código de prenda: ");
                            String codigoPrenda = scanner.nextLine();
                            boolean prendaEncontrada = false;
                            for (Prenda prenda : empresa.getListaPrendas()) {
                                if (prenda.getCodigo().equalsIgnoreCase(codigoPrenda)) {
                                    prendaEncontrada = true;
                                    System.out.print("Talla (XS/S/M/L/XL o 35-44): ");
                                    String talla = scanner.nextLine();
                                    System.out.print("Color: ");
                                    String color = scanner.nextLine();
                                    System.out.print("Cantidad inicial: ");
                                    int cantidad = scanner.nextInt();
                                    scanner.nextLine();
                                    if (sucursal.agregarInventario(prenda, talla, color, cantidad)) {
                                        System.out.println("Inventario registrado.");
                                    } else {
                                        System.out.println("Talla, cantidad o combinación incorrecta.");
                                    }
                                    break;
                                }
                            }
                            if (!prendaEncontrada) {
                                System.out.println("Prenda no encontrada.");
                            }
                            break;
                        }
                    }
                    if (!sucursalEncontrada) {
                        System.out.println("Sucursal no encontrada.");
                    }
                    break;
                }
                case 6: {
                    System.out.print("Código de sucursal: ");
                    String codigo = scanner.nextLine();
                    boolean encontrada = false;
                    for (Sucursal sucursal : empresa.getListaSucursales()) {
                        if (sucursal.getCodigo().equalsIgnoreCase(codigo)) {
                            encontrada = true;
                            for (Inventario inventario : sucursal.consultarDisponibles()) {
                                System.out.println(inventario);
                            }
                        }
                    }
                    if (!encontrada) {
                        System.out.println("Sucursal no encontrada.");
                    }
                    break;
                }
                case 7: {
                    System.out.print("Código de sucursal: ");
                    String codigoSucursal = scanner.nextLine();
                    System.out.print("Documento del cliente: ");
                    String documentoCliente = scanner.nextLine();
                    System.out.print("Documento del vendedor: ");
                    String documentoVendedor = scanner.nextLine();
                    System.out.print("Código de venta: ");
                    String codigoVenta = scanner.nextLine();
                    boolean encontrada = false;
                    for (Sucursal sucursal : empresa.getListaSucursales()) {
                        if (sucursal.getCodigo().equalsIgnoreCase(codigoSucursal)) {
                            for (Cliente cliente : empresa.getListaClientes()) {
                                if (cliente.getDocumento().equalsIgnoreCase(documentoCliente)) {
                                    for (Vendedor vendedor : empresa.getListaVendedores()) {
                                        if (vendedor.getDocumento().equalsIgnoreCase(documentoVendedor)
                                                && vendedor.getSucursal() == sucursal) {
                                            encontrada = true;
                                            if (!empresa.verificarVenta(codigoVenta)) {
                                                Venta venta = new Venta(codigoVenta, LocalDate.now(), sucursal, cliente, vendedor);
                                                String continuar;
                                                do {
                                                    for (int i = 0; i < sucursal.getListaInventarios().size(); i++) {
                                                        System.out.println((i + 1) + ". " + sucursal.getListaInventarios().get(i));
                                                    }
                                                    System.out.print("Seleccione el número de la opción del producto: ");
                                                    int numero = scanner.nextInt();
                                                    if (numero >= 1 && numero <= sucursal.getListaInventarios().size()) {
                                                        System.out.print("Cantidad: ");
                                                        int cantidad = scanner.nextInt();
                                                        Inventario inventario = sucursal.getListaInventarios().get(numero - 1);
                                                        if (venta.agregarDetalle(inventario, cantidad)) {
                                                            System.out.println("Producto agregado a la compra pendiente.");
                                                            System.out.println("Las existencias se verificarán al confirmar la venta.");
                                                        } else {
                                                            System.out.println("Cantidad o inventario inválido.");
                                                        }
                                                    } else {
                                                        System.out.println("Opción de producto inválida.");
                                                    }
                                                    scanner.nextLine();
                                                    System.out.print("¿Agregar otro detalle? (S/N): ");
                                                    continuar = scanner.nextLine();
                                                } while (continuar.equalsIgnoreCase("S"));
                                                for (DetalleVenta detalle : venta.getListaDetalles()) {
                                                    System.out.println(detalle);
                                                }
                                                System.out.printf("Total de la compra pendiente: $%.2f%n", venta.calcularTotal());
                                                System.out.print("¿Confirmar venta? (S/N): ");
                                                String confirmar = scanner.nextLine();
                                                if (confirmar.equalsIgnoreCase("S")) {
                                                    if (empresa.registrarVenta(venta)) {
                                                        System.out.println("Venta confirmada e inventario actualizado.");
                                                    } else {
                                                        System.out.println("Venta rechazada: no se cumplen las condiciones o las existencias acumuladas.");
                                                        System.out.println("No se modificaron las existencias ni los historiales.");
                                                    }
                                                } else {
                                                    System.out.println("Venta cancelada; inventarios sin cambios.");
                                                }
                                            } else {
                                                System.out.println("Código de venta repetido.");
                                            }
                                            break;
                                        }
                                    }
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    if (!encontrada) {
                        System.out.println("Sucursal, cliente o vendedor no encontrados o incompatibles.");
                    }
                    break;
                }
                case 8: {
                    System.out.print("Código de sucursal: ");
                    String codigo = scanner.nextLine();
                    boolean encontrada = false;
                    for (Sucursal sucursal : empresa.getListaSucursales()) {
                        if (sucursal.getCodigo().equalsIgnoreCase(codigo)) {
                            encontrada = true;
                            for (Inventario inventario : sucursal.consultarAgotados()) {
                                System.out.println(inventario);
                            }
                        }
                    }
                    if (!encontrada) {
                        System.out.println("Sucursal no encontrada.");
                    }
                    break;
                }
                case 9: {
                    System.out.print("Documento de vendedor: ");
                    String documento = scanner.nextLine();
                    boolean encontrado = false;
                    for (Vendedor vendedor : empresa.getListaVendedores()) {
                        if (vendedor.getDocumento().equalsIgnoreCase(documento)) {
                            encontrado = true;
                            for (Venta venta : vendedor.getListaVentas()) {
                                System.out.println(venta);
                            }
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Vendedor no encontrado.");
                    }
                    break;
                }
                case 10: {
                    System.out.print("Documento de cliente: ");
                    String documento = scanner.nextLine();
                    boolean encontrado = false;
                    for (Cliente cliente : empresa.getListaClientes()) {
                        if (cliente.getDocumento().equalsIgnoreCase(documento)) {
                            encontrado = true;
                            for (Venta venta : cliente.getListaCompras()) {
                                System.out.println(venta);
                            }
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;
                }
                case 11: {
                    System.out.print("Código de sucursal: ");
                    String codigo = scanner.nextLine();
                    boolean encontrada = false;
                    for (Sucursal sucursal : empresa.getListaSucursales()) {
                        if (sucursal.getCodigo().equalsIgnoreCase(codigo)) {
                            encontrada = true;
                            System.out.println("Ingresos: $" + sucursal.calcularIngresos());
                        }
                    }
                    if (!encontrada) {
                        System.out.println("Sucursal no encontrada.");
                    }
                    break;
                }
                case 12: {
                    int posicion = empresa.buscarPrendaMasVendida();
                    if (posicion >= 0) {
                        Prenda prenda = empresa.getListaPrendas().get(posicion);
                        System.out.println("Prenda: " + prenda.getNombre()
                                + " - unidades vendidas: " + prenda.calcularUnidadesVendidas());
                    } else {
                        System.out.println("No hay prendas registradas.");
                    }
                    break;
                }
                case 13: {
                    System.out.print("Código de prenda: ");
                    String codigoPrenda = scanner.nextLine();
                    System.out.print("Documento de cliente: ");
                    String documentoCliente = scanner.nextLine();
                    boolean encontrado = false;
                    for (Prenda prenda : empresa.getListaPrendas()) {
                        if (prenda.getCodigo().equalsIgnoreCase(codigoPrenda)) {
                            for (Cliente cliente : empresa.getListaClientes()) {
                                if (cliente.getDocumento().equalsIgnoreCase(documentoCliente)) {
                                    encontrado = true;
                                    System.out.println("Precio con recargo: $" + prenda.calcularPrecioConRecargo());
                                    System.out.println("Precio final: $" + cliente.calcularPrecioFinal(prenda.calcularPrecioConRecargo()));
                                }
                            }
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Prenda o cliente no encontrados.");
                    }
                    break;
                }
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        } while (opcion != 0);
        scanner.close();
    }
}
