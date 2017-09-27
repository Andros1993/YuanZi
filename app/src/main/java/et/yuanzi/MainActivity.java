package et.yuanzi;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import et.yuanzi.serviceTest.MyReceiver;

public class MainActivity extends AppCompatActivity {

//    private MyReceiver myReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        initListener();
    }

    public void initView() {
//        myReceiver = new MyReceiver();
//        IntentFilter filter = new IntentFilter();
//        filter.addAction(Intent.ACTION_SCREEN_OFF);
//        filter.addAction(Intent.ACTION_SCREEN_ON);
//        registerReceiver(myReceiver,filter);
    }

    public void initData() {

    }

    public void initListener() {

    }

//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        unregisterReceiver(myReceiver);
//    }
}
