package Methods;

public class PassByValueAndPassByReference {
    public static void Change(int x ){
        x = 10;
    }

    public static void main(String[] args) {
        int x = 6;
        System.out.println(x);
        Change(x);
        System.out.println(x);
    }
}
