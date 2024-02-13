package _02_control_statement;
import java.util.Scanner;
public class Prac {

    public static void main(String[] args) {
        int age = 0;
        Scanner scanner = new Scanner(System.in);
        while(age != 9999) {
            System.out.println("나이를 입력하세요");
            age = scanner.nextInt();
            String result;
            if (age > 19) {
                result = "성인";
            } else if (age > 16) {
                result = "고등학생";
            } else if (age > 13) {
                result = "중학생";
            } else if (age > 7) {
                result = "초등학생";
            } else if (age > 0) {
                result = "유아";
            } else {
                result = "잘못된 값입니다. 다시 입력해주세요.";
            }
            System.out.println(result);

        }
        scanner.close();

         // scanner 닫기
    }
}
