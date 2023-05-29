public class Прікол {
    public static void main(String[] args) {
        int i,f,c,d,v,a,b;
        int o=0;
        for(i=1;i<=999999;i++){
            f=i/100000;
            c=(i-(f*100000))/10000;
            d=(i-(f*100000)-(c*10000))/1000;
            v=(i-(f*100000)-(c*10000)-(d*1000))/100;
            a=(i-(f*100000)-(c*10000)-(d*1000)-(v*100))/10;
            b=(i-(f*100000)-(c*10000)-(d*1000)-(v*100)-(a*10));

            if(f+c+d==v+a+b){
                System.out.println(f+""+c+""+d+""+v+""+a+""+b);
                o++;
            }


        }
        System.out.println(o);
    }
}
