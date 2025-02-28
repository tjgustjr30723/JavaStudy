package exception.basic.checked;

public class Service {
    Client client = new Client();

    public void callCatch() {

        try {
            client.call();
        } catch (MyCheckedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("done");
    }
    public void callThrow() throws MyCheckedException {
        client.call();
    }
}
