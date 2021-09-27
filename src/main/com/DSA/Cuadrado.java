package main.com.DSA;

public class Cuadrado extends Rectangulo{
    private double cuadradoLado;
    private double areaCuadrado;

    public Cuadrado(double cuadradoLado){
        super(cuadradoLado,cuadradoLado);
       // this.CuadradoLado = cuadradoLado;
        //this.areaCuadrado = Math.pow(cuadradoLado,2);//Agafa la variable que introduim i la multiplica per si mateixa tantes vegades com indiquem en el segon nombre;
        //super (cuadradoLado,cuadradoLado);



    }
    public double getAreaCuadrado() {
        return areaCuadrado;
    }

}

