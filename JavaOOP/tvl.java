import java.nio.channels.Channel;

public class tvl {
    private int channel = 1 ;
    private int volumelevel = 1;
    private boolean tvon = false;

    public tvl(){

    }
    
    public void turnon(){
        tvon = true;
    }

    public void turnoff(){
        tvon = false;
    }

    public int getChannel() {
        return channel;
    }
    public void setChannel(int channel) {
        if (tvon && channel >= 1 && channel <=120){
        this.channel = channel;}
    }
    public int getVolumelevel() {
        return volumelevel;
    }
    
    public void setVolumelevel(int volumelevel) {
        if(tvon  && volumelevel >= 1 && volumelevel <= 7){
        this.volumelevel = volumelevel;}
    }

    public void channelup(){
        if(tvon && channel < 120){
            channel++;
        }
    }

    public void channeldown(){
        if(tvon && channel > 1){
            channel--;
        }
    }

    public void volumeup(){
        if(tvon && volumelevel< 7){
            volumelevel++;
        }
    }

    public void volumedown(){
        if(tvon && channel > 1){
            volumelevel--;
        }
    }
    
    

    
}
