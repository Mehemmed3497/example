package interfaceQaralama;

public class Proses implements Vurma,Bolme,Toplama,Cxma,Mentiqi{

    @Override
    public double bolme(int a, int b) {
        int netice = a/b;
        return netice;
    }

    @Override
    public int cixma(int a, int b, int c) {
        int netice = a-b-c;
        return netice;
    }

    @Override
    public boolean mentiq(int a) {
        boolean netice=false;
        if (a%2==0){
            netice=true;
        }

        return netice;
    }

    @Override
    public int topla(int a, int b, int c, int d) {
        int netice = a+b+c+d;
        return netice;
    }

    @Override
    public int vurma(int a, int b, int c) {
        int netice=a*b*c;
        return netice;
    }
}
