package Pilha.Exe2;

import java.util.Scanner;

class App{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Pilha p = new Pilha();
        System.out.println("Digete a conta a ser testada");
        String conta = in.nextLine();
        boolean invalid=false;

        for(int i=0;i<conta.length();i++){
            if(conta.charAt(i)==('('))
                try {
                    p.push(conta.charAt(i));    
                } catch (Exception e) {
                    System.out.println("Erro: "+e);
                }
            else if(conta.charAt(i)==')'){
                if(p.isVazia()){
                    invalid=true;
                }
                try{
                    p.pop();    
                } catch (Exception e) {
                    System.out.println("Erro: "+e);
                }
            }
        }

        if(invalid)
            System.out.println("Conta inválida");
        else if(!p.isVazia())
            System.out.println("Conta inválida");
        else
            System.out.println("Conta válida");
        in.close();
    }
}
