package net.hoangduchuu.demomvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import net.hoangduchuu.demomvp.HandleLogin.PresenterLogicLogin;
import net.hoangduchuu.demomvp.HandleLogin.ViewHandleLogin;

import static net.hoangduchuu.demomvp.R.id.sub;

public class MainActivity extends AppCompatActivity
        implements ViewHandleLogin, View.OnClickListener {
    EditText edtU, edtP;
    Button btnSubmit;
    PresenterLogicLogin presenterLogicLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewByIds();
    }

    private void findViewByIds() {
        edtP = (EditText) findViewById(R.id.p);
        edtU = (EditText) findViewById(R.id.u);
        btnSubmit = (Button) findViewById(sub);
        btnSubmit.setOnClickListener(this);
        presenterLogicLogin
                = new PresenterLogicLogin(this);


    }


    @Override
    public void onClick(View view) {
        presenterLogicLogin.CheckLogin(edtU.getText().toString(), edtP.getText().toString());

    }

    @Override
    public void LoginSusess(String msg) {
        Toast.makeText(this, String.valueOf(msg), Toast.LENGTH_SHORT).show();

    }

    @Override
    public void LoginFailed(String msg) {
        Toast.makeText(this, String.valueOf(msg), Toast.LENGTH_SHORT).show();

    }
}
