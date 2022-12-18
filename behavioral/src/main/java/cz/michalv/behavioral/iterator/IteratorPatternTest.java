package cz.michalv.behavioral.iterator;

import lombok.extern.slf4j.Slf4j;

/**
 * Iterator pattern is useful when you want to provide a standard way to iterate over a collection and hide the implementation logic from client program.
 * The logic for iteration is embedded in the collection itself and it helps client program to iterate over them easily.
 */
@Slf4j
public class IteratorPatternTest {

    public static void main(String[] args) {
        ChannelCollection channels = populateChannels();
        ChannelIterator baseIterator = channels.iterator(ChannelTypeEnum.ALL);
        while (baseIterator.hasNext()) {
            RadioChannel c = baseIterator.next();
            log.info(c.toString());
        }
        log.info("******");
        // RadioChannel Type Iterator
        ChannelIterator englishIterator = channels.iterator(ChannelTypeEnum.ENGLISH);
        while (englishIterator.hasNext()) {
            RadioChannel c = englishIterator.next();
            log.info(c.toString());
        }
    }

    private static ChannelCollection populateChannels() {
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new RadioChannel(98.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new RadioChannel(99.5, ChannelTypeEnum.CZECH));
        channels.addChannel(new RadioChannel(100.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new RadioChannel(101.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new RadioChannel(102.5, ChannelTypeEnum.CZECH));
        channels.addChannel(new RadioChannel(103.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new RadioChannel(104.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new RadioChannel(105.5, ChannelTypeEnum.CZECH));
        channels.addChannel(new RadioChannel(106.5, ChannelTypeEnum.FRENCH));
        return channels;
    }

}
