package _01_basic_syntax;

public class Operator {
    public static void main(String[] args) {
        int x, y;
        float a, b;

        // 대입 연산자 (=)
        x = 20;
        y = 8;
        a = 5.1f;
        b = 10.0f;

        // 산술 연산자 : 숫자형 데이터에 대해서 산술 연산 가능
        System.out.println("=== x, y ===");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

        System.out.println("=== a, b ===");
        System.out.printf("a = %f", a);
        System.out.println(" ");
        System.out.printf("b = %f", b);
        System.out.println(" ");
        System.out.printf("a + b = %f", (a + b));
        System.out.println(" ");
        System.out.printf("a - b = %f", (a - b));
        System.out.println(" ");
        System.out.printf("a * b = %f", (a * b));
        System.out.println(" ");
        System.out.printf("a / b = %f", (a / b));
        System.out.println(" ");
        System.out.println("a % b =" + (a % b));

        // 장가, 감소 연산자
        System.out.println("=== 증감 연산자 ===");
        System.out.println("x++ = " + x++ + " " + x); // 후위 증가
        System.out.println("++x =" + ++x); //전위 증가

        // 산술적인 대입 연산자
        System.out.println(" === 산술적인 대입 연산자 ===");
        System.out.println(x);
        System.out.println("x += 5 >> " + (x += 5));

        // 비교연산자
        System.out.println(" === 비교 연산자 ===");
        System.out.println("a > b >> " + (a > b));
        System.out.println("a < b >> " + (a < b));
        System.out.println("a >= b >> " + (a >= b));
        System.out.println("a == b >> " + (a == b));
        System.out.println("a != b >> " + (a != b));

        // 논리연산자: 연산 결과 불리언
        boolean t = true;
        boolean f = false;
        boolean tt = true;

        System.out.println("=== 논리 연산자 ===");
        System.out.println("t && f >> " + (t && f)); // And : 모두 참이어야.
        System.out.println("t || f >> " + (t || f)); // Or : 하나만 참이어도.
        System.out.println("!t || f >> " + (!t || f));

        // 삼항 연산자
        System.out.println("=== 삼항 연산자 ===");
        System.out.println("x :" + x + " y : " + y);
        System.out.println(x > y ? "x는 y보다 큼" : "x는 y보다 크지 않음");
    }
}
