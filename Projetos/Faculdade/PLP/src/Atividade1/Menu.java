package Atividade1;

public class Menu {

    private String menu;
    private String menuWhile;
    private String againOrEnd;


    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {this.menu = (">Escolha uma questão de 1 a 5!<\n" +
                                                    "-------------------------------\n" +
                                                    "    1 - Pessoa Mais Velha\n"+
                                                    "    2 - Salário Médio\n"+
                                                    "    3 - Retangulo\n"+
                                                    "    4 - Aumento de Funcionário\n"+
                                                    "    5 - Notas de Aluno\n"+
                                                    "-------------------------------\n"+
                                                    "      Digite 0 para sair!");

    }

    public String getMenuWhile() {return menuWhile;}


    public void setMenuWhile(String menuWhile) {
        this.menuWhile = menuWhile;
    }

    public String getAgainOrEnd() {return againOrEnd;}

    public void setAgainOrEnd(String againOrEnd) {
        this.againOrEnd = ("Para repetir a questão, informe o mesmo numero escolhido.\n" +
                            "Para escolher outra questão, digite o numero referente.\n"+
                            "Para sair e terminar o programa digite 0. ");;
    }
}


