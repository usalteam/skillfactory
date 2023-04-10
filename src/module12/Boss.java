package module12;

import java.util.Queue;
import java.util.Stack;

public class Boss {
    private Stack toDoQueue;// у босса тоже есть ссылка на очередь из заданий
    public Boss(Stack toDoQueue) {
        this.toDoQueue = toDoQueue;// даем ссылку на очередь в конструкторе
    }
    public void giveTask(String task) {
        toDoQueue.add(task); // кладем задание в очередь
        System.out.println("Дал задачу " + task);
    }
}