import java.time.ZonedDateTime;

/**
 * @author ：m
 * @date ：Created in 2022/4/7 14:20
 */
public class T2 {
    public static void main(String[] args) {
        //获取当前时间串
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        //2022-04-07T14:21:39.072+08:00[Asia/Shanghai]
    }
}
