package com.example.finaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText accountEdit;
    private EditText passwordEdit;
    private Button login;
    private Button register;
    private MyDatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        databaseHelper=new MyDatabaseHelper(this,"AccountCollector.db",null,1);
        SQLiteDatabase database=databaseHelper.getWritableDatabase();
        accountEdit=(EditText) findViewById(R.id.account);
        passwordEdit=(EditText) findViewById(R.id.password);
        login=(Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("Range")
            @Override
            public void onClick(View v) {
                String account=accountEdit.getText().toString();
                String password=passwordEdit.getText().toString();
                Cursor cursor=database.query("Account",null,"account=?",new String[]{account},null,null,null);
                if (cursor.moveToFirst()&&password.equals(cursor.getString(cursor.getColumnIndex("password")))){//曾经的BUG2:需先判断cursor是否找到，否则后者可能非法访问
                    Intent intent=new Intent(LoginActivity.this, ShowActivity.class);
                    startActivity(intent);
                    Toast.makeText(LoginActivity.this,"欢迎，"+account,Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(LoginActivity.this,"账号或密码错误",Toast.LENGTH_SHORT).show();
                }
                cursor.close();
            }
        });
        register=(Button) findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}