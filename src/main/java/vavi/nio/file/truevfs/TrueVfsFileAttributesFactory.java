/*
 * Copyright (c) 2021 by Naohide Sano, All rights reserved.
 *
 * Programmed by Naohide Sano
 */

package vavi.nio.file.truevfs;

import com.github.fge.filesystem.driver.ExtendedFileSystemDriverBase.ExtendsdFileAttributesFactory;

import net.java.truevfs.access.TFile;


/**
 * TrueVfsFileAttributesFactory.
 *
 * @author <a href="mailto:umjammer@gmail.com">Naohide Sano</a> (umjammer)
 * @version 0.00 2021/11/30 umjammer initial version <br>
 */
public final class TrueVfsFileAttributesFactory extends ExtendsdFileAttributesFactory {

    public TrueVfsFileAttributesFactory() {
        setMetadataClass(TFile.class);
        addImplementation("basic", TrueVfsBasicFileAttributesProvider.class);
    }
}
