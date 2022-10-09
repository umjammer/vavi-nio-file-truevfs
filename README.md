[![Release](https://jitpack.io/v/umjammer/vavi-nio-file-truevfs.svg)](https://jitpack.io/#umjammer/vavi-nio-file-truevfs)
[![Java CI](https://github.com/umjammer/vavi-nio-file-truevfs/actions/workflows/maven.yml/badge.svg)](https://github.com/umjammer/vavi-nio-file-truevfs/actions/workflows/maven.yml)
[![CodeQL](https://github.com/umjammer/vavi-nio-file-truevfs/actions/workflows/codeql-analysis.yml/badge.svg)](https://github.com/umjammer/vavi-nio-file-truevfs/actions/workflows/codeql-analysis.yml)
![Java](https://img.shields.io/badge/Java-8-b07219)

# vavi-nio-file-truevfs

A Java NIO FileSystem implementation over [truevfs](http://truevfs.net/).

## Status

| fs         | list | upload | download | copy | move | rm | mkdir | cache | watch |
|------------|------|--------|----------|------|------|----|-------|-------|-------|
| http(s)    | 🚫   |        | ?        |      |   |  |    |    |       |
| zip        | ✅   |        | ?        |      |   |  |    |    |       |
| zip (fuse) | ✅   |        | ?        |      |   |  |    |    |       |

## References

 * https://github.com/christian-schlichtherle/truevfs (cannot recognize as folder?)
 * https://github.com/magicDGS/jsr203-http (not implemented enough)
 * https://github.com/broadinstitute/alfre (cannot maven)

## TODO

 * truevfs has own FileSystem `TFileSystem`, `TFileSystemProvider`
 * how about wget https://github.com/winneryong/wget