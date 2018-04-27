package com.example.harryschmach.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the soccer score for 2 teams.
 */
public class MainActivity extends AppCompatActivity{

    // Tracks the score for Team A
    int scoreTeamA = 0;
    // Tracks the red cards for Team A
    int redsTeamA = 0;

    // Tracks the score for Team B
    int scoreTeamB = 0;
    // Tracks the red cards for Team B
    int redsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //Increase Team A score by 1
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
    * Increase the red cards for Team B by 1.
    */
    public void addRedForTeamA(View v) {
        redsTeamA = redsTeamA + 1;
        displayRedsTeamA(redsTeamA);
    }
    //Increase Team A score by 1
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
    * Increase the red cards for Team B by 1.
    */
    public void addRedForTeamB(View v) {
        redsTeamB = redsTeamB + 1;
        displayRedsTeamB(redsTeamB);
    }

    /**
    * Resets the score and red cards for both teams back to 0.
    */

    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        redsTeamA = 0;
        redsTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayRedsTeamA(redsTeamA);
        displayRedsTeamB(redsTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given reds for Team A.
     */
    public void displayRedsTeamA(int reds) {
        TextView redsView = findViewById(R.id.team_a_reds);
        redsView.setText(String.valueOf(reds));
    }
    /**
     * Displays the given reds for Team B.
     */
    public void displayRedsTeamB(int reds) {
        TextView redsView = findViewById(R.id.team_b_reds);
        redsView.setText(String.valueOf(reds));
    }
}