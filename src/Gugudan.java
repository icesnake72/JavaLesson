public class Gugudan {
    public static void main(String[] args) {
        // 2단
        /*
         * 2 x 1 = 2
         * 2 x 2 = 4
         * ...
         * 2 x 9 = 18
         * */

        int i = 1;
        int dan = 2;
        while( dan < 10 ) {
            i = 1;
            System.out.printf("%d단", dan);
            while (i < 10) {
                System.out.printf("%d x %d = %d\n", dan, i, dan * i);
                i += 1;
            }

            dan += 1;
        }
    }
}
