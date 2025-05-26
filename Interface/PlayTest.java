interface playable{
    void play();
}
class Football implements playable{
    @Override
    public void play(){
        System.out.println("Playing a football in the field.");
    }
}
class VideoGame implements playable{
    @Override
    public void play(){
        System.out.println("Playing a video game at the home.");
    }
}
public class PlayTest{
    public static void main(String[] args){
        playable p1 = new Football();
        p1.play();
        playable p2 = new VideoGame();
        p2.play();
    }
}