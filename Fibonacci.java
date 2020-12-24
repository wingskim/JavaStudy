package my.test.study.kim_narae;

import java.util.Scanner;

public class Fibonacci{


    public static void main(String[] args) {


        int intput = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("N번까지의 피보나치 수열을 계산합니다 :");
        String put = scanner.next();



        long[] Arr = new long[intput];

        try {
            intput = Integer.parseInt(put);
        }
        catch(NegativeArraySizeException e) {
            System.out.println("1보다 큰 수를 입력해 주세요.");
            System.exit(0);
        }catch(NumberFormatException e) {
            System.out.println("정수를 입력해 주세요.");
            System.exit(0);
        }
        finally {
            if(intput==0) {
            System.out.print("1보다 큰 수를 입력해 주세요.");
        }else if(intput==1) {
            System.out.print(Arr[0]+" ");
        }else if(intput>=2 && intput<=93) {
            Arr[0] = 0;
            Arr[1] = 1;
            System.out.print(Arr[0]+" ");
            System.out.print(Arr[1]+" ");
            for(int i=2; i<Arr.length; i++) {
                Arr[i] = Arr[i-1] + Arr[i-2];
                System.out.print(Arr[i]+" ");
            }
        } else if(intput<=-1){
            System.out.println("1보다 큰 수를 입력해 주세요.");

        }
            else {
            System.out.println("94번째 값부터는 숫자가 너무 커서 표현할 수 없습니다.");
            System.out.println("94보다 작은 수를 입력해 주세요.");
            System.exit(0);
        }
        }






    }

}