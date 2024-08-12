public class testTv {
    public static void main(String[] args) {
        //Create a Tv object 1
        Tv tv1 = new Tv();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        System.out.println("tv1 channel is "+tv1.channel + " and volume level is "+tv1.volumeLevel);

        Tv tv2 = new Tv();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv2 channel is "+tv2.channel + " and volume level is "+tv2.volumeLevel);

        Tv tv3 = new Tv();
        tv3.turnOn();
        tv3.setChannel(30);
        tv3.setVolume(3);
        tv3.channelDown();
        tv3.volumeDown();

        System.out.println("tv3 channel is "+tv3.channel + " and volume level is "+tv3.volumeLevel);
    }
    
}
