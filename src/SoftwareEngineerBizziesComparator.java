import java.util.Comparator;

public class SoftwareEngineerBizziesComparator implements Comparator<SoftwareEngineer> {
    @Override
    public int compare(SoftwareEngineer se1, SoftwareEngineer se2) {
        return se1.getNumberOfTasks() - se2.getNumberOfTasks();
    }
}
