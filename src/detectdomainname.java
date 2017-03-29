
import java.util.*;
import java.util.regex.*;

public class detectdomainname {

    
    public static void main(String[] args) {
        Matcher matcher = Pattern.compile("(?:https?://)" + "(?<domain>[-a-z0-9_~]{1,63}(?:\\.[-a-z0-9_~]{1,63}){1,126})" + "(?::[0-9]{1,5})?" + "(?:/[^\\s?]*)?" + "(?:\\?[-a-z0-9_~]+=[-a-z0-9_~]*(?:&[-a-z0-9_~]+=[-a-z0-9_~]*)*)?", Pattern.CASE_INSENSITIVE).matcher("");

        Scanner in = new Scanner(System.in);
        Set<String> domains = new TreeSet<>();
        int N = Integer.parseInt(in.nextLine());
        while (N-- > 0) {
            String htmlFrag = in.nextLine();
            matcher.reset(htmlFrag);
            while (matcher.find()) {
                String domain = matcher.group("domain").toLowerCase();
                if (domain.length() < 254) {
                    if (domain.startsWith("www.") || domain.startsWith("ww2.")) {
                        domain = domain.substring(4);
                    }
                    domains.add(domain);
                }
            }
        }
        N = domains.size();
        for (String domain : domains) {
            System.out.print(domain + (--N > 0 ? ";" : ""));
        }
    }
}
