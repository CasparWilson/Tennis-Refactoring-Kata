
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
        String s;
        if (player1Score < 4 && player2Score < 4 && !(player1Score + player2Score == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"}; 
            s = p[player1Score];
            return (player1Score == player2Score) ? s + "-All" : s + "-" + p[player2Score];
        } else {
            if (player1Score == player2Score)
                return "Deuce";
            s = player1Score > player2Score ? player1 : player2;
            return ((player1Score - player2Score)*(player1Score - player2Score) == 1) ? "Advantage " + s : "Win for " + s;
        }
    }
    
    public void wonPoint(String ScoringPlayerName) {
        if (ScoringPlayerName.equals(this.player1))
            this.player1Score += 1;
        else
            this.player2Score += 1;
        
    }

}
