public class ComisionPersonalizada implements EstrategiaComision {
    @Override
    public double calcularComision(double montoVenta) {
        if (montoVenta < 0) {
            throw new IllegalArgumentException("El monto de venta no puede ser negativo.");
        }

        return montoVenta * 0.15;
    }
}
