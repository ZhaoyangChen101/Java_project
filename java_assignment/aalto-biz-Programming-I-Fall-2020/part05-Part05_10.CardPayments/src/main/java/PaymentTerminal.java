
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }
    //下面两个方法都是支持现金支付，一个一个算的，并且返回找零
    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if(payment >= 2.5){
            this.money += 2.5;
            this.affordableMeals++;
            payment -= 2.5;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if(payment >=4.3){
            this.money += 4.3;
            this.heartyMeals ++;
            payment -= 4.3;
        }
        return payment;
    }
    //接下来添加方法来支持信用卡支付，返回是否支付成功，即true false可以代表成功与否
    public boolean eatAffordably(PaymentCard card){
        boolean consume = card.takeMoney(2.5);
        if(consume){
            this.affordableMeals ++;
        }
        return consume;
                
    }
    public boolean eatHeartily(PaymentCard card){
        boolean consume = card.takeMoney(4.3);
        if(consume){
            this.heartyMeals ++;
        }
        return consume;
    }
    public void addMoneyToCard(PaymentCard card, double sum){
        if(sum > 0){
            card.addMoney(sum);
            this.money += sum;
        }  
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
