package com.wecp.progressive.entity;

import java.util.Date;

public class Match {
    private int matchId;
    private int firstName;
    private int secondTeam;
    private Date matchDate;
    private String venue;
    private String result;
    private String status;
    private int winnerTeamId;

    public Match() {
    }

    public Match(int matchId, int firstName, int secondTeam, Date matchDate, String venue, String result, String status,
            int winnerTeamId) {
        this.matchId = matchId;
        this.firstName = firstName;
        this.secondTeam = secondTeam;
        this.matchDate = matchDate;
        this.venue = venue;
        this.result = result;
        this.status = status;
        this.winnerTeamId = winnerTeamId;
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public int getFirstName() {
        return firstName;
    }

    public void setFirstName(int firstName) {
        this.firstName = firstName;
    }

    public int getSecondTeam() {
        return secondTeam;
    }

    public void setSecondTeam(int secondTeam) {
        this.secondTeam = secondTeam;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getWinnerTeamId() {
        return winnerTeamId;
    }

    public void setWinnerTeamId(int winnerTeamId) {
        this.winnerTeamId = winnerTeamId;
    }

    

    

}