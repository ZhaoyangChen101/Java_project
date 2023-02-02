
import java.util.ArrayList;
public class ExerciseManagement {
    private ArrayList<Exercise> exercises;
    public ExerciseManagement(){
        this.exercises = new ArrayList<>();     
    }
    //该功能是返回一个只有exercise的list
    public ArrayList<String> exerciseList(){
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise: this.exercises){
            list.add(exercise.getName());
        }
        return list;
    }//现在因为list存储的是对象，所以添加的元素也必须是对象
    public void add(String exercise){
        this.exercises.add(new Exercise(exercise));
    }
    public void markAsCompleted(String exercise) {
        //该函数为空的时候，test是通过了的,因为最后一步assertTrue是判断的isCompleted
        //该函数永恒返回true，故通过,然而虽然通过test，却并没有实现功能
        //添加了那个ifnotcompleted的test之后，重新写函数.
        //this.completedExercises.add(exercise);
        for (Exercise ex: this.exercises){
            if(ex.getName().equals(exercise)){
                ex.setCompleted(true);
            }
        }
    }
    public boolean isCompleted(String exercise) {
        //return this.completedExercises.contains(exercise);
        for(Exercise ex: exercises){
            if(ex.getName().equals(exercise)){
                return ex.isCompleted();
            }
        }
        return false;
    }
}
