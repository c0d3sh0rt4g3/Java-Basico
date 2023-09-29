package Ejercicios02;

import java.util.Objects;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int points = 0;
        System.out.println("Responda las siguientes preguntas con v(verdadero) o f(falso)");
        System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        String question1 = scanner.next();
        if (Objects.equals(question1, "v")){
            points += 3;
        }
        System.out.println("Ha aumentado sus gastos de vestuario");
        String question2 = scanner.next();
        if (Objects.equals(question2, "v")){
            points += 3;
        }
        System.out.println("Ha perdido el interés que mostraba anteriormente por ti");
        String question3 = scanner.next();
        if (Objects.equals(question3, "v")){
            points += 3;
        }
        System.out.println("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
        String question4 = scanner.next();
        if (Objects.equals(question4, "v")){
            points += 3;
        }
        System.out.println("No te deja que mires la agenda de su teléfono móvil");
        String question5 = scanner.next();
        if (Objects.equals(question5, "v")){
            points += 3;
        }
        System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
        String question6 = scanner.next();
        if (Objects.equals(question6, "v")){
            points += 3;
        }
        System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
        String question7 = scanner.next();
        if (Objects.equals(question7, "v")){
            points += 3;
        }
        System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
        String question8 = scanner.next();
        if (Objects.equals(question8, "v")){
            points += 3;
        }
        System.out.println("Has notado que últimamente se perfuma más");
        String question9 = scanner.next();
        if (Objects.equals(question9, "v")){
            points += 3;
        }
        System.out.println("e confunde y te dice que ha estado en sitios donde no ha ido contigo");
        String question10 = scanner.next();
        if (Objects.equals(question10, "v")){
            points += 3;
        }

        if (points <= 10){
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        }else if (points < 22){
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia");
        }else{
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        }
    }
}
