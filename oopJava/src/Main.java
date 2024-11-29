import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
    ToDoList todolist = new ToDoList();
    while(true){
        String taskDescription = JOptionPane.showInputDialog("Введите описание задачи: ");//Первичное окно, в которое вводятся задачи.
        if(taskDescription == null){ //Если нажали кансел, то идите домой
            break;
        }
        else if(taskDescription.trim().isEmpty()){ //Если нихуя не ввели вводите ещё раз дауны
            System.out.println("Не может быть пустым");
            continue;
        }
        todolist.addTask(new Task(taskDescription));//Вот это уже другое дело
    }

        String allTasks = todolist.getAllTasks();//Получение всех задач(ToDO:Засунуть в функцию)
        JOptionPane.showMessageDialog(null, allTasks.isEmpty() ? "Нет задач." : allTasks, "Список задач", JOptionPane.INFORMATION_MESSAGE);

    while(true)//Цикл, в котором мы определяем, желаем ли мы добавить задачу или нет, а затем помечаем её, как сделанную
    {
        int info = JOptionPane.showConfirmDialog(null, "Желаете изменить задачу? ");
        if(info == JOptionPane.YES_OPTION) {
            String IndexChangeTask = JOptionPane.showInputDialog("Введите номер задачи, которую хотите изменить : ");
            int intIndexChangeTask = Integer.parseInt(IndexChangeTask);

            if (intIndexChangeTask <= 0) {
                JOptionPane.showMessageDialog(null, "Введите положительное число");

            } else {
                todolist.findTaskByIndex(intIndexChangeTask).markAsDone();
            }
        }
            break;
        }
        String allTasks2 = todolist.getAllTasks();
        JOptionPane.showMessageDialog(null, allTasks2.isEmpty() ? "Нет задач." : allTasks2, "Список задач", JOptionPane.INFORMATION_MESSAGE);


    }


    }






