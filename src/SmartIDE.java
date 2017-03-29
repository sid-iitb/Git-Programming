
import java.io.*;

public class SmartIDE {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = new String[200];
        int i = 0;
        line[i] = br.readLine();
        while (line[i] != null) {
            i++;
            line[i] = br.readLine();

        }
        solve(line);
    }

    static void solve(final String[] line) {
        for (int i = 0; line[i] != null; i++) {
            if (line[i].contains("/*")) {
                int l = line[i].indexOf("/*");
                if (line[i].contains("*/")) {
                    int la = line[i].indexOf("*/");
                    System.out.println(line[i].substring(l, la + 2));
                } else {
                    System.out.println(line[i].substring(l));
                    i++;
                    while (!line[i].contains("*/")) {
                        System.out.println(line[i]);
                        i++;
                    }
                    int la = line[i].indexOf("*/");
                    System.out.println(line[i].substring(0, la + 2));
                }
            } else if (line[i].contains("//")) {
                int l = line[i].indexOf("//");
                System.out.println(line[i].substring(l));
            }
        }
    }
}
