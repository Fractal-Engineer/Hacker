
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class hacker {
    static void hackerScreen() {
    try {
        ProcessBuilder builder = new ProcessBuilder("cmd", "/c", "dir/s");
        Process process = builder.start();

        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public static void main(String[] args) {
    for (int i = 0; i < 100000000; i++) { 
    hackerScreen();
}
}
}