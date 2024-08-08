
public class TennisGame3 implements TennisGame {

    private final String player1;
    private final String player2;
    private int player1Score;
    private int player2Score;


    public TennisGame3(String player1name, String player2name) {
        this.player1 = player1name;
        this.player2 = player2name;
        this.player1Score = 0;
        this.player2Score = 0;
    }

    public String getScore() {
        String[] pointsNames = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
        if (preDeuce()) {
            String score = pointsNames[player1Score];
            score += (scoresLevel()) ? "-All": "-" + pointsNames[player2Score];
            return score;
        } else if (scoresLevel()) {
            return "Deuce";
        } else {
            String winningPlayer = player1Score > player2Score ? player1 : player2;
            return (scoreDifference() == 1) ? "Advantage " + winningPlayer : "Win for " + winningPlayer;
        }
    }
    
    public void wonPoint(String ScoringPlayerName) {
        if (ScoringPlayerName.equals(this.player1))
            this.player1Score += 1;
        else
            this.player2Score += 1;
        
    }

    private boolean preDeuce() {
        return player1Score < 4 && player2Score < 4 && !(player1Score + player2Score == 6);
    }

    private boolean scoresLevel() {
        return player1Score == player2Score;
     }

     private int scoreDifference() {
        return  (player1Score - player2Score)*(player1Score - player2Score);
    }
}

