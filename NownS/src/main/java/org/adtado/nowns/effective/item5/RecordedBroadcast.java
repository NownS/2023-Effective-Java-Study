package org.adtado.nowns.effective.item5;

public class RecordedBroadcast implements Broadcast {
    @Override
    public void startBroadcast() {
        System.out.println("recorded live start");
    }

    @Override
    public void endBroadcast() {
        System.out.println("recorded live end");
    }
}
