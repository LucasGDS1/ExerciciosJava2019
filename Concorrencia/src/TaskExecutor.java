import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class TaskExecutor 
{
	public static void main(String[] args)
	{
		PrintTask task1 = new PrintTask("tarefa 1");
		PrintTask task2 = new PrintTask("tarefa 2");
		PrintTask task3 = new PrintTask("tarefa 3");
		
		System.out.printf("Iniciando Executor %n");
		System.out.printf("tarefas iniciadas, fins principais: %n%n");
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		executorService.execute(task1);
		executorService.execute(task2);
		executorService.execute(task3);
		
		executorService.shutdown();
		
		
	}
}
