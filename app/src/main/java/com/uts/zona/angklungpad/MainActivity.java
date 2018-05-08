package com.uts.zona.angklungpad;

import android.content.pm.ActivityInfo;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SoundPool sp;
    private int sol;
    private int doo;
    private int re;
    private int mi;
    private int fa;
    private int la;
    private int si;
    private int do1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = new SoundPool(10, AudioManager.STREAM_MUSIC,0);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        la = sp.load(getApplicationContext(),R.raw.sla,1);
        doo = sp.load(getApplicationContext(),R.raw.sdo,1);
        re = sp.load(getApplicationContext(),R.raw.sre,1);
        mi = sp.load(getApplicationContext(),R.raw.smi,1);
        fa = sp.load(getApplicationContext(),R.raw.sfa,1);
        si = sp.load(getApplicationContext(),R.raw.ssi
                ,1);
        do1 = sp.load(getApplicationContext(),R.raw.sdo1,1);
        sol = sp.load(getApplicationContext(),R.raw.ssol,1);


    }


    public void doo(View view) {
        sp.play(doo,1.0f,1.0f,0,0,1f);
    }
    public void re(View view) {
        sp.play(re,1.0f,1.0f,0,0,1f);
    }
    public void mi(View view) {
        sp.play(mi,1.0f,1.0f,0,0,1f);
    }

    public void fa(View view) {
        sp.play(fa,1.0f,1.0f,10,0,1f);
    }
    public void la(View view) {
        sp.play(la,1.0f,1.0f,0,0,1f);
    }
    public void si(View view) {
        sp.play(si,1.0f,1.0f,0,0,1f);
    }
    public void do1(View view) {
        sp.play(do1,1.0f,1.0f,0,0,1f);
    }
    public void sol(View view) {
        sp.play(sol,1.0f,1.0f,0,0,1f);
    }

}