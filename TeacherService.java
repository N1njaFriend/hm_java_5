import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teachers = new ArrayList<>();

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(int index) {
        if (index >= 0 && index < teachers.size()) {
            teachers.remove(index);
        }
    }

    public void changeTeacher(int index, Teacher teacher) {
        if (index >= 0 && index < teachers.size()) {
            teachers.set(index, teacher);
        }
    }
}