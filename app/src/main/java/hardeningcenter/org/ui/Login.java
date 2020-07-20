package hardeningcenter.org.ui;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import hardeningcenter.org.R;

public class Login extends AppCompatActivity {

    LinearLayout sign_in_button;
    EditText user_id,password;
    Dialog myDialog;
    TextView forgot;
    String user_ids,passwords;
    private static final String SHARED_PREF_NAME = "JPhpref";
    private static final String KEY_BRANCH_ID= "designation";
    private static final String KEY_ID = "keyid";
    String usernames,tokens,deg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences prefs = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);
        usernames = prefs.getString("username", null);
        tokens = prefs.getString(KEY_ID, null);
        deg = prefs.getString(KEY_BRANCH_ID, null);

        sign_in_button=(LinearLayout)findViewById(R.id.sign_in_button);
        sign_in_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    attemptLogin();
            }
        });

        user_id=(EditText)findViewById(R.id.user_id);
        password=(EditText)findViewById(R.id.password);
        myDialog=new Dialog(Login.this);
        forgot=(TextView)findViewById(R.id.forgot);
        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowPopup(v);
            }
        });
    }

    private void attemptLogin() {
        user_id.setError(null);
        password.setError(null);
        user_ids = user_id.getText().toString();
        passwords = password.getText().toString();

        boolean cancel = false;
        View focusView = null;

        if (TextUtils.isEmpty(user_ids)) {
            user_id.setError(getString(R.string.error_field_required));
            focusView = user_id;
            cancel = true;
        }
        if (TextUtils.isEmpty(passwords)) {
            password.setError(getString(R.string.error_incorrect_password));
            focusView = password;
            cancel = true;
        }
        if (cancel) {
            focusView.requestFocus();

        }else{
            Intent intent=new Intent(Login.this,Dashboard.class);
            startActivity(intent);
            finish();
        }

    }

    public void ShowPopup(View v) {
        TextView txtclose;
        final EditText add_d,add_password;
        Button btnFollow;
        myDialog.setContentView(R.layout.forgot_password);
        myDialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
        add_password=(EditText) myDialog.findViewById(R.id.add_password);
        btnFollow = (Button) myDialog.findViewById(R.id.btnfollow);
        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }
}