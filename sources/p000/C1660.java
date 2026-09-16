package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۥٙؕؓؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1660 {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f5523;

    public /* synthetic */ C1660(int i) {
        this.f5523 = i;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m3469(C2632 c2632, Iterator it, C5408 c5408) {
        switch (this.f5523) {
            case 0:
                break;
            default:
                if (!c2632.f8741) {
                    C1078.m2276("non repeating key");
                } else if (c2632.f8745 && ((C5245) C5245.f17313.get()).f17314 > 20) {
                    while (it.hasNext()) {
                        c5408.m9090(it.next(), c2632.f8744);
                    }
                } else {
                    c2632.mo4952(it, c5408);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    private final void m3468(C2632 c2632, Iterator it, C5408 c5408) {
    }
}
