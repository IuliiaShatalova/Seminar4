public class Worker {
    private final String name;
    private final String phoneNumber;
    private final int seniority;
    private final int id;

    public Worker(String name, String phoneNumber, int seniority, int id) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.seniority = seniority;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSeniority() {
        return seniority;
    }

    public int getId() {
        return id;
    }
}
