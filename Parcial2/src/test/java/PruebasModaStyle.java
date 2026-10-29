import java.time.LocalDate;
public class PruebasModaStyle {
  static void validar(boolean condicion, String mensaje) {if (!condicion) throw new AssertionError(mensaje);}
  public static void main(String[] a) {
    Empresa e = new Empresa("ModaStyle","901","Armenia");
    Sucursal s = new Sucursal("S1","Centro","Calle","Armenia");
    Sucursal otra = new Sucursal("S2","Norte","Calle","Armenia");
    validar(e.agregarSucursal(s),"sucursal");validar(!e.agregarSucursal(new Sucursal("S1","Duplicada","C","A")),"sucursal duplicada");
    validar(e.agregarSucursal(otra),"otra sucursal");
    Prenda p = new Prenda("P1","Vestido","Moda",100000,CategoriaPrenda.VESTIDO);
    validar(e.agregarPrenda(p),"prenda");
    validar(s.agregarInventario(p,"M","Negro",5),"inventario");
    validar(!s.agregarInventario(p,"M","Negro",5),"inventario duplicado");
    validar(!s.agregarInventario(p,"38","Negro",5),"talla incorrecta");
    validar(otra.agregarInventario(p,"M","Negro",2),"inventario otra sucursal");
    validar(p.getListaInventarios().size()==2,"prenda con dos inventarios");
    validar(s.getListaInventarios().size()==1 && otra.getListaInventarios().size()==1,"inventarios independientes");
    validar(p.getListaInventarios().get(0).getPrenda()==p && p.getListaInventarios().get(1).getPrenda()==p,"cada inventario refiere a una prenda");
    Cliente c = new Cliente("100","Ana","ana@x","300","A01",CategoriaCliente.PLATA);
    validar(e.agregarCliente(c),"cliente");
    Vendedor v = new Vendedor("200","Juan","juan@x","300","E01",LocalDate.now(),10000,s);
    validar(e.agregarVendedor(v),"vendedor");
    Inventario inv = s.getListaInventarios().get(0);
    Venta mala = new Venta("V1",LocalDate.now(),s,c,v);
    validar(mala.agregarDetalle(inv,3),"detalle1");validar(mala.agregarDetalle(inv,3),"detalle2");
    validar(!e.registrarVenta(mala),"venta excedida");validar(inv.getCantidadDisponible()==5,"sin descuentos anticipados");
    validar(!mala.agregarDetalle(otra.getListaInventarios().get(0),1),"inventario incorrecto");
    Venta buena = new Venta("V2",LocalDate.now(),s,c,v);
    validar(buena.agregarDetalle(inv,2),"detalle");
    validar(Math.abs(buena.calcularTotal()-198000)<0.01,"total recargo/descuento");
    validar(e.registrarVenta(buena),"confirmacion");
    validar(!e.registrarVenta(buena),"doble confirmacion");
    validar(inv.getCantidadDisponible()==3,"stock");
    validar(c.getListaCompras().size()==1 && v.getListaVentas().size()==1 && s.getListaVentas().size()==1,"historiales");
    validar(inv.getListaDetallesVendidos().size()==1,"historial inventario");
    validar(p.calcularUnidadesVendidas()==2,"prenda mas vendida");
    validar(Math.abs(s.calcularIngresos()-198000)<0.01,"ingresos");
    validar(e.buscarPrendaMasVendida()==0,"prenda popular");
    // Caso de clase: 20 camisetas, 10 tenis; se piden 2+50 camisetas y 12 tenis.
    Prenda camiseta = new Prenda("001", "Camiseta", "Diesel", 120000, CategoriaPrenda.CAMISETA);
    Prenda tenis = new Prenda("002", "Tenis", "Adidas", 500000, CategoriaPrenda.CALZADO);
    validar(e.agregarPrenda(camiseta) && e.agregarPrenda(tenis), "registro de prendas del ejemplo");
    validar(s.agregarInventario(camiseta, "S", "Negro", 20), "registro de camisetas");
    validar(s.agregarInventario(tenis, "37", "Blanco", 10), "registro de tenis");
    Inventario stockCamiseta = s.getListaInventarios().get(1);
    Inventario stockTenis = s.getListaInventarios().get(2);
    Venta exceso = new Venta("V3", LocalDate.now(), s, c, v);
    validar(exceso.agregarDetalle(stockCamiseta, 2), "camisetas 2 pendientes");
    validar(exceso.agregarDetalle(stockTenis, 12), "tenis 12 pendientes");
    validar(exceso.agregarDetalle(stockCamiseta, 50), "camisetas 50 pendientes");
    validar(exceso.calcularCantidadSolicitada(stockCamiseta) == 52, "sumar camisetas repetidas");
    validar(!e.registrarVenta(exceso), "rechazar compra completa");
    validar(stockCamiseta.getCantidadDisponible() == 20 && stockTenis.getCantidadDisponible() == 10, "no descontar inventario");
    validar(stockCamiseta.getListaDetallesVendidos().size() == 0 && stockTenis.getListaDetallesVendidos().size() == 0, "no registrar detalles rechazados");
    validar(c.getListaCompras().size() == 1 && v.getListaVentas().size() == 1, "no guardar venta rechazada en historiales");
    System.out.println("Pruebas de negocio y caso de venta excedida: correctas.");
  }
}
