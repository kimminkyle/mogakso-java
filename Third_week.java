public class Third_week{
  public static void main(String[] args) {
    int score=72;
    if (score >=80 && score <90){
      System.out.println("B학점");
    }
    else if (score >=90) {
      System.out.println("A학점");
    }
    else if (score >=70&& score <80){
      System.out.println("C학점");
    }
    else {
      System.out.println("F학점");
    }
    //C와 같은구조
    for(int j=10;j>0;j-=2){
        System.out.println(j);
    }
    //for문과 같은 while문
    int k=10;
    while(k>0){
        System.out.println(k);
        k-=2;
    }
  }
}
