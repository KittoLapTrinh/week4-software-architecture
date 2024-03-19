package org.example.w4;

import jdepend.framework.PackageFilter;
import jdepend.xmlui.JDepend;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
//        try (PrintWriter out = new PrintWriter(new FileOutputStream("results.xml")))
//        {
//            jdepend.xmlui.JDepend xml = new jdepend.xmlui.JDepend(out);
//            xml.addDirectory("T:\\w4");
//            PackageFilter f = PackageFilter.all();
//// f.including("vn.edu.iuh");
//            f.accept("example");
//            f.excluding("org");
//            xml.setFilter(f);
//            xml.analyze();
//        }catch (Exception e){
//            throw new RuntimeException(e);
//        }

        JDepend depend =new JDepend(new PrintWriter("reports/report.xml"));
        depend.addDirectory("E:\\KienTrucPM\\w4\\Library-Assistant");
        depend.analyze();
        System.out.println("DONE");
    }

}
