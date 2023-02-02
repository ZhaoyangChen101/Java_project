/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chenzhaoyang
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand hundredthsOfSeconds;
    public Timer(){
        //构造函数就是初始化成员变量。成员变量可以只是变量，也可以是对象。
        this.seconds = new ClockHand(60);
        this.hundredthsOfSeconds = new ClockHand(100);
    }
    public String toString(){
        //先试一下加this的结果如何,是可以的
        return this.seconds + ":" + this.hundredthsOfSeconds;
    }
    public void advance(){
        this.hundredthsOfSeconds.advance();
        if (this.hundredthsOfSeconds.value() == 0){
            this.seconds.advance();
        }
    }
}
