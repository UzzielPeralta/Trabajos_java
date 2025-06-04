public class Persona {
    private String nombre;
    private double altura;
    private double peso;

    public Persona(String nombre, double altura, double peso) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String clasificarIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc < 25) {
            return "Normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

}
