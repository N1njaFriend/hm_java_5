import java.io.IOException;

public class TeacherController {
    private TeacherService teacherService;
    private TeacherView teacherView;

    public TeacherController(TeacherService teacherService, TeacherView teacherView) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
    }

    public Teacher createTeacher() throws IOException {
        System.out.println("Создаем новую запись учителей");
        String name = teacherView.userInput("Введите имя учителя: ");
        String surname = teacherView.userInput("Введите фамилию учителя: ");
        int age = Integer.parseInt(teacherView.userInput("Введите возраст учителя: "));
        String subject = teacherView.userInput("Введите предмет: ");
        System.out.println("Учитель успешно добавлен в список! ");
        System.out.println();
        return new Teacher(name, surname, age, subject);
    }

    public void run() throws IOException {
        boolean isRun = true;
        while (isRun) {
            System.out.println("Главное меню: " +
                    "\n1 - Вывести список учителей на экран; " +
                    "\n2 - Добавить нового учителя в список; " +
                    "\n3 - Заменить учителя в списке; " +
                    "\n4 - Удалить учителя из списка; " +
                    "\n5 - Завершить работу программы");

            String userInput = teacherView.userInput("Выберите нужный пункт из списка: ");

            if (!userInput.matches("[1-5]")) {
                System.out.println("Неправильный ввод пункта меню. Повторите попытку.\n");
            } else {
                switch (Integer.parseInt(userInput)) {
                    case 1:
                        teacherView.printTeachers(teacherService.getTeachers());
                        break;
                    case 2:
                        teacherService.addTeacher(createTeacher());
                        break;
                    case 3:
                        int index1 = Integer.parseInt(teacherView.userInput("Введите индекс для замены: "));
                        teacherService.changeTeacher(index1, createTeacher());
                        break;
                    case 4:
                        int index2 = Integer.parseInt(teacherView.userInput("Введите индекс для удаления: "));
                        teacherService.removeTeacher(index2);
                        break;
                    case 5:
                        isRun = false;
                }
            }
        }
    }
}