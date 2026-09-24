public class Student {
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

    @Override // I spend 2 days, I tired, I have no ideas
    public String toString() {
        return name + " " + age;
    }
}