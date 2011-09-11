package net.minecraft.server;

import java.io.IOException;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Packet1Login extends Packet {

    public int a;
    public String name;
    public long c;
    public byte d;

    public Packet1Login() {}

    public Packet1Login(String s, int i, long j, byte b0) {
        this.name = s;
        this.a = i;
        this.c = j;
        this.d = b0;
    }

    public void a(DataInputStream datainputstream) throws IOException {
        datainputstream.readInt();
        this.a = 14; //RetroSurvival: Protocol 14
        this.name = a(datainputstream, 16);
        this.c = datainputstream.readLong();
        datainputstream.readInt(); //RetroSurvival start
        this.d = datainputstream.readByte();
        datainputstream.readByte();
        datainputstream.readByte(); //Retrosurvival end
    }

    public void a(DataOutputStream dataoutputstream) throws IOException {
        dataoutputstream.writeInt(15); //RetroSurvival: Protocol 15
        a(this.name, dataoutputstream);
        dataoutputstream.writeLong(this.c);
        dataoutputstream.writeInt(0);
        dataoutputstream.writeByte(this.d);
        dataoutputstream.writeByte(128);
        dataoutputstream.writeByte(150);
    }

    public void a(NetHandler nethandler) {
        nethandler.a(this);
    }

    public int a() {
        //return 4 + this.name.length() + 4 + 5;
        return 4 + 2 + (this.name.length() * 2) + 8 + 4 + 3; //RetroSurvival: Packet size
    }
}
