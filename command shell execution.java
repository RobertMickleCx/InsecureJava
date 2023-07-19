import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandInjectionExample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a name: ");
        String name = reader.readLine();

        // Vulnerable code: directly concatenating user input into a shell command
        //String command = "echo Hello, " + name;
        //Process process = Runtime.getRuntime().exec(command);

        System.out.println("Hello, " + name)

        // Read the output of the command
        BufferedReader outputReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String output;
        while ((output = outputReader.readLine()) != null) {
            System.out.println(output);
        }
        outputReader.close();
    }
}
