package Atividade1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int questao = scan.nextInt();
        Menu menuI = new Menu();
        menuI.setMenu(menuI.getMenu());
        System.out.println(menuI.getMenu());


        while (questao != 0) {
        Menu againOrEnd = new Menu();
        againOrEnd.setAgainOrEnd(againOrEnd.getAgainOrEnd());


            switch (questao) {
                case 1 -> {
                    Pessoa p1 = new Pessoa();
                    Pessoa p2 = new Pessoa();
                    System.out.println("Informe nome e idade: ");
                    p1.setNome(scan.next());
                    p1.setIdade(scan.nextInt());
                    System.out.println("Informe nome e idade: ");
                    p2.setNome(scan.next());
                    p2.setIdade(scan.nextInt());
                    if (p1.getIdade() > p2.getIdade()) {
                        System.out.println("Pessoa mais velha: " + p1.getNome());
                    } else {
                        System.out.println("Pessoa mais velha: " + p2.getNome());
                    }
                    System.out.println(againOrEnd.getAgainOrEnd());
                    questao = scan.nextInt();
                }
                case 2 -> {
                    System.out.println(againOrEnd.getAgainOrEnd());
                    questao = scan.nextInt();
                }
                case 3 -> {
                    Retangulo retangulo = new Retangulo();
                    System.out.println("Altura: ");
                    retangulo.setAltura(scan.nextFloat());
                    System.out.println("Largura: ");
                    retangulo.setLargura(scan.nextFloat());
                    retangulo.setDiagonal(retangulo.getDiagonal());
                    retangulo.setArea(retangulo.getArea());
                    retangulo.setPerimetro(retangulo.getPerimetro());
                    System.out.println("Area: " + retangulo.getArea());
                    System.out.println("Perimetro: " + retangulo.getPerimetro());
                    System.out.println("Diagonal: " + retangulo.getDiagonal());
                    System.out.println(againOrEnd.getAgainOrEnd());
                    questao = scan.nextInt();
                }
                case 4 -> {
                    Aluno a1 = new Aluno();
                    a1.setNome(scan.next());
                    System.out.println(a1.getNome());
                    System.out.println(againOrEnd.getAgainOrEnd());
                    questao = scan.nextInt();
                }
                case 5 -> {
                    System.out.println(againOrEnd.getAgainOrEnd());
                    questao = scan.nextInt();
                }
            }
        }
    }
}
