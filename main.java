// ========== EXERCÍCIO 01 ==========
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Litros vendidos: ");
        double litros = sc.nextDouble();
        System.out.print("Tipo (A-álcool, G-gasolina): ");
        char tipo = sc.next().toUpperCase().charAt(0);

        double precoLitro, desconto;

        if (tipo == 'A') {
            precoLitro = 3.98;
            if (litros <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }
        } else {
            precoLitro = 6.49;
            if (litros <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
        }

        double total = litros * precoLitro;
        double valorDesconto = total * desconto;
        double valorPago = total - valorDesconto;

        System.out.printf("Valor a pagar: R$ %.2f\n", valorPago);
        sc.close();
    }
}

// ========== EXERCÍCIO 02 ==========
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de morangos (Kg): ");
        double kgMorango = sc.nextDouble();
        System.out.print("Quantidade de maçãs (Kg): ");
        double kgMaca = sc.nextDouble();

        double precoMorango, precoMaca;

        if (kgMorango <= 5) {
            precoMorango = 2.50;
        } else {
            precoMorango = 2.20;
        }

        if (kgMaca <= 5) {
            precoMaca = 1.80;
        } else {
            precoMaca = 1.50;
        }

        double totalMorango = kgMorango * precoMorango;
        double totalMaca = kgMaca * precoMaca;
        double total = totalMorango + totalMaca;

        double desconto = 0;
        if ((kgMorango + kgMaca) > 8 || total > 25.00) {
            desconto = 0.10;
        }

        double valorFinal = total * (1 - desconto);

        System.out.printf("Valor a pagar: R$ %.2f\n", valorFinal);
        sc.close();
    }
}

// ========== EXERCÍCIO 03 ==========
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tipo de carne (FD-File Duplo, A-Alcatra, P-Picanha): ");
        String tipo = sc.nextLine().toUpperCase();
        System.out.print("Quantidade (Kg): ");
        double quantidade = sc.nextDouble();
        System.out.print("Pagamento (C-cartão, D-dinheiro): ");
        char pagamento = sc.next().toUpperCase().charAt(0);

        double precoKg = 0;
        String nomeCarne = "";

        if (tipo.equals("FD") || tipo.equals("FILE DUPLO")) {
            nomeCarne = "File Duplo";
            if (quantidade <= 5) {
                precoKg = 4.90;
            } else {
                precoKg = 5.80;
            }
        } else if (tipo.equals("A") || tipo.equals("ALCATRA")) {
            nomeCarne = "Alcatra";
            if (quantidade <= 5) {
                precoKg = 5.90;
            } else {
                precoKg = 6.80;
            }
        } else if (tipo.equals("P") || tipo.equals("PICANHA")) {
            nomeCarne = "Picanha";
            if (quantidade <= 5) {
                precoKg = 6.90;
            } else {
                precoKg = 7.80;
            }
        }

        double total = quantidade * precoKg;
        double desconto = 0;
        String tipoPagamento = (pagamento == 'C') ? "Cartão" : "Dinheiro";

        if (pagamento == 'C') {
            desconto = total * 0.05;
        }

        double valorPagar = total - desconto;

        System.out.println("\n========== CUPOM FISCAL ==========");
        System.out.printf("Tipo: %s\n", nomeCarne);
        System.out.printf("Quantidade: %.2f Kg\n", quantidade);
        System.out.printf("Preço total: R$ %.2f\n", total);
        System.out.printf("Pagamento: %s\n", tipoPagamento);
        System.out.printf("Desconto: R$ %.2f\n", desconto);
        System.out.printf("Valor a pagar: R$ %.2f\n", valorPagar);
        System.out.println("===================================");
        sc.close();
    }
}

// ========== EXERCÍCIO 04 ==========
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número do funcionário: ");
        int numero = sc.nextInt();
        System.out.print("Salário atual: R$ ");
        double salario = sc.nextDouble();

        double percentual = 0;

        if (salario <= 400.00) {
            percentual = 0.15;
        } else if (salario <= 700.00) {
            percentual = 0.12;
        } else if (salario <= 1000.00) {
            percentual = 0.10;
        } else if (salario <= 1800.00) {
            percentual = 0.07;
        } else if (salario <= 2500.00) {
            percentual = 0.04;
        } else {
            percentual = 0.00;
        }

        double aumento = salario * percentual;
        double novoSalario = salario + aumento;

        System.out.println("\n========== DADOS DO FUNCIONÁRIO ==========");
        System.out.printf("Número: %d\n", numero);
        System.out.printf("Salário atual: R$ %.2f\n", salario);
        System.out.printf("Percentual de aumento: %.0f%%\n", percentual * 100);
        System.out.printf("Salário corrigido: R$ %.2f\n", novoSalario);
        System.out.println("============================================");
        sc.close();
    }
}

// ========== EXERCÍCIO 05 ==========
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hora de início:");
        System.out.print("Horas: ");
        int hInicio = sc.nextInt();
        System.out.print("Minutos: ");
        int mInicio = sc.nextInt();

        System.out.println("Hora de término:");
        System.out.print("Horas: ");
        int hFim = sc.nextInt();
        System.out.print("Minutos: ");
        int mFim = sc.nextInt();

        int totalMinInicio = hInicio * 60 + mInicio;
        int totalMinFim = hFim * 60 + mFim;

        int duracaoMinutos;

        if (totalMinFim > totalMinInicio) {
            duracaoMinutos = totalMinFim - totalMinInicio;
        } else {
            duracaoMinutos = (24 * 60 - totalMinInicio) + totalMinFim;
        }

        if (duracaoMinutos > 24 * 60) {
            duracaoMinutos = 24 * 60;
        }

        int horas = duracaoMinutos / 60;
        int minutos = duracaoMinutos % 60;

        System.out.printf("\nDuração do jogo: %d horas e %d minutos\n", horas, minutos);
        sc.close();
    }
}

// ========== EXERCÍCIO 06 ==========
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total de cabeças: ");
        int cabecas = sc.nextInt();
        System.out.print("Total de patas: ");
        int patas = sc.nextInt();

        // Cada animal tem 1 cabeça
        // Coelhos têm 4 patas, patos têm 2 patas
        // Sistema:
        // coelhos + patos = cabecas
        // 4*coelhos + 2*patos = patas

        int coelhos = (patas - 2 * cabecas) / 2;
        int patos = cabecas - coelhos;

        System.out.println("\n========== RESULTADO ==========");
        System.out.printf("Patos: %d\n", patos);
        System.out.printf("Coelhos: %d\n", coelhos);
        System.out.println("===============================");
        sc.close();
    }
}