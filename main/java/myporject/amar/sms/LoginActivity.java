package myporject.amar.sms;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "LoginActivity";

    private TextInputEditText et_username;
    private TextInputEditText et_password;
    private Button btn_login;
    private Button btn_forgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.FullScreenTheme);
        setContentView(R.layout.activity_login);

        et_username = (TextInputEditText) findViewById(R.id.et_username);
        et_password = (TextInputEditText) findViewById(R.id.et_password);
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_forgot = (Button) findViewById(R.id.btn_forgot);

        btn_login.setOnClickListener(this);
        btn_forgot.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.equals(btn_login)){
            String username =Functions.getText(et_username);
            if (username.isEmpty()|| !username.contains("@") || !username.contains(".")) {
                Functions.showError(et_username,"Invalid Username");
            }else if (Functions.getText(et_password).isEmpty()){
                Functions.showError(et_password,"Invalid Password");
            }else {
                et_username.setError(null);
                et_password.setError(null);
            }
        }

    }
}
