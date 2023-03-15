package com.example.finaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class PoetryContentActivity extends AppCompatActivity {

    public static void actionStart(Context context, String poetryTitle, String poetryContent){
        Intent intent=new Intent(context,PoetryContentActivity.class);
        intent.putExtra("poetry_title",poetryTitle);
        intent.putExtra("poetry_content",poetryContent);
        context.startActivity(intent);
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poetry_content);
        String poetryTitle=getIntent().getStringExtra("poetry_title");
        String poetryContent=getIntent().getStringExtra("poetry_content");
        PoetryContentFragment poetryContentFragment=(PoetryContentFragment) getSupportFragmentManager().findFragmentById(R.id.poetry_content_fragment);
        poetryContentFragment.refresh(poetryTitle,poetryContent);
    }
}