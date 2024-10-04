import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Database {
    private final List<Worker> workers = new ArrayList<>();

    public String  findByName (String name){
        for (Worker worker : workers) {
            if (Objects.equals(worker.getName(), name)) {
                return worker.getPhoneNumber();
            }
        }
        return null;
    }

    public String  findById (int id) {
        for (Worker worker : workers) {
            if (worker.getId()== id) {
                return worker.getName();
            }
        }
        return null;
    }

    public List<Worker> findBySeniority (int seniority) {
        List<Worker> res = new ArrayList<>();
        for (Worker worker : workers) {
            if (worker.getSeniority() == seniority) {
                res.add(worker);
            }
        }
        return res;
    }

    public void addWorker (Worker worker) {
        workers.add(worker);
    }
}
