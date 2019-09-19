package com.example.android.americanfootballscorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //track the score for team A
    int scoreTeamA = 0;
    //track the score for team B
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /**
    * increase the score for team A by 6 points
    */
    public void addSixPointsForTeamA(View V) {
         scoreTeamA = (scoreTeamA+6);
         displayForTeamA(scoreTeamA);
    }
    /**
     * increase the score for team A by 3 points
     */
    public void addThreePointsForTeamA(View V) {
        scoreTeamA = (scoreTeamA+3);
        displayForTeamA(scoreTeamA);
    }
    /**
     * increase the score for team A by 2 points
     */
    public void addTwoPointsForTeamA(View V) {
        scoreTeamA = (scoreTeamA+2);
        displayForTeamA(scoreTeamA);
    }
    /**
     * increase the score for team A by 1 point
     */
    public void addOnePointsForTeamA(View V) {
        scoreTeamA =(scoreTeamA+1);
        displayForTeamA(scoreTeamA);
    }

    /**
     * increase the score for team B by 6 points
     */
    public void addSixPointsForTeamB(View V) {
        scoreTeamB =(scoreTeamB+6);
        displayForTeamB(scoreTeamB);
    }


    /**
     * increase the score for team B by 3 points
     */
    public void addThreePointsForTeamB(View V) {
        scoreTeamB = (scoreTeamB+3);
        displayForTeamB(scoreTeamB);
    }
    /**
     * increase the score for team B by 2 points
     */
    public void addTwoPointsForTeamB(View V) {
        scoreTeamB = (scoreTeamB+2);
        displayForTeamB(scoreTeamB);
    }
    /**
     * increase the score for team B by 1 points
     */
    public void addOnePointsForTeamB(View V) {
        scoreTeamB = (scoreTeamB+1);
        displayForTeamB(scoreTeamB);
    }
    /**
     * reset the scores for both teams to 0
     */
    public void resetScore(View v){
        scoreTeamA = 0;
       scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }



    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_B_score);
        scoreView.setText(String.valueOf(score));
    }



}
