package onconnect;

import ordenacao.Contadores;
import java.util.Scanner;
import java.util.Random;

public class Principal {

    public static void main(String[] args) {

        InicializarMenu();

    }

    private static void InicializarMenu() {
        Scanner menu = new Scanner(System.in);

        System.out.println("\tBem-Vindo!\n\n");

        System.out.print("##---------         MENU        ----------##\n\n");
        System.out.print("|------------------------------------------|\n");
        System.out.print("| Op��o 1 - Pequeno volume de dados        |\n");
        System.out.print("| Op��o 2 - M�dio volume de dados          |\n");
        System.out.print("| Op��o 3 - Grande volume de dados         |\n");
        System.out.print("| Op��o 4 - Sair                           |\n");
        System.out.print("|------------------------------------------|\n");
        System.out.print("Digite uma Op��o: ");
        int opcao = menu.nextInt();
        CriarMenu(opcao, menu);
    }

    private static void CriarMenu(int opcao, Scanner menu) {

        if (opcao == 4) {
            System.out.print("\nAt� logo!");
            menu.close();
            return;
        }

        switch (opcao) {
            case 1:
                PeqVolumeDados(menu);
                break;
            case 2:
                MedVolumeDados(menu);
                break;

            case 3:
                GrandeVolumeDados(menu);
                break;

            default:
                System.out.print("\nOp��o Inv�lida!");
                break;
        }

    }

    private static Contadores SepararOrdenacao(int selecao, int[] dados) {

        switch (selecao) {

            case 1:
                System.out.println("M�todo bolha selecionado!");
                return ordenacao.MetodosOrdenacao.ordenacaoBolha(dados);

            case 2:
                System.out.println("M�todo inser��o selecionado!");
                return ordenacao.MetodosOrdenacao.ordenacaoInsercao(dados);

            case 3:
                System.out.println("M�todo sele��o selecionado!");
                return ordenacao.MetodosOrdenacao.ordenacaoSelecao(dados);

        }

        return new Contadores(0, 0);

    }

    private static void PeqVolumeDados(Scanner menu) {

        System.out.print("\nOp��o Pequeno volume de dados Selecionado\n");

        System.out.print("\nDigite o tamanho do vetor: ");

        int tam = menu.nextInt();

        System.out.printf("\nVetor de tamanho %d\n", tam);

        int dados[] = new int[tam];

        for (int i = 0; i < dados.length; i++) {
            System.out.printf("Informe o %d� elemento do vetor: ", (i + 1));
            dados[i] = menu.nextInt();
        }

        ProcessarDados(menu, dados);

    }

    private static void MedVolumeDados(Scanner menu) {

        System.out.print("\nOp��o M�dio volume de dados Selecionado\n");
        Random aleatorio = new Random();

        int dados[] = new int[1000];

        for (int i = 0; i < dados.length; i++) {

            dados[i] = aleatorio.nextInt(dados.length - 1);
        }
        
        ProcessarDados(menu, dados);
    }

    private static void GrandeVolumeDados(Scanner menu) {
        
        System.out.print("\nOp��o Grande volume de dados Selecionado\n");
        Random aleatorio = new Random();

        int dados[] = new int[10000];

        for (int i = 0; i < dados.length; i++) {

            dados[i] = aleatorio.nextInt(dados.length - 1);
        }
        
        ProcessarDados(menu, dados);
    }

    private static void ProcessarDados(Scanner menu, int[] dados) {
        System.out.print("|------------------------------------------|\n");
        System.out.print("| Op��o 1 - M�todo bolha                   |\n");
        System.out.print("| Op��o 2 - M�todo de inser��o             |\n");
        System.out.print("| Op��o 3 - M�todo de sele��o              |\n");
        System.out.print("| Op��o 4 - Sem m�todo de ordena��o        |\n");
        System.out.print("| Op��o 5 - Voltar                         |\n");
        System.out.print("|------------------------------------------|\n");
        System.out.print("Selecione o m�todo de ordena��o: ");
        int selecao = menu.nextInt();
        if (selecao == 5) {
            InicializarMenu();
            return;
        }
        long tempo1 = System.currentTimeMillis();
        Contadores contadores = SepararOrdenacao(selecao, dados);
        long tempo2 = System.currentTimeMillis();

        System.out.println("\nO tempo de processamento foi de " + (tempo2 - tempo1) + " ms");
        System.out.println("O total de passos para a ordena��o escolhida foi de " + contadores.passos + " passos");
        System.out.println("O total de trocas para a ordena��o escolhida foi de " + contadores.trocas + " trocas");
        System.out.println("Deseja voltar ao menu? [0] N�o ou [1] Sim: ");
        int escolha = menu.nextInt();
        if (escolha == 1) {
            InicializarMenu();
        }
    }
}
