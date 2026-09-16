package p000;

/* JADX INFO: renamed from: ۥٟۗؑؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2096 extends AbstractC5381 implements InterfaceC4933, InterfaceC5671 {

    /* JADX INFO: renamed from: ۥؔ */
    public int f6895;

    /* JADX INFO: renamed from: ۥً */
    public float f6896;

    /* JADX INFO: renamed from: ۥٕ */
    public float f6897;

    /* JADX INFO: renamed from: ۥۙ */
    public float f6898;

    /* JADX INFO: renamed from: ۥۦ */
    public InterfaceC2864 f6899;

    /* JADX INFO: renamed from: ۦؖ */
    public long f6900;

    /* JADX INFO: renamed from: ۦؗ */
    public boolean f6901;

    /* JADX INFO: renamed from: ۦؙ */
    public float f6902;

    /* JADX INFO: renamed from: ۦُ */
    public long f6903;

    /* JADX INFO: renamed from: ۦٖ */
    public long f6904;

    /* JADX INFO: renamed from: ۦٚ */
    public float f6905;

    /* JADX INFO: renamed from: ۦۜ */
    public C4627 f6906;

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f6896);
        sb.append(", scaleY=");
        sb.append(this.f6905);
        sb.append(", alpha = ");
        sb.append(this.f6897);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f6898);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb.append(this.f6902);
        sb.append(", transformOrigin=");
        sb.append((Object) AbstractC5477.m9177(this.f6900));
        sb.append(", shape=");
        sb.append(this.f6899);
        sb.append(", clip=");
        sb.append(this.f6901);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC5078.m8677(this.f6903, sb, ", spotShadowColor=");
        AbstractC5078.m8677(this.f6904, sb, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) C4773.m8129(this.f6895));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 mo931(InterfaceC2427 interfaceC2427, InterfaceC1827 interfaceC1827, long j) {
        AbstractC0275 abstractC0275Mo3597 = interfaceC1827.mo3597(j);
        return interfaceC2427.mo755(abstractC0275Mo3597.f985, abstractC0275Mo3597.f984, C0204.f751, new C5544(11, abstractC0275Mo3597, this));
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦؘ */
    public final boolean mo786() {
        return false;
    }

    @Override // p000.InterfaceC5671
    /* JADX INFO: renamed from: ۦِ */
    public final boolean mo4044() {
        return false;
    }

    @Override // p000.InterfaceC5671
    /* JADX INFO: renamed from: ۦٟ */
    public final void mo790(InterfaceC1066 interfaceC1066) {
        if (this.f6901) {
            AbstractC3992.m7131(interfaceC1066, this.f6899);
        }
    }
}
