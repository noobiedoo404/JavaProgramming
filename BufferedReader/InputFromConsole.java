package BufferedReader;
import java.io.*;


//taking input from the console
public class InputFromConsole {
    public static void main(String[] args) throws IOException {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);

//        also valid
//        BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));


        System.out.print("assign value to a: ");
        //read() takes a single character as input and returns corresponding decimal value.
        int a=br.read();
        System.out.println(a);

        //while inputting single character we hit enter, so needs to be cleared from the buffer.
        br.readLine();

        System.out.print("assign value to b: ");
        /*readLine() takes string till the end of the line as input, returns a string containing the contents of the line,
         including any line-termination characters, or null if the end of the stream has been reached without reading any characters*/
        String b=br.readLine();
        System.out.println(b);

        System.out.print("assign value to c: ");
        //to use the string value, we can convert the value from string to integer.
        int c=Integer.parseInt(br.readLine());
        System.out.println(c);

    }

}
