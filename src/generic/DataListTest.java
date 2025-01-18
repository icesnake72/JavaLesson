package generic;

public class DataListTest {
    public static void main(String[] args) {
        DataList list = new DataList(10);
        for(int i=0; i<15; i++) {
            list.add(i+1);
        }

        for(int i=0; i<15; i++) {
            System.out.println(list.get(i));
        }

        System.out.println( list );
        // 1,2,3,4,5,6,7,8,9,10
    }
}
