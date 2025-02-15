import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int tryNum = 0;

        while (true) {
            tryNum++;
            System.out.println("숫자를 입력해주세요: ");
            String str = scanner.nextLine();
            int userNum = Integer.parseInt(str);

            if(userNum < randomNum) {
                System.out.println("입력한 숫자보다 큽니다.");
            } else if(userNum > randomNum) {
                System.out.println("입력한 숫자보다 작습니다.");
            } else {
                System.out.printf("맞추셨습니다. 시도 횟수: %d", tryNum);
                break;
            }
        }


    }
}