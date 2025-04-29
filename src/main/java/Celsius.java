public class Celsius extends Temperatura{
    //construtor
    public Celsius(double valorGraus){
        //super refere a classe pai
        super(valorGraus);
    }
    //criando metodo converter
    public double paraFahrenheit(){
        return (getGraus()*9/5)+32;
    
    }
    //metodo de celsius para kelvin
    public double paraKelvin(){
    return(getGraus())+273;
    
    }
    
    
}
