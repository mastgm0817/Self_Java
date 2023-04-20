package section01.ooppack;

import java.util.ArrayList;

public class solution2 {
    public static void main(String[] args) throws Exception {
        //int배열을만듭니다
        int[] intArr = new int[5];
        intArr[0] = 10;
        intArr[1] = 20;
        intArr[2] = 30;
        intArr[3] = 40;
        intArr[4] = 50;

        //int배열을만듭니다
        int[] intArr2 = {10, 20, 30, 40, 50};

        ArrayList<Integer> crudArr = new ArrayList<>();
        crudArr.add(10); // Add
        System.out.println(crudArr);
        crudArr.set(0,100); // Update
        System.out.println(crudArr);
        crudArr.remove(0); // Delete
        System.out.println(crudArr);
    }
}
