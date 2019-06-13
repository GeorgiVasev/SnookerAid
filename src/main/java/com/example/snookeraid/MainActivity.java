package com.example.snookeraid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Setting starting values for players score.
    int playerOne = 0;
    int playerTwo = 0;

    //Setting starting values for players frames.
    int playerOneFrames = 0;
    int playerTwoFrames = 0;

    //Setting starting values for Player one balls.
    int redBall;
    int blackBall;
    int blueBall;
    int pinkBall;
    int greenBall;
    int brownBall;
    int yellowBall;
    int whiteBall;

    //Setting starting values for Player one balls.
    int redBallTwo;
    int blackBallTwo;
    int blueBallTwo;
    int pinkBallTwo;
    int greenBallTwo;
    int brownBallTwo;
    int yellowBallTwo;
    int whiteBallTwo;

    // Adding points to redBall and playerOne
    public void addRedPoint(View view) {
        playerOne += 1;
        redBall += 1;
        displayPlayerOne(playerOne);
        displayRedBallCount(redBall);
        gameOverConditions();
    }

    // Adding points to BlackBall and playerOne
    public void addBlackPoint(View view) {
        playerOne += 7;
        blackBall += 1;
        displayPlayerOne(playerOne);
        displayBlackBallCount(blackBall);
        gameOverConditions();
    }

    // Adding points to BlueBall and playerOne
    public void addBluePoint(View view) {
        playerOne += 5;
        blueBall += 1;
        displayPlayerOne(playerOne);
        displayBlueBallCount(blueBall);
        gameOverConditions();
    }

    // Adding points to PinkBall and playerOne
    public void addPinkPoint(View view) {
        playerOne += 6;
        pinkBall += 1;
        displayPlayerOne(playerOne);
        displayPinkBallCount(pinkBall);
        gameOverConditions();
    }

    // Adding points to GreenBall and playerOne
    public void addGreenPoint(View view) {
        playerOne += 3;
        greenBall += 1;
        displayPlayerOne(playerOne);
        displayGreenBallCount(greenBall);
        gameOverConditions();
    }

    // Adding points to BrownBall and playerOne
    public void addBrownPoint(View view) {
        playerOne += 4;
        brownBall += 1;
        displayPlayerOne(playerOne);
        displayBrownBallCount(brownBall);
        gameOverConditions();
    }

    // Adding points to YellowBall and playerOne
    public void addYellowPoint(View view) {
        playerOne += 2;
        yellowBall += 1;
        displayPlayerOne(playerOne);
        displayYellowBallCount(yellowBall);
        gameOverConditions();
    }

    // Removing points from playerOne
    public void minusPoints(View view) {
        if (playerOne >= 1) {
            playerOne = playerOne - 1;
            whiteBall += 1;
            displayPlayerOne(playerOne);
            displayWhiteBallCount(whiteBall);
        }
    }

    // Adding points to redBall and playerTwo
    public void addRedPointTwo(View view) {
        playerTwo += 1;
        redBallTwo += 1;
        displayPlayerTwo(playerTwo);
        displayRedBallCountTwo(redBallTwo);
        gameOverConditions();
    }

    // Adding points to BlackBall and playerTwo
    public void addBlackPointTwo(View view) {
        playerTwo += 7;
        blackBallTwo += 1;
        displayPlayerTwo(playerTwo);
        displayBlackBallCountTwo(blackBallTwo);
        gameOverConditions();
    }

    // Adding points to BlueBall and playerTwo
    public void addBluePointTwo(View view) {
        playerTwo += 5;
        blueBallTwo += 1;
        displayPlayerTwo(playerTwo);
        displayBlueBallCountTwo(blueBallTwo);
        gameOverConditions();
    }

    // Adding points to PinkBall and playerv
    public void addPinkPointTwo(View view) {
        playerTwo += 6;
        pinkBallTwo += 1;
        displayPlayerTwo(playerTwo);
        displayPinkBallCountTwo(pinkBallTwo);
        gameOverConditions();
    }

    // Adding points to GreenBall and playerTwo
    public void addGreenPointTwo(View view) {
        playerTwo += 3;
        greenBallTwo += 1;
        displayPlayerTwo(playerTwo);
        displayGreenBallCountTwo(greenBallTwo);
        gameOverConditions();
    }

    // Adding points to BrownBall and playerTwo
    public void addBrownPointTwo(View view) {
        playerTwo += 4;
        brownBallTwo += 1;
        displayPlayerTwo(playerTwo);
        displayBrownBallCountTwo(brownBallTwo);
        gameOverConditions();
    }

    // Adding points to YellowBall and playerTwo
    public void addYellowPointTwo(View view) {
        playerTwo += 2;
        yellowBall += 1;
        displayPlayerTwo(playerTwo);
        displayYellowBallCountTwo(yellowBallTwo);
        gameOverConditions();
    }

    // Removing points from playerTwo
    public void minusPointsTwo(View view) {
        if (playerTwo >= 1) {
            playerTwo = playerTwo - 1;
            whiteBallTwo += 1;
            displayPlayerTwo(playerTwo);
            displayWhiteBallCountTwo(whiteBallTwo);
        }
    }

    public void gameOverConditions() {
        if ((playerOne + playerTwo) >= 200) {
            playerOne = 0;
            redBall = 0;
            blackBall = 0;
            blueBall = 0;
            pinkBall = 0;
            greenBall = 0;
            brownBall = 0;
            yellowBall = 0;
            whiteBall = 0;

            playerTwo = 0;
            redBallTwo = 0;
            blackBallTwo = 0;
            blueBallTwo = 0;
            pinkBallTwo = 0;
            greenBallTwo = 0;
            brownBallTwo = 0;
            yellowBallTwo = 0;
            whiteBallTwo = 0;

            displayPlayerOne(playerOne);
            displayPlayerTwo(playerTwo);
            displayClearBalls();
        }
    }

    // Game Over button, resets scores and views
    public void gameOverButton(View view) {

        if (playerOne == playerTwo) {
            displayPlayerOneWonFrames(playerOneFrames);
            displayPlayerTwoWonFrames(playerTwoFrames);
        } else if (playerOne > playerTwo) {
            playerOneFrames += 1;
            displayPlayerOneWonFrames(playerOneFrames);
            playerOne = 0;
            redBall = 0;
            blackBall = 0;
            blueBall = 0;
            pinkBall = 0;
            greenBall = 0;
            brownBall = 0;
            yellowBall = 0;
            whiteBall = 0;

            playerTwo = 0;
            redBallTwo = 0;
            blackBallTwo = 0;
            blueBallTwo = 0;
            pinkBallTwo = 0;
            greenBallTwo = 0;
            brownBallTwo = 0;
            yellowBallTwo = 0;
            whiteBallTwo = 0;

            displayPlayerOne(playerOne);
            displayPlayerTwo(playerTwo);
            displayClearBalls();

        } else {
            playerTwoFrames += 1;
            displayPlayerTwoWonFrames(playerTwoFrames);

            playerOne = 0;
            redBall = 0;
            blackBall = 0;
            blueBall = 0;
            pinkBall = 0;
            greenBall = 0;
            brownBall = 0;
            yellowBall = 0;
            whiteBall = 0;

            playerTwo = 0;
            redBallTwo = 0;
            blackBallTwo = 0;
            blueBallTwo = 0;
            pinkBallTwo = 0;
            greenBallTwo = 0;
            brownBallTwo = 0;
            yellowBallTwo = 0;
            whiteBallTwo = 0;

            displayPlayerOne(playerOne);
            displayPlayerTwo(playerTwo);
            displayClearBalls();
        }
    }


    //Displays the score for Player One.

    public void displayPlayerOne(int score) {
        TextView scoreView = findViewById(R.id.player_one_score);
        scoreView.setText(String.valueOf(score));
    }

    //Displays the score for Player Two.

    public void displayPlayerTwo(int score) {
        TextView scoreView = findViewById(R.id.player_two_score);
        scoreView.setText(String.valueOf(score));
    }

    //Displays Player One won frames
    public void displayPlayerOneWonFrames(int score) {
        TextView scoreView = findViewById(R.id.player_one_frames);
        scoreView.setText(String.valueOf(score));
    }

    //Displays Player Two won frames
    public void displayPlayerTwoWonFrames(int score) {
        TextView scoreView = findViewById(R.id.player_two_frames);
        scoreView.setText(String.valueOf(score));
    }

    //Displays the ball count of Player One

    public void displayRedBallCount(int score) {
        TextView scoreView = findViewById(R.id.player_one_red_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBlackBallCount(int score) {
        TextView scoreView = findViewById(R.id.player_one_black_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBlueBallCount(int score) {
        TextView scoreView = findViewById(R.id.player_one_blue_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPinkBallCount(int score) {
        TextView scoreView = findViewById(R.id.player_one_pink_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGreenBallCount(int score) {
        TextView scoreView = findViewById(R.id.player_one_green_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBrownBallCount(int score) {
        TextView scoreView = findViewById(R.id.player_one_brown_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowBallCount(int score) {
        TextView scoreView = findViewById(R.id.player_one_yellow_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayWhiteBallCount(int score) {
        TextView scoreView = findViewById(R.id.player_one_white_score);
        scoreView.setText(String.valueOf(score));
    }

    //Displays the ball count of Player Two

    public void displayRedBallCountTwo(int score) {
        TextView scoreView = findViewById(R.id.player_two_red_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBlackBallCountTwo(int score) {
        TextView scoreView = findViewById(R.id.player_two_black_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBlueBallCountTwo(int score) {
        TextView scoreView = findViewById(R.id.player_two_blue_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPinkBallCountTwo(int score) {
        TextView scoreView = findViewById(R.id.player_two_pink_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGreenBallCountTwo(int score) {
        TextView scoreView = findViewById(R.id.player_two_green_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBrownBallCountTwo(int score) {
        TextView scoreView = findViewById(R.id.player_two_brown_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowBallCountTwo(int score) {
        TextView scoreView = findViewById(R.id.player_two_yellow_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayWhiteBallCountTwo(int score) {
        TextView scoreView = findViewById(R.id.player_two_white_score);
        scoreView.setText(String.valueOf(score));
    }

    // Clears the numbers from the balls buttons.

    public void displayClearBalls() {
        //Display clear balls player 2
        TextView redView = findViewById(R.id.player_one_red_score);
        redView.setText(" ");

        TextView blackView = findViewById(R.id.player_one_black_score);
        blackView.setText(" ");

        TextView blueView = findViewById(R.id.player_one_blue_score);
        blueView.setText(" ");

        TextView pinkView = findViewById(R.id.player_one_pink_score);
        pinkView.setText(" ");

        TextView greenView = findViewById(R.id.player_one_green_score);
        greenView.setText(" ");

        TextView brownView = findViewById(R.id.player_one_brown_score);
        brownView.setText(" ");

        TextView yellowView = findViewById(R.id.player_one_yellow_score);
        yellowView.setText(" ");

        TextView whiteView = findViewById(R.id.player_one_white_score);
        whiteView.setText(" ");

        //Display clear balls player 2
        TextView redViewTwo = findViewById(R.id.player_two_red_score);
        redViewTwo.setText(" ");

        TextView blackViewTwo = findViewById(R.id.player_two_black_score);
        blackViewTwo.setText(" ");

        TextView blueViewTwo = findViewById(R.id.player_two_blue_score);
        blueViewTwo.setText(" ");

        TextView pinkViewTwo = findViewById(R.id.player_two_pink_score);
        pinkViewTwo.setText(" ");

        TextView greenViewTwo = findViewById(R.id.player_two_green_score);
        greenViewTwo.setText(" ");

        TextView brownViewTwo = findViewById(R.id.player_two_brown_score);
        brownViewTwo.setText(" ");

        TextView yellowViewTwo = findViewById(R.id.player_two_yellow_score);
        yellowViewTwo.setText(" ");

        TextView whiteViewTwo = findViewById(R.id.player_two_white_score);
        whiteViewTwo.setText(" ");
    }
}
