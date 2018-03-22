package com.example.dell.activitytest;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button1=(Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //Toast.makeText(MainActivity.this, "You click Button 1",Toast.LENGTH_SHORT).show();
                /*Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);*/
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });
        Button button2=(Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data="Hello SecondActivity";
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                //intent.putExtra("extra_data",data);
                startActivity(intent);
            }
        });
        Button button3=(Button) findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "You click Button 3",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent("com.example.dell.activitytest.VIEW");
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });
        Button button4=(Button) findViewById(R.id.button_4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("com.example.dell.activitytest.ACTION_START");
                intent.addCategory("android.intent.category.MY_CATEGORY");
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.add_item:
                Toast.makeText(MainActivity.this,
                        "You click Add",Toast.LENGTH_SHORT).show();break;
            case R.id.remove_item:
                Toast.makeText(MainActivity.this,
                        "You click Remove",Toast.LENGTH_SHORT).show();break;
                default:
        }
        return true;
    }
}
