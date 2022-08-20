package cz.michalv.structural.adapter;

//Using inheritance for adapter pattern
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

    public Voltage get120Volts() {
        return getVolt();
    }

    public Voltage get12Volts() {
        Voltage v= getVolt();
        return convertVolt(v,10);
    }

    public Voltage get3Volts() {
        Voltage v= getVolt();
        return convertVolt(v,40);
    }

    private Voltage convertVolt(Voltage v, int i) {
        return new Voltage(v.getVolts()/i);
    }

}
