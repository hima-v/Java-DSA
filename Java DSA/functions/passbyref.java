package functions;

public class passbyref {
    public static void main(String[] args) {
        String name = "Himu";
        System.out.println(name);
        System.out.println(change(name));
        System.out.println(name);
    }

    static String change(String name) {
        name = "Cheems";
        return name;
    }
}
