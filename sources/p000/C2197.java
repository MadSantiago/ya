package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥٌۙؑؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2197 {

    /* JADX INFO: renamed from: ۥۣ */
    public final List f7289 = AbstractC2164.m4188(AbstractC2539.f8452.f5219, AbstractC2539.f8461.f5219);

    /* JADX INFO: renamed from: ۥۗ */
    public final C4994 f7288 = AbstractC1605.m3349(new C5890(C2340.f7777, false));

    /* JADX INFO: renamed from: ۥؗ */
    public final List m4259() {
        return ((C5890) this.f7288.getValue()).f19426;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m4260(String str) {
        C4994 c4994;
        Object value;
        if (this.f7289.contains(str)) {
            return;
        }
        do {
            c4994 = this.f7288;
            value = c4994.getValue();
        } while (!c4994.m8386(value, C5890.m9722((C5890) value, false, AbstractC0973.m2051(m4259(), str), 1)));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4261(String str) {
        C4994 c4994;
        Object value;
        if (m4259().contains(str)) {
            return;
        }
        do {
            c4994 = this.f7288;
            value = c4994.getValue();
        } while (!c4994.m8386(value, C5890.m9722((C5890) value, false, AbstractC0973.m2046(m4259(), str), 1)));
    }
}
