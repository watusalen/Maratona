import java.util.Scanner;

public class G {
    public static void g(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int sbecs = 100;
        int maximo = sbecs;

        for (int i = 0; i < N; i++) {
            sbecs += scanner.nextInt();
            if(sbecs > maximo){
                maximo = sbecs;
            }
        }

        System.out.println(maximo);

    }
}