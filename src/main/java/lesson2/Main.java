package lesson2;

public class Main {
    public static void main(String[] args) {

        List<String> list = new LinkedL<>();

        for (int i = 0; i < 10; i++) {
            list.add("i" + i);
        }

        System.out.println(list);
        System.out.println(list.indexOf("i6"));
        System.out.println(list.get(8));
        list.set(6, "eeee");
        System.out.println(list);
        System.out.println(list.remove(0));
        System.out.println(list);
        list.remove("eeee");
        System.out.println(list);

    }
}
