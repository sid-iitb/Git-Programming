
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhsaho
 */
public class IpAddressValidation {
    

    public static String check(String ip)
    {
        
        String ipReg = "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}";
        String ip6Reg = "\\A(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}\\z";
        
        if(Pattern.compile(ipReg).matcher(ip).matches())
            return "IPv4";
        else if(Pattern.compile(ip6Reg).matcher(ip).matches())
            return "IPv6";
        else
            return "Neither";
    }
    public static void main(String args[])
    {
            System.out.println(check("121.18.19.20"));
    }

}
