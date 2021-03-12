import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        int count = 0;
        while(true){
            int num = Integer.parseInt(reader.readLine());
            if(num == -1){
                System.out.println(sum / count);
                break;
            }else{
                count++;
                sum += num;
            }
        }
    }
}