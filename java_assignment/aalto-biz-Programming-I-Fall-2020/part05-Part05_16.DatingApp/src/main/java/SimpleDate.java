
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
    //判断对象日期是否在参数之前。所以叫boolean befkre
    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    public void advance(){
        this.day += 1;
        if(this.day > 30){
            this.day = 1;
            this.month += 1;
            if(this.month > 12){
                this.month = 1;
                this.year += 1;
            }
        }
    }
    //overloading advance()卡住了，
    //反而是在advancce()基础上进行更改
    public void advance(int howManyDays){
        for(int i = 0; i < howManyDays; i++){
            this.advance();
        }
    }
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newDate = new SimpleDate(this.day,this.month,this.year);
        newDate.advance(days);
        return newDate;
        /*对比
        this.advance(days);
        return new SimpleDate(this.day ,this.month, this.year);
        */
        
    }

}
