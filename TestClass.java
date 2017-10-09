import org.jetbrains.annotations.Contract;

import java.util.ArrayList;


public class TestClass {
    private static String student;
    private static String student2;
    String n, n1;
    static String titleStudent = "MIDDLE";
    private static ArrayList<String> list = new ArrayList<String>();
    static String titleText = "This immediately cuts the maximum number of transactions per second by the factor" +
            "of 10 as well (limited thread-pool, limited CPU resources).";

    public static void main(String args[]) {
        TestClass cl = new TestClass("Igor Petrov", "Ivan Ivanov");
        sortGuys();
        System.out.println("Compare result: " + isTitleEquals(student, student2));
    }

    // s - student; s1 - student2
    private TestClass(String s, String s1) {
        TestClass.student = s;
        TestClass.student2 = s1;
        list.add(s);
        list.add(s1);
    }

    //sorting item
    private static void sortGuys() {
        ArrayList<String> sortedList = new ArrayList<String>();

        System.out.println("Сортировка завершена успешно! Студентов в списке:" + list.size());
        for (String aList : list) {
            System.out.println(aList);
        }
    }

    public boolean isPostRejected(final String postText) {
        //some logic
        return false;
    }

    public void selectRejectedRadioButtonFromMainPageInFooterArea(final String postText) {
        //TODO: need to implement
    }

    @Contract(pure = true)
    private static boolean isTitleEquals(final String s, final String s1) {
        return s.equals(s1);
    }

}
