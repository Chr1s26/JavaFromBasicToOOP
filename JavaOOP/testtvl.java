public class testtvl {
    public static void main(String[] args) {
        tvl tv1 = new tvl();
        tv1.turnon();
        tv1.setChannel(111);
        tv1.channeldown();
        tv1.channeldown();
        tv1.channelup();
        tv1.setVolumelevel(4);
        tv1.volumedown();
        tv1.volumedown();
        System.out.println("The tv channel is "+tv1.getChannel());
        System.out.println("The tv volume is "+tv1.getVolumelevel());

        tvl tv2 = new tvl();
        tv2.setChannel(111);
        tv2.channeldown();
        tv2.channeldown();
        tv2.channelup();
        tv2.setVolumelevel(4);
        tv2.volumedown();
        tv2.volumedown();
        System.out.println("The tv channel is "+tv2.getChannel());
        System.out.println("The tv volume is "+tv2.getVolumelevel());
    }
    
}
