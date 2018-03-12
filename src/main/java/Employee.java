public class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee() {
    } //empty constructor

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    } //this is another constructor

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise){
        salary += raise;
    }


}
