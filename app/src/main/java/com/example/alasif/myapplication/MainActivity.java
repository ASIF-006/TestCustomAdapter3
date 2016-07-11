package com.example.alasif.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Team> teams;
    TeamAdapter teamAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.TeamListView);
        Team  team = new Team();
        teams = team.getAllTeam();
        teamAdapter = new TeamAdapter(this, teams);
        listView.setAdapter(teamAdapter);
    }
}
