package net.minecraft.server;

import java.io.IOException;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Packet70Bed extends Packet {

    public static final String[] a = new String[] { "tile.bed.notValid", null, null, null}; //RetroSurvival: one extra null
    public int b;

    public Packet70Bed() {}

    public Packet70Bed(int i) {
        this.b = i;
    }

    public void a(DataInputStream datainputstream) throws IOException { //RetroSurvival start
        this.b = datainputstream.readByte();
        datainputstream.readByte();
    }

    public void a(DataOutputStream dataoutputstream) throws IOException {
        dataoutputstream.writeByte(this.b);
        dataoutputstream.writeByte(0);
    } //RetroSurvival end

    public void a(NetHandler nethandler) {
        nethandler.a(this);
    }

    public int a() {
        return 1 + 1; //RetroSurvival: packet size
    }
}
