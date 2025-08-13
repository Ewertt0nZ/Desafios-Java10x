package Desafio6tres;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        LinkedList<Heroi> listaHerois = new LinkedList<>();
        listaHerois.add(new Heroi("Amai Mask", 24, "Herói Rank A"));
        listaHerois.add(new Heroi("Tatsumaki", 28,"Herói Rank S"));
        listaHerois.add(new Heroi("Mumen Rider", 25,"Herói Rank C"));
        listaHerois.add(new Heroi("Garou", 18, "Assassino de Heróis"));
        listaHerois.add(new Heroi("Genos", 19, "Herói Rank S"));
        listaHerois.add(new Heroi("Fubuki", 23, "Herói Rank B"));
        listaHerois.add(new Heroi("Saitama", 25,"Herói Rank B"));
        listaHerois.add(new Heroi("Stinger", 24,"Herói Rank A"));

        while (opcao != 8) {
            System.out.println("  ---   Escolha uma Opçção:  ---  ");
            System.out.println("1 - Adicionar um novo Herói no início da Lista");
            System.out.println("2 - Remover o Herói do início da lista");
            System.out.println("3 - Listar todos os Heróis");
            System.out.println("4 - Pesquisar Herói pelo índice");
            System.out.println("5 - Remover Herói pelo índice");
            System.out.println("6 - Pesquisar Herói pelo nome");
            System.out.println("7 - Remover herói pelo nome");
            System.out.println("8 - Encerrrar sistema");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    String nome;
                    String classificacao;
                    int idade;

                    System.out.println("Digite o nome do Herói: "); nome = scanner.nextLine();
                    System.out.println("Digite a classificação do Herói:"); classificacao = scanner.nextLine();
                    System.out.println("Digite a idade do Herói:"); idade = scanner.nextInt();

                    listaHerois.addFirst(new Heroi(nome, idade,classificacao));
                    System.out.println("Herói cadastrado com sucesso!");
                    System.out.println("");
                    break;

                case 2:
                    if (listaHerois.isEmpty()){
                        System.out.println("A lista está vazia");
                        System.out.println("");
                    }else {
                        listaHerois.removeFirst();
                        System.out.println("Herói removido com sucesso!");
                        System.out.println("");
                    }
                    break;

                case 3:
                    if (listaHerois.isEmpty()){
                        System.out.println("Não há nenhum Herói cadastrado na lista");
                        System.out.println("");
                    }else {
                        for (int i = 0; i < listaHerois.size() ; i++) {
                            System.out.println(listaHerois.get(i));
                        }
                        System.out.println("");
                    }

                    if(listaHerois.size() > 1) {
                        int ordenar;
                        System.out.println("Deseja ordenar a lista?");
                        System.out.println("Sim - digite 1");
                        System.out.println("Não - digite qualquer outro número");
                        ordenar = scanner.nextInt();

                        if (ordenar == 1) {
                            boolean fechar = false;

                            while (!fechar) {
                                System.out.println("1 - Ordenar por nome em ordem crescente");
                                System.out.println("2 - Ordenar por nome em ordem decrescente");
                                System.out.println("3 - Ordeanr por idade em ordem crescente");
                                System.out.println("4 - Ordeanr por idade em ordem decrescente");
                                System.out.println("5 - Ordenar por classificação em ordem crescente");
                                System.out.println("6 - Ordenar por classificação em ordem decrescente");
                                System.out.println("7 - Sair");

                                ordenar = scanner.nextInt();
                                switch (ordenar) {
                                    case 1:
                                        listaHerois.sort(Comparator.comparing(Heroi::getNome));
                                        for (int i = 0; i < listaHerois.size(); i++) {
                                            System.out.println(listaHerois.get(i));
                                        }
                                        System.out.println("");
                                        break;

                                    case 2:
                                        Collections.sort(listaHerois, Comparator.comparing(Heroi::getNome).reversed());
                                        for (int i = 0; i < listaHerois.size(); i++) {
                                            System.out.println(listaHerois.get(i));
                                        }
                                        System.out.println("");
                                        break;

                                    case 3:
                                        listaHerois.sort(Comparator.comparing(Heroi::getIdade));
                                        for (int i = 0; i < listaHerois.size(); i++) {
                                            System.out.println(listaHerois.get(i));
                                        }
                                        System.out.println("");
                                        break;

                                    case 4:
                                        Collections.sort(listaHerois, Comparator.comparing(Heroi::getIdade).reversed());
                                        for (int i = 0; i < listaHerois.size(); i++) {
                                            System.out.println(listaHerois.get(i));
                                        }
                                        System.out.println("");
                                        break;

                                    case 5:
                                        listaHerois.sort(Comparator.comparing(Heroi::getClassificação));
                                        for (int i = 0; i < listaHerois.size(); i++) {
                                            System.out.println(listaHerois.get(i));
                                        }
                                        System.out.println("");
                                        break;

                                    case 6:
                                        listaHerois.sort(Comparator.comparing(Heroi::getClassificação).reversed());
                                        for (int i = 0; i < listaHerois.size(); i++) {
                                            System.out.println(listaHerois.get(i));
                                        }
                                        System.out.println("");
                                        break;

                                    case 7:
                                        fechar = true;
                                        System.out.println("Voltando a tela inicial");
                                        System.out.println("");
                                        break;

                                    default:
                                        System.out.println("Escolha uma opção válida");
                                        System.out.println("");
                                        break;
                                }
                            }
                        }
                    }
                    break;

                case 4:
                    int pesquisa;

                    if(listaHerois.isEmpty()){
                        System.out.println("Não há nehume Herói cadastrado na lista");
                        System.out.println("");
                    }else {
                        System.out.println("Digite o número correspondente ao número do Herói desejado");
                        pesquisa = scanner.nextInt();
                        if (pesquisa < listaHerois.size()) {
                            System.out.println(listaHerois.get(pesquisa));
                            System.out.println("");
                        } else {
                            System.out.println("Nenhum resultado encontrado");
                            System.out.println("");
                        }
                    }
                    break;

                case 5:
                    int remover;

                    if (listaHerois.isEmpty()){
                        System.out.println("A lista está vazia");
                        System.out.println("");
                    }else {
                        System.out.println("Digite o número correspondente ao número do Herói que deseja remover");
                        remover = scanner.nextInt();
                        if (remover < listaHerois.size()) {
                            listaHerois.remove(remover);
                            System.out.println("Herói removido com sucesso!");
                            System.out.println("");
                        } else {
                            System.out.println("Nenhum resultado encontrado");
                            System.out.println("");
                        }
                    }
                    break;

                case 6:
                    String procurarNome;
                    boolean encontrado = false;

                    if (listaHerois.isEmpty()){
                        System.out.println("Não há nenhum Herói cadastrado na lista");
                        System.out.println("");
                    }else {
                        System.out.println("Digite o nome do Herói desejado");
                        procurarNome = scanner.nextLine();
                        for (Heroi heroi : listaHerois) {
                            if (heroi.getNome().equalsIgnoreCase(procurarNome)) {
                                System.out.println("Herói encontrado");
                                System.out.println(heroi);
                                encontrado = true;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Nenhum resultado enconrtrado");
                        }
                        System.out.println("");
                    }
                    break;

                case 7:
                    String excluir;
                    Iterator<Heroi> iterator = listaHerois.iterator();
                    boolean exlcuido = false;

                    if (listaHerois.isEmpty()){
                        System.out.println("A lista está vazia");
                        System.out.println("");
                    }else {
                        System.out.println("Digite o nome do Herói que deseja remover");
                        excluir = scanner.nextLine();
                        while (iterator.hasNext()) {
                            Heroi heroi = iterator.next();
                           if(heroi.getNome().equalsIgnoreCase(excluir)) {
                               iterator.remove();
                               exlcuido = true;
                               System.out.println("Herói removido com sucesso!");
                           }
                        }
                        if (!exlcuido) {
                            System.out.println("Não foi possível excluir, nenhum resultado encontrado");
                        }
                        System.out.println("");
                    }
                    break;

                case 8:
                    System.out.println("Sistema encerrado");
                    System.out.println("");
                    break;

                default:
                    System.out.println("Escolha um opção válida");
                    System.out.println("");
                    break;
            }
        }
        scanner.close();
    }
}
