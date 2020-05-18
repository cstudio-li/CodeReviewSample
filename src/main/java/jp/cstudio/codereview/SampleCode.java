package jp.cstudio.codereview;

import java.text.SimpleDateFormat;

public class SampleCode {
    public void sample(){
        String dateString = "2016/01/01 00:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Long epochTime = sdf.parse(dateString).getTime();
        System.out.println(epochTime);
    }
}
