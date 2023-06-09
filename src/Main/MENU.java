package Main;

import java.util.Scanner;

public class MENU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Bem-vindo à ONG!");

        while (true) {
            System.out.println("Selecione o que você deseja:");
            System.out.println("1. Doação");
            System.out.println("2. Objetivos");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    realizarDoacao(scanner);
                    break;
                case 2:
                    exibirObjetivos(scanner);
                    break;
                case 0:
                    System.out.println("Obrigado por utilizar o sistema da ONG!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
                    break;
            }
        }
    }

    public static void realizarDoacao(Scanner scanner) {
        System.out.println("Digite seu nome ou empresa:");
        String nome = scanner.nextLine();

        System.out.println("Digite a quantidade que deseja doar:");
        double quantidade = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer

        System.out.println("Muito obrigado pela doação, " + nome + "!");
    }

    public static void exibirObjetivos(Scanner scanner) {
        int opcao;

        while (true) {
            System.out.println("Selecione uma opção que você deseja saber:");
            System.out.println("1. Otimização do ambiente");
            System.out.println("2. Gerenciamento de recursos");
            System.out.println("3. Monitoramento ");
            System.out.println("4. Planejamento e tomada de decisão");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.println("A otimização do ambiente na agricultura vertical envolve o controle de luz, temperatura, umidade e outros fatores para criar condições ideais de crescimento das plantas.");
                    System.out.println("Qual alimento voce deseja:");
                    while (true) {
                        System.out.println("1. Morango");
                        System.out.println("2. Uva");
                        System.out.println("3. Alface");

                        int alimento = scanner.nextInt();

                        System.out.println("Quantos celsus?");
                        int celsus = scanner.nextInt();


                        if (celsus > 10 && alimento) {
                            System.out.println("Alimento aprovado.");
                        } else {
                            System.out.println("Alimento NÃO aprovado.");
                        }


                        if (celsus < 300 && morango) {
                            System.out.println("Alimento aprovado.");
                        } else {
                            System.out.println("Alimento NÃO aprovado.");
                        }

                        if (tombado == 1 && morango) {
                            System.out.println("Alimento aprovado");
                        } else {
                            System.out.println("Alimento NÃO aprovado");
                        }
                        break;

                        case 2:
                            System.out.println("O gerenciamento de recursos na agricultura vertical inclui a gestão eficiente de água, nutrientes e energia para garantir a sustentabilidade e maximizar a produção.");
                            break;

                        case 3:
                            System.out.println("O monitoramento  na agricultura vertical são realizados por meio de sensores e algoritmos de IA para identificar problemas de saúde das plantas e tomar medidas corretivas.");
                            break;

                        case 4:
                            System.out.println("O planejamento e a tomada de decisão na agricultura vertical podem ser aprimorados com a IA, que analisa dados e fornece insights para otimizar a produção e tomar decisões mais informadas.");
                            break;

                        case 0:
                            return;
                        default:
                            System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
                            break;
                    }
            }
        }
    }
}

