/*
 * Copyright (c) 2021 by Naohide Sano, All rights reserved.
 *
 * Programmed by Naohide Sano
 */

package vavi.nio.file.vfs;

import java.io.File;
import java.io.IOException;

import vavi.util.properties.annotation.PropsEntity;

import net.java.truevfs.access.TFile;


/**
 * TestTrueVfs (smb).
 *
 * @author <a href="mailto:umjammer@gmail.com">Naohide Sano</a> (umjammer)
 * @version 0.00 2021/11/30 umjammer initial version <br>
 */
@PropsEntity(url = "file://${user.home}/.vavifuse/credentials.properties")
public class TestTrueVfs {

    private String baseUrl;
    private String alias;

    /**
     * @param args 0: base url, 1: alias
     */
    public static void main(String[] args) throws Exception {
        TestTrueVfs app = new TestTrueVfs();
        app.baseUrl = args[0];
        app.alias = args[1];
        PropsEntity.Util.bind(app, app.alias);
        app.proceed();
    }

    void proceed() throws IOException {
        File File = new TFile(baseUrl);
System.err.println(File.exists() + " " + File.lastModified());
        if (File.isDirectory()) {
            for (File fo : File.listFiles()) {
System.err.println(fo.getName());
            }
        }
    }
}

/* */
