
public class TennisGame1 implements TennisGame {
    
    private int player1Score = 0;
    private int player2Score = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(this.player1Name))
            player1Score += 1;
        else
            player2Score += 1;
    }

    public String getScore() {
        if (player1Score == player2Score)
        {
            switch (player1Score)
            {
                case 0:
                        return "Love-All";
                case 1:
                        return "Fifteen-All";
                case 2:
                        return "Thirty-All";
                default:
                        return "Deuce";
            }
        }
        else if (player1Score >=4 || player2Score >=4)
        {
            switch (player1Score - player2Score){
                case 1: return "Advantage " + player1Name;
                case -1: return "Advantage " + player2Name;
                default:
                    String winningPlayer = (player1Score > player2Score) ? player1Name : player2Name;
                    return "Win for " + winningPlayer;
            }
        }
        else
        { String[] pointNames = {"Love", "Fifteen", "Thirty", "Forty"};
            return pointNames[player1Score] + "-" + pointNames[player2Score];
        }

    }
}
