package org.adtado.nowns.effective.item5;

import java.util.function.Supplier;

public class ChatController {
    private final Supplier<? extends Broadcast> broadcastFactory;
    public ChatController(Supplier<? extends Broadcast> broadcastFactory) {
        this.broadcastFactory = broadcastFactory;
    }

    public void startBroadcast() {
        broadcastFactory.get().startBroadcast();
    }

    public void endBroadcast() {
        broadcastFactory.get().endBroadcast();
    }
}
