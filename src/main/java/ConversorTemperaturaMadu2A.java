import java.util.Scanner;
public class ConversorTemperaturaMadu2A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean continuar = true;
        
        while(continuar){
            System.out.println("===Coversor de Temperatura==");
            System.out.println("1. Celsius");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Kelvin");
            System.out.println("4. Sair");
            System.out.println("Escolha a unidade de origem: ");
            int escolha = scanner.nextInt();
            
            if(escolha== 4 ){
                continuar=false;
                continue;
            }
            if(escolha<1 || escolha>4){
                System.out.println("Opcao invalida");
                continue;
            }
            System.out.println("Digit o valor da temperatura");
            double graus = scanner.nextDouble();
            
            switch(escolha){
                case 1:
                    Celsius celsius = new Celsius(graus);
                    System.out.println("****************");
                    System.out.println("Resultado");
                    System.out.println("Fahrenheit:" + celsius.paraFahrenheit());
                    System.out.println("Kelvin:"+celsius.paraKelvin());
                    System.out.println("******************");
                    break;
                case 2:
                   Fahrenheit f = new Fahrenheit(graus);
                     System.out.println("****************");
                    System.out.println("Resultado");
                    System.out.println("Celsius:" +f.paraCelsius());
                    System.out.println("Kelvin:"+f.paraKelvin());
                    System.out.println("******************");
                    
                case 3:
                    Kelvin kelvin = new Kelvin(graus);
                     System.out.println("****************");
                    System.out.println("Resultado");
                    System.out.println("Celsius:" + kelvin.paraCelsius());
                    System.out.println("Fahrenheit:"+ kelvin.paraFahrenheit());
                    System.out.println("******************");
                    break;
                    
            }
        }
        System.out.println("Programa encerrado");
        scanner.close();
    }
}
