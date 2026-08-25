// //exercicio 1
// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Digite o raio da esfera: ");
//         double raio = scanner.nextDouble();

//         double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

//         System.out.printf("O volume da esfera é: %.2f", volume);

//         scanner.close();
//     }
// }

//02

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Digite o primeiro número: ");
//         double num1 = scanner.nextDouble();
//         System.out.print("Digite o peso do primeiro número: ");
//         double peso1 = scanner.nextDouble();

//         System.out.print("Digite o segundo número: ");
//         double num2 = scanner.nextDouble();
//         System.out.print("Digite o peso do segundo número: ");
//         double peso2 = scanner.nextDouble();

//         System.out.print("Digite o terceiro número: ");
//         double num3 = scanner.nextDouble();
//         System.out.print("Digite o peso do terceiro número: ");
//         double peso3 = scanner.nextDouble();

//         double mediaPonderada = (num1 * peso1 + num2 * peso2 + num3 * peso3) / (peso1 + peso2 + peso3);

//         System.out.printf("A média ponderada é: %.2f", mediaPonderada);

//         scanner.close();
//     }
// }

//03

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Digite a quantidade de homicídios: ");
//         double homicidios = scanner.nextDouble();

//         System.out.print("Digite o número total de habitantes: ");
//         double habitantes = scanner.nextDouble();

//         double taxa = (homicidios / habitantes) * 100000;

//         System.out.printf("A taxa de homicídios por 100 mil habitantes é: %.2f", taxa);

//         scanner.close();
//     }
// }

//04

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Digite o valor do primeiro elemento: ");
//         double primeiro = scanner.nextDouble();

//         System.out.print("Digite a quantidade de termos: ");
//         int n = scanner.nextInt();

//         System.out.print("Digite o valor da razão: ");
//         double razao = scanner.nextDouble();

//         double enesimo = primeiro + (n - 1) * razao;

//         System.out.printf("O %dº termo da progressão aritmética é: %.2f", n, enesimo);

//         scanner.close();
//     }
// }

//05

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Horário inicial:");
//         System.out.print("Hora: ");
//         int horaInicio = scanner.nextInt();
//         System.out.print("Minuto: ");
//         int minutoInicio = scanner.nextInt();

//         System.out.println("Horário final:");
//         System.out.print("Hora: ");
//         int horaFim = scanner.nextInt();
//         System.out.print("Minuto: ");
//         int minutoFim = scanner.nextInt();

//         int totalMinutosInicio = horaInicio * 60 + minutoInicio;
//         int totalMinutosFim = horaFim * 60 + minutoFim;

//         int duracao;
//         if (totalMinutosFim >= totalMinutosInicio) {
//             duracao = totalMinutosFim - totalMinutosInicio;
//         } else {
//             duracao = (24 * 60 - totalMinutosInicio) + totalMinutosFim;
//         }

//         System.out.println("Duração do evento: " + duracao + " minutos");

//         scanner.close();
//     }
// }

//import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Digite a base do triângulo: ");
//         double base = scanner.nextDouble();

//         System.out.print("Digite a altura do triângulo: ");
//         double altura = scanner.nextDouble();

//         double area = (base * altura) / 2;

//         System.out.printf("A área do triângulo retângulo é: %.2f", area);

//         scanner.close();
//     }
// }

//06

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Digite a temperatura em graus Celsius: ");
//         double celsius = scanner.nextDouble();

//         double fahrenheit = (celsius * 9.0 / 5.0) + 32;

//         System.out.printf("%.2f °C equivale a %.2f °F", celsius, fahrenheit);

//         scanner.close();
//     }
// }

//07

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Digite a temperatura em graus Celsius: ");
//         double celsius = scanner.nextDouble();

//         double fahrenheit = (celsius * 9.0 / 5.0) + 32;

//         System.out.printf("%.2f °C equivale a %.2f °F", celsius, fahrenheit);

//         scanner.close();
//     }
// }

//08

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Digite o preço original do produto: R$ ");
//         double precoOriginal = scanner.nextDouble();

//         System.out.print("Digite a porcentagem de desconto: ");
//         double desconto = scanner.nextDouble();

//         double valorDesconto = precoOriginal * (desconto / 100);
//         double precoFinal = precoOriginal - valorDesconto;

//         System.out.printf("Preço original: R$ %.2f\n", precoOriginal);
//         System.out.printf("Desconto: R$ %.2f\n", valorDesconto);
//         System.out.printf("Preço final: R$ %.2f", precoFinal);

//         scanner.close();
//     }
// }

//09

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Digite o capital a ser investido: R$ ");
//         double capital = scanner.nextDouble();

//         System.out.print("Digite a taxa de juros mensal (em %): ");
//         double taxaPercentual = scanner.nextDouble();
//         double taxa = taxaPercentual / 100;

//         System.out.print("Digite o tempo em meses: ");
//         int tempo = scanner.nextInt();

//         // Juros Simples
//         double montanteSimples = capital * (1 + taxa * tempo);

//         // Juros Compostos
//         double montanteComposto = capital * Math.pow(1 + taxa, tempo);

//         System.out.printf("\n--- Resultados ---\n");
//         System.out.printf("Juros Simples: R$ %.2f\n", montanteSimples);
//         System.out.printf("Juros Compostos: R$ %.2f\n", montanteComposto);
//         System.out.printf("Diferença: R$ %.2f\n", (montanteComposto - montanteSimples));

//         scanner.close();
//     }
// }

//10

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Digite um número para ver sua tabuada: ");
//         int numero = scanner.nextInt();

//         System.out.println("\nTabuada do " + numero + ":");
//         System.out.println("------------------");

//         for (int i = 1; i <= 10; i++) {
//             System.out.printf("%d x %2d = %d\n", numero, i, numero * i);
//         }

//         scanner.close();
//     }
// }