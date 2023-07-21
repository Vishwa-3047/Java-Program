public class parameter{
    int id;
    String name;
    parameter(int i,String n)
    {
        id=i;
        name=n;

    }
    void display() {
        System.out.println(id + " " + name);

    }
    public static void main(String args[]) {
        {
            student4 s1 = new student4(111, "hari");
            student4 s2 = new student4(222, "priya");
            s1.display();
            s2.display();
        }
    }
}

