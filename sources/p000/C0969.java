package p000;

/* JADX INFO: renamed from: ۥٍؖٞؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0969 implements InterfaceC0215 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Object f3422;

    /* JADX INFO: renamed from: ۥۗ */
    public final float f3423;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f3424;

    public C0969(float f, float f2, Object obj) {
        this.f3424 = f;
        this.f3423 = f2;
        this.f3422 = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0969) {
            C0969 c0969 = (C0969) obj;
            if (c0969.f3424 == this.f3424 && c0969.f3423 == this.f3423 && AbstractC3831.m6874(c0969.f3422, this.f3422)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f3422;
        return Float.hashCode(this.f3423) + AbstractC3761.m6635(this.f3424, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    @Override // p000.InterfaceC3347
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC2707 mo827(C1280 c1280) {
        Object obj = this.f3422;
        return new C3121(this.f3424, this.f3423, obj == null ? null : (AbstractC1814) c1280.f4359.mo211(obj));
    }

    public /* synthetic */ C0969(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
