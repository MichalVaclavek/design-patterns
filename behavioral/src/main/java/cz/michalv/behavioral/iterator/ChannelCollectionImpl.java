package cz.michalv.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *  Interface and core classes are ready, let’s proceed with the implementation of collection class and iterator.
 *  Notice the inner class implementation of iterator interface so that the implementation can’t be used by any other collection.
 */
public class ChannelCollectionImpl implements ChannelCollection {

    private List<RadioChannel> channelsList;

    public ChannelCollectionImpl() {
        channelsList = new ArrayList<>();
    }

    public void addChannel(RadioChannel c) {
        this.channelsList.add(c);
    }

    public void removeChannel(RadioChannel c) {
        this.channelsList.remove(c);
    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type, this.channelsList);
    }

    private class ChannelIteratorImpl implements ChannelIterator {

        private ChannelTypeEnum type;
        private List<RadioChannel> radioChannels;
        private int position;

        public ChannelIteratorImpl(ChannelTypeEnum ty,
                                   List<RadioChannel> channelsList) {
            this.type = ty;
            this.radioChannels = channelsList;
        }

        @Override
        public boolean hasNext() {
            while (position < radioChannels.size()) {
                RadioChannel c = radioChannels.get(position);
                if (c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
                    return true;
                } else
                    position++;
            }
            return false;
        }

        @Override
        public RadioChannel next() {
            RadioChannel c = radioChannels.get(position);
            position++;
            return c;
        }

    }
}
