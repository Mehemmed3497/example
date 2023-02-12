package interfacee;

public class Operation implements Arifmetic,Mentiqi{
    @Override
    public int toplama(int a, int b) {
        int netice = a+b;
        return netice;
    }

    @Override
    public boolean mentiqi(int eded) {
        boolean netice =false;
        if (eded%2==0){
            netice=true;
        }
        return netice;
    }
}
