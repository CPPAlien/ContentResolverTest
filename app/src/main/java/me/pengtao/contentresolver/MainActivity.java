package me.pengtao.contentresolver;

import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final Uri CONTENT_URI = Uri.parse("content://me.pengtao.contentprovidertest/test");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Cursor cursor = getContentResolver().query(CONTENT_URI, null, null, null, null);
        cursor.moveToFirst();

        TextView tv = (TextView)findViewById(R.id.content);
        tv.setText(cursor.getString(1));

        cursor.close();
    }
}
