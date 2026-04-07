package oop;
import java.util.Scanner;

public class MusicPlayerMain {
    public static void main(String[] args) {

        MusicPlayerData musicPlayer = new MusicPlayerData();
        Scanner scan = new Scanner(System.in);



        boolean boolLoop = true;
        while (boolLoop) {
            musicPlayer.printMusicPlayerMenu();
            int menu = scan.nextInt(); scan.nextLine();

            switch (menu) {
                case 1:
                    musicPlayer.togglePower(musicPlayer);
                    continue;
                case 2:
                    musicPlayer.volumeUp(musicPlayer);
                    continue;
                case 3:
                    musicPlayer.volumeDown(musicPlayer);
                    continue;
                case 4:
                    musicPlayer.printMusicPlayerData(musicPlayer);
                    continue;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    boolLoop = false;
                    break;
            }

            System.out.println(" ");

        }
    }


}
