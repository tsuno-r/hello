package app;
import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        kazuate();
    }

    // 数字あてゲーム
    public static void kazuate() {
        int num; // 推測する数字
        int cnt = 0; // 現在の入力回数
        int limit = 5; // 入力上限
        int input;
        Random random = new Random();

        // 推測する数字(10~99)の生成
        num = random.nextInt(90) + 10;
        
    
        while(cnt < limit) {
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