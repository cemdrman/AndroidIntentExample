package io.bilisim.intentexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnIkinciSayfayaGec = (Button)findViewById(R.id.btnIkinciSayfa);
        btnIkinciSayfayaGec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ıntent = new Intent(MainActivity.this,SecondActivity.class);
                Intent ıntent1 = new Intent();
                String web = "bilism.io";
                ıntent.putExtra("web",web);
                ıntent.put
                startActivity(ıntent);
            }
        });

    }
}
