public class Second_week {
  public static void main(String[] args) {
    System.out.println(2+3/2);
    System.out.println(10%3+5/3);
    System.out.println((4+5/2)%4);
    int a=5;
    int b=a++; //b=a=5 한 후에 a만 6이됨
    System.out.println(a); //6
    System.out.println(b); //5
    System.out.println(++a); //7
    System.out.println(++b); //6
    System.out.println(a++ + --b); //7+(6-1)=12 하고 a스스로는 8이 됨
    System.out.println(a+b); // 8+5=13
    //계산을 하면서 윗줄의 영향을 받고, 위에서아래로 내려옴
    A_Second_week.second(); //추가해야 밑의 class가 작동됨
  }
}
class A_Second_week {
  public static void second(){
    #이진수연산
    System.out.println(5 & 3); //And (디회처럼...)
    System.out.println(5 |3); //Or
    System.out.println(5^3); //XOR연산 (서로 다를때만1)
    System.out.println(~5); //NOT,비트반전+1더하기,2의보수 
  }
}
#파일명따라서 첫줄
#public class는 한번만 작성
#class 여러개 작성 시 public을 하나만 붙이고 나머지는 떼기
