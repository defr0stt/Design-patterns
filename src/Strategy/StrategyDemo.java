package Strategy;

public class StrategyDemo
{
    public static void main(String[] args) {

        Strategic<String> strategic1 = new StrategyAddition();
        Strategic<String> strategic2 = new StrategySubtraction();

        Strategy strategy = new Strategy(strategic1);
        System.out.println("Strategy 1 - " + strategy.executeStrategy(10,15));

        strategy.setStrategy(strategic2);
        System.out.println("Strategy 2 - " + strategy.executeStrategy(10,15));
    }
}