package com.shinemo.mpush.api.protocol;

/**
 * Created by ohun on 2015/12/22.
 */
public enum Command {
    Heartbeat(1),
    Handshake(2),
    Login(3),
    Kick(4),
    Unknown(-1);

    Command(int cmd) {
        this.cmd = (byte) cmd;
    }

    public final byte cmd;

    public static Command toCMD(byte b) {
        if (b > 0 && b < values().length) return values()[b - 1];
        return Unknown;
    }
}