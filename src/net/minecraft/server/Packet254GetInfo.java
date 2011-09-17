package net.minecraft.server;

import java.io.IOException;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Packet254GetInfo extends Packet {

    public Packet254GetInfo() {}

    public void a(NetHandler nethandler) {
        nethandler.a(this);
    } 

    public void a(DataInputStream datainputstream) throws IOException {
    } 

    public void a(DataOutputStream dataoutputstream) throws IOException {
    }

    public int a() {
        return 0;
    }
}
