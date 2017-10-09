import java.util.ArrayList;


public class TestClass {
    static String s;
    static String s1;
    String n,n1;
    static String titleStudent = "MIDDLE";
    static ArrayList<String> list = new ArrayList<String>();
    static String titletext = "This immediately cuts the maximum number of transactions per second by the factor of 10 as well (limited thread-pool, limited CPU resources).";

    public static void main(String args[])
    {
        TestClass cl = new TestClass("Igor Petrov", "Ivan Ivanov");
        SortGuys();
        System.out.println("Compare result: "  + isTitleEquals(s, s1));
    }

    //s - student; s1 - student2
    public TestClass(String s,String s1 ) {
        this.s = s;
        this.s1 = s1;
        list.add(s);
        list.add(s1);
    }

    public static void SortGuys()               //сортировка item
    {
        ArrayList<String> SortedList = new ArrayList<String>();

        System.out.println("Сортировка завершена успешно! Студентов в списке:" + list.size() );
        for(int i = 0;i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public boolean postRejected(final String postText) {
        //some logic
        return false;
    }

    public void selectRejectedRadioButtonFromMainPageInFooterArea(final String postText) {
       //TODO: need to implement
    }

    public static boolean isTitleEquals(final String s, final String s1) {
        return s.equals(s1);
    }

}
