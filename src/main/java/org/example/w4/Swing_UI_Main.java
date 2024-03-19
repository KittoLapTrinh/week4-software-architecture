package org.example.w4;

import jdepend.xmlui.JDepend;

public class Swing_UI_Main {
    public static void main(String[] args) throws Exception{
        JDepend depend =new JDepend();
        depend.addDirectory("E:\\KienTrucPM\\w4\\Library-Assistant");
        depend.analyze();
        System.out.println("DONE");
    }
}
