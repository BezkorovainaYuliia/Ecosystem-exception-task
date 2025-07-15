public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student newStudent = Student.builder()
                .name("Florian")
                .subject("Geschichte")
                .build();

        Student savedStudent = studentService.addNewStudent(newStudent);

        System.out.println("Student saved: " + savedStudent);

        Student newStudent2 = Student.builder()
                .name("Yuliia")
                .subject("Java")
                .build();

        Student savedStudent2 = studentService.addNewStudent(newStudent2);

        System.out.println("Student saved: " + savedStudent2);

        try {
            Student findByIdStudent = studentService.findStudentByID("677777");
        } catch (NoStudentByIDException e) {
            System.out.println(e);
        }

        try {
            Student findByIdStudent = studentService.findStudentByID("-1");
        } catch (NoStudentByIDException e) {
            System.out.println(e);
        }

        try {
            Student findByIdStudent = studentService.findStudentByID(savedStudent2.id());
            System.out.println(findByIdStudent);
        } catch (NoStudentByIDException e) {
            System.out.println(e);
        }

    }
}
