package section01.ooppack;

import java.util.Arrays;

public class solution {
    public static void main(String[] args) throws Exception {
        //String
        String name = "John";
        String name2 = new String("John");
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name == name2);
        System.out.println(name.equals(name2));
        String name3 = "John";
        System.out.println(name == name3);
        String[] names = name.split("");
        System.out.println(Arrays.toString(names));

        //String formatting
        String str = String.format("name = %s", name);
        System.out.println("str" + str);
    }
}
