package interfacee;

public  class Proses implements Toplama,Cixma,Vurma,Cutdumu{
    @Override
    public int cixma(int a, int b, int c) {
        int netice=a-b-c;
        return netice;
    }

    @Override
    public boolean cutdurmuu(int eded) {
        boolean netice =false;
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

    @Override
    public int vur(int a, int b, int c) {
         int netice=a*b*c;
        return netice;
    }
}
