public class Main {
    public static void main(String[] args) {
        EstrategiaComision estandar = new ComisionEstandar();
        EstrategiaComision personalizada = new ComisionPersonalizada();

        Vendedor vendedor = new Vendedor("Elvis ", 1500.0, personalizada);

        System.out.println("--- DETALLE CON COMISIÓN ESTÁNDAR (5%) ---");
        vendedor.mostrarDetalle();

        vendedor.cambiarEstrategia(personalizada);

        System.out.println("\n--- DETALLE CON COMISIÓN PERSONALIZADA (10%) ---");
        vendedor.mostrarDetalle();
    }
}