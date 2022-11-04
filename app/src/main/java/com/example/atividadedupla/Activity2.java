package com.example.atividadedupla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    public static final String EXTRA_REPLY =
            "com.example.android.Atividadedupla.extra.Reply";
    private EditText mReply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.text_message);
        textView.setText(message);
        mReply = findViewById(R.id.editText_second);
    }

    public void launchSecondActivity(View view) {
    }

    public void returnReply(View view) {
        String reply = mReply.getText().toString();
        Intent replyIntend = new Intent();
        replyIntend.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntend);
        finish();
    }
}