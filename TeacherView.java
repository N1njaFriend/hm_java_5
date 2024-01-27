import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class TeacherView {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void printTeachers(List<Teacher> teachers) {
        System.out.println("Список учителей: ");
        for (Teacher teacher : teachers) {
            System.out.println(teacher.toString());
        }
        System.out.println();
    }

    public String userInput(String data) throws IOException {
        System.out.print(data);
        return reader.readLine();
    }
}