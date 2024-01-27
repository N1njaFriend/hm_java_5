import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TeacherService teacherService = new TeacherService();
        TeacherView teacherView = new TeacherView();
        TeacherController teacherController = new TeacherController(teacherService, teacherView);

        teacherController.run();
    }
}