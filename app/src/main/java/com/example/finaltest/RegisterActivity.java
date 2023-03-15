package com.example.finaltest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private MyDatabaseHelper databaseHelper;
    private EditText registerAccountEdit;
    private EditText registerPasswordEdit1;
    private EditText registerPasswordEdit2;
    private Button registerConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        databaseHelper=new MyDatabaseHelper(this,"AccountCollector.db",null,1);//曾经的BUG1:数据库的调用需要在onCreate()中重新new
        SQLiteDatabase database=databaseHelper.getWritableDatabase();
        registerAccountEdit=(EditText)findViewById(R.id.r_account);
        registerPasswordEdit1=(EditText)findViewById(R.id.r_password1);
        registerPasswordEdit2=(EditText)findViewById(R.id.r_password2);
        registerConfirm=(Button)findViewById(R.id.r_confirm);
        registerConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String registerAccount=registerAccountEdit.getText().toString();
                String registerPassword1=registerPasswordEdit1.getText().toString();
                String registerPassword2=registerPasswordEdit2.getText().toString();
                Cursor cursor=database.query("Account",null,"account=?",new String[]{registerAccount},null,null,null);
                if (!cursor.moveToFirst()&&registerPassword1.equals(registerPassword2)){
                    ContentValues values=new ContentValues();
                    values.put("account",registerAccount);
                    values.put("password",registerPassword1);
                    database.insert("Account",null,values);
                    values.clear();
                    AlertDialog.Builder dialog=new AlertDialog.Builder(RegisterActivity.this);
                    dialog.setTitle("注册成功");
                    dialog.setMessage("请返回登录界面");
                    dialog.setPositiveButton("好", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent=new Intent(RegisterActivity.this,LoginActivity.class);
                            startActivity(intent);
                        }
                    });
                    dialog.show();
                }else if (!cursor.moveToFirst()){
                    AlertDialog.Builder dialog=new AlertDialog.Builder(RegisterActivity.this);
                    dialog.setTitle("注册失败");
                    dialog.setMessage("两次密码输入不一致");
                    dialog.setPositiveButton("好", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    dialog.show();
                }else {
                    AlertDialog.Builder dialog=new AlertDialog.Builder(RegisterActivity.this);
                    dialog.setTitle("注册失败");
                    dialog.setMessage("用户名已存在");
                    dialog.setPositiveButton("好", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    dialog.show();
                }
                cursor.close();
            }
        });
    }
}