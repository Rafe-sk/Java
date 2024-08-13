class Data {
    private int roll;
    private String name;
    private int id;
    private double marks1, marks2;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMarks1() {
        return marks1;
    }

    public void setMarks1(double marks1) {
        this.marks1 = marks1;
    }

    public double getMarks2() {
        return marks2;
    }

    public void setMarks2(double marks2) {
        this.marks2 = marks2;
    }

    public void setStudentData(int id, String name, double marks1, double marks2, int roll) {
        setId(id);
        setName(name);
        setMarks1(marks1);
        setMarks2(marks2);
        setRoll(roll);
    }

    public void identity() {
        System.out.println("Name: " + getName());
        System.out.println("Roll no: " + getRoll());
        System.out.println("ID: " + getId());
        System.out.println("Marks 1: " + getMarks1());
        System.out.println("Marks 2: " + getMarks2());
    }

    public void percentage() {
        double avg = (getMarks1() + getMarks2()) / 2;
        System.out.println("PERCENTAGE: " + avg);
    }
}

public class StudentClass {
    public static void main(String[] args) {
        Data S1 = new Data();

        S1.setStudentData(1001, "Jeevan", 35, 45, 15);
        S1.identity();
        S1.percentage();
    }
}