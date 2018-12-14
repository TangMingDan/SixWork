package com.example.administrator.sixwork;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint("ValidFragment")
public class MyFragment extends Fragment {
    private String title;
    private String content;
    private int imageID;
    private String hint;
    View view;
    Context context;

    public MyFragment(String title, String content, int imageID, String hint) {
        super();
        this.title = title;
        this.content = content;
        this.imageID = imageID;
        this.hint = hint;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_layout,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView textView = view.findViewById(R.id.txt_text_frag);
        textView.setText(content);
        ImageView imageView = view.findViewById(R.id.img_image_frag);
        imageView.setImageResource(imageID);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getHint() {
        return hint;
    }
}
