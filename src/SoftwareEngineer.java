import java.util.Objects;

public class SoftwareEngineer {
    private final String name;
    private int numberOfTasks = 0;
    private final TaskReviewMediator taskReviewMediator;

    public SoftwareEngineer(String name, int numberOfTasks, TaskReviewMediator taskReviewMediator) {
        this.name = name;
        this.numberOfTasks = numberOfTasks;
        this.taskReviewMediator = taskReviewMediator;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfTasks() {
        return numberOfTasks;
    }

    public void takeTask(Task task) {
        System.out.println(name + " took task with number " + task.getNumber());
        numberOfTasks++;
        System.out.println(name + " finished task " + task.getNumber());

        // Send to review
        taskReviewMediator.notify(this, task);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(name, that.name);
    }

}
