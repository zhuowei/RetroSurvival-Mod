package net.minecraft.server;

import java.io.IOException;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Packet0KeepAlive extends Packet {

    public Packet0KeepAlive() {}

    public void a(NetHandler nethandler) { //Retrosurvival start
        nethandler.a(this);
    } //Retrosurvival end

    public void a(DataInputStream datainputstream) throws IOException { //RetroSurvival start
        datainputstream.readInt();
    } //RetroSurvival end

    public void a(DataOutputStream dataoutputstream) throws IOException { //RetroSurvival start
        dataoutputstream.writeInt(0);
    } //RetroSurvival end

    public int a() {
        return 4; //Retrosurvival change
    }
}
