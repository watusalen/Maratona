import java.util.Scanner;

public class J2 {
    public static void j2(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int maria = 0;
        int joao = 0;

        int as = 0;
        int dois = 0;
        int tres = 0;
        int quatro = 0;
        int cinco = 0;
        int seis = 0;
        int sete = 0;
        int oito = 0;
        int nove = 0;
        int dez = 0;

        for (int i = 0; i < 2; i++) {
            int carta = scanner.nextInt();
            if (carta == 1) {
                joao += 1;
                as++;
            }
            if (carta == 2) {
                joao += 2;
                dois++;
            }
            if (carta == 3) {
                joao += 3;
                tres++;
            }
            if (carta == 4) {
                joao += 4;
                quatro++;
            }
            if (carta == 5) {
                joao += 5;
                cinco++;
            }
            if (carta == 6) {
                joao += 6;
                seis++;
            }
            if (carta == 7) {
                joao += 7;
                sete++;
            }
            if (carta == 8) {
                joao += 8;
                oito++;
            }
            if (carta == 9) {
                joao += 9;
                nove++;
            }
            if (carta == 10) {
                joao += 10;
                dez++;
            }
            if (carta == 11) {
                joao += 10;
                dez++;
            }
            if (carta == 12) {
                joao += 10;
                dez++;
            }
            if (carta == 13) {
                joao += 10;
                dez++;
            }
        }

        for (int i = 0; i < 2; i++) {
            int carta = scanner.nextInt();
            if (carta == 1) {
                maria += 1;
                as++;
            }
            if (carta == 2) {
                maria += 2;
                dois++;
            }
            if (carta == 3) {
                maria += 3;
                tres++;
            }
            if (carta == 4) {
                maria += 4;
                quatro++;
            }
            if (carta == 5) {
                maria += 5;
                cinco++;
            }
            if (carta == 6) {
                maria += 6;
                seis++;
            }
            if (carta == 7) {
                maria += 7;
                sete++;
            }
            if (carta == 8) {
                maria += 8;
                oito++;
            }
            if (carta == 9) {
                maria += 9;
                nove++;
            }
            if (carta == 10) {
                maria += 10;
                dez++;
            }
            if (carta == 11) {
                maria += 10;
                dez++;
            }
            if (carta == 12) {
                maria += 10;
                dez++;
            }
            if (carta == 13) {
                maria += 10;
                dez++;
            }
        }

        for (int i = 0; i < N; i++) {
            int carta = scanner.nextInt();
            if (carta == 1) {
                maria += 1;
                joao += 1;
                as++;
            }
            if (carta == 2) {
                maria += 2;
                joao += 2;
                dois++;
            }
            if (carta == 3) {
                maria += 3;
                joao += 3;
                tres++;
            }
            if (carta == 4) {
                maria += 4;
                joao += 4;
                quatro++;
            }
            if (carta == 5) {
                maria += 5;
                joao += 5;
                cinco++;
            }
            if (carta == 6) {
                maria += 6;
                joao += 6;
                seis++;
            }
            if (carta == 7) {
                maria += 7;
                joao += 7;
                sete++;
            }
            if (carta == 8) {
                maria += 8;
                joao += 8;
                oito++;
            }
            if (carta == 9) {
                maria += 9;
                joao += 9;
                nove++;
            }
            if (carta == 10) {
                maria += 10;
                joao += 10;
                dez++;
            }
            if (carta == 11) {
                maria += 10;
                joao += 10;
                dez++;
            }
            if (carta == 12) {
                maria += 10;
                joao += 10;
                dez++;
            }
            if (carta == 13) {
                maria += 10;
                joao += 10;
                dez++;
            }
        }

        int cartaPraGanhar = -1;

        for (int i = 1; i <= 13; i++) {

            boolean existe = false;
            int valor;

            if (i >= 10) {
                valor = 10;
            } else {
                valor = i;
            }

            if (i == 1 && as < 4) {
                existe = true;
            }

            if (i == 2 && dois < 4) {
                existe = true;
            }

            if (i == 3 && tres < 4) {
                existe = true;
            }

            if (i == 4 && quatro < 4) {
                existe = true;
            }

            if (i == 5 && cinco < 4) {
                existe = true;
            }

            if (i == 6 && seis < 4) {
                existe = true;
            }

            if (i == 7 && sete < 4) {
                existe = true;
            }

            if (i == 8 && oito < 4) {
                existe = true;
            }

            if (i == 9 && nove < 4) {
                existe = true;
            }

            if ((i == 10 || i == 11 || i == 12 || i == 13) && dez < 16) {
                existe = true;
            }


            if (existe) {
                int joaoTeste = joao + valor;
                int mariaTeste = maria + valor;

                if ((mariaTeste == 23) || (joaoTeste > 23 && mariaTeste <= 23)) {
                    cartaPraGanhar = i;
                    break;
                }
            }
        }

        System.out.println(cartaPraGanhar);

    }
}