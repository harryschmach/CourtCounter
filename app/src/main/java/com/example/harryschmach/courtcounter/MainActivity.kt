package com.example.harryschmach.courtcounter

import android.R.menu
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView

/**
 * This activity keeps track of the basketball score for 2 teams.
 */
class MainActivity : AppCompatActivity() {

    // Tracks the score for Team A
    internal var scoreTeamA = 0
    internal var redsTeamA = 0

    // Tracks the score for Team B
    internal var scoreTeamB = 0
    internal var redsTeamB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    /**
     * Increase the score for Team A by 1 point.
     */
    fun addOneForTeamA(v: View) {
        scoreTeamA = scoreTeamA + 1
        displayForTeamA(scoreTeamA)
    }

    /**
     * Increase the red cards for Team A by 1.
     */
    fun addRedForTeamA(v: View) {
        redsTeamA += 1
        displayRedsTeamA(redsTeamA)
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    fun addOneForTeamB(v: View) {
        scoreTeamB = scoreTeamB + 1
        displayForTeamB(scoreTeamB)
    }

    /**
     * Increase the red cards for Team B by 1.
     */
    fun addRedForTeamB(v: View) {
        redsTeamB += 1
        displayRedsTeamB(redsTeamB)
    }


    /**
     * Resets the score and red cards for both teams back to 0.
     */
    fun resetScore(v: View) {
        scoreTeamA = 0
        scoreTeamB = 0
        redsTeamA = 0
        redsTeamB = 0
        displayForTeamA(scoreTeamA)
        displayForTeamB(scoreTeamB)
        displayRedsTeamA(redsTeamA)
        displayRedsTeamB(redsTeamB)
    }

    /**
     * Displays the given score for Team A.
     */
    fun displayForTeamA(score: Int) {
        val scoreView = findViewById<View>(R.id.team_a_score) as TextView
        scoreView.text = score.toString()
    }

    /**
     * Displays the given score for Team B.
     */
    fun displayForTeamB(score: Int) {
        val scoreView = findViewById<TextView>(R.id.team_b_score)
        scoreView.text = score.toString()
    }
    /**
     * Displays the given score for Team A.
     */
    fun displayRedsTeamA(reds: Int) {
        val redsView = findViewById<View>(R.id.team_a_reds) as TextView
        redsView.text = reds.toString()
    }

    /**
     * Displays the given score for Team B.
     */
    fun displayRedsTeamB(reds: Int) {
        val redsView = findViewById<TextView>(R.id.team_b_reds)
        redsView.text = reds.toString()
    }
}