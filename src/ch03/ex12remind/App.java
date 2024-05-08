package ch03.ex12remind;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        
        // filtering, res/remind.data->res/valid.data
        {
            

        }

        // mapping, res/valid.data->grade.data
        {

        }

        // reducing : count, res/valid.data
        int count = 0;
        {
            // 코드를 작성하세요.
            

            System.out.printf("count is %d\n",count);
        }

        // reducing : total, res/valid.data
        int total = 0;
        {
            // 코드를 작성하세요.
            

            System.out.printf("total is %d\n",total);
        }

        // reducing : avg
        {
            double avg = 0;
            // 코드를 작성하세요.
                       
            
            System.out.printf("avg is %6.2f\n",avg);
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
