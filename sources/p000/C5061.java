package p000;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦۘؗ٘ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5061 extends AbstractC4086 {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ int f16797 = 0;

    /* JADX INFO: renamed from: ۦۨ */
    public final ArrayList f16798;

    public C5061(OutputStream outputStream, ArrayList arrayList) {
        super(outputStream);
        this.f16798 = arrayList;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Iterator it = this.f16798.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                C0178.m382();
                return;
            }
            try {
                throw null;
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // p000.AbstractC4086, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        ((FilterOutputStream) this).out.write(bArr);
        Iterator it = this.f16798.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C0178.m382();
            } else {
                int length = bArr.length;
                throw null;
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        Iterator it = this.f16798.iterator();
        if (it.hasNext()) {
            throw AbstractC5078.m8675(it);
        }
    }

    @Override // p000.AbstractC4086, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        Iterator it = this.f16798.iterator();
        if (it.hasNext()) {
            throw AbstractC5078.m8675(it);
        }
    }
}
