package exam03;

public class MyResource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("자원 해제");
    }
}
