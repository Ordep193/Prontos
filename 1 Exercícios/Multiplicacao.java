import java.util.Scanner;

public class Multiplicacao {
    public static long mult(int num,int mult,int somador){
        if(mult==0)
            return 0;
        else if(mult==1)
            return somador;
        else{
                somador+=num;
                mult--;
            return mult(num,mult,somador);
        }
    }
    public static long mult(int num,int mult){
        int somador=num;
        if(mult==0)
            return 0;
        else if(mult==1)
            return somador;
        else{
                somador+=num;
                mult--;
            return mult(num,mult,somador);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digita o número");
        int num=in.nextInt();
        System.out.println("Digite o multipplicador");
        int mult=in.nextInt();
        System.out.println(mult(num,mult));
        in.close();
    }
}