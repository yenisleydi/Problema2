public class Paciente {
    private String nombre;
    private int edad;
    private double temperaturaCelcius;
    private double temperaturaFahrenheit;

    public Paciente(String nombre, int edad, double temperaturaCelcius, double temperaturaFahrenheit){
        this.nombre=nombre;
        this.edad=edad;
        this.temperaturaCelcius=temperaturaCelcius;
        this.temperaturaFahrenheit=temperaturaFahrenheit;
    }


    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getTemperaturaCelcius() {
        return temperaturaCelcius;
    }

    public double getTemperaturaFahrenheit() {
        return temperaturaFahrenheit;
    }
}
