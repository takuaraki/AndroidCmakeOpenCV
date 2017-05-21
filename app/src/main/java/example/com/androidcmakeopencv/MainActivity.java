package example.com.androidcmakeopencv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.opencv.core.Mat;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mat mat = new Mat();
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(
                stringFromJNI() + "\n" +
                "rows: " + mat.rows() + ", cols: " + mat.cols()
        );
    }

    public native String stringFromJNI();
}
