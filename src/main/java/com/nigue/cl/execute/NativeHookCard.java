package com.nigue.cl.execute;

import com.nigue.cl.NativeHookDemo;
import org.jnativehook.keyboard.NativeKeyEvent;

public class NativeHookCard extends NativeHookDemo {

    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        CodeCard cc = new CodeCard(e.paramString());
        cc.execute();
        displayEventInfo(e);
    }

}
