public class Three {
    public static void main(String[] args){

       for (int b=1;b<=10;b++) {
           int c = 10 % b;
           if(c>0) continue;
           System.out.println(b);
       }
    }
}
