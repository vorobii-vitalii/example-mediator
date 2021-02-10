import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SoftwareEngineerRepositoryImpl implements SoftwareEngineerRepository {
    private final List<SoftwareEngineer> softwareEngineers =
            List.of(new SoftwareEngineer("John", 5, new TaskReviewMediatorImpl(this)),
                    new SoftwareEngineer("Alex", 3, new TaskReviewMediatorImpl(this)));

    @Override
    public List<SoftwareEngineer> getAllSortedByNumberOfTasksAsc() {
        var softwareEngineersCopy = new ArrayList<>(softwareEngineers);

        softwareEngineersCopy.sort(new SoftwareEngineerBizziesComparator());

        return softwareEngineersCopy;
    }

    @Override
    public Optional<SoftwareEngineer> getByName(String name) {
        return softwareEngineers.stream()
                    .filter(se -> se.getName().equals(name))
                    .findFirst();
    }
}
