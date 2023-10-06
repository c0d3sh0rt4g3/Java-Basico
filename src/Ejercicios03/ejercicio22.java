package Ejercicios03;

public class ejercicio22 {
    public static void main(String[] args) {
        for (var i = 2; i <= 100; i++) {
            var primo = true;
            for (var j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                }
            }
            if (primo){
                System.out.println(i);
            }
        }
    }
}
