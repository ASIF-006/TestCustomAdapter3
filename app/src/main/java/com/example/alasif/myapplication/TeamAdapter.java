package com.example.alasif.myapplication;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TeamAdapter extends ArrayAdapter<Team> {

    private Context context;
    private ArrayList<Team> teams;

    public TeamAdapter(Context context,ArrayList<Team> teams) {
        super(context, R.layout.list_row, teams);
        this.context = context;
        this.teams = teams;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.list_row, null,true);
        TextView teamNameText = (TextView) convertView.findViewById(R.id.teamName);
        ImageView teamPic = (ImageView) convertView.findViewById(R.id.teamPic);

        teamNameText.setText(teams.get(position).getTeamName());
        teamPic.setImageResource(teams.get(position).getTeamImageId());
        return convertView;
    }
}
