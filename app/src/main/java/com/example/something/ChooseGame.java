package com.example.something;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class ChooseGame extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choosegame);

        Window w=getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button button_back=(Button)findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent=new Intent(ChooseGame.this,MainActivity.class);
                    startActivity(intent); finish();
                }catch(Exception e) {
                }
            }
        });
        //Это чтобы кнопка Игра 1 перекидывала на старничку с уровнями для 1 игры
        TextView textView1=(TextView)findViewById(R.id.textViewG1);
        textView1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try{
                    Intent intent=new Intent(ChooseGame.this,GameLevels1.class);
                    startActivity(intent); finish();
                }catch(Exception e) {
                }
            }
        });
        //Это чтобы кнопка Игра 2 перекидывала на старничку с уровнями для 2 игры
        TextView textView2=(TextView)findViewById(R.id.textViewG2);
        textView2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try{
                    Intent intent=new Intent(ChooseGame.this,GameLevels2.class);
                    startActivity(intent); finish();
                }catch(Exception e) {
                }
            }
        });
        //Это чтобы кнопка Игра 3 перекидывала на старничку с уровнями для 3 игры
        TextView textView3=(TextView)findViewById(R.id.textViewG3);
        textView3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try{
                    Intent intent=new Intent(ChooseGame.this,GameLevels3.class);
                    startActivity(intent); finish();
                }catch(Exception e) {
                }
            }
        });




    }
    //Это чтобы системная кнопка тоже была кнопкой назад
    @Override
    public void onBackPressed(){
        try{
            Intent intent=new Intent(ChooseGame.this,MainActivity.class);
            startActivity(intent); finish();
        }catch(Exception e) {
        }
    }

}

