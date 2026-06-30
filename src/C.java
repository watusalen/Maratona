import java.util.Scanner;

public class C {
    public static void c(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long sequencia = 0;

        for (int i = 0; i <= N; i++) {
            int bit = sc.nextInt();
            sequencia = (sequencia << 1) | bit;
        }

        int passos = 0;

        while (sequencia != 1) {
            if ((sequencia & 1) == 1) {
                sequencia = (sequencia << 1) ^ sequencia ^ 1;
            } else {
                sequencia >>= 1;
            }
            passos++;
        }

        System.out.println(passos);
    }
}