package p000;

/* JADX INFO: renamed from: ۦؙ٘ؑؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4402 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f14498;

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f14499;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC2864 f14500;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f14501;

    public C4402(InterfaceC2864 interfaceC2864, boolean z, long j, long j2) {
        this.f14500 = interfaceC2864;
        this.f14499 = z;
        this.f14498 = j;
        this.f14501 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4402)) {
            return false;
        }
        C4402 c4402 = (C4402) obj;
        if (!C4497.m7826(3.0f, 3.0f) || !AbstractC3831.m6874(this.f14500, c4402.f14500) || this.f14499 != c4402.f14499) {
            return false;
        }
        long j = c4402.f14498;
        int i = C1327.f4593;
        return C4462.m7744(this.f14498, j) && C4462.m7744(this.f14501, c4402.f14501);
    }

    public final int hashCode() {
        int iM8672 = AbstractC5078.m8672((this.f14500.hashCode() + (Float.hashCode(3.0f) * 31)) * 31, 31, this.f14499);
        int i = C1327.f4593;
        return Long.hashCode(this.f14501) + AbstractC3761.m6626(iM8672, 31, this.f14498);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) C4497.m7825(3.0f));
        sb.append(", shape=");
        sb.append(this.f14500);
        sb.append(", clip=");
        sb.append(this.f14499);
        sb.append(", ambientColor=");
        AbstractC5078.m8677(this.f14498, sb, ", spotColor=");
        sb.append((Object) C1327.m2827(this.f14501));
        sb.append(')');
        return sb.toString();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        AbstractC1311 abstractC1311;
        C4201 c4201 = (C4201) abstractC5381;
        C2932 c2932 = new C2932(28, this);
        c4201.f13959 = c2932;
        if (c4201.f17791.f17786 && (abstractC1311 = AbstractC5537.m9245(c4201, 2).f4530) != null) {
            abstractC1311.m9786(c2932, true);
        }
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        return new C4201(new C2932(28, this));
    }
}
