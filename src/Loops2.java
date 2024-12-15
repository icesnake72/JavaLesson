import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        // 구구단
        Scanner sc = new Scanner(System.in);

        System.out.print("출력할 단수를 입력하세요 >>> ");
        int dan = sc.nextInt();   // 사용자의 정수 입력부분
        int i = 1;
        while ( i < 10 ) {
//            System.out.println(dan + " x " + i + " = " + dan*i);
            System.out.printf("%d x %d = %d\n", dan, i, dan*i);
            i += 1;
        }

        while( true ) {

        }


        sc.close();
    }
}
