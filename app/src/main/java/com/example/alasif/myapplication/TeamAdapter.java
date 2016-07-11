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



    public TeamAdapter(Context context,ArrayList<Team> teams) {
        super(context, R.layout.list_row, teams);
        this.context = context;
        this.teams = teams;
    }

    private Context context;
    private ArrayList<Team> teams;

    private class viewHolder{
        TextView teamNameText ;
        TextView teamPhone ;
        TextView teamEmail ;
        ImageView teamPic ;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        viewHolder vi = new viewHolder();

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_row, null,true);

            vi.teamNameText = (TextView) convertView.findViewById(R.id.teamName);
            vi.teamPhone = (TextView) convertView.findViewById(R.id.phone);
            vi.teamEmail = (TextView) convertView.findViewById(R.id.email);
            vi.teamPic = (ImageView) convertView.findViewById(R.id.teamPic);
            convertView.setTag(vi);
        }
        else{
            vi = (viewHolder) convertView.getTag();
        }

        vi.teamNameText.setText(teams.get(position).getTeamNameText());
        vi.teamPic.setImageResource(teams.get(position).getTeamImageId());
        vi.teamPhone.setText(teams.get(position).getTeamPhoneText());
        vi.teamEmail.setText(teams.get(position).getTeamEmailText());
        return convertView;
    }
}
