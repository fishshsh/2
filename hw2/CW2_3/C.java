public class C extends A{
    @Override
    public int count(int a, int b){
        int P = a*b;
        System.out.println("P=" + P);
    }

    @Override
    void show(){
        System.out.println("Kласс C");
    }
}
