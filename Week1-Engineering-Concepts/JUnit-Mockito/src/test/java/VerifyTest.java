import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class VerifyTest {

    @Test
    void testVerifyInteraction() {

        Database mockDatabase = Mockito.mock(Database.class);

        Mockito.when(mockDatabase.getEmployeeName(101))
                .thenReturn("Asmita");

        DataService service = new DataService(mockDatabase);

        service.fetchEmployee(101);

        Mockito.verify(mockDatabase).getEmployeeName(101);
    }
}