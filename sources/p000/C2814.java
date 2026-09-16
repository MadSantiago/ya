package p000;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: renamed from: ۥۦؚؖؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2814 extends Writer {

    /* JADX INFO: renamed from: ۦۨ */
    public final StringBuilder f9395 = new StringBuilder(128);

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m5379();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m5379();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m5379();
            } else {
                this.f9395.append(c);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m5379() {
        StringBuilder sb = this.f9395;
        if (sb.length() > 0) {
            Log.d("FragmentManager", sb.toString());
            sb.delete(0, sb.length());
        }
    }
}
