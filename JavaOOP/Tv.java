public class Tv {

    //Define data field
    int channel;
    int volumeLevel;
    boolean on = false;

    //Constructor 
    public Tv(){

    }

    //turn TV on
    public void turnOn(){
        on = true;
    }

    public void tff(){
        on = false;
    }
    
    //set channel
    public void setChannel(int newChannel){
        if(on && newChannel >= 1 && newChannel <= 120){
        channel = newChannel;}
    }

    public void setVolume(int newVolume){
        if(on && newVolume >= 1 & newVolume <= 7){
            volumeLevel = newVolume;
        }
    }

    //Increase channel
    public void channelUp(){
        if(on && channel < 120){
            channel++;
        }
    }
    //Decrease channel
    public void channelDown(){
        if(on && channel > 1){
            channel--;
        }
    }

    //Increase volume 
    public void volumeUp(){
        if(on && volumeLevel <= 7)
           volumeLevel ++;
    }

    //Decrease volume
    public void volumeDown(){
        if(on && volumeLevel > 1)
           volumeLevel --;
    }
    
}
