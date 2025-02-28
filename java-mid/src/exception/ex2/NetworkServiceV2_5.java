package exception.ex2;

public class NetworkServiceV2_5 {
    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("오류 코드: " + e.getMessage() + ", 메시지: " + e.getErrorCode());
        }
        finally {
            client.disconnect();
        }

        client.disconnect();
    }
}
