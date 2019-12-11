public class FoodBank extends Thread {
    private int food;


    FoodBank(int food){
        this.food = 0;
    }

    synchronized void giveFood(int give) throws InterruptedException {
        System.out.println("Giving food.. : " + give);
        this.food = this.food + give;
    }

     synchronized void takeFood(int take) throws InterruptedException {
        if (this.food - take <= 0){
            System.out.println("Waiting to get food.. ");
            Thread.sleep(10);

        }
        else{
            this.food = this.food - take;
            System.out.println("Taking " + take + " items of food, the balance is now " + food);
        }
    }
}
