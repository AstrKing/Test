package ak;

import java.io.IOException;
import java.util.Date;
import java.util.Timer;

public class demo001
{
    public static void main(String[] args) throws IOException {
        Timer timer = new Timer();
        timer.schedule(new MyTask(), new Date(),
                1 * 1000);//在下一个整十分钟时执行此任务,每次间隔10分钟,如果传递一个Data参数,就可以在某个固定的时间执行这个任务.
        while (true) {//这个是用来停止此任务的,否则就一直循环执行此任务了
            try {
                int ch = System.in.read();
                if (ch - 'c' == 0) {
                    timer.cancel();//使用这个方法退出任务
                }
            }
            catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    static class MyTask extends java.util.TimerTask
    {
        @Override
        public void run() {
            System.out.println("任务执行！");
        }
    }

}
