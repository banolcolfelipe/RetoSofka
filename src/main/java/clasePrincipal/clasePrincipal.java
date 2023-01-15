
package clasePrincipal;
import com.retosofka.*;

import java.util.Scanner;

public class clasePrincipal {
    public static void main(String[] args) {
        Scanner consolaNav = new Scanner(System.in);

        //1. Genero los objetos de las diferentes naves y asigno los atributos unicos de cada nave.

        Falcom falcomIX = new Falcom("El vehiculo de lanzamiento Falcom IX Esta despegando.",
                "El vehiculo de lanzamiento Falcom IX se ha desprendido de la Carga y esta en orbita.",
                "El vehiculo procede a volver al planeta.",
                "El vehiculo aterriza en el oceano para ser recogido y reutilizado para proximas misiones.");

        Mariner marinerIV = new Mariner("El vehiculo no tripulado se desplaza en la orbita de marte.",
                "El vehiculo empieza su a tomar las primeras fotos de la superficie de marte.",
                "Gracias a sus paneles solares el vehiculo adquiere energia gracias a la luz solar.");


        Gemini geminis = new Gemini("El vehiculo Lanzadera Titan II despega y trasportando el vehiculo tripulado Gemini.",
                "Gracias a el impulso inicial del Gemini, el vehiculo apolo viaja hacia el vehiculo Apolo 11.",
                "La nave espacial Gemini se acopla con la nave Apolo11 con exito, mision cumplida.");


        Apolo apolo11 = new Apolo("El vehiculo Lanzadera Saturno V despega y trasportando el vehiculo tripulado Apolo 11.",
                "Gracias a el impulso inicial del Saturno V, el vehiculo apolo viaja hacia la luna.",
                "El vehiculo aterriza sobre la superficie lunar, mision cumplida.");



// 2. Inicio de guion de generador de naves:

        System.out.println("\nBIENVENIDO AL GENERADOR DE NAVES ESPACIALES");
        System.out.println("\n\nEl hombre siempre ha soñado con volar y alcanzar las estrellas, por eso el ser humano se ha hecho con la capacidad de crear naves espaciales, " +
                "\nestos vehículos fueron creados con diferentes materiales y usando diversos cálculos matemáticos han logrado cumplir con este sueño. " +
                "\nPor esta razón se ha creado este pequeño programa, que brinda algunos datos sobre las naves espaciales tales como: Nombre, clasificación, " +
                "\ntipo de combustible usado durante la misión y el fabricante, además de simular brevemente las posibles acciones que estas naves han realizado " +
                "\ndurante sus misiones. ¿Continuamos?");

        System.out.println("\nPorfavor indica con un <1> para continuar, o con un <0> para terminar con el programa." +
                "\n\nRespuesta: ");


        String seguir = "S";
        int primerPaso = Integer.parseInt(consolaNav.nextLine());


            switch (primerPaso){
                case 1:
                    System.out.println("Opciones de naves:" + "\n- " + falcomIX.obtenerNombre() + "\n- " + marinerIV.obtenerNombre() +
                            "\n- " + geminis.obtenerNombre() + "\n- " + apolo11.obtenerNombre());
                    break;

                case 0:
                    System.out.println("Gracias por probar el programa! FIN.");
                    break;

                default:
                    System.out.println("Respuesta incorrecta. ¿Volver a intentarlo?");
                    System.out.println("Indica para <S> para volver a comenzar, y <N> para terminar\"");


        }

    }
}



