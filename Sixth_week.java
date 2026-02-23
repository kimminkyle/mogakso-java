class A {
    void print() {
        System.out.println("입력값이 없습니다.");
    }
    void print(int k) {
        System.out.println("정수 입력값 : " + k);
    }
    void print(double k) {
        System.out.println("실수 입력값 : " + k);
    }
    void print(String k) {
        System.out.println("문자열 입력값 : " + k);
    }
}

public class Sixth_week {
    public static void main(String[] args) {
        A a = new A();
        
        a.print();
        a.print(3);
        a.print(5.8);
        a.print("안녕");
    }
}
