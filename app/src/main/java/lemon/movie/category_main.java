package lemon.movie;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class category_main extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btn_comedy = (Button)findViewById(R.id.btncomedy);
        btn_comedy.setOnClickListener(this);

        Button btn_romantic = (Button)findViewById(R.id.btnromantic);
        btn_romantic.setOnClickListener(this);

        Button btn_action = (Button)findViewById(R.id.btnaction);
        btn_action.setOnClickListener(this);

        Button btn_horror = (Button)findViewById(R.id.btnhorror);
        btn_horror.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent itn_comedy = new Intent(this, category_detail.class);
        startActivity(itn_comedy);

        Intent itn_romatic = new Intent(this, category_detail.class);
        startActivity(itn_romatic);

        Intent itn_action = new Intent(this, category_detail.class);
        startActivity(itn_action);

        Intent itn_horror = new Intent(this, category_detail.class);
        startActivity(itn_horror);

    }
}
