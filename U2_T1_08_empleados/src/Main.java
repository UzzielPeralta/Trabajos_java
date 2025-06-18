//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                EmpleadoTiempoCompleto empleadoUno = new EmpleadoTiempoCompleto("20243ds035" , "Uzziel",200, "0");
                System.out.println(empleadoUno.calcularSalario());

                EmpleadoPorHora empleadoDos = new EmpleadoPorHora("20243ds054","Angel",200,8);
                System.out.println(empleadoDos.calcularSalario());
            }
        }
