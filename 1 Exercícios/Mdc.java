import java.util.Scanner;

public class Mdc {
    protected static int mdc(int x,int y){
        if(x>=y && x%y==0)
            return y;
        else if(x<y) return mdc(y,x);
        else return mdc(y,x%y);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        System.out.println(mdc(x,y));
    }
    
}