package Mocking_and_Stubbing;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVerifyProcessDataInteractionWithSpecificArguments() {
        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        String rawInput = "  hello world  ";
        service.performDataTransformation(rawInput);

        verify(mockApi).processData("HELLO WORLD");
    }

    @Test
    public void testVerifySaveDataInteractionWithSpecificArguments() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        String idToSave = "document_abc";
        String dataToSave = "{\"status\": \"complete\", \"version\": 2}";

        service.storeImportantData(idToSave, dataToSave);

        verify(mockApi).saveData("document_abc", "{\"status\": \"complete\", \"version\": 2}");

    }
}
