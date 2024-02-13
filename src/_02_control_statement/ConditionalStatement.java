package _02_control_statement;

import java.util.Scanner;
public class ConditionalStatement {
    public static void main(String[] args) {
        int number = 10;
        if (number % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        //////////////////////////////////////////
        // 문자열 (String) 객체 비교
        System.out.println("이름을 입력하세요 : "); // 김코딩
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("name 값 확인: " + name);

//        if (name == "김코딩") {
//            System.out.println("환영합니다!");
//        } else {
//            System.out.println("이름을 다시 입력해주세요!");
//        }// 김코딩 입력했는데도 false처리됨.
//        *****문자열 일치 여부는 항상 equals!!!*********
        //why?
        // "==" 연산자 : 두 객체의 참조 비교 (동일한 메모리 위치 가리키는지 확인)
        // ".equals" 메서드 : 두 객체의 내용이 동일한지 비교
        // 여기있는 김코딩과, 내가 입력한 김코딩은 위치한 메모리 주소가 다르기때문에 == 로는 비교 불가.
        if (name.equals("김코딩")) {
            System.out.println("환영합니다!");
        } else {
            System.out.println("이름을 다시 입력해주세요!");
        }// 이제서야 환영합니다 true 처리됨

        //"문자열 리터럴"의 경우, Java 에서 특별 취급
        // 동일한 문자열 리터럴이 사용되는 경우, Java 컴파일러는 문자열 풀(string pool)이라는 공유된 메모리에 저장함
        String str1 = "hello";
        String str2 = "hello";
        // 이렇게 되면 str1, str2같은 경우 같은 문자열을 가리키고 있음. 같은 참조값 지님.
        // 그래서 == 로 비교하더라도 참조 주소가 같기 때문에 같음. if (str1 == str2)
        // equals 를 하더라도 같음. if (str1.equals(str2))

        // 문자열을 "동적 할당"하게 되는 경우. ex) new String
        // new String(...)을 이용해서 새로운 문자열 객체를 생성 -> 서로다른 객체를 가리킴

        String str3 = new String("hi");
        String str4 = new String("hi");
        // str3, 4는 서로 다른 객체.
        // 그렇기에 ==로 비교하면 서로 다른 주소에 각각 저장된 객체라 항상 false




        // 따!라!서!
        // 문자열 비교시 (내용) .equals 로 비교하는 것이 좋다.











        ///////////////////////////////////////////////////////
        //switch ~ case 문
        // 각 case 문의 break 문으로 탈출. break 문 생략시 바로 밑 case 문으로 넘어감
        String dayOfWeek;
        int day = 4;

        switch (day) {
            case 1 :
                dayOfWeek = "일요일";
                break;
            case 2 :
                dayOfWeek = "월요일";
                break;
            case 3 :
                dayOfWeek = "화요일";
                break;
            case 4 :
                dayOfWeek = "수요일";
                break;
            case 5 :
                dayOfWeek = "목요일";
                break;
            case 6 :
                dayOfWeek = "금요일";
                break;
            case 7 :
                dayOfWeek = "토요일";
                break;
        }
//        System.out.println(dayOfWeek);
    }
}
