/*
 * Copyright (c) 2016 by Naohide Sano, All rights reserved.
 *
 * Programmed by Naohide Sano
 */

package vavi.nio.file.vfs;

import java.net.URI;
import java.net.URLEncoder;
import java.util.Collections;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import vavi.nio.file.truevfs.TrueVfsFileSystemProvider;

import static vavi.nio.file.Base.testAll;


/**
 * TrueVFS JavaFS.
 *
 * @author <a href="mailto:umjammer@gmail.com">Naohide Sano</a> (umjammer)
 * @version 0.00 2016/04/03 umjammer initial version <br>
 */
public class Main {

    static {
        System.setProperty("vavi.util.logging.VaviFormatter.extraClassMethod",
                "(" +
                "org\\.slf4j\\.impl\\.JDK14LoggerAdapter#(log|info)" +
                "|" +
                "sun\\.util\\.logging\\.LoggingSupport#log" +
                "|" +
                "sun\\.util\\.logging\\.PlatformLogger#fine" +
                "|" +
                "jdk\\.internal\\.event\\.EventHelper#logX509CertificateEvent" +
                "|" +
                "sun\\.util\\.logging\\.PlatformLogger.JavaLoggerProxy#doLog" +
                ")");
    }

    /**
     * environment variable
     * <ul>
     * <li> TEST_SFTP_ACCOUNT
     * <li> TEST_SFTP_PASSPHRASE
     * <li> TEST_SFTP_HOST
     * <li> TEST_SFTP_KEYPATH
     * <li> TEST_SFTP_PATH
     * </ul>
     */
    @Test
    @Disabled
    void test01() throws Exception {
        String username = URLEncoder.encode(System.getenv("TEST_SFTP_ACCOUNT"), "utf-8");
        String passPhrase = URLEncoder.encode(System.getenv("TEST_SFTP_PASSPHRASE"), "utf-8");
        String host = System.getenv("TEST_SFTP_HOST");
        String keyPath = URLEncoder.encode(System.getenv("TEST_SFTP_KEYPATH"), "utf-8");
        String path = System.getenv("TEST_SFTP_PATH");

        URI uri = URI.create(String.format("vfs:sftp://%s@%s%s?keyPath=%s&passphrase=%s", username, host, path, keyPath, passPhrase));

        testAll(new TrueVfsFileSystemProvider().newFileSystem(uri, Collections.emptyMap()));
    }
}