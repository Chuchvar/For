public class Main {
    public static void main(String[] args){
        int x=500;
        //while
        while (x!=650){
            x=x+10;
            System.out.println("While-"+x);
        }
        //for
        for (int n=500;n<=650; n+=10) {
            System.out.println("For-"+n);
        }
        //do-while
        int b =500;
        do{
            b += 10;
            System.out.println("Do-while-" + b);
        }while(b!=650);
    }
}