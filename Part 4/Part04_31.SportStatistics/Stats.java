/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author madmo
 */
public class Stats {
    private String homeTm;
    private String awayTm;
    private int homePts;
    private int awayPts;
    
    public Stats (String homeTm, String awayTm, int homePts, int awayPts) {
        this.homeTm = homeTm;
        this.awayTm = awayTm;
        this.homePts = homePts;
        this.awayPts = awayPts;
    }
        
        public String getHomeTm() {
            return homeTm;
        }
        
        public String getAwayTm() {
            return awayTm;
        }
        
        public int getHomePts() {
            return homePts;
        }
        
        public int getAwayPts() {
            return awayPts;
        
            
    }
}