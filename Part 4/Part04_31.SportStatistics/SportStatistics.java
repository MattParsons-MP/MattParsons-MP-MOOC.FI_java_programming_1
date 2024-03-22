import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scan.nextLine();
        
        ArrayList<Stats> records = scanRecords(file);
        
        System.out.println("Team: ");
        String teamName = scan.nextLine();
        
        int counter = 0;
        int wins = 0;
        int losses = 0;
        
        for (Stats record : records)
            
            if (record.getHomeTm().contains(teamName)) {
                counter++;
                
                if (record.getHomePts() > record.getAwayPts()){
                    wins++;
                    
                } else {
                    losses++;
                }
                
            } else if (record.getAwayTm().contains(teamName)) {
                counter++;
                
                if (record.getAwayPts() > record.getHomePts()) {
                    wins++;
                    
                } else {
                    losses++;
                }
            }
        System.out.println("Games: " + counter);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
    
    public static ArrayList<Stats> scanRecords(String file) {
        ArrayList<Stats> teams = new ArrayList<>();
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                
                String[] parts = line.split(",");
                String hTeam = parts[0];
                String aTeam = parts[1];
                int hScore = Integer.valueOf(parts[2]);
                int aScore = Integer.valueOf(parts[3]);
                
                teams.add(new Stats(hTeam, aTeam, hScore, aScore));
            }
            
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        return teams;
        
        
    }
}
    


    