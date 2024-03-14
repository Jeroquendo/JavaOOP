import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<VideoGame> videoGameList = new ArrayList<VideoGame>();
        VideoGame videoGame = new VideoGame(4323, "Game 1", "Play 5", 2, "Sports");
        VideoGame videoGame2 = new VideoGame(5343, "Game 2", "Play 5", 1, "Adventure");
        VideoGame videoGame3 = new VideoGame(1243, "Game 3", "Nintendo", 1, "Adventure");
        VideoGame videoGame4 = new VideoGame(9453, "Game 4", "Play 5", 2, "Action");
        VideoGame videoGame5 = new VideoGame(5643, "Game 5", "XBox", 1, "SiFi");

        videoGameList.add(videoGame);
        videoGameList.add(videoGame2);
        videoGameList.add(videoGame3);
        videoGameList.add(videoGame4);
        videoGameList.add(videoGame5);

        System.out.println("----------Video games---------");

        /**
         * Other form to iterate lists is with For Each
         * for(VideoGame videoGame: videoGameList) {
         *  System.out.println("Title: " + videoGame.getTitle());
         *  }
         */

        for (int i =0; i<videoGameList.size();i++) {
            System.out.println("Title: " + videoGameList.get(i).getTitle());
            System.out.println("Console: " + videoGameList.get(i).getConsole());
            System.out.println("Quantity players: " + videoGameList.get(i).getGamersQuantity());
            System.out.println("======================");
        }

        videoGame2.setTitle("NewVideoGame1");
        videoGame2.setGamersQuantity(4);
        videoGame4.setTitle("NewVideoGame2");
        videoGame4.setGamersQuantity(3);

        System.out.println("----------Video games After update---------");

        for (int i =0; i<videoGameList.size();i++) {
            System.out.println("Title: " + videoGameList.get(i).getTitle());
            System.out.println("Code: " + videoGameList.get(i).getCode());
            System.out.println("Console: " + videoGameList.get(i).getConsole());
            System.out.println("Quantity players: " + videoGameList.get(i).getGamersQuantity());
            System.out.println("Category: " + videoGameList.get(i).getCategory());

            System.out.println("======================");
        }

        System.out.println("----------Video games for Nintendo---------");

        for (int i =0; i<videoGameList.size();i++) {
            if(videoGameList.get(i).getConsole() == "Nintendo"){
            System.out.println("Title: " + videoGameList.get(i).getTitle());
            }
        }
    }
}