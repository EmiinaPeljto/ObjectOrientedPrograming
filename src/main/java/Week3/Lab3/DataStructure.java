package Week3.Lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataStructure {
    private List<TaskItem> tasks=new ArrayList<>();

    public DataStructure(){
        tasks= Arrays.asList(
                new TaskItem(1,"Push lab code to the github",taskStatus.TO_DO),
                new TaskItem(2,"Prepare for the quiz",taskStatus.IN_PROGRESS),
                new TaskItem(3,"Go over tasks from lab2",taskStatus.COMPLETED),
                new TaskItem(4,"Cancelled",taskStatus.CANCELLED)
        );
    }
    public List<TaskItem> getAllObjects(){
        return this.tasks;
    }

    public void getByStatus(taskStatus status){
        tasks=tasks.stream()
                .filter(task->(task.getStatus().equals(status)))
                .collect(Collectors.toList());
        for (TaskItem s:tasks){
            System.out.println(s.getTaskid()+", " +s.getTaskDescription()+", "+s.getStatus());
        }
    }

    public List<TaskItem> idParameterGreaterThanOrEqual(){
        return tasks.stream()
                .filter(task-> (task.getTaskid() >= 2))
                .collect(Collectors.toList());
    }

    public void printTaskDescription() {
        System.out.println("\nPrint task description:");
        tasks
                .stream()
                .map(TaskItem::getTaskDescription)
                .forEach(y -> {
                    System.out.println(y);;
                });
    }


}
