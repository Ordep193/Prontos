public class ListaFilme {
    int tam=1,ultimo=-1,aux=ultimo;
    private Filme[] filmeList;

    public ListaFilme(){
        filmeList = new Filme[tam];
    }
    
    public void add(Filme film) throws Exception{
        if(ultimo==filmeList.length) throw new Exception("não há espaço na lista de filmes");

        if(aux==-1){
            ultimo++;
            aux=ultimo;
            filmeList[0]=film;
        } else{
            if(filmeList[aux].getCodigo()>film.getCodigo()){
                filmeList[aux+1]=filmeList[aux];
                aux--;
                add(film); 
            }else{
                filmeList[++ultimo]=film;
                aux=ultimo;
            }
        } 
    }

    public void aumetarTam(int tamanho){
        tam = tamanho;
        Filme[] listTemp = new Filme[filmeList.length];
        listTemp = filmeList;

        filmeList = new Filme[tam];
        for(int i=0;i<listTemp.length;i++){
            filmeList[i]=listTemp[i];
        }
    }

    public void excluir(int cod){
        for(int i=0;i<filmeList.length;i++){
            if(filmeList[i].getCodigo()==cod){
                for(int j=i;j<filmeList.length-1;j++){
                    filmeList[j]=filmeList[j+1];
                }
            }
        }
        ultimo--;
    }

    public Filme pesquisa(String nome){
        for(int i=0;i<filmeList.length;i++){
            if(filmeList[i].getNome().equals(nome)) return filmeList[i];
        }
            return null;
    }

    public void mostrar(){
        System.out.println("CÓDIGO - NOME - GÊNERO");
        for(int i=0;i<=ultimo;i++){
            System.out.println(filmeList[i].getCodigo()+" - "+filmeList[i].getNome()+" - "+filmeList[i].getGenero());
        }
    }
}