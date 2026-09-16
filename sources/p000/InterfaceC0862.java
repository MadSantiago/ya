package p000;

/* JADX INFO: renamed from: ۥًؗۛؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0862 extends InterfaceC3347 {
    /* JADX INFO: renamed from: ۥؗ */
    float mo1836(long j, float f, float f2, float f3);

    /* JADX INFO: renamed from: ۥُ */
    default float mo1837(float f, float f2, float f3) {
        return mo1836(mo1839(f, f2, f3), f, f2, f3);
    }

    /* JADX INFO: renamed from: ۥۗ */
    float mo1838(long j, float f, float f2, float f3);

    @Override // p000.InterfaceC3347
    /* JADX INFO: renamed from: ۥۣ */
    default InterfaceC2707 mo827(C1280 c1280) {
        return new C1489(this);
    }

    /* JADX INFO: renamed from: ۦؑ */
    long mo1839(float f, float f2, float f3);
}
