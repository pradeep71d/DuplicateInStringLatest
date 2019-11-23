package com.example.duplicateinstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s1="bjhkkjlmn";
        char ch[]=s1.toCharArray();
        for (int i=0;i<ch.length;i++){
           for (int j=i+1;j<ch.length;j++){
               if (ch[i]==ch[j]){
                   System.out.println(ch[j]);

               }
           }
        }
    }
}
