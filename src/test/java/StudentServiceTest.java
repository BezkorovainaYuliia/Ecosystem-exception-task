import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    void findByIDThrowsEX(){

        StudentService service = new StudentService();
        Student student = Student.builder().build();
        service.addNewStudent(student);

        assertThrows(NoStudentByIDException.class, () -> service.findStudentByID(""));
    }

    @Test
    void findByIDThrowsEX2(){
        StudentService service = new StudentService();
        assertThrows(NoStudentByIDException.class, () -> service.findStudentByID(""));
    }

    @SneakyThrows
    @Test
    void findByIDThrowsWithoutEX() throws NoStudentByIDException {
        StudentService service = new StudentService();
        Student student = Student.builder().build();
        Student actual = service.addNewStudent(student);
        Student expected = service.findStudentByID(actual.id());
        assertEquals(expected, actual);
    }

}