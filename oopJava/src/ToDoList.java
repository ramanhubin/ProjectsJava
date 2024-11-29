import java.util.ArrayList;

public class ToDoList {
    ArrayList<Task> tasks;

    ToDoList() {
        tasks = new ArrayList<>();
    }
    void getArr(){
        for(int i = 0; i < tasks.size(); i++)
        {
        System.out.println(tasks.get(i));
        }
    }
    Task findTaskByIndex(int index)
    {
        return tasks.get(index);
    }

    void addTask(Task task) {
        tasks.add(task);
    }

    String getAllTasks() {
        StringBuilder allTasks = new StringBuilder();

        for (int i = 0; i < tasks.size(); i++) {
            allTasks.append(i).append(": ").append(tasks.get(i).toString()).append("\n");

        }
        return allTasks.toString();
    }

    void printTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
