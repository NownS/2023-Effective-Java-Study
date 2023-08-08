package org.adtado.nowns.effective.item5;

public class RealTimeBroadcast implements Broadcast {
    @Override
    public void startBroadcast() {
        System.out.printf("realtime live start");
    }

    @Override
    public void endBroadcast() {
        System.out.printf("realtime live end");
    }
}
