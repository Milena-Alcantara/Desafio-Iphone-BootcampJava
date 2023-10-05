package edu.desafioIphone;

import java.util.Scanner;

public class Iphone {
    Scanner scanner = new Scanner(System.in);
    public void menuInicial() throws InterruptedException {

        int escolha;
        do {
            System.out.println("Qual aplicativo deseja acessar: ");
            System.out.println("\n\t1- Reprodutor de Músicas\n\t2- Telefone\n\t3- Navegador\n\t0- Bloquear a tela");
             escolha = scanner.nextInt();

            switch (escolha){
                case 1:
                    menuReprodutor();
                    break;
                case 2:
                    menuTelefone();
                    break;
                case 3:
                    menuNavegador();
                    break;
                case 0: System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente\n");

            }
        }while (escolha!=0);
    }

    public void menuReprodutor(){
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        int escolha;
        do {
            System.out.println("\n\t1- Selecionar Música\n\t2- Tocar\n\t3- Pausar\n\t0- Voltar para home");
            escolha = scanner.nextInt();

            switch (escolha){
                case 1:
                    scanner.nextLine();
                    System.out.println("Informe a música desejada: ");
                    String musica = scanner.nextLine();
                    reprodutorMusical.selecionarMusica(musica);
                    break;
                case 2:
                    reprodutorMusical.tocar();
                    break;
                case 3:
                    reprodutorMusical.pausar();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente\n");
            }
        }while (escolha!=0);

    }
    public void menuTelefone(){
        Telefone telefone = new Telefone();
        int escolha;
        do {
            System.out.println("\n\t1- Ligar\n\t2- Atender\n\t3- Correio de Voz\n\t0- Voltar para home");
            escolha = scanner.nextInt();

            switch (escolha){
                case 1:
                    telefone.ligar();
                    break;
                case 2:
                    telefone.atender();
                    break;
                case 3:
                    telefone.inicarCorreioDeVoz();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente\n");
            }
        }while (escolha!=0);
    }
    public void menuNavegador() throws InterruptedException {
        Navegador navegador = new Navegador();
        int escolha;
        do {
            System.out.println("\n\t1- Exibir Página\n\t2- Adicionar nova aba\n\t3- Atualizar\n\t0- Voltar para home");
            escolha = scanner.nextInt();

            switch (escolha){
                case 1:
                    scanner.nextLine();
                    System.out.println("Informe o endereço da página que deseja visualizar: ");
                    navegador.setPaginaAtual(scanner.nextLine());
                    navegador.exibirPagina();
                    break;
                case 2:
                    navegador.adicionarNovaAba();
                    break;
                case 3:
                    navegador.atualizar();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente\n");
                    menuReprodutor();
            }
        }while (escolha!=0);

    }

}
