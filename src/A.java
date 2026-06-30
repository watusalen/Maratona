import java.util.Scanner;

public class A {
    public static void a(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        String[] string = S.split("");

        int monotonicidade = 0;
        int contador = 0;

        for (int i = 0; i < string.length; i++) {
            if(string[i].equals("a")){
                contador++;
            } else {
                if(contador >= 2){
                    monotonicidade += contador;
                }
                contador = 0;
            }
        }

        if (contador >= 2) {
            monotonicidade += contador;
        }

        System.out.print(monotonicidade);

    }
}