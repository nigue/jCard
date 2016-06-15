package com.nigue.cl;

import javax.swing.SwingUtilities;

public class App {

    public static void main(String[] args) {

        StringBuffer copyright = new StringBuffer("\n")
                .append("JNativeHook: Global keyboard and mouse hooking for Java.\n")
                .append("Copyright (C) 2006-2015 Alexander Barker.  All Rights Received.\n")
                .append("https://github.com/kwhat/jnativehook/\n")
                .append("\n")
                .append("JNativeHook is free software: you can redistribute it and/or modify\n")
                .append("it under the terms of the GNU Lesser General Public License as published\n")
                .append("by the Free Software Foundation, either version 3 of the License, or\n")
                .append("(at your option) any later version.\n")
                .append("\n")
                .append("JNativeHook is distributed in the hope that it will be useful,\n")
                .append("but WITHOUT ANY WARRANTY; without even the implied warranty of\n")
                .append("MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the\n")
                .append("GNU General Public License for more details.\n")
                .append("\n")
                .append("You should have received a copy of the GNU Lesser General Public License\n")
                .append("along with this program.  If not, see <http://www.gnu.org/licenses/>.\n");
        System.out.println(copyright);

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new NativeHookDemo();
            }
        });
    }

}
