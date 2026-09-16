package p000;

/* JADX INFO: renamed from: ۦٞؓۡۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C4793 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f15805;

    /* JADX INFO: renamed from: ۥُ */
    public final long f15806;

    /* JADX INFO: renamed from: ۥّ */
    public final InterfaceC2864 f15807;

    /* JADX INFO: renamed from: ۥۗ */
    public final float f15808;

    /* JADX INFO: renamed from: ۥۜ */
    public final long f15809;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f15810;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f15811;

    /* JADX INFO: renamed from: ۦٛ */
    public final long f15812;

    /* JADX INFO: renamed from: ۦۙ */
    public final boolean f15813;

    public C4793(float f, float f2, float f3, float f4, long j, InterfaceC2864 interfaceC2864, boolean z, long j2, long j3) {
        this.f15810 = f;
        this.f15808 = f2;
        this.f15805 = f3;
        this.f15811 = f4;
        this.f15806 = j;
        this.f15807 = interfaceC2864;
        this.f15813 = z;
        this.f15809 = j2;
        this.f15812 = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4793) {
            C4793 c4793 = (C4793) obj;
            if (Float.compare(this.f15810, c4793.f15810) == 0 && Float.compare(this.f15808, c4793.f15808) == 0 && Float.compare(this.f15805, c4793.f15805) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f15811, c4793.f15811) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0) {
                long j = c4793.f15806;
                int i = AbstractC5477.f18070;
                if (this.f15806 == j && AbstractC3831.m6874(this.f15807, c4793.f15807) && this.f15813 == c4793.f15813) {
                    long j2 = c4793.f15809;
                    int i2 = C1327.f4593;
                    if (C4462.m7744(this.f15809, j2) && C4462.m7744(this.f15812, c4793.f15812)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM6635 = AbstractC3761.m6635(8.0f, AbstractC3761.m6635(0.0f, AbstractC3761.m6635(0.0f, AbstractC3761.m6635(0.0f, AbstractC3761.m6635(this.f15811, AbstractC3761.m6635(0.0f, AbstractC3761.m6635(0.0f, AbstractC3761.m6635(this.f15805, AbstractC3761.m6635(this.f15808, Float.hashCode(this.f15810) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = AbstractC5477.f18070;
        int iM8672 = AbstractC5078.m8672((this.f15807.hashCode() + AbstractC3761.m6626(iM6635, 31, this.f15806)) * 31, 961, this.f15813);
        int i2 = C1327.f4593;
        return AbstractC2049.m3999(3, AbstractC2049.m3999(0, AbstractC3761.m6626(AbstractC3761.m6626(iM8672, 31, this.f15809), 31, this.f15812), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.f15810);
        sb.append(", scaleY=");
        sb.append(this.f15808);
        sb.append(", alpha=");
        sb.append(this.f15805);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f15811);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sb.append((Object) AbstractC5477.m9177(this.f15806));
        sb.append(", shape=");
        sb.append(this.f15807);
        sb.append(", clip=");
        sb.append(this.f15813);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC5078.m8677(this.f15809, sb, ", spotShadowColor=");
        sb.append((Object) C1327.m2827(this.f15812));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) C4773.m8129(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        AbstractC1311 abstractC1311;
        C2096 c2096 = (C2096) abstractC5381;
        c2096.f6896 = this.f15810;
        c2096.f6905 = this.f15808;
        c2096.f6897 = this.f15805;
        c2096.f6898 = this.f15811;
        c2096.f6902 = 8.0f;
        c2096.f6900 = this.f15806;
        c2096.f6899 = this.f15807;
        c2096.f6901 = this.f15813;
        c2096.f6903 = this.f15809;
        c2096.f6904 = this.f15812;
        c2096.f6895 = 3;
        C4627 c4627 = c2096.f6906;
        if (c2096.f17791.f17786 && (abstractC1311 = AbstractC5537.m9245(c2096, 2).f4530) != null) {
            abstractC1311.m9786(c4627, true);
        }
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C2096 c2096 = new C2096();
        c2096.f6896 = this.f15810;
        c2096.f6905 = this.f15808;
        c2096.f6897 = this.f15805;
        c2096.f6898 = this.f15811;
        c2096.f6902 = 8.0f;
        c2096.f6900 = this.f15806;
        c2096.f6899 = this.f15807;
        c2096.f6901 = this.f15813;
        c2096.f6903 = this.f15809;
        c2096.f6904 = this.f15812;
        c2096.f6895 = 3;
        c2096.f6906 = new C4627(1, c2096);
        return c2096;
    }
}
