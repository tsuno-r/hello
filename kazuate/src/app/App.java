package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int num = 50;
        int cnt = 0;
        int input;
    
        while(cnt < 5) {
            System.out.println(String.valueOf(cnt + 1) + "回目");
            System.out.print("数字を入力してください:");
            Scanner scan = new Scanner(System.in);
            try {
                input = scan.nextInt();
            } catch (Exception e){
                System.out.println("2桁の正の整数を入力してください");
                continue;
            }
            if(input < 10 || input > 99) {
                System.out.println("2桁の正の整数を入力してください");
                continue;
            }
            if (input == num) {
                System.out.println("あたり！！！");
                scan.close();
                return;
            }else if(input < num) {       
                if(Math.abs(num - input) >= 20) {
                    System.out.println("20以上小さいです");
                }else {
                    System.out.println("小さいです");
                }
            }else {              
                if(Math.abs(num - input) >= 20) {
                    System.out.println("20以上大きいです");
                }else {
                    System.out.println("大きいです");
                }
            }
            cnt++;
        }

        System.out.println("残念でしたぁ〜");
        return;
    }
}