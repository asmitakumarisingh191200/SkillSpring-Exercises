import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    String name;

    @BeforeEach
    void setup() {

        name = "Asmita";

        System.out.println("Setup Executed");
    }

    @AfterEach
    void teardown() {

        System.out.println("Teardown Executed");
    }

    @Test
    void testName() {

        // Arrange
        String expected = "Asmita";

        // Act
        String actual = name;

        // Assert
        assertEquals(expected, actual);
    }
}
