
public class Main {
    private static final SoftwareEngineerRepository softwareEngineerRepository =
            new SoftwareEngineerRepositoryImpl();

    public static void main(String[] args) {
        var softwareEngineerName = "John";
        var task = new Task("RA-250", "Implement data pipeline");

        assignTask(softwareEngineerName, task);
    }

    private static void assignTask(String softwareEngineerName, Task task) {
        var softwareEngineer =
                softwareEngineerRepository.getByName(softwareEngineerName).orElseThrow();

        softwareEngineer.takeTask(task);
    }

}
