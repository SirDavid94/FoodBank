import java.util.Random;

public class FoodConsumer extends Thread {
    private FoodBank bank;


    public FoodConsumer(FoodBank bank){
        this.bank = bank;
    }

    @Override
    public void run() {
        super.run();
        //boolean x = true;
        Random random = new Random();
        while(true){
            int randomNum = random.nextInt((100 - 1) + 1) + 1;
            try {
                bank.takeFood(randomNum);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
