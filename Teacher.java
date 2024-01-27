public class Teacher {
    private String name;
    private String surname;
    private int age;
    private String subject;

    public Teacher(String name, String surname, int age, String subject) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Учитель: ").append(name).append(" ").append(surname);
        sb.append(" Возраст: ").append(age).append(" Предмет: ").append(subject);
        return sb.toString();
    }
}