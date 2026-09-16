package p000;

import java.io.Closeable;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: ۥؘؓؕٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0348 implements Closeable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f1280;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f1281;

    public C0348() {
        this.f1281 = 1;
        this.f1280 = new Inflater(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f1281;
        Object obj = this.f1280;
        switch (i) {
            case 0:
                ((C1702) obj).close();
                break;
            default:
                ((Inflater) obj).end();
                break;
        }
    }

    public C0348(C1702 c1702) {
        this.f1281 = 0;
        this.f1280 = c1702;
    }
}
