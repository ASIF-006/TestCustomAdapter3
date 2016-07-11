package com.example.alasif.myapplication;


import java.util.ArrayList;

public class Team {
    private String teamNameText;
    private String teamPhoneText;
    private  String teamEmailText;
    private int teamImageId;

    public String getTeamPhoneText() {
        return teamPhoneText;
    }

    public String getTeamEmailText() {
        return teamEmailText;
    }

    public Team(String teamName, int teamImageId, String teamEmail, String teamPhone) {
        this.teamNameText = teamName;
        this.teamImageId = teamImageId;
        this.teamEmailText = teamEmail;
        this.teamPhoneText = teamPhone;

    }

    public Team() {
    }

    public String getTeamNameText() {
        return teamNameText;
    }

    public int getTeamImageId() {
        return teamImageId;
    }

   public ArrayList<Team> getAllTeam(){
       ArrayList<Team> teams = new ArrayList<>();
       teams.add(new Team("AngryBird",R.drawable.ang,"angry@gmail.com","01911907777"));
       teams.add(new Team("Minions",R.drawable.mini,"min@hotmail","01711809999"));
       teams.add(new Team("Pikachu",R.drawable.pikachu,"pika@yahoo.com","01180902354"));
       return  teams;
   }

}
