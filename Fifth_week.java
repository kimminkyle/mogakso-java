public class Fifth_week {
    public static void main(String[] args){
        String str ="내 이름은[hong]입니다. 나이는[19]살 입니다";
        String name;
        int age;
        int start1 = str.indexOf("[");
        int end1 =str.indexOf("]");
        name = str.substring(start1+1,end1);
        
        int start2 = str.lastIndexOf("[");
        int end2=str.lastIndexOf("]");
        age = Integer.parseInt(str.substring(start2+1,end2));
        
        System.out.println(name);
        System.out.println(age);
    }
}
