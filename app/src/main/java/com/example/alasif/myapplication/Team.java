package com.example.alasif.myapplication;


import java.util.ArrayList;

public class Team {
    private String teamName;
    private int teamImageId;

    public Team(String teamName, int teamImageId) {
        this.teamName = teamName;
        this.teamImageId = teamImageId;
    }

    public Team() {
    }

    public String getTeamName() {
        return teamName;
    }

    public int getTeamImageId() {
        return teamImageId;
    }

   public ArrayList<Team> getAllTeam(){
       ArrayList<Team> teams = new ArrayList<>();
       teams.add(new Team("angry birds",R.drawable.ang));
       teams.add(new Team("minions",R.drawable.mini));
       teams.add(new Team("pikachu",R.drawable.pikachu));
       return  teams;
   }

}
