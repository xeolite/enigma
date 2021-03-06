package com.github.xeolite.enigma.stator;

import com.github.xeolite.enigma.cipher.Cipher;
import com.github.xeolite.enigma.cipher.SubstitutionCipher;

public class Stator {

    public static final Stator MILITARY = new Stator(new SubstitutionCipher("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));

    private Cipher inboundCipher;
    private Cipher outboundCipher;

    public Stator(Cipher cipher) {
        this.inboundCipher = cipher;
        this.outboundCipher = Cipher.inverse(cipher);
    }

    public Cipher inbound() {
        return inboundCipher;
    }

    public Cipher outbound() {
        return outboundCipher;
    }
}
