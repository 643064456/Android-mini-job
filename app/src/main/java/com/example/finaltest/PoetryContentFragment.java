package com.example.finaltest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PoetryContentFragment extends Fragment {
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.poetry_content_fragment,container,false);
        return view;
    }

    public void refresh(String poetryTitle,String poetryContent){
        View visibilityLayout=view.findViewById(R.id.visibility_layout);
        visibilityLayout.setVisibility(view.VISIBLE);
        TextView poetryTitleText=(TextView) view.findViewById(R.id.poetry_title);
        TextView poetryContentText=(TextView) view.findViewById(R.id.poetry_content);
        poetryTitleText.setText(poetryTitle);
        poetryContentText.setText(poetryContent);
    }
}
