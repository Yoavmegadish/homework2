package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
try {
    firstexception();
}
catch (Exception e)
{
    fix(e);
}
try {
    secondexception();
}
catch (Exception exp)
{
    fix(exp);
}
    }
    public void firstexception() throws Exception
    {
        int a= 10;
        int b=0;
        int c=a/b;
    }
    public void secondexception()
    {
String exp =null;
int x=exp.length();
    }
    public void fix(Exception exp)
    {
        System.out.println("error");
    }
}