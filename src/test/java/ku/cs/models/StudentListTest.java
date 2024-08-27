package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    StudentList students;

    @BeforeEach
    void init() {
        students = new StudentList();
    }

    @Test
    @DisplayName("ทดสอบจำนวนสมาชิกของ Array students")
    void testAddNewStudent() {
        students.addNewStudent("6610450315","Maggy");
        students.addNewStudent("1","A");
        students.addNewStudent("2","B");
        assertEquals(3,students.getStudents().size());
    }

    @Test
    @DisplayName("ทดสอบจำนวนสมาชิกของ Array students แบบมีการเพิ่ม score")
    void testAddNewStudentWithScore() {
        students.addNewStudent("6610450315","Maggy",99.9);
        students.addNewStudent("1","A",10.2);
        students.addNewStudent("2","B",50.6);
        assertEquals(3,students.getStudents().size());
    }


    @Test
    @DisplayName("ทดสอบว่ามีนักเรียนหรือไม่โดยใช้ ID")
    void testFindStudentById() {
        students.addNewStudent("6610450315","Maggy");
        students.addNewStudent("1","A");
        students.addNewStudent("2","B");
        Student S1 = students.findStudentById("1");

        assertEquals("1",S1.getId());
    }

    @Test
    @DisplayName("ทดสอบว่าสามารถเพิ่ม score ผ่าน id ได้หรือไม่")
    void giveScoreToId() {
        students.addNewStudent("6610450315","Maggy");
        Student S1 = students.findStudentById("6610450315");
        S1.addScore(20);

        assertEquals(20,S1.getScore());
    }

    @Test
    @DisplayName("ทดสอบดูว่าเกรดตรงกับสัดส่วนคะแนนที่ได้หรือไม่")
    void viewGradeOfId() {
        students.addNewStudent("6610450315","Maggy");
        Student S1 = students.findStudentById("6610450315");
        S1.addScore(20);

        assertEquals("F",S1.grade());
    }

}