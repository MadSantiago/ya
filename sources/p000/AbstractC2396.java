package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۥِْۜؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2396 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4461 f7968 = new C4461(0);

    /* JADX INFO: renamed from: ۥۣ */
    public static synchronized void m4515() {
        C4461 c4461 = f7968;
        Iterator it = ((C3300) c4461.values()).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        c4461.clear();
    }
}
