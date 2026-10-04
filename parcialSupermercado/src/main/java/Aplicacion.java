import java.time.LocalDate;
import java.util.Scanner;


public class Aplicacion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Supermercado supermercado = new Supermercado("MarketPlus", "Armenia", "3200000000");

        int opcion;
        do {
            System.out.println("\n========== MENÚ MARKETPLUS ==========");

            System.out.println("\n--- CLIENTES ---");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Mostrar clientes");

            System.out.println("\n--- PRODUCTOS ---");
            System.out.println("3. Agregar producto");
            System.out.println("4. Mostrar productos");

            System.out.println("\n--- COMPRAS ---");
            System.out.println("5. Crear compra");
            System.out.println("6. Agregar producto a compra");
            System.out.println("7. Calcular total compra");
            System.out.println("8. Mostrar compras");

            System.out.println("\n--- REPORTES ---");
            System.out.println("9. Calcular ventas por fecha");

            System.out.println("\n0. Salir");

            System.out.print("\nSeleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion) {
                case 1:
                    System.out.print("Documento: ");
                    String documento = scanner.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();

                    System.out.print("Correo: ");
                    String correo = scanner.nextLine();

                    Cliente cliente = new Cliente(nombre, documento, telefono, correo);

                    if(supermercado.agregarCliente(cliente)) {
                        System.out.println("Cliente agregado correctamente");
                    }
                    else {
                        System.out.println("El cliente ya existe");
                    }
                    break;

                case 2:
                    if(supermercado.getClientes().size() == 0) {
                        System.out.println("No existen clientes registrados");
                    }
                    else {
                        for(Cliente clienteLista : supermercado.getClientes()) {
                            System.out.println(clienteLista);
                            System.out.println("----------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Código producto: ");
                    String codigo = scanner.nextLine();

                    System.out.print("Nombre producto: ");
                    String nombreProducto = scanner.nextLine();

                    System.out.print("Precio unitario: ");
                    double precio = scanner.nextDouble();

                    System.out.print("Cantidad disponible: ");
                    int cantidad = scanner.nextInt();

                    scanner.nextLine();

                    System.out.println("\nSeleccione categoría:");

                    Categoria[] categorias = Categoria.values();
                    for(int i = 0; i < categorias.length; i++) {
                        System.out.println((i + 1) + ". " + categorias[i]);
                    }

                    System.out.print("Opción categoría: ");
                    int opcionCategoria = scanner.nextInt();

                    scanner.nextLine();

                    Categoria categoriaSeleccionada = categorias[opcionCategoria - 1];

                    Producto producto = new Producto(codigo, nombreProducto, categoriaSeleccionada, precio, cantidad);

                    if(supermercado.agregarProducto(producto)) {
                        System.out.println("Producto agregado correctamente");
                    }
                    else {
                        System.out.println("El producto ya existe");
                    }
                    break;

                case 4:
                    if(supermercado.getProductos().size() == 0) {
                        System.out.println("No existen productos registrados");
                    }
                    else {
                        for(Producto productoLista : supermercado.getProductos()) {
                            System.out.println(productoLista);
                            System.out.println("----------------");
                        }
                    }
                    break;

                case 5:
                    System.out.print("Código compra: ");
                    String codigoCompra = scanner.nextLine();

                    System.out.println("\nSeleccione método de pago:");

                    MetodoPago[] metodos = MetodoPago.values();
                    for(int i = 0; i < metodos.length; i++) {
                        System.out.println((i + 1) + ". " + metodos[i]);
                    }

                    System.out.print("Opción método pago: ");
                    int opcionPago = scanner.nextInt();

                    scanner.nextLine();

                    MetodoPago metodoSeleccionado = metodos[opcionPago - 1];

                    Compra compra = new Compra(codigoCompra, LocalDate.now(), metodoSeleccionado);

                    if(supermercado.agregarCompra(compra)) {
                        System.out.println("Compra creada correctamente");
                    }
                    else {
                        System.out.println("La compra ya existe");
                    }
                    break;

                case 6:
                    System.out.print("Código compra: ");
                    String codigoCompraBuscar = scanner.nextLine();
                    boolean encontroCompra = false;

                    for(Compra compraLista : supermercado.getCompras()) {
                        if(compraLista.getCodigo().equals(codigoCompraBuscar)) {
                            encontroCompra = true;

                            System.out.print("Código producto: ");
                            String codigoProductoBuscar = scanner.nextLine();
                            boolean encontroProducto = false;

                            for(Producto productoLista : supermercado.getProductos()) {
                                if(productoLista.getCodigo().equals(codigoProductoBuscar)) {
                                    encontroProducto = true;
                                    System.out.print("Cantidad a comprar: ");
                                    int cantidadCompra = scanner.nextInt();

                                    scanner.nextLine();

                                    if(compraLista.agregarProducto(productoLista, cantidadCompra)) {
                                        System.out.println("Producto agregado correctamente");
                                    }
                                    else {
                                        System.out.println("No hay suficiente inventario o el producto ya está agregado");
                                    }
                                }
                            }
                            if(encontroProducto == false) {
                                System.out.println("El producto no existe");
                            }
                        }
                    }
                    if(encontroCompra == false) {
                        System.out.println("La compra no existe");
                    }
                    break;

                case 7:
                    System.out.print("Código compra: ");
                    String codigoCalcular = scanner.nextLine();

                    boolean encontro = false;
                    for(Compra compraLista : supermercado.getCompras()) {
                        if(compraLista.getCodigo().equals(codigoCalcular)) {
                            encontro = true;
                            double total = compraLista.calcularTotal();
                            System.out.println("Total compra: $" + total);
                        }
                    }

                    if(encontro == false) {
                        System.out.println("La compra no existe");
                    }
                    break;

                case 8:
                    if(supermercado.getCompras().size() == 0) {
                        System.out.println("No existen compras registradas");
                    }
                    else {
                        for(Compra compraLista : supermercado.getCompras()) {
                            compraLista.calcularTotal();
                            System.out.println(compraLista);
                            System.out.println("----------------");
                        }
                    }
                    break;

                case 9:
                    for(Compra compraLista : supermercado.getCompras()) {
                        compraLista.calcularTotal();
                    }
                    double ventas = supermercado.calcularVentasFecha(LocalDate.now());
                    System.out.println("Las ventas del día equivalen a: $" + ventas);
                    break;

                case 0:
                    System.out.println("Programa finalizado");
                    break;

                default:
                    System.out.println("Opción inválida");
            }


        } while(opcion != 0);
        scanner.close();
    }

}