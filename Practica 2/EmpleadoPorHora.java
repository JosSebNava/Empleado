public class EmpleadoPorHora extends Empleado {
    private int horasTrabajadas;
    private double valorPorHora;

    public EmpleadoPorHora(String nombre, double salario, int horasTrabajadas, double valorPorHora) throws SalarioInvalidoException {
        super(nombre, salario);
        if (salario <= 0) {
            throw new SalarioInvalidoException("El salario debe ser mayor que cero.");
        }
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public double calcularSalario() {
        return horasTrabajadas * valorPorHora;
    }
}