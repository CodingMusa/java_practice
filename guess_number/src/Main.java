import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int RandomRangeNum = 0;
        int chanceNum = 0;
        int coefficient = 0;
        int score = 0;
        int tryCount = 0;

        System.out.print("난이도를 입력하세요(쉬움, 보통, 어려움): ");
        String difficultyLevel = scanner.nextLine();
        if(difficultyLevel.equals("쉬움")){
            RandomRangeNum = 50;
            chanceNum = 20;
            coefficient = 1;
        } else if(difficultyLevel.equals("보통")) {
            RandomRangeNum = 100;
            chanceNum = 15;
            coefficient = 2;
        } else {
            RandomRangeNum = 200;
            chanceNum = 10;
            coefficient = 3;
        }

        int randomNum = random.nextInt(RandomRangeNum);

        while (tryCount <= chanceNum ) {
            tryCount++;

            System.out.printf("숫자를 입력해주세요: ");
            String str = scanner.nextLine();
            int userNum = Integer.parseInt(str);

            if(userNum < randomNum) {
                System.out.printf("입력한 숫자보다 큽니다. 남은 횟수: %d\n", chanceNum - tryCount);
            } else if(userNum > randomNum) {
                System.out.printf("입력한 숫자보다 작습니다. 남은 횟수: %d\n", chanceNum - tryCount);
            } else {
                score = tryCount * 100 * coefficient;
                System.out.printf("맞추셨습니다. 시도 횟수: %d/%d, 점수: %d", tryCount, chanceNum, score);
                break;
            }
        }
    }
}