public class EmpleadoPorHora extends Empleado{
        private int horasTrabajadas;

        public EmpleadoPorHora(String id, String nombre, double salarioBase, int horasTrabajadas) {
            super(id, nombre, salarioBase);
            this.horasTrabajadas = horasTrabajadas;
        }

    public EmpleadoPorHora(String id, String nombre, double salarioBase) {
        super(id, nombre, salarioBase);
    }

    @Override
        public double calcularSalario() {
            return getSalarioBase() * horasTrabajadas;
        }
    }
