import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class DataServiceTest {

    @Test
    void testMockingAndStubbing() {

        Database mockDatabase = Mockito.mock(Database.class);

        Mockito.when(mockDatabase.getEmployeeName(101))
                .thenReturn("Mock Employee");

        DataService service = new DataService(mockDatabase);

        String result = service.fetchEmployee(101);

        assertEquals("Mock Employee", result);
    }
}