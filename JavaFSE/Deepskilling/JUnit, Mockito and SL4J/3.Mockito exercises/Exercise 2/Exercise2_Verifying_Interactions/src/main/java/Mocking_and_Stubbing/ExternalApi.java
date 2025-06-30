package Mocking_and_Stubbing;

public interface ExternalApi {
    String processData(String input);
    void saveData(String id, String data);
}