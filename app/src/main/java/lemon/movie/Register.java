package lemon.movie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        EditText name = (EditText) findViewById(R.id.editText1);
        EditText sername = (EditText) findViewById(R.id.editText2);
        EditText email= (EditText) findViewById(R.id.editText3);
        EditText tel = (EditText) findViewById(R.id.editText4);
        final EditText username = (EditText) findViewById(R.id.editText5);
        final EditText password = (EditText) findViewById(R.id.editText6);
        Button btn_regigter = (Button) findViewById(R.id.button);

    }
}