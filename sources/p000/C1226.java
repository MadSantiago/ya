package p000;

import android.graphics.Typeface;

/* JADX INFO: renamed from: ۥْؖؖٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1226 implements InterfaceC4434 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C1039 f4221;

    /* JADX INFO: renamed from: ۥۗ */
    public final C2346 f4222;

    /* JADX INFO: renamed from: ۥۣ */
    public final C4662 f4223;

    public C1226(C0373 c0373, C4662 c4662) {
        C2346 c2346 = AbstractC3139.f10598;
        C0743 c0743 = C2584.f8629;
        C5136 c5136 = AbstractC3572.f11832;
        c0743.getClass();
        AbstractC4009.m7151(AbstractC4593.m7963(c0743, c5136).mo860(C4794.f15814).mo860(new C2084(null)));
        C1039 c1039 = new C1039(3);
        this.f4223 = c4662;
        this.f4222 = c2346;
        this.f4221 = c1039;
        new C0091(12, this);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C4879 m2590(AbstractC0903 abstractC0903, C1626 c1626, int i, int i2) {
        int i3 = this.f4223.f15363;
        return m2591(new C1439(abstractC0903, (i3 == 0 || i3 == Integer.MAX_VALUE) ? c1626 : new C1626(AbstractC4554.m7934(c1626.f5444 + i3, 1, 1000)), i, i2, null));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074 A[Catch: Exception -> 0x007c, TRY_ENTER, TryCatch #0 {Exception -> 0x007c, blocks: (B:15:0x0027, B:17:0x0035, B:20:0x003a, B:22:0x003e, B:25:0x004b, B:42:0x0074, B:43:0x007b, B:24:0x0047), top: B:49:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۥۣ */
    public final C4879 m2591(C1439 c1439) {
        Typeface typefaceMo2860;
        C4879 c4879;
        C2346 c2346 = this.f4222;
        synchronized (((C3223) c2346.f7786)) {
            C4879 c48710 = (C4879) ((C2094) c2346.f7785).m4035(c1439);
            if (c48710 != null) {
                if (c48710.f16041) {
                    return c48710;
                }
            }
            try {
                AbstractC0903 abstractC0903 = c1439.f4933;
                InterfaceC1351 interfaceC1351 = (InterfaceC1351) this.f4221.f3672;
                int i = c1439.f4930;
                C1626 c1626 = c1439.f4932;
                if (abstractC0903 != null && !(abstractC0903 instanceof C0654)) {
                    if (abstractC0903 instanceof C3277) {
                        typefaceMo2860 = interfaceC1351.mo2861((C3277) abstractC0903, c1626, i);
                    } else {
                        c4879 = null;
                    }
                    if (c4879 != null) {
                        throw new IllegalStateException("Could not load font");
                    }
                    synchronized (((C3223) c2346.f7786)) {
                        if (((C2094) c2346.f7785).m4035(c1439) == null && c4879.f16041) {
                            ((C2094) c2346.f7785).m4041(c1439, c4879);
                        }
                    }
                    return c4879;
                }
                typefaceMo2860 = interfaceC1351.mo2860(c1626, i);
                c4879 = new C4879(typefaceMo2860);
                if (c4879 != null) {
                    throw new IllegalStateException("Could not load font");
                }
                synchronized (((C3223) c2346.f7786)) {
                    if (((C2094) c2346.f7785).m4035(c1439) == null) {
                        ((C2094) c2346.f7785).m4041(c1439, c4879);
                    }
                    return c4879;
                }
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }
}
