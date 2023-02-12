package interfaceYeni;

public class Proses implements Toplama,Cixma,Mentiqi,Bolme {
    @Override
    public double bolme(int a, int b) {
        int netice=a/b;
        return netice;
    }

    @Override
    public int cixma(int a, int b, int c) {
        int netice=a-b-c;
        return netice;
    }

    @Override
    public boolean mentiqi(int eded) {
        boolean netice=false;
        if (eded%2==0){
            netice=true;
        }
        return netice;
    }

    @Override
    public int topla(int a, int b, int c) {
        int netice=a+b+c;
        return netice;
    }
}
