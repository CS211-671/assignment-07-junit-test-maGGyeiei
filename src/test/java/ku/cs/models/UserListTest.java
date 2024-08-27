package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("ทดสอบว่ามีชื่อในระบบหรือไม่โดยค้นหาจากชื่อ")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList

        // TODO: find one of them

        // TODO: assert that UserList found User
        // String expected = "<one of username>";
        // String actual = user.getUsername();
        // assertEquals(expected, actual);

        UserList userList = new UserList();
        userList.addUser("หม่ำ", "1");
        userList.addUser("เท่ง", "2");
        userList.addUser("โหน่ง", "3");

        User user = userList.findUserByUsername("เท่ง");

        String expected = "เท่ง";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("ทดสอบว่าผู้ใช้สามารถเปลี่ยนรหัสผ่านได้หรือไม่")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList

        // TODO: change password of one user

        // TODO: assert that user can change password
        // assertTrue(actual);

        UserList userList = new UserList();
        userList.addUser("หม่ำ", "1");
        userList.addUser("เท่ง", "2");
        userList.addUser("โหน่ง", "3");

        boolean isPasswordChanged = userList.changePassword("หม่ำ", "1", "newpassword");

        assertTrue(isPasswordChanged);
        User user = userList.findUserByUsername("หม่ำ");
        assertTrue(user.validatePassword("newpassword"));
    }

    @Test
    @DisplayName("ทดสอบว่าผู้ใช้สามารถ login ได้หรือไม่")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with correct username and password

        // TODO: assert that User object is found
        // assertEquals(expected, actual);

        UserList userList = new UserList();
        userList.addUser("หม่ำ", "1");
        userList.addUser("เท่ง", "2");
        userList.addUser("โหน่ง", "3");

        User user = userList.login("หม่ำ", "1");

        assertEquals("หม่ำ", user.getUsername());
    }

    @Test
    @DisplayName("ทดสอบว่าไม่สามารถ login ได้หากใส่รหัสผ่านผิด")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with incorrect username or incorrect password

        // TODO: assert that the method return null
        // assertNull(actual);

        UserList userList = new UserList();
        userList.addUser("หม่ำ", "1");
        userList.addUser("เท่ง", "2");
        userList.addUser("โหน่ง", "3");

        User user = userList.login("หม่ำ", "2");

        assertNull(user);
    }
}