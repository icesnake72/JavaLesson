package generic;

public class DataList {
    private int[] array;
    private int position;
    private int size;

    public DataList(int count) {
        array = new int[count];
        position = 0;
        size = count;
    }

    public void add(int number) {
        // array의 position위치에 number를 대입한뒤, postion을 1증가시킴
//        try {
//            array[position++] = number;
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println( e.getMessage() );
//        }
        if ( position >= size ) {
            // position의 값이 최대이기 때문에 값을 추가할 수 없음
            System.out.println("더이상 값을 추가할 수 없습니다.");
            return;
        }

        array[position++] = number;
    }

    // 배열의 크기를 반환한다.
    public int size() {
        return size;
    }

    public int get(int index) {
        try {
            return array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        return -1;
    }

}
