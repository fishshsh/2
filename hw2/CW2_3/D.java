public class D extends B{
    @Override
    public int count(int a, int b){
        int L = a / b;
        System.out.println("L=" + L);
    }

    @Override
    void show(){
        System.out.println("Kласс D");
    }
}
