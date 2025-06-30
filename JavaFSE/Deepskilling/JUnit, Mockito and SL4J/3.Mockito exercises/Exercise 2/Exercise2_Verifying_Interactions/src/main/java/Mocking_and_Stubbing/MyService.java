package Mocking_and_Stubbing;

public class MyService {
    private final ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String performDataTransformation(String rawInput) {
        String transformedInput = rawInput.trim().toUpperCase();
        return externalApi.processData(transformedInput);
    }

    public void storeImportantData(String uniqueId, String payload) {
        externalApi.saveData(uniqueId, payload);
    }
}