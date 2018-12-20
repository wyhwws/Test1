package wyh.test;

import android.media.Image;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

public class WelcomeActivity extends BaseActivity{

    private ImageView iv_welcome;
    private Handler mHandler = new Handler();
    private int alpha = 255;
    private int b = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_welcome);
        iv_welcome = findViewById(R.id.iv_welcome);
        iv_welcome.setAlpha(alpha);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (b<2){
                    try {
                        if (b==0){
                            Thread.sleep(500);
                            b=1;
                        }else {
                            Thread.sleep(100);
                        }
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
            }
        }

    }).start();
        mHandler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                iv_welcome.setAlpha(alpha);
                iv_welcome.invalidate();
            }
        };
    }
    public void updateApp(){
        alpha -=11;
        if (alpha <= 30){
            b=2;
        }
        mHandler.sendMessage(mHandler.obtainMessage());
    }
}
