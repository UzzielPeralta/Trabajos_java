//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Ingresa tu nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Ingresa tu altura (en mt): ");
            double altura = Double.parseDouble(sc.nextLine());
            System.out.println("Ingresa tu peso (en kg): ");
            double peso = Double.parseDouble(sc.nextLine());

            Persona persona = new Persona(nombre, altura, peso);
            double imc = persona.calcularIMC();
            String clasificacion = persona.clasificarIMC();

            System.out.printf("Hola %s tu IMC es de: %.2f (%s)%n", persona.getNombre(), imc, clasificacion);

        }
    }