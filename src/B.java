import java.util.Scanner;

public class B {
    public static void b(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[][] tabuleiro = new boolean[10][10];

        int N = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabuleiro[i][j] = false;
            }
        }

        boolean invalido = false;

        for (int n = 0; n < N; n++) {
            int D = scanner.nextInt();
            int L = scanner.nextInt();
            int R = scanner.nextInt();
            int C = scanner.nextInt();

            if ((D == 0) && (C + L - 1 > 10)) {
                invalido = true;
            }

            if ((D == 1) && (R + L - 1 > 10)) {
                invalido = true;
            }

            if (D == 0) {
                for (int i = 0; i < L; i++) {
                    if (tabuleiro[R - 1][(C - 1) + i]) {
                        invalido = true;
                    }
                    tabuleiro[R - 1][(C - 1) + i] = true;
                }
            }

            if (D == 1) {
                for (int i = 0; i < L; i++) {
                    if (tabuleiro[(R - 1) + i][C - 1]) {
                        invalido = true;
                    }
                    tabuleiro[(R - 1) + i][C - 1] = true;
                }
            }
        }

        if (invalido) {
            System.out.println("N");
        } else {
            System.out.println("Y");
        }

        scanner.close();
    }
}