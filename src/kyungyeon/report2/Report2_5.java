package kyungyeon.report2;

public class Report2_5 {
    public static void main(String[] args) {
        //3-5. 아래는 변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드이다.
        //삼항연산자를 이용해서 빈칸에 알맞은 코드를 넣으시오.
        //Hint : 삼항 연산자를 두 번 사용할 것!

        int num = 10;
        String result = num > 0 ? "양수" : num == 0 ? "0" : "음수";

        System.out.println(result);
    }
}
