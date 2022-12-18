package cz.michalv.behavioral.iterator;

/**
 * RadioChannel is a simple POJO class that has attributes frequency and channel type.
 * Part of contact for our collection and iterator interfaces
 */
public class RadioChannel {

    private double frequency;
    private ChannelTypeEnum TYPE;

    public RadioChannel(double freq, ChannelTypeEnum type){
        this.frequency=freq;
        this.TYPE=type;
    }

    public double getFrequency() {
        return frequency;
    }

    public ChannelTypeEnum getTYPE() {
        return TYPE;
    }

    @Override
    public String toString(){
        return "Frequency="+this.frequency+", Type="+this.TYPE;
    }
}
