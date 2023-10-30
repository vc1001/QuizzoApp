package com.example.quizzoappwithrecyclerviewstaggered.Model;


public class model {
    String playername;
    int playerimage;
    public model(String playername, int playerimage) {
        this.playername = playername;
        this.playerimage = playerimage;
    }
    public String getPlayername() {
        return playername;
    }
    public void setPlayername(String playername) {
        this.playername = playername;
    }
    public int getPlayerimage() {
        return playerimage;
    }
    public void setPlayerimage(int playerimage) {
        this.playerimage = playerimage;
    }
}





