import java.util.Scanner;
import java.util.HashSet;

public class J {
    public static void j(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> niveis = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            niveis.add(sc.nextInt());
        }

        int tarefasFaltando = 4 - niveis.size();

        System.out.println(tarefasFaltando);

        sc.close();
    }
}