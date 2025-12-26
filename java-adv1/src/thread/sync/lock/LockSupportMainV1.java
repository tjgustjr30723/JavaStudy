package thread.sync.lock;

import java.util.concurrent.locks.LockSupport;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class LockSupportMainV1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ParkTask(), "thread-1");
        thread1.start();

        sleep(100);
        log("Thread-1 state: " + thread1.getState());
        LockSupport.unpark(thread1); // 1. unpark 사용
        //thread1.interrupt(); // 2. interrupt() 사용
    }

    static class ParkTask implements Runnable {
        @Override
        public void run() {
            log("park 시작");
            LockSupport.park();
            log("park 종료, state: " + Thread.currentThread().getState());
            log("인터럽트 상태: " + Thread.currentThread().isInterrupted());
        }
    }
}
