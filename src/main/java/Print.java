import java.util.List;
import java.util.Map;

public class Print {
    private static final String START_GAME_MESSAGE = "자동차 경주 게임을 시작합니다.";
    private static final String PLEASE_INPUT = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String HOW_MANY_TIMES_TRY_MESSAGE = "시도할 회수는 몇 회인가요?";
    private static final String IS_WIN = " 이(가) 최종 우승하였습니다.";

    private Operation operation = new Operation();

    private void printCarName(Car car) {
        System.out.print(car.getName());
    }

    private void printCarPosition(int position) {
        String positionView = "";
        for (int i = 0; i < position; i++) {
            positionView += "-";
        }
        System.out.println(positionView);
    }

    void printCarInfos(Car car, Map<Car, Integer> carInfos) {
        printCarName(car);
        System.out.print(" : ");
        printCarPosition(carInfos.get(car));
    }

    void printStartGame() {
        System.out.println(START_GAME_MESSAGE);
    }

    void printPleaseInput() {
        System.out.println(PLEASE_INPUT);
    }

    void printHowManyTimesTry() {
        System.out.println(HOW_MANY_TIMES_TRY_MESSAGE);
    }

    void printWinners(List<Car> cars, Map<Car, Integer> carInfos, int maxPosition) {
        String winners = operation.getWinnderNames(cars, carInfos, maxPosition);
        System.out.println(winners + IS_WIN);
    }
}