import java.util.Arrays;

public class Fourth_week {
    public static void main(String[] args) {
        double[] a= {1.2,3.4,5.6};
        double[] b=a; //a와 b는 같은 배열이다, 하나가 바뀌면 다른것도 바뀐다.
        b[0]=7.8;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(" ");
        
        int[]c=new int[]{1,2,3,4,5}; //5개원소있는 1차원배열 모든원소 순서대로 출력
        for(int k: c){
            System.out.println(k);
        }
        System.out.println(" ");
        
        int[][]d=new int[2][];
        d[0]=new int[]{1,3,5};
        d[1]=new int[]{7,9};//2차원배열 객체생성과 값
        //출력하기
        for(int i=0;i<d.length;i++){
            for(int j=0;j<d[i].length;j++){
                System.out.println(d[i][j]);
            }
        }
    }
}
