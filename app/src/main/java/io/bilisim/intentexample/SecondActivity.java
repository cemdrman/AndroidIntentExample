package io.bilisim.intentexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by cem on 16.06.2017.
 */
public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView mesaj = (TextView)findViewById(R.id.txtBirinciSayfadanGelenVeri);

        Intent ıntent = getIntent();
        String web = ıntent.getStringExtra("web");
        mesaj.setText(web);
    }
}
