import java.util.Scanner;

public class I {
    public static void i(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] b = processar(s);

        boolean invalido = false;

        for (int i : b) {
            if (i == 9) {
                invalido = true;
            }
        }

        System.out.println(invalido ? "F" : "S");
    }

    private static int[] processar(String s) {
        String[] armazenador = s.split(" ");
        int[] b = new int[armazenador.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(armazenador[i]);
        }
        return b;
    }
}