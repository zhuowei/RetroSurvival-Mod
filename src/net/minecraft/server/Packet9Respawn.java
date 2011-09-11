package net.minecraft.server;

import java.io.IOException;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Packet9Respawn extends Packet {

    public byte a;

    public Packet9Respawn() {}

    public Packet9Respawn(byte b0) {
        this.a = b0;
    }

    public void a(NetHandler nethandler) {
        nethandler.a(this);
    }

    public void a(DataInputStream datainputstream) throws IOException { //RetroSurvival start
        this.a = datainputstream.readByte();
        datainputstream.readByte();
        datainputstream.readShort();
        datainputstream.readLong();
    }

    public void a(DataOutputStream dataoutputstream) throws IOException {
        dataoutputstream.writeByte(this.a);
        dataoutputstream.writeByte(0);
        dataoutputstream.writeShort(128);
        dataoutputstream.writeLong(42); //RetroSurvival: Don't send the seed
    } //RetroSurvival end

    public int a() {
        return 1 + 1 + 2 + 8;
    }
}
