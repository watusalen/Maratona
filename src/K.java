import java.util.Scanner;

public class K {
    public static void k(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int D = scanner.nextInt();
        int M = scanner.nextInt();

        if (M > 0) {
            int[] m = new int[M];

            for (int i = 0; i < M; i++) {
                m[i] = scanner.nextInt();
            }

            boolean consegue = false;
            int ultimo = 0;

            for (int i = 0; i < m.length; i++) {
                if (T + ultimo <= m[i]) {
                    consegue = true;
                    break;
                } else {
                    ultimo = m[i];
                }
            }

            if ((D - m[M - 1]) >= T) {
                consegue = true;
            }

            System.out.println(consegue ? "Y" : "N");
        } else {
            System.out.println("Y");
        }

        scanner.close();
    }
}