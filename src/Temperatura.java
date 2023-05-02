import java.util.Scanner;

public class Temperatura {
    Paciente[] pacientes=new Paciente[2];
    CalcularTemperatura calcularTemperatura=new CalcularTemperatura();
    Scanner scanner=new Scanner(System.in);
    public void ingresar(){
        for (int i=0; i< pacientes.length; i++){
            System.out.println("Ingresar nombre del paciente"+(i+1));
            String nombre= scanner.next();
            System.out.println("Ingresar edad del paciente"+(i+1));
            int edad=scanner.nextInt();
            System.out.println("Ingresar temperatura en Celcius del paciente"+(i+1));
            double temperaturaCelcius=scanner.nextDouble();
            System.out.println("Ingresar temperatura en Fahrenhei del paciente"+(i+1));
            double temperaturaFahrenhei=scanner.nextDouble();

            pacientes[i]=new Paciente(nombre, edad, temperaturaCelcius, temperaturaFahrenhei);
        }
    }
    private  static class CalcularTemperatura{
        private double calcularCelcius(double temperaturaFahrenhei){
            double celsius = (temperaturaFahrenhei - 32) * 5 / 9;
            return celsius;
        }
        private double calcularFahrenheit(double temperaturaCelcius){
            double fahrenheit = (temperaturaCelcius * 9 / 5) + 32;
            return fahrenheit;
        }
    }

    public void mostrar(){
        for (int j=0; j< pacientes.length; j++){
            System.out.println("Nombre: " + pacientes[j].getNombre());
            System.out.println("Edad: " + pacientes[j].getEdad());
            System.out.println("Temperatura en Celsius: " + pacientes[j].getTemperaturaCelcius());
            System.out.println("Temperatura en Fahrenheit: " + pacientes[j].getTemperaturaFahrenheit());
            double celsius = pacientes[j].getTemperaturaCelcius();
            System.out.println("Conversion  a Celsius");
            System.out.println(calcularTemperatura.calcularCelcius(celsius));
            double farenheit = pacientes[j].getTemperaturaFahrenheit();
            System.out.println("Conversion a fahrenheit");
            System.out.println(calcularTemperatura.calcularFahrenheit(farenheit));
        }
    }
}
