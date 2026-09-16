package p000;

/* JADX INFO: renamed from: ۦۖؖۥؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4928 extends AbstractC4225 {
    @Override // p000.AbstractC4225
    /* JADX INFO: renamed from: ۥۙ */
    public final void mo2237(C5054 c5054, float f, float f2) {
        float f3 = f2 * f;
        c5054.m8579(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        C2974 c2974 = new C2974(0.0f, 0.0f, f4, f4);
        c2974.f9963 = 180.0f;
        c2974.f9966 = 90.0f;
        c5054.f16775.add(c2974);
        C4918 c4918 = new C4918(c2974);
        c5054.m8578(180.0f);
        c5054.f16779.add(c4918);
        c5054.f16778 = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        c5054.f16776 = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        c5054.f16773 = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
