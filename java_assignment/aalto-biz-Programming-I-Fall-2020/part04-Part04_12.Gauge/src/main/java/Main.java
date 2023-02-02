
public class Main {

    public static void main(String[] args) {
        // Test your Gauge class here

         Gauge g = new Gauge();//我的构造函数是中间有设置需要输入值的，看有不有问题

         while(!g.full()) {
             System.out.println("Not full! Value: " + g.value());
             g.increase();
         }

         System.out.println("Full! Value: " + g.value());
         g.decrease();
         System.out.println("Not full! Value: " + g.value());
    }
}
