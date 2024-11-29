public class Task{
    String description;
    boolean isDone = false;

    Task(String description){
        this.description = description;
    }

    void markAsDone(){
        isDone = true;
    }

    public String toString(){
        String checkTask;
        if(isDone == true){
            checkTask = "[x]"+description;
        }
        else{
            checkTask = "[ ]"+description;
        }
        return checkTask;
    }

}
