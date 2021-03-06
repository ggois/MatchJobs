package io.github.matchjobsapp.matchjobs.view.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.github.matchjobsapp.matchjobs.R;
/**
 * ╭────────────────────────────────────────────────────╮
 * │                                                    │
 * │   @author: Ivam H. M. Santos                       │
 * │   https://www.linkedin.com/in/ivamsantos           |
 * |   ivamks@gmail.com                                 |
 * |   Project: MatchJobs                               |
 * |   Create at 21/10/18                               │
 * │                                                    │
 * ╰────────────────────────────────────────────────────╯
 */
public class MainActivity extends AppCompatActivity implements Runnable{

    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handler = new Handler();
        handler.postDelayed(this, 3000);

    }

    @Override
    public void run() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() { }
}
