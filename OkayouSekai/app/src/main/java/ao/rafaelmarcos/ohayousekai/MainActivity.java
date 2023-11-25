package ao.rafaelmarcos.ohayousekai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView mTextView;
    private boolean mAllCaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.hello_message);
        mAllCaps = true;

        mTextView.setOnClickListener(this::onClick);
    }

    @Override
    public void onClick(View v){
        mTextView.setAllCaps(mAllCaps);
        mAllCaps = !mAllCaps;
    }
}