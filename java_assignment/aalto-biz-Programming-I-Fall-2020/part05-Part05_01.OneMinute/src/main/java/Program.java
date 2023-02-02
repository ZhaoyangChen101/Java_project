
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here
        Timer timer = new Timer();
        while(true){
            System.out.println(timer);
            timer.advance();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }//这个程序会一致运行下去，也是对时间和时钟的抽象化，突然很有哲学的意味了。

    }
}
