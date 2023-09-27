package Pilha.Exe2;

public class Pilha {
    static final int MAX_TAM = 100;
    char pilha[] = new char[MAX_TAM];
    int topo = -1;

    public boolean isVazia(){
        return topo == -1;
    }
    public int getTamanho(){
        return topo+1;
    }
    public void push(char c) throws Exception{
        if(topo==MAX_TAM-1)
            throw new Exception("Não há espaço livre");
        pilha[++topo]=c;
    }
    public char pop()throws Exception{
        if(isVazia())
            throw new Exception("Essa conta é inválida");
        return pilha[topo--];
    }
}

