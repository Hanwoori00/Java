package _01_basic_syntax;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // 출력
        System.out.println("안녕하세요");
        System.out.print("잘 부탁드립니다");
        System.out.print("잘 부탁드립니다 \n"); // 줄바꿈 없음
        System.out.print("잘 부탁드립니다 \n");

        // 입력
        // - Scanner 클래스 이용
        System.out.println("공백으로 구분해서 이름/나이/키/결혼여부를 입력해주세요");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next(); // 공백 이전까지 문자열 읽음
        int age = scanner.nextInt(); // 공전까지 정수 읽음
        double height = scanner.nextDouble(); // 실수 읽음
        boolean isSingle = scanner.nextBoolean(); // 논리 읽음

        System.out.println("=== 입력 결과 출력 ===");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height);
        System.out.println("싱글이야? : " + isSingle);

        scanner.close(); // scanner 닫기
    }
}
