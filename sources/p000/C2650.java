package p000;

/* JADX INFO: renamed from: ۥۢۢۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C2650 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۗ */
    public final float f8799;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f8800;

    public C2650(float f, float f2) {
        this.f8800 = f;
        this.f8799 = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2650)) {
            return false;
        }
        C2650 c2650 = (C2650) obj;
        return C4497.m7826(this.f8800, c2650.f8800) && C4497.m7826(this.f8799, c2650.f8799);
    }

    public final int hashCode() {
        return Float.hashCode(this.f8799) + (Float.hashCode(this.f8800) * 31);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C2595 c2595 = (C2595) abstractC5381;
        c2595.f8675 = this.f8800;
        c2595.f8676 = this.f8799;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C2595 c2595 = new C2595();
        c2595.f8675 = this.f8800;
        c2595.f8676 = this.f8799;
        return c2595;
    }
}
