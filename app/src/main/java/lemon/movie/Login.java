package lemon.movie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

/**
 * Created by lemon on 12/11/2017.
 */

public class Login extends AppCompatActivity {
    private static final String TAG = "login";
    TextView tv;
    EditText edUser, edPasswrd;
    String user,passwrd, url;
    //ProcessDialog pDialog;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

    url = "https://movie-2f053.firebaseio.com";
    tv = (TextView)findViewById(R.id.textView);

    }

    public void signin(View v){
        edUser = (EditText)findViewById(R.id.username);
        edPasswrd = (EditText)findViewById(R.id.password);
        user = edUser.getText().toString().trim();
        passwrd = edPasswrd.getText().toString().trim();

        // Access a Cloud Firestore instance from your Activity

        FirebaseFirestore db = FirebaseFirestore.getInstance();
        DocumentReference docRef = db.collection("cities").document("BJ");
        docRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                Querylogin querylogin = documentSnapshot.toObject(Querylogin.class);
            }
        });

    }


}
