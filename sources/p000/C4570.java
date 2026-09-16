package p000;

/* JADX INFO: renamed from: ۦٚؖ٘ٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4570 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f15077;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f15078;

    public C4570(float f, boolean z) {
        this.f15078 = f;
        this.f15077 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C4570 c4570 = obj instanceof C4570 ? (C4570) obj : null;
        return c4570 != null && this.f15078 == c4570.f15078 && this.f15077 == c4570.f15077;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15077) + (Float.hashCode(this.f15078) * 31);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C0864 c0864 = (C0864) abstractC5381;
        c0864.f3183 = this.f15078;
        c0864.f3184 = this.f15077;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C0864 c0864 = new C0864();
        c0864.f3183 = this.f15078;
        c0864.f3184 = this.f15077;
        return c0864;
    }
}
