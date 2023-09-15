public class EmpleadoAsalariado extends Empleado implements Bonificable {
    private int diasTrabajados;
    private double sueldoMensual;

    public EmpleadoAsalariado(String nombre, double salario, int diasTrabajados, double sueldoMensual) throws SalarioInvalidoException {
        super(nombre, salario);
        if (salario <= 0) {
            throw new SalarioInvalidoException("El salario debe ser mayor que cero.");
        }
        this.diasTrabajados = diasTrabajados;
        this.sueldoMensual = sueldoMensual;
    }

    public double calcularSalario() {
        return sueldoMensual;
    }

    @Override
    public double calcularBonificacion() {
        // Implementa aquí la lógica para calcular bonificaciones adicionales si es necesario.
        return 0.0;
    }
}
