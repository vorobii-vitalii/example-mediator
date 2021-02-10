import java.util.List;
import java.util.Optional;

public interface SoftwareEngineerRepository {
    List<SoftwareEngineer> getAllSortedByNumberOfTasksAsc();
    Optional<SoftwareEngineer> getByName(String name);
}
