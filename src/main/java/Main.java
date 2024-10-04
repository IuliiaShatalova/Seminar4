import java.util.List;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();

        Worker worker1 = new Worker ("Anna", "3399", 1, 1);
        Worker worker2 = new Worker ("Petr", "1244", 3, 2);
        Worker worker3 = new Worker ("Lubov", "9015", 1, 3);

        database.addWorker(worker1);
        database.addWorker(worker2);
        database.addWorker(worker3);

        System.out.println(database.findById(2));
        System.out.println(database.findByName("Anna"));
        List<Worker> workerList = database.findBySeniority(1);
        for (Worker worker : workerList) {
            System.out.printf(worker.getName() + " " + worker.getSeniority() + "\n" );
        }
    }
}
