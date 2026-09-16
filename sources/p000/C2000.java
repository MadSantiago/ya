package p000;

/* JADX INFO: renamed from: ۥٍٟؔٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C2000 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f6588;

    /* JADX INFO: renamed from: ۥۗ */
    public final float f6589;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f6590;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f6591;

    public C2000(float f, float f2, float f3, float f4) {
        this.f6590 = f;
        this.f6589 = f2;
        this.f6588 = f3;
        this.f6591 = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            AbstractC5233.m8862("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        C2000 c2000 = obj instanceof C2000 ? (C2000) obj : null;
        return c2000 != null && C4497.m7826(this.f6590, c2000.f6590) && C4497.m7826(this.f6589, c2000.f6589) && C4497.m7826(this.f6588, c2000.f6588) && C4497.m7826(this.f6591, c2000.f6591);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC3761.m6635(this.f6591, AbstractC3761.m6635(this.f6588, AbstractC3761.m6635(this.f6589, Float.hashCode(this.f6590) * 31, 31), 31), 31);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C4196 c4196 = (C4196) abstractC5381;
        c4196.f13946 = this.f6590;
        c4196.f13950 = this.f6589;
        c4196.f13947 = this.f6588;
        c4196.f13948 = this.f6591;
        c4196.f13949 = true;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C4196 c4196 = new C4196();
        c4196.f13946 = this.f6590;
        c4196.f13950 = this.f6589;
        c4196.f13947 = this.f6588;
        c4196.f13948 = this.f6591;
        c4196.f13949 = true;
        return c4196;
    }
}
