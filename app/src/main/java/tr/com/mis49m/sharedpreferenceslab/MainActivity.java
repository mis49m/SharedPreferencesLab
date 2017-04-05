package tr.com.mis49m.sharedpreferenceslab;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private static final String SHARED_PREF_LOGIN = "loginPref";

    EditText txtUserName;
    Switch switchRemember;
    Button btnLogin;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUserName = (EditText) findViewById(R.id.txt_username);
        switchRemember = (Switch) findViewById(R.id.switch_remember);
        btnLogin = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {


           }
       });

    }

}
