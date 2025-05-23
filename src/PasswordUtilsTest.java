import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordUtilsTest {

    // Part 1: describePasswordLength method

    @Test
    void testDescribePasswordLengthShortPassword() {

        // Arrange
        String password = "hey";


        // Act
        String actual = PasswordUtils.describePasswordLength(password);

        // We dont have to manually add print method, junit will do it for us under Assert part
        //System.out.println(actual);


        // Assert
        // comparing 2 variables for the test, where one is expect, and one is actual one
        assertEquals("short", actual);

    }

    @Test
    void testDescribePasswordLengthExactly12chars(){

        // Arrange
        String password = "hellosdev220";

        // Act
        String actual = PasswordUtils.describePasswordLength(password);

        // Assert
        assertEquals("long", actual);
    }


    @Test
    void testDescribePasswordLengthMedium(){

        // Arrange
        String password = "helloSDEV";

        // Act
        String actual = PasswordUtils.describePasswordLength(password);

        // Assert
        assertEquals("medium", actual);
    }


    @Test
    void testDescribePasswordLengthLongPassword(){

        // Arrange
        String password = "helloStudentSDEV220";

        // Act
        String actual = PasswordUtils.describePasswordLength(password);

        // Assert
        assertEquals("long", actual);
    }



    // Part 2: isAlphanumeric method

    @Test
    void testIsAlphanumeric(){

        // Arrange
        String password = "hello123";

        // Act
        boolean actual = PasswordUtils.isAlphanumeric(password);

        // Assert
        assertEquals (true, actual);
    }


    @Test
    void testIsAlphanumericWithSpecialChar(){

        // Arrange
        String password = "hello!";

        // Act
        boolean actual = PasswordUtils.isAlphanumeric(password);

        // Assert
        assertEquals (false, actual);
    }


    @Test
    void testIsAlphanumericWithSpace(){

        // Arrange
        String password = "hello 123";

        // Act
        boolean actual = PasswordUtils.isAlphanumeric(password);

        // Assert
        assertEquals (false, actual);
    }


    // Part 3: containsTriple method

    @Test
    void testContainsTriple1(){
        
        // Arrange
        String password = "heyyy";

        // Act
        boolean actual = PasswordUtils.containsTriple(password);

        // Assert
        assertEquals(true, actual);
    }

    @Test
    void testContainsTriple2(){

        // Arrange
        String password = "hheeyy";

        // Act
        boolean actual = PasswordUtils.containsTriple(password);

        // Assert
        assertEquals(false, actual);
    }


    @Test
    void testContainsTriple3(){

        // Arrange
        String password = "hh heeyy";

        // Act
        boolean actual = PasswordUtils.containsTriple(password);

        // Assert
        assertEquals(false, actual);
    }


    // Part 4: countSpecialCharacters method

    @Test
    void testCountSpecialCharactersAsSpaces(){

        // Arrange
        String password = "he ythe re";

        // Act
        int actual = PasswordUtils.countSpecialCharacters(password);

        // Assert
        assertEquals(2, actual);
    }

    @Test
    void testCountSpecialCharacters(){

        // Arrange
        String password = "!!!hello!!!";

        // Act
        int actual = PasswordUtils.countSpecialCharacters(password);

        // Assert
        assertEquals(6, actual);
    }

    @Test
    void testCountSpecialCharactersAndSpaces(){

        // Arrange
        String password = "he ythe re!!";

        // Act
        int actual = PasswordUtils.countSpecialCharacters(password);

        // Assert
        assertEquals(4, actual);
    }


    // Part 5: hasSufficientSpecialCharacters method

    @Test
    void testHasSufficientSpecialCharactersMoreThan(){

        // Arrange
        String password = "hellothere!!!";

        // Act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, 2);

        // Assert
        assertEquals(true, actual);
    }

    @Test
    void testHasSufficientSpecialCharactersLessThan(){

        // Arrange
        String password = "hello there!!!";

        // Act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, 6);

        // Assert
        assertEquals(false, actual);
    }

    @Test
    void testHasSufficientSpecialCharactersEqualTo(){

        // Arrange
        String password = "hello there!!!";

        // Act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, 4);

        // Assert
        assertEquals(true, actual);
    }

}
