public class TennisGame6 implements TennisGame {
    private final String player1Name;
    private final String player2Name;
    private int player1Score;
    private int player2Score;

    public TennisGame6(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.player1Score = 0;
        this.player2Score = 0;
    }

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals(this.player1Name))
            player1Score++;
        else
            player2Score++;
    }

    public String getScore()
    {
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
        else if (player1Score >= 4 || player2Score >= 4)
        {
            switch (player1Score - player2Score){
                case 1:
                    return "Advantage " + player1Name;
                case -1:
                    return "Advantage " + player2Name;
                default:
                    String winningPlayer = (player1Score > player2Score) ? player1Name : player2Name;
                    return "Win for " + winningPlayer;
            }
        }
        else
        {
            String[] pointsNames = { "Love", "Fifteen", "Thirty", "Forty" };
            return pointsNames[player1Score] + "-" + pointsNames[player2Score];
        }
    }
}
