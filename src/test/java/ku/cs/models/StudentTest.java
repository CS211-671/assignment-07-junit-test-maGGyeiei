package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 100.5 คะแนน")
    void testAddScore() {
        Student S = new Student("6610450315","Maggy");
        assertEquals(0,S.getScore());
        S.addScore(40.5);
        assertEquals(40.5,S.getScore());
        S.addScore(60);
        assertEquals(100.5,S.getScore());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 60.8 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade() {
        Student S = new Student("6610450315", "Maggy");
        S.addScore(60.8);
        assertEquals("C", S.grade());
    }

    @Test
    @DisplayName("ทดสอบการเปลี่ยนชื่อ")
    void testChangeName() {
        Student S = new Student("6610450315", "Maggy");
        S.changeName("Supakrit");
        assertEquals("Supakrit",S.getName());
    }

    @Test
    @DisplayName("ทดสอบการตรวจสอบว่าเป็น id หรือไม่")
    void testIsId() {
        Student S = new Student("6610450315", "Maggy");
        assertTrue(S.isId("6610450315"));
    }

}