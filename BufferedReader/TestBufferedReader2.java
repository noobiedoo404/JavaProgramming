package BufferedReader;
import java.io.*;

class IwillThrowException{
    void TestThrow() throws Exception{
        throw new Exception("An exception is thrown:)!");
    }
}

public class TestBufferedReader2 {
    public static void main(String[] args) throws Exception {
        IwillThrowException obj=new IwillThrowException();
        obj.TestThrow();

    }
}

