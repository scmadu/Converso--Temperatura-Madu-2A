public class Fahrenheit extends Temperatura {
    public Fahrenheit(double ValorGraus){
    super(ValorGraus);
    }
    //metodo que converte Fahrenheit para celsius 
    public double paraCelsius(){
        return (getGraus()-32)*5/9;
    }
    //  //metodo que converte Fahrenheit para Kelvin
    public double paraKelvin(){
        return paraCelsius()+273;
    
    }
}
