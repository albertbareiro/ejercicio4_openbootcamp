import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        Scanner teclado = new Scanner(System.in);
        int nro;
        System.out.println("Ingrese 1er valor");
        nro = teclado.nextInt();
        if(nro<0){
            System.out.println("El nro "+nro+" es negativo");
        }else if (nro>0){
            System.out.println("El nro "+nro+" es positivo");
        }else {
            System.out.println("El nro "+nro+" es igual a cero");
        }

        //Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        //Incrementar el valor de la variable en uno cada vez que se ejecute.
        //Mostrarlo por pantalla cada vez que se ejecute.
        int numeroWhile;
        System.out.println("Ingrese 2do valor");
        numeroWhile = teclado.nextInt();
        while (numeroWhile<3){
            numeroWhile++;
            System.out.println("el while es: "+numeroWhile);
        }

        //Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        int numeroDoWhile;
        System.out.println("Ingrese 3er valor");
        numeroDoWhile = teclado.nextInt();
        do{
            numeroDoWhile++;
            System.out.println("el do while es: "+numeroDoWhile);
        }while (numeroWhile<3);

        //Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
        for (int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println("el for es: "+numeroFor);
        }

        //Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
        String estacion;
        System.out.println("ingrese estacion del año: ");
        estacion=teclado.next();
        switch(estacion) {
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("La palabra ingresada no es una estación.");
        }
    }
}