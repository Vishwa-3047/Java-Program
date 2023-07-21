class salary {
    double salary;
    int hours;

    public void getInfo(double salary, int hours) {
        this.salary = salary;
        this.hours = hours;
    }

    public void AddSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    public void AddWork() {
        if (hours > 6) {
            salary += 5;
        }
    }

    public void printSalary() {
        System.out.println("Final salary: " + salary);
    }
}

public class work {
    public static void main(String[] args) {
        salary emp = new salary();
        emp.getInfo(450, 8);
        emp.AddSal();
        emp.AddWork();
        emp.printSalary();
    }
}
