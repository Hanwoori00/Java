package _01_basic_syntax;


// 형변환
// - 데이터 타입을 반환하는 것
// - (type)var
// - type: 데이터 유형
// - var: 변수이름

public class Casting {
    public static void main(String[] args) {
        // 묵시적 형변환 (wider Conversion)
        // - 더 작은 타입에서 더 큰 타입으로의 자동 형변환
        // - 반대의 경우에는 묵시적 형변환 X -> 명시적으로 변환해야 함
        int smallNumber = 10;
        double bigNumber = smallNumber; // int를 double 로 자동 형변환

        System.out.println("small :" + smallNumber); // 10
        System.out.println("big : " + bigNumber); //10.0 >> 자동으로 형변환 되어있음!

        ////////////////////////////////
        //명시적 형변환 (narrow Conversion)
        // - 더 큰 타입에서 더 작은 타입으로 강제 형변환
        double anotherBig = 20.5;
        int anotherSmall = (int)anotherBig; // double을 int로 강제 형변환

        System.out.println("anotherSmall :" + anotherSmall); // 20.5가 int로 바뀌면서 0.5가 잘리고 20만 남음
        System.out.println("anotherBig :" + anotherBig);

        int largeNumber = 128;
        byte smallByte = (byte) largeNumber;

        System.out.println("largeNumber : " + largeNumber); //128
        System.out.println("smallByte : " + smallByte); // -128 // byte는 -128 ~ 127까지밖에 지원 x 127넘어가면 -128로 씀


    }
}
