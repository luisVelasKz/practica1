import java.util.Scanner;

public class TicketCompra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipoPago;
        String tipoPagoStr;

        System.out.println("Ingrese el tipo de pago (1. Efectivo, 2. Tarjeta de crédito, 3. Tarjeta débito)");
        tipoPago = sc.nextInt();
        sc.nextLine();

        switch (tipoPago){
            case 1:
                tipoPagoStr = "Efectivo";
                break;
            case 2:
                tipoPagoStr = "Tarjeta de crédito";
                break;
            case 3:
                tipoPagoStr = "Tarjeta de débito";
                break;
            default:
                System.out.println("Tipo de pago no válido");
                return;
        }

        String [] nombreProductos = new String[3];
        Double [] precioProductos = new Double[3];

        Double total = 0.0;

        for (int i = 0; i < nombreProductos.length; i++) {
            System.out.println("Ingrese el nombre del producto (" + (i + 1) + ")");
            nombreProductos[i] = sc.nextLine();

            System.out.println("Ingrese el precio del producto (" + (i + 1) + ")");
            precioProductos[i] = sc.nextDouble();
            total += precioProductos[i];

            sc.nextLine();
        }


        System.out.println("************************");
        System.out.println("Resumen:");
        System.out.println("Tipo de pago: " + tipoPagoStr);
        System.out.println("**Productos**");

        for (int i = 0; i < 3; i++) {
            System.out.println("Producto: " + nombreProductos[i] + ", Precio: " + precioProductos[i].toString());
        }
        System.out.println("************************");
        System.out.println("Total de la compra: " + total);
        System.out.println("************************");





    }
}
