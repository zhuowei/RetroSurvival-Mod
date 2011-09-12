package net.minecraft.server;

import java.io.IOException;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Packet8UpdateHealth extends Packet {

    public int a;

    public Packet8UpdateHealth() {}

    public Packet8UpdateHealth(int i) {
        this.a = i;
    }

    public void a(DataInputStream datainputstream) throws IOException { //RetroSurvival start
        this.a = datainputstream.readShort();
        datainputstream.readShort();
        datainputstream.readFloat();
    }

    public void a(DataOutputStream dataoutputstream) throws IOException {
        dataoutputstream.writeShort(this.a);
        dataoutputstream.writeShort(20);
        dataoutputstream.writeFloat(5.0f);
    } //RetroSurvival end

    public void a(NetHandler nethandler) {
        nethandler.a(this);
    }

    public int a() {
        return 2 + 2 + 4; //RetroSurvival: packet size
    }
}
