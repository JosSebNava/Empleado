public class Main {
    public static void main(String[] args) {
        try {
            EmpleadoPorHora empleadoPorHora = new EmpleadoPorHora("Juan", -10.0, 160, 15.0); // Salario negativo
            EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Maria", 2500.0, 20, 3000.0);

            double salarioPorHora = empleadoPorHora.calcularSalario();
            double salarioAsalariado = empleadoAsalariado.calcularSalario();

            System.out.println("Salario por hora: " + salarioPorHora);
            System.out.println("Salario asalariado: " + salarioAsalariado);

            if (empleadoAsalariado instanceof Bonificable) {
                double bonificacion = ((Bonificable) empleadoAsalariado).calcularBonificacion();
                System.out.println("Bonificación: " + bonificacion);
            }
        } catch (SalarioInvalidoException e) {
            System.out.println("Error al crear el empleado: " + e.getMessage());
        }
    }
}
