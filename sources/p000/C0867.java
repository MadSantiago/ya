package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ۥًٍؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C0867 extends AbstractC1567 {
    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo1562(C5051 c5051) throws IOException {
        if (c5051.toFile().mkdir()) {
            return;
        }
        C1377 c1377Mo1565 = mo1565(c5051);
        if (c1377Mo1565 == null || !c1377Mo1565.f4711) {
            C2316.m4362(c5051, "failed to create directory: ");
        }
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۥّ */
    public final List mo1563(C5051 c5051) throws IOException {
        File file = c5051.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                C2316.m4362(c5051, "failed to list ");
                return null;
            }
            C5028.m8454(c5051, "no such file: ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            arrayList.add(c5051.m8573(str));
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۥۗ */
    public void mo1564(C5051 c5051, C5051 c5052) throws IOException {
        if (c5051.toFile().renameTo(c5052.toFile())) {
            return;
        }
        throw new IOException("failed to move " + c5051 + " to " + c5052);
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۥۜ */
    public C1377 mo1565(C5051 c5051) {
        File file = c5051.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new C1377(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC3832 mo1566(C5051 c5051) {
        File file = c5051.toFile();
        Logger logger = AbstractC2235.f7403;
        return new C1455(1, new FileOutputStream(file, true), new C2014());
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo1567(C5051 c5051) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = c5051.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        C2316.m4362(c5051, "failed to delete ");
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۦِ */
    public final InterfaceC3832 mo1568(C5051 c5051) {
        File file = c5051.toFile();
        Logger logger = AbstractC2235.f7403;
        return new C1455(1, new FileOutputStream(file, false), new C2014());
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۦٛ */
    public final C3886 mo1569(C5051 c5051) {
        return new C3886(new RandomAccessFile(c5051.toFile(), "r"));
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۦۗ */
    public final InterfaceC4598 mo1570(C5051 c5051) {
        File file = c5051.toFile();
        Logger logger = AbstractC2235.f7403;
        return new C5164(1, new FileInputStream(file), C2014.f6633);
    }
}
