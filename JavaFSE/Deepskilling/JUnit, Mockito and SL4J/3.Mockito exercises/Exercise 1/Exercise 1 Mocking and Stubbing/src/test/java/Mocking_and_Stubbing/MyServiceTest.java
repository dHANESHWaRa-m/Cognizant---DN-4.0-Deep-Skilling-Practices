package Mocking_and_Stubbing;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testExternalApiGetData() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");
        when(mockApi.getStatusCode()).thenReturn(200);
        MyService service = new MyService(mockApi);
        String result = service.fetchData();
        assertEquals("Mock Data", result);
        verify(mockApi, times(1)).getData();
        assertTrue(service.isServiceReady());
        verify(mockApi, times(1)).getStatusCode();
    }

    @Test
    public void testExternalApiGetDataWithError() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenThrow(new RuntimeException("API Down!"));
        MyService service = new MyService(mockApi);
        org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, () -> {
            service.fetchData();
        });
        verify(mockApi, times(1)).getData();
    }
}
