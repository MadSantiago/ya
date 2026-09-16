package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦ۠ؗٛۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5421 extends AbstractC3810 {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ int f17896 = 0;

    /* JADX INFO: renamed from: ۦۨ */
    public final ArrayList f17897;

    public C5421(InputStream inputStream, ArrayList arrayList) {
        super(inputStream);
        this.f17897 = arrayList;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Iterator it = this.f17897.iterator();
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

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            Iterator it = this.f17897.iterator();
            if (it.hasNext()) {
                throw AbstractC5078.m8675(it);
            }
        }
        return i;
    }

    @Override // p000.AbstractC3810, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = ((FilterInputStream) this).in.read(bArr);
        if (i != -1) {
            Iterator it = this.f17897.iterator();
            if (it.hasNext()) {
                throw AbstractC5078.m8675(it);
            }
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 != -1) {
            Iterator it = this.f17897.iterator();
            if (it.hasNext()) {
                throw AbstractC5078.m8675(it);
            }
        }
        return i3;
    }
}
