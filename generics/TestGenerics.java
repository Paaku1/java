package generics;

public class TestGenerics {
    public static void main(String[] args) {
        Printer<Integer> n = new Printer<>(52);
        n.print();
        System.out.println(print("karthi", 12));
        System.out.println(print("Lavanya", 20));
    }

    private static <T, V> T print(T name, V age) {
        System.out.println(name.getClass());
        System.out.println(age.getClass());
        System.out.println("name: " + name + "\nage: " + age);
        return name;
    }
}
