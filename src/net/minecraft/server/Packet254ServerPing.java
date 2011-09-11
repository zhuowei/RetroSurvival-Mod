package net.minecraft.server;

import java.io.IOException;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Packet254ServerPing extends Packet {

    public Packet254ServerPing() {}

    public void a(NetHandler nethandler) {
    } 

    public void a(DataInputStream datainputstream) throws IOException {
    } 

    public void a(DataOutputStream dataoutputstream) throws IOException {
        dataoutputstream.writeInt(0);
    }

    public int a() {
        return 0;
    }
}
