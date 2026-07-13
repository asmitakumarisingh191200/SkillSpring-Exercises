public class DataService {

    private Database database;

    public DataService(Database database) {
        this.database = database;
    }

    public String fetchEmployee(int id) {

        return database.getEmployeeName(id);
    }
}