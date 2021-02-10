public class TaskReviewMediatorImpl implements TaskReviewMediator {
    private final SoftwareEngineerRepository softwareEngineerRepository;

    public TaskReviewMediatorImpl(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    @Override
    public void notify(SoftwareEngineer creator, Task task) {
        var softwareEngineers = softwareEngineerRepository.getAllSortedByNumberOfTasksAsc();

        for (SoftwareEngineer softwareEngineer : softwareEngineers) {
            if (!softwareEngineer.equals(creator)) {
                System.out.println(softwareEngineer.getName() + " gotta review the task number " + task.getNumber());
                break;
            }
        }
    }

}
