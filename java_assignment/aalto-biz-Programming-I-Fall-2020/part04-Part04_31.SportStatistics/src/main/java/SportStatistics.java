
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File:");
        String file = scanner.nextLine();
        System.out.println("Team:");
        String teamSearched = scanner.nextLine();
        int teamCount = 0;
        int winCount = 0;
        int loseCount = 0;
        try(Scanner readFile = new Scanner(Paths.get(file))){
            while(readFile.hasNextLine()){
                String line = readFile.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                String [] parts = line.split(",");
                String homeTeam = parts [0];
                String visitingTeam = parts [1];
                
                if (teamSearched.equals(homeTeam) || teamSearched.equals(visitingTeam)){
                    teamCount ++;
                }
                if (teamSearched.equals(homeTeam)){
                    int homeTeamPoint = Integer.valueOf(parts[2]);
                    int visitingTeamPoint = Integer.valueOf(parts[3]);
                    if (homeTeamPoint > visitingTeamPoint){
                        winCount ++;
                    }else{ //没有考虑平手
                        loseCount ++; 
                    }
                }
                if (teamSearched.equals(visitingTeam)){
                    int homeTeamPoint = Integer.valueOf(parts[2]);
                    int visitingTeamPoint = Integer.valueOf(parts[3]);
                    if (homeTeamPoint > visitingTeamPoint){
                        loseCount ++;
                    }else{ //没有考虑平手
                         
                        winCount ++;
                    }
                }
            }
            System.out.println("Games: " + teamCount);
            System.out.println("Wins: " + winCount);
            System.out.println("Losses: " + loseCount);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
