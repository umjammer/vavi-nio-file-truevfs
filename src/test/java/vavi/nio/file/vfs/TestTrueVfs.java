/*
 * Copyright (c) 2021 by Naohide Sano, All rights reserved.
 *
 * Programmed by Naohide Sano
 */

package vavi.nio.file.vfs;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import vavi.util.Debug;
import vavi.util.properties.annotation.Property;
import vavi.util.properties.annotation.PropsEntity;

import net.java.truevfs.access.TFile;


/**
 * TestTrueVfs (http).
 *
 * @author <a href="mailto:umjammer@gmail.com">Naohide Sano</a> (umjammer)
 * @version 0.00 2021/11/30 umjammer initial version <br>
 */
@PropsEntity(url = "file://${user.dir}/local.properties")
public class TestTrueVfs {

    @Property
    private String baseUrl = "http://truevfs.net/";

    /**
     * @param args 0: base url, 1: alias
     */
    public static void main(String[] args) throws Exception {
        TestTrueVfs app = new TestTrueVfs();
        PropsEntity.Util.bind(app);
        app.proceed();
    }

    void proceed() throws IOException {
Debug.println("exists: " + Files.exists(Paths.get(baseUrl)));
        File file = new TFile(baseUrl);
System.err.println(file.exists() + ", " + file.lastModified() + ", " + file);
        if (file.isDirectory()) {
            for (File fo : file.listFiles()) {
System.err.println(fo.getName());
            }
        }
    }
}

/* */
