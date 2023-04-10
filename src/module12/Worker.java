package module12;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Worker {
    private Stack toDoQueue; // у рабочего есть ссылка на очередь из заданий
    public Worker(Stack toDoQueue) {
        this.toDoQueue = toDoQueue; // даем ссылку на очередь в конструкторе
    }
    public void takeTask() {
        try {
            Object task = toDoQueue.pop(); // вынимаем задание из очереди
            System.out.println("Выполняю задачу: " + task);
        } catch (EmptyStackException e) {
            System.out.println("Нет работы! Можно идти домой");
        }
        Queue<String> stringsQueue = new LinkedList<>();
    }
}