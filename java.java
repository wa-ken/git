import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        
        int year = 2015;
        int month = 2;
        int day = 4;
        
        // バリデーション
        if(month < 0 || 12 < month){
            System.out.println("月がおかしいけど続行");
        }
        if(day < 0 || 31 < day ){
            System.out.println("日がおかしいけど続行");
        }
        
        // ツェラーの公式
        if(month < 3){
            month = month + 12;
            year = year - 1;
        }
        
        int c = year / 100;
        int first = day;
        int second = (26*(month+1)) / 10;
        int third = year % 100;
        int fourth = third / 4;
        int fifth = (5 * c) + (c / 4);
        
        int h = (first + second + third + fourth + fifth) % 7;
        
        switch(h){
            case 0:
                System.out.println("土曜日");
                break;
            case 1:
                System.out.println("日曜日");
                break;
            case 2:
                System.out.println("月曜日");
                break;
            case 3:
                System.out.println("火曜日");
                break;
            case 4:
                System.out.println("水曜日");
                break;
            case 5:
                System.out.println("木曜日");
                break;
            case 6:
                System.out.println("金曜日");
                break;

        }
    }
}
