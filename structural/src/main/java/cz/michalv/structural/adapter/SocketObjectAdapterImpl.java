package cz.michalv.structural.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {

    //Using Composition for adapter pattern
    private Socket sock = new Socket();

    public Voltage get120Volts() {
        return sock.getVolt();
    }

    public Voltage get12Volts() {
        Voltage v= sock.getVolt();
        return convertVolt(v,10);
    }

    public Voltage get3Volts() {
        Voltage v= sock.getVolt();
        return convertVolt(v,40);
    }

    private Voltage convertVolt(Voltage v, int i) {
        return new Voltage(v.getVolts()/i);
    }
}
