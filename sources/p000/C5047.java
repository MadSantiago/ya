package p000;

/* JADX INFO: renamed from: ۦۘؖۗ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5047 implements InterfaceC3205 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C3263 f16736;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f16737;

    /* JADX INFO: renamed from: ۥۣ */
    public final C4950 f16738;

    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC4448 f16739;

    public C5047(C4950 c4950, int i, C3263 c3263, InterfaceC4448 interfaceC4448) {
        this.f16738 = c4950;
        this.f16737 = i;
        this.f16736 = c3263;
        this.f16739 = interfaceC4448;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5047) {
            C5047 c5047 = (C5047) obj;
            if (this.f16738 == c5047.f16738 && this.f16737 == c5047.f16737 && this.f16736.equals(c5047.f16736) && AbstractC3831.m6874(this.f16739, c5047.f16739)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16739.hashCode() + ((this.f16736.hashCode() + AbstractC2049.m3999(this.f16737, this.f16738.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f16738 + ", cursorOffset=" + this.f16737 + ", transformedText=" + this.f16736 + ", textLayoutResultProvider=" + this.f16739 + ')';
    }

    @Override // p000.InterfaceC3205
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 mo4547(InterfaceC2427 interfaceC2427, InterfaceC1827 interfaceC1827, long j) {
        AbstractC0275 abstractC0275Mo3597 = interfaceC1827.mo3597(C3693.m6550(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(abstractC0275Mo3597.f984, C3693.m6551(j));
        return interfaceC2427.mo755(abstractC0275Mo3597.f985, iMin, C0204.f751, new C5153(this, abstractC0275Mo3597, iMin));
    }
}
