import java.util.regex.Pattern;

public class CheckIp {
    public void checkIp(String ip){
        String regEx = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d))";
       boolean result = Pattern.matches(regEx,ip);
        if(result == true){
            System.out.println("Ip is right");
        }else System.out.println("Ip is wrong");
    }
}
