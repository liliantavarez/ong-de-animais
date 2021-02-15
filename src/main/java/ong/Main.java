package ong;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Cadastros> totalCad = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("---------------NAO COMPRE ADOTE------------");
            System.out.println("1.FAZER NOVO CADASTRO DE PET");
            System.out.println("2.BUSCAR ANIMAIS CADASTRADOS");
            System.out.println("0.SAIR");
            System.out.println("-------------------------------------------");
            escolha = s.nextInt();

            switch (escolha) {

                case 1:
                    Cadastros novoCad = new Cadastros();

                    System.out.println("ESPECIE:");
                    String especie = s.next();

                    System.out.println("PORTE:");
                    String porte = s.next();

                    System.out.println("NUMERO DE IDENFICAÇAO:");
                    int numID = s.nextInt();

                    System.out.println("INSIRA UMA BREVE DESCRIÇAO SOBRE O PET:");
                    s.nextLine();
                    String descricao = s.nextLine();

                    novoCad.setEspecie(especie);
                    novoCad.setPorte(porte);
                    novoCad.setNumId(numID);
                    novoCad.setDescricao(descricao);

                    totalCad.add(novoCad);
                    break;
                case 2:
                    System.out.println("----------------FAZER BUSCA----------------");
                    System.out.println("1.ESPECIE");
                    System.out.println("2.PORTE");
                    System.out.println("3.LISTAR TODOS");
                    s.nextLine();
                    escolha = s.nextInt();
                    switch (escolha) {
                        case 1:
                            System.out.println("1.GATO");
                            System.out.println("2.CACHORRO");
                            s.nextLine();
                            escolha = s.nextInt();
                            switch (escolha) {
                                case 1:
                                    for (int i = 0; i < totalCad.size(); i++) {
                                        if (totalCad.get(i).getEspecie().equals("GATO")) {
                                            System.out.println("-------------------------------------------");
                                            System.out.println("ID: " + totalCad.get(i).getNumId());
                                            System.out.println("Porte: " + totalCad.get(i).getPorte());
                                            System.out.println("Descrição: " + totalCad.get(i).getDescricao());
                                            System.out.println("-------------------------------------------");
                                        }
                                    }
                                    break;
                                case 2:
                                    for (int i = 0; i < totalCad.size(); i++) {
                                        if (totalCad.get(i).getEspecie().equals("CACHORRO")) {
                                            System.out.println("-------------------------------------------");
                                            System.out.println("ID: " + totalCad.get(i).getNumId());
                                            System.out.println("Porte: " + totalCad.get(i).getPorte());
                                            System.out.println("Descrição: " + totalCad.get(i).getDescricao());
                                            System.out.println("-------------------------------------------");
                                        }
                                    }
                                    break;
                                default:
                                    System.out.println("OPÇÃO INVALIDA");
                            }
                            break;
                        case 2:
                            System.out.println("1.PEQUENO");
                            System.out.println("2.MEDIO");
                            System.out.println("3.GRANDE");
                            s.nextLine();
                            escolha = s.nextInt();
                            switch (escolha) {
                                case 1:
                                    for (int i = 0; i < totalCad.size(); i++) {
                                        if (totalCad.get(i).getPorte().equals("PEQUENO")) {
                                            System.out.println("-------------------------------------------");
                                            System.out.println("ID: " + totalCad.get(i).getNumId());
                                            System.out.println("Especie: " + totalCad.get(i).getEspecie());
                                            System.out.println("Descrição: " + totalCad.get(i).getDescricao());
                                            System.out.println("-------------------------------------------");
                                        }
                                    }
                                    break;
                                case 2:
                                    for (int i = 0; i < totalCad.size(); i++) {
                                        if (totalCad.get(i).getPorte().equals("MEDIO")) {
                                            System.out.println("-------------------------------------------");
                                            System.out.println("ID: " + totalCad.get(i).getNumId());
                                            System.out.println("Especie: " + totalCad.get(i).getEspecie());
                                            System.out.println("Descrição: " + totalCad.get(i).getDescricao());
                                            System.out.println("-------------------------------------------");
                                        }
                                    }
                                    break;
                                case 3:
                                    for (int i = 0; i < totalCad.size(); i++) {
                                        if (totalCad.get(i).getPorte().equals("GRANDE")) {
                                            System.out.println("-------------------------------------------");
                                            System.out.println("ID: " + totalCad.get(i).getNumId());
                                            System.out.println("Especie: " + totalCad.get(i).getEspecie());
                                            System.out.println("Descrição: " + totalCad.get(i).getDescricao());
                                            System.out.println("-------------------------------------------");
                                        }
                                    }
                                    break;
                                default:
                                    System.out.println("OPÇÃO INVALIDA");
                            }
                            break;
                        case 3:
                            for (int i = 0; i < totalCad.size(); i++) {
                                System.out.println("-------------------------------------------");
                                System.out.println("ID: " + totalCad.get(i).getNumId());
                                System.out.println("Especie: " + totalCad.get(i).getEspecie());
                                System.out.println("Porte: " + totalCad.get(i).getPorte());
                                System.out.println("Descrição: " + totalCad.get(i).getDescricao());
                                System.out.println("-------------------------------------------");
                            }
                            if (totalCad.size()<=0){
                                System.out.println("NENHUM ANIMAL CADASTRADO");
                            }
                            break;
                        default:
                            System.out.println("OPÇÃO INVALIDA");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
            }
        } while (escolha != 0);
    }
}
