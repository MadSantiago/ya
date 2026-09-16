package p000;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: renamed from: ۦْٜؖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4084 extends C0867 {
    /* JADX INFO: renamed from: ۦؚ */
    public static Long m7270(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // p000.C0867
    public final String toString() {
        return "NioSystemFileSystem";
    }

    @Override // p000.C0867, p000.AbstractC1567
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo1564(C5051 c5051, C5051 c5052) throws IOException {
        try {
            Files.move(Paths.get(c5051.f16767.m2214(), new String[0]), Paths.get(c5052.f16767.m2214(), new String[0]), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            C5028.m8448("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // p000.C0867, p000.AbstractC1567
    /* JADX INFO: renamed from: ۥۜ */
    public final C1377 mo1565(C5051 c5051) throws EOFException {
        C5051 c5051M8667;
        Path path = Paths.get(c5051.f16767.m2214(), new String[0]);
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = C5051.f16766;
                String string = symbolicLink.toString();
                C1007 c1007 = AbstractC0088.f16843;
                C1270 c1270 = new C1270();
                c1270.m2677(string);
                c5051M8667 = AbstractC0088.m8667(c1270, false);
            } else {
                c5051M8667 = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lM7270 = fileTimeCreationTime != null ? m7270(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lM7271 = fileTimeLastModifiedTime != null ? m7270(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new C1377(zIsRegularFile, zIsDirectory, c5051M8667, lValueOf, lM7270, lM7271, fileTimeLastAccessTime != null ? m7270(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }
}
