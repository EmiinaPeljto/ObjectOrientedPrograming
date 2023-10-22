package Week3.Lab3;

public class TaskItem {
    private int taskid;
    private String taskDescription;
    private taskStatus status;

    public TaskItem(int taskid,String taskDescription,taskStatus status){
        this.taskid=taskid;
        this.taskDescription=taskDescription;
        this.status=status;
    }

    public int getTaskid() {
        return taskid;
    }

    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public taskStatus getStatus() {
        return status;
    }

    public void setStatus(taskStatus status) {
        this.status = status;
    }
}
