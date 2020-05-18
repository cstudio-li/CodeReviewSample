package jp.cstudio.codereview;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;

public class SampleCode {
    public void sample(){
        String dateString = "2016/01/01 00:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Long epochTime = sdf.parse(dateString).getTime();
        System.out.println(epochTime);
    }

    public long sample2(){
        return 1.2;
    }

    public void runtimeError(){
        int n = 9, div = 0;

        div = n/0;

        System.out.println("result = " + div);
    }

    public void runtimeExcption(String someFile){
        try {
            InputStream is = new FileInputStream(someFile);  // could throw IOException
            if (true) {
                throw new Exception();  // WRONG
            }
        } catch (IOException ex) {
            System.err.println("cannot open ...");
        } catch (Exception ex) {
            System.err.println("something bad happened");  // WRONG
        }
    }
}
