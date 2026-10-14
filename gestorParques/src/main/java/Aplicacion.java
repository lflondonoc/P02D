
import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Proyecto proyecto = new Proyecto("Parques del Quindío");

        Parque parque1 = new Parque(
                "Parque de la Vida", "Recreativo", Municipio.ARMENIA);
        Parque parque2 = new Parque(
                "Parque Principal", "Infantil", Municipio.CALARCA);
        Parque parque3 = new Parque(
                "Parque Fundadores", "Familiar", Municipio.ARMENIA);

        proyecto.agregarParque(parque1);
        proyecto.agregarParque(parque2);
        proyecto.agregarParque(parque3);

        int opcion;

        do {
            System.out.println("\n===== PARQUES DEL QUINDÍO =====");
            System.out.println("1. Agregar zona a un parque");
            System.out.println("2. Listar parques de un municipio");
            System.out.println("3. Consultar parque por nombre");
            System.out.println("4. Mostrar valor de un parque");
            System.out.println("5. Calcular valor total del proyecto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1: {
                    System.out.print("Nombre del parque: ");
                    String nombreParque = scanner.nextLine();

                    Parque parqueEncontrado = null;

                    // Buscar el parque por su nombre
                    for (Parque parque : proyecto.getListaParques()) {
                        if (parque.getNombre().equalsIgnoreCase(nombreParque)) {
                            parqueEncontrado = parque;
                            break;
                        }
                    }

                    // Verificar si el parque existe
                    if (parqueEncontrado == null) {
                        System.out.println("El parque no existe");
                        break;
                    }

                    System.out.print("Nombre de la zona: ");
                    String nombreZona = scanner.nextLine();

                    System.out.print("Tipo de la zona: ");
                    String tipoZona = scanner.nextLine();

                    // Verificar que no exista otra zona con ese nombre
                    if (parqueEncontrado.verificarZona(nombreZona)) {
                        System.out.println(
                                "Ya existe una zona con ese nombre");
                        break;
                    }

                    System.out.println(
                            "¿Qué tipo de figura es la zona?");
                    System.out.println("1. Círculo");
                    System.out.println("2. Cuadrado");
                    System.out.println("3. Triángulo rectángulo");
                    System.out.print("Seleccione una figura: ");

                    int tipoFigura = scanner.nextInt();

                    if (tipoFigura < 1 || tipoFigura > 3) {
                        System.out.println("Figura incorrecta");
                        break;
                    }

                    FiguraGeometrica figura;

                    switch (tipoFigura) {
                        case 1:
                            System.out.print("¿Cuál es la medida del radio?: ");
                            double radio = scanner.nextDouble();
                            figura = new Circulo(radio);
                            break;

                        case 2:
                            System.out.print("¿Cuál es la medida del lado?: ");
                            double lado = scanner.nextDouble();
                            figura = new Cuadrado(lado);
                            break;

                        default:
                            System.out.print("¿Cuál es la medida de la base?: ");
                            double base = scanner.nextDouble();

                            System.out.print("¿Cuál es la medida de la altura?: ");
                            double altura = scanner.nextDouble();

                            figura = new Triangulo(base, altura);
                            break;
                    }

                    // Mostrar los materiales disponibles
                    Material[] materiales = Material.values();

                    System.out.println("Materiales disponibles:");

                    for (int i = 0; i < materiales.length; i++) {
                        System.out.println(
                                (i + 1) + ". " + materiales[i]);
                    }

                    System.out.print("Seleccione material: ");
                    int opcionMaterial = scanner.nextInt();

                    if (opcionMaterial < 1
                            || opcionMaterial > materiales.length) {
                        System.out.println("Material incorrecto");
                        break;
                    }

                    Material material = materiales[opcionMaterial - 1];

                    Zona zona = new Zona(
                            nombreZona, tipoZona, material, figura);

                    if (parqueEncontrado.agregarZona(zona)) {
                        System.out.println("Zona agregada correctamente");
                        System.out.println(
                                "Área: " + figura.calcularArea() + " m²");
                        System.out.println(
                                "Valor zona: $" + zona.calcularValorZona());
                    } else {
                        System.out.println("No se pudo agregar la zona");
                    }

                    break;
                }

                case 2: {
                    System.out.print("Nombre del municipio: ");
                    String nombreMunicipio = scanner.nextLine();

                    boolean municipioEncontrado = false;

                    for (Parque parque : proyecto.getListaParques()) {
                        if (parque.getMunicipio().name()
                                .equalsIgnoreCase(nombreMunicipio)) {
                            System.out.println(parque);
                            municipioEncontrado = true;
                        }
                    }

                    if (!municipioEncontrado) {
                        System.out.println(
                                "No hay parques en ese municipio");
                    }

                    break;
                }

                case 3: {
                    System.out.print("Nombre del parque: ");
                    String nombreBuscar = scanner.nextLine();

                    boolean encontrado = false;

                    for (Parque parque : proyecto.getListaParques()) {
                        if (parque.getNombre()
                                .equalsIgnoreCase(nombreBuscar)) {
                            System.out.println(parque);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("El parque no existe");
                    }

                    break;
                }

                case 4: {
                    System.out.print("Nombre del parque: ");
                    String nombreValor = scanner.nextLine();

                    boolean valorEncontrado = false;

                    for (Parque parque : proyecto.getListaParques()) {
                        if (parque.getNombre()
                                .equalsIgnoreCase(nombreValor)) {
                            System.out.println(
                                    "Parque: " + parque.getNombre());
                            System.out.println(
                                    "Valor: $" + parque.calcularValorParque());

                            valorEncontrado = true;
                            break;
                        }
                    }

                    if (!valorEncontrado) {
                        System.out.println("El parque no existe");
                    }

                    break;
                }

                case 5: {
                    double valorTotal = proyecto.calcularValorProyecto();

                    System.out.println(
                            "Valor total del proyecto: $" + valorTotal);
                    break;
                }

                case 0:
                    System.out.println("Programa finalizado");
                    break;

                default:
                    System.out.println("Opción incorrecta");
            }

        } while (opcion != 0);

        scanner.close();
    }
}