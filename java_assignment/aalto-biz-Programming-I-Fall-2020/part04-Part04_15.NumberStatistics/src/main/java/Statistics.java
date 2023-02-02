
public class Statistics {
    private int count;
    private int sum;
    public Statistics(){
        //this.count = count;
        //this.sum = sum;
    }//构造函数可以什么都不写，就只是一个初始化对象的功能。
    public void addNumber(int number){
        this.sum = this.sum + number;
        this.count ++;
    }//执行功能，不返回值
    public int getCount(){
        return this.count;
    }
    public int sum(){
        if(this.count == 0){
            this.sum = 0;
        }
        return this.sum;
    }//只负责返回值，不执行功能
    public double average(){
        if (this.count == 0 ){
            return 0.0;
        }
        return sum() * 1.0 / this.count;
    } //这里就是调用内部方法的写法，即直接写方法名
}
