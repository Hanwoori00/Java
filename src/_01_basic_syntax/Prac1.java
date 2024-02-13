package _01_basic_syntax;

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        System.out.println("이름을 입력하세요");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next(); // 공백 이전까지 문자열 읽음
        System.out.println("나이를 입력하세요");
        int age = scanner.nextInt(); // 공전까지 정수 읽음
        System.out.println("안녕하세요!" + name + "님(" + age + "세)");

        scanner.close(); // scanner 닫기
    }
}
