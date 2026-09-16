package p000;

/* JADX INFO: renamed from: ۥؙْؔٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0722 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final InterfaceC2144[] f2636;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4912 f2637;

    static {
        C4912 c4912 = new C4912(8);
        InterfaceC2144.f7023.getClass();
        C2285 c2285 = C1114.f3913;
        c4912.m8319(1, c2285);
        C2285 c2286 = C1114.f3906;
        c4912.m8319(2, c2286);
        C2285 c2287 = C1114.f3907;
        c4912.m8319(4, c2287);
        C2285 c2288 = C1114.f3910;
        c4912.m8319(8, c2288);
        C2285 c2289 = C1114.f3908;
        c4912.m8319(16, c2289);
        C2285 c22810 = C1114.f3905;
        c4912.m8319(32, c22810);
        C2285 c22811 = C1114.f3912;
        c4912.m8319(64, c22811);
        C2285 c22812 = C1114.f3904;
        c4912.m8319(128, c22812);
        f2637 = c4912;
        f2636 = new InterfaceC2144[]{c2285, c2286, c2287, c22811, c2289, c22810, c2288, C1114.f3911, c22812};
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m1596(C4910 c4910, C5655 c5655, long j, int i, int i2) {
        if (AbstractC4489.m7807(j, -1L)) {
            return;
        }
        c4910.m8312(c5655.f18620, (int) ((j >>> 48) & 65535));
        c4910.m8312(c5655.f18617, (int) ((j >>> 32) & 65535));
        c4910.m8312(c5655.f18622, i - ((int) ((j >>> 16) & 65535)));
        c4910.m8312(c5655.f18618, i2 - ((int) (j & 65535)));
    }
}
