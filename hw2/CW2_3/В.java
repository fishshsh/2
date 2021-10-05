public class B extends A{
    @Override
    public int count(int a, int b){
    int R = a - b;
        System.out.println("R=" + R);
    }

    @Override
    void show(){
        System.out.println("Kласс B");
    }
}
