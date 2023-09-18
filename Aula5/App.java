import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean rodar = true;
        ListaFilme lista = new ListaFilme();
        Filme filme;
        int op=0,cod,tam;
        String nome,gem;
        while(rodar){
            switch (op) {
                case 0:
                    System.out.println("        |FILMES|        ");
                    System.out.println("1-Adicionar filme\n2-Excluir filme\n3-Ver lista de filme\n4-Aumentar tamanho da lista\n5-Buscar um filme\n6-Fechar");
                    op=in.nextInt();
                    in.nextLine();
                    break;
                case 1:
                    System.out.println("Qual o nome do filme?");
                    nome=in.nextLine();
                    System.out.println("Qual o gênero do filme?");
                    gem=in.nextLine();
                    System.out.println("Qual o codigo do filme?");
                    cod=in.nextInt();
                    in.nextLine();
                    filme = new Filme(nome, gem, cod);
                    try {
                        lista.add(filme);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    op=0;
                    break;
                case 2:
                    System.out.println("Qual o código do filme que você quer excluir?");
                    cod=in.nextInt();
                    in.nextLine();
                    lista.excluir(cod);
                    op=0;
                    break;
                case 3:
                    lista.mostrar();
                    op=0;
                    break;
                case 4:
                    System.out.println("Tamanho atual da lista: "+lista.tam);
                    System.out.println("Aumentar para quanto?");
                    tam=in.nextInt();
                    in.nextLine();
                    lista.aumetarTam(tam);
                    op=0;
                    break;
                case 5:
                    System.out.println("Qual filme você quer procurar?");
                    nome=in.nextLine();
                    filme = lista.pesquisa(nome);
                    if(filme!=null){
                        System.out.println("CÓDIGO - NOME - GÊNERO");
                        System.out.println(filme.getCodigo()+" - "+filme.getNome()+" - "+filme.getGenero());
                    }else
                        System.out.println("Filme não encontrado");
                    op=0;
                    break;
                case 6:
                    rodar=false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    op=0;
                    break;
            }
        }
        in.close();
    }
}
