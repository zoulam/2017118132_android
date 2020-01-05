package cn.edu.hstc.service;
import android.app.IntentService;
import android.content.Intent;
import android.widget.Toast;

public class HelloIntentService extends IntentService {
    public HelloIntentService() {
        super("HelloIntentService");
    }

    /**
     * The IntentService calls this method from the default worker thread with
     * the intent that started the service. When this method returns, IntentService
     * stops the service, as appropriate.
     */
    @Override
    protected void onHandleIntent( Intent intent) {
        // Normally we would do some work here, like download a file.
        // For our sample, we just sleep for 5 seconds.
        try {
            Thread.sleep(5000);
            System.out.println("Thread are sleeping");
        } catch (InterruptedException e) {
            // Restore interrupt status.
            Thread.currentThread().interrupt();
        }
    }
    //onStartCommand() 必须返回默认实现（即，如何将 Intent 传递给 onHandleIntent()）：
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "service starting", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent,flags,startId);
    }
    @Override
    public void onDestroy() {
        System.out.println("Service onDestroy");
        super.onDestroy();
    }
}