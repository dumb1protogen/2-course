public class Student implements Comparable<Student> {
    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override //I have no idea at this point.
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }
}