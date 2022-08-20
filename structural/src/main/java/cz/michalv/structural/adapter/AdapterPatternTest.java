package cz.michalv.structural.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AdapterPatternTest {

    public static void main(String[] args) {
        testClassAdapter();
        testObjectAdapter();
    }

    private static void testObjectAdapter() {
        SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
        Voltage v3 = getVoltage(sockAdapter,3);
        Voltage v12 = getVoltage(sockAdapter,12);
        Voltage v120 = getVoltage(sockAdapter,120);

        log.info("v3 volts using Object Adapter=" + v3.getVolts());
        log.info("v12 volts using Object Adapter=" + v12.getVolts());
        log.info("v120 volts using Object Adapter=" + v120.getVolts());
    }

    private static void testClassAdapter() {
        SocketAdapter sockAdapter = new SocketClassAdapterImpl();
        Voltage v3 = getVoltage(sockAdapter,3);
        Voltage v12 = getVoltage(sockAdapter,12);
        Voltage v120 = getVoltage(sockAdapter,120);

        log.info("v3 volts using Class Adapter=" + v3.getVolts());
        log.info("v12 volts using Class Adapter=" + v12.getVolts());
        log.info("v120 volts using Class Adapter=" + v120.getVolts());
    }

    private static Voltage getVoltage(SocketAdapter sockAdapter, int i) {
        return switch (i) {
            case 3 -> sockAdapter.get3Volts();
            case 12 -> sockAdapter.get12Volts();
            default -> sockAdapter.get120Volts();
        };
    }
}
