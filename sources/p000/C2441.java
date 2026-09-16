package p000;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: ۥٖ۟ؓٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2441 {

    /* JADX INFO: renamed from: ۥؗ */
    public C1660 f8134;

    /* JADX INFO: renamed from: ۥۗ */
    public final HashMap f8135;

    /* JADX INFO: renamed from: ۥۣ */
    public final HashMap f8136;

    /* JADX INFO: renamed from: ۦؑ */
    public static final C4252 f8133 = new C4252();

    /* JADX INFO: renamed from: ۥُ */
    public static final C1660 f8132 = new C1660(0);

    public C2441(C2441 c2441) {
        HashMap map = new HashMap();
        this.f8136 = map;
        HashMap map2 = new HashMap();
        this.f8135 = map2;
        map.putAll(c2441.f8136);
        map2.putAll(c2441.f8135);
        this.f8134 = c2441.f8134;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void m4556(C2632 c2632, Iterator it, C5408 c5408) {
        C1660 c1660 = (C1660) this.f8135.get(c2632);
        if (c1660 != null) {
            c1660.m3469(c2632, it, c5408);
            return;
        }
        C1660 c1661 = this.f8134;
        if (c1661 != null && !this.f8136.containsKey(c2632)) {
            c1661.m3469(c2632, it, c5408);
        } else {
            while (it.hasNext()) {
                m4557(c2632, it.next(), c5408);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m4557(C2632 c2632, Object obj, C5408 c5408) {
        C4252 c4252 = (C4252) this.f8136.get(c2632);
        if (c4252 == null) {
            if (!c2632.f8745 || ((C5245) C5245.f17313.get()).f17314 <= 20) {
                c2632.mo4951(obj, c5408);
                return;
            } else {
                c5408.m9090(obj, c2632.f8744);
                return;
            }
        }
        switch (c4252.f14093) {
            case 0:
                break;
            default:
                if (c2632.f8745 && ((C5245) C5245.f17313.get()).f17314 > 20) {
                    c5408.m9090(obj, c2632.f8744);
                } else {
                    c2632.mo4951(obj, c5408);
                }
                break;
        }
    }

    public /* synthetic */ C2441() {
        this.f8136 = new HashMap();
        this.f8135 = new HashMap();
        this.f8134 = null;
    }
}
