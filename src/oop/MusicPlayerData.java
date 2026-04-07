package oop;

public class MusicPlayerData {
    int volume = 0;
    boolean isOn = false;

    void printMusicPlayerMenu() {
        System.out.println("\n1. 전원\t2. 볼륨+\t3. 볼륨-\t4. 정보출력\t5. 종료");
        System.out.print("버튼을 누르세요: ");
    }

    void volumeUp (MusicPlayerData musicPlayer) {

        if (!musicPlayer.isOn) {
            System.out.println("전원이 꺼져있습니다.");
            return;
        }

        if (musicPlayer.volume < 15)
            musicPlayer.volume++;
        else
            System.out.println("더 이상 볼륨을 올릴 수 없습니다.");

        System.out.println("volume: " + musicPlayer.volume);
    }

    void volumeDown (MusicPlayerData musicPlayer) {

        if (!musicPlayer.isOn) {
            System.out.println("전원이 꺼져있습니다.");
            return;
        }

        if (musicPlayer.volume > 0)
            musicPlayer.volume--;
        else
            System.out.println("더 이상 볼륨을 내릴 수 없습니다.");

        System.out.println("volume: " + musicPlayer.volume);
    }

    void togglePower(MusicPlayerData musicPlayer) {

        if (!musicPlayer.isOn) {
            musicPlayer.isOn = true;
            System.out.println("음악 플레이어를 시작합니다");
        }

        else {
            musicPlayer.isOn = false;
            System.out.println("음악 플레이어를 종료합니다");
        }
    }

    void printMusicPlayerData (MusicPlayerData musicPlayer) {

        System.out.println("---음악 플레이어 상태 확인---");
        System.out.println("전원: " + musicPlayer.isOn);
        System.out.println("볼륨: " + musicPlayer.volume);
    }
}
