package ru.sheps.android.homework332;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOk(View view) {
        Locale locale;
        Spinner spinner = findViewById(R.id.spinner);
        int position = spinner.getSelectedItemPosition();
        if (position == 1) {
            locale = new Locale("ru");
        } else {
            locale = new Locale("eng");
        }
        Configuration config = new Configuration();
        config.setLocale(locale);
        getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        recreate();

    }

}
