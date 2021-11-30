/*
 * Copyright (c) 2021 by Naohide Sano, All rights reserved.
 *
 * Programmed by Naohide Sano
 */

package vavi.nio.file.truevfs;

import com.github.fge.filesystem.provider.FileSystemFactoryProvider;


/**
 * VfsFileSystemFactoryProvider.
 *
 * @author <a href="mailto:umjammer@gmail.com">Naohide Sano</a> (umjammer)
 * @version 0.00 2021/11/30 umjammer initial version <br>
 */
public final class TrueVfsFileSystemFactoryProvider extends FileSystemFactoryProvider {

    public TrueVfsFileSystemFactoryProvider() {
        setAttributesFactory(new TrueVfsFileAttributesFactory());
        setOptionsFactory(new TrueVfsFileSystemOptionsFactory());
    }
}
