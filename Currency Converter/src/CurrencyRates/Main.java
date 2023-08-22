package CurrencyRates;


public class Main {
    public static void main(String[] args){
        int choice = frontend.showOptions();
        while (choice != 3){
            if(choice == 1){
                String[] result = frontend.enterCurrencies();
                double baseToTarget = Double.parseDouble(result[3]) / Double.parseDouble(result[2]);
                System.out.println(result[0] + " to " + result[1] + " rate is " +  baseToTarget);


            } else if (choice == 2) {
                frontend.showCurrencies();
            }
            choice = frontend.showOptions();
        }
        System.exit(0);

    }
}
