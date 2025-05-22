package interview;

import java.text.SimpleDateFormat;

public class DateFormatCheck {
    public static void main(String[] args) {
        String str = "2021-02-2800:30:00";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-ddHH:mm:SS");
        try {
            System.out.println(format.parse(str));
    
        } catch(Exception e) {
            System.out.println(e.getMessage());
    
        }
    }
   
}
