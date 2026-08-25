import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);

    public static void exercicio01() {
        System.out.println("\n=== EXERCICIO 01 - POSTO DE COMBUSTIVEL ===");
        System.out.print("Digite a quantidade de litros: ");
        double litros = scanner.nextDouble();
        System.out.print("Digite o tipo de combustivel (A - Alcool, G - Gasolina): ");
        char tipo = scanner.next().toUpperCase().charAt(0);

        double precoLitro;
        double desconto;

        if (tipo == 'A') {
            precoLitro = 3.98;
            if (litros <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }
        } else if (tipo == 'G') {
            precoLitro = 6.49;
            if (litros <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
        } else {
            System.out.println("Tipo de combustivel invalido!");
            return;
        }

        double valorBruto = litros * precoLitro;
        double valorDesconto = valorBruto * desconto;
        double valorPagar = valorBruto - valorDesconto;

        System.out.printf("\n--- RESULTADO ---\n");
        System.out.printf("Litros: %.2f\n", litros);
        System.out.printf("Preco por litro: R$ %.2f\n", precoLitro);
        System.out.printf("Valor bruto: R$ %.2f\n", valorBruto);
        System.out.printf("Desconto: R$ %.2f (%.0f%%)\n", valorDesconto, desconto * 100);
        System.out.printf("Valor a pagar: R$ %.2f\n", valorPagar);
    }

    public static void exercicio02() {
        System.out.println("\n=== EXERCICIO 02 - FRUTEIRA ===");
        System.out.print("Digite a quantidade de morangos (Kg): ");
        double morangos = scanner.nextDouble();
        System.out.print("Digite a quantidade de macas (Kg): ");
        double macas = scanner.nextDouble();

        double precoMorango, precoMaca;

        if (morangos <= 5) {
            precoMorango = 2.50;
        } else {
            precoMorango = 2.20;
        }

        if (macas <= 5) {
            precoMaca = 1.80;
        } else {
            precoMaca = 1.50;
        }

        double totalMorango = morangos * precoMorango;
        double totalMaca = macas * precoMaca;
        double totalCompra = totalMorango + totalMaca;
        double desconto = 0;

        if ((morangos + macas) > 8 || totalCompra > 25.00) {
            desconto = totalCompra * 0.10;
        }

        double valorPagar = totalCompra - desconto;

        System.out.println("\n--- RESULTADO ---");
        System.out.printf("Morangos: %.2f Kg x R$ %.2f = R$ %.2f\n", morangos, precoMorango, totalMorango);
        System.out.printf("Macas: %.2f Kg x R$ %.2f = R$ %.2f\n", macas, precoMaca, totalMaca);
        System.out.printf("Total da compra: R$ %.2f\n", totalCompra);
        if (desconto > 0) {
            System.out.printf("Desconto (10%%): R$ %.2f\n", desconto);
        }
        System.out.printf("Valor a pagar: R$ %.2f\n", valorPagar);
    }

    public static void exercicio03() {
        System.out.println("\n=== EXERCICIO 03 - HIPERMERCADO - PROMOCAO DE CARNES ===");
        System.out.println("Tipos de carne disponiveis:");
        System.out.println("F - File Duplo");
        System.out.println("A - Alcatra");
        System.out.println("P - Picanha");
        System.out.print("Digite o tipo de carne: ");
        char tipo = scanner.next().toUpperCase().charAt(0);
        System.out.print("Digite a quantidade em Kg: ");
        double quantidade = scanner.nextDouble();
        System.out.print("Pagamento no cartao? (S/N): ");
        char cartao = scanner.next().toUpperCase().charAt(0);

        double precoKg;
        String nomeCarne;

        if (tipo == 'F') {
            nomeCarne = "File Duplo";
            if (quantidade <= 5) {
                precoKg = 4.90;
            } else {
                precoKg = 5.80;
            }
        } else if (tipo == 'A') {
            nomeCarne = "Alcatra";
            if (quantidade <= 5) {
                precoKg = 5.90;
            } else {
                precoKg = 6.80;
            }
        } else if (tipo == 'P') {
            nomeCarne = "Picanha";
            if (quantidade <= 5) {
                precoKg = 6.90;
            } else {
                precoKg = 7.80;
            }
        } else {
            System.out.println("Tipo de carne invalido!");
            return;
        }

        double totalCompra = quantidade * precoKg;
        double desconto = 0;
        String tipoPagamento;

        if (cartao == 'S') {
            tipoPagamento = "Cartao";
            desconto = totalCompra * 0.05;
        } else {
            tipoPagamento = "Dinheiro";
        }

        double valorPagar = totalCompra - desconto;

        System.out.println("\n=== CUPOM FISCAL ===");
        System.out.println("Tipo de carne: " + nomeCarne);
        System.out.printf("Quantidade: %.2f Kg\n", quantidade);
        System.out.printf("Preco total: R$ %.2f\n", totalCompra);
        System.out.println("Tipo de pagamento: " + tipoPagamento);
        if (desconto > 0) {
            System.out.printf("Desconto (5%%): R$ %.2f\n", desconto);
        }
        System.out.printf("Valor a pagar: R$ %.2f\n", valorPagar);
        System.out.println("===================");
    }

    public static void exercicio04() {
        System.out.println("\n=== EXERCICIO 04 - REAJUSTE SALARIAL ===");
        System.out.print("Digite o numero do funcionario: ");
        int numero = scanner.nextInt();
        System.out.print("Digite o salario atual: R$ ");
        double salario = scanner.nextDouble();

        double indice;
        double aumento;

        if (salario <= 400.00) {
            indice = 0.15;
        } else if (salario <= 700.00) {
            indice = 0.12;
        } else if (salario <= 1000.00) {
            indice = 0.10;
        } else if (salario <= 1800.00) {
            indice = 0.07;
        } else if (salario <= 2500.00) {
            indice = 0.04;
        } else {
            indice = 0.00;
        }

        aumento = salario * indice;
        double salarioCorrigido = salario + aumento;

        System.out.println("\n--- DADOS DO FUNCIONARIO ---");
        System.out.println("Numero: " + numero);
        System.out.printf("Salario atual: R$ %.2f\n", salario);
        System.out.printf("Percentual de aumento: %.0f%%\n", indice * 100);
        System.out.printf("Valor do aumento: R$ %.2f\n", aumento);
        System.out.printf("Salario corrigido: R$ %.2f\n", salarioCorrigido);
    }

    public static void exercicio05() {
        System.out.println("\n=== EXERCICIO 05 - DURACAO DO JOGO ===");
        System.out.print("Digite a hora de inicio (0-23): ");
        int hInicio = scanner.nextInt();
        System.out.print("Digite o minuto de inicio (0-59): ");
        int mInicio = scanner.nextInt();
        System.out.print("Digite a hora de fim (0-23): ");
        int hFim = scanner.nextInt();
        System.out.print("Digite o minuto de fim (0-59): ");
        int mFim = scanner.nextInt();

        int minutosInicio = hInicio * 60 + mInicio;
        int minutosFim = hFim * 60 + mFim;

        int duracaoMinutos;
        if (minutosFim > minutosInicio) {
            duracaoMinutos = minutosFim - minutosInicio;
        } else if (minutosFim < minutosInicio) {
            duracaoMinutos = (24 * 60 - minutosInicio) + minutosFim;
        } else {
            duracaoMinutos = 24 * 60; // Jogo de 24 horas
        }

        int horas = duracaoMinutos / 60;
        int minutos = duracaoMinutos % 60;

        System.out.println("\n--- DURACAO DO JOGO ---");
        System.out.printf("Inicio: %02d:%02d\n", hInicio, mInicio);
        System.out.printf("Fim: %02d:%02d\n", hFim, mFim);
        System.out.printf("Duracao: %d horas e %d minutos\n", horas, minutos);
    }

    public static void exercicio06() {
        System.out.println("\n=== EXERCICIO 06 - PATOS E COELHOS ===");
        System.out.print("Digite o total de cabecas: ");
        int cabecas = scanner.nextInt();
        System.out.print("Digite o total de patas: ");
        int patas = scanner.nextInt();

        // Sistema de equacoes:
        // patos + coelhos = cabecas
        // 2*patos + 4*coelhos = patas

        int coelhos = (patas - 2 * cabecas) / 2;
        int patos = cabecas - coelhos;

        if (coelhos >= 0 && patos >= 0 && (2*patos + 4*coelhos) == patas) {
            System.out.println("\n--- RESULTADO ---");
            System.out.println("Patos: " + patos);
            System.out.println("Coelhos: " + coelhos);
        } else {
            System.out.println("\nNao foi possivel determinar a quantidade de patos e coelhos.");
            System.out.println("Verifique se os dados estao corretos.");
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n==================================================");
            System.out.println("          LISTA DE EXERCICIOS - JAVA");
            System.out.println("==================================================");
            System.out.println("01 - Posto de Combustivel");
            System.out.println("02 - Fruteira");
            System.out.println("03 - Hipermercado - Promocao de Carnes");
            System.out.println("04 - Reajuste Salarial");
            System.out.println("05 - Duracao do Jogo");
            System.out.println("06 - Patos e Coelhos");
            System.out.println("00 - Sair");
            System.out.println("==================================================");

            System.out.print("Escolha uma opcao: ");
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("\nObrigado por usar o programa!");
                break;
            }

            switch (opcao) {
                case 1:
                    exercicio01();
                    break;
                case 2:
                    exercicio02();
                    break;
                case 3:
                    exercicio03();
                    break;
                case 4:
                    exercicio04();
                    break;
                case 5:
                    exercicio05();
                    break;
                case 6:
                    exercicio06();
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }

            System.out.print("\nPressione ENTER para continuar...");
            scanner.nextLine(); // Limpa o buffer
            scanner.nextLine(); // Aguarda o ENTER
        }
        scanner.close();
    }
