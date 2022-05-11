package com.example.messanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class CreateMessageActivity extends AppCompatActivity {

    private EditText editTextMsg;
    private Spinner spinnerSelect;
    private TextView textViewFastText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMsg = findViewById(R.id.editTextMessage);
        spinnerSelect = findViewById(R.id.spinnerFastText);
        textViewFastText = findViewById(R.id.textViewFastText);

    }

    public void onClickSendMsg(View view) {
        String msg = editTextMsg.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, msg);
        Intent chosenIntent = Intent.createChooser(intent, getString(R.string.chooser_title));
        startActivity(chosenIntent);
    }


    public void selectFastText(View view) {
    int position = spinnerSelect.getSelectedItemPosition();
    String text = getFastTextByPosition(position);
    textViewFastText.setText(text);

    }
    private String getFastTextByPosition(int position){
        String[] text = getResources().getStringArray(R.array.fast_text);
        return text[position];
    }
}