package p000;

/* JADX INFO: renamed from: ۥ۟ؒۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2434 implements InterfaceC3205 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C3263 f8100;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f8101;

    /* JADX INFO: renamed from: ۥۣ */
    public final C4950 f8102;

    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC4448 f8103;

    public C2434(C4950 c4950, int i, C3263 c3263, InterfaceC4448 interfaceC4448) {
        this.f8102 = c4950;
        this.f8101 = i;
        this.f8100 = c3263;
        this.f8103 = interfaceC4448;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2434) {
            C2434 c2434 = (C2434) obj;
            if (this.f8102 == c2434.f8102 && this.f8101 == c2434.f8101 && this.f8100.equals(c2434.f8100) && AbstractC3831.m6874(this.f8103, c2434.f8103)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8103.hashCode() + ((this.f8100.hashCode() + AbstractC2049.m3999(this.f8101, this.f8102.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f8102 + ", cursorOffset=" + this.f8101 + ", transformedText=" + this.f8100 + ", textLayoutResultProvider=" + this.f8103 + ')';
    }

    @Override // p000.InterfaceC3205
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 mo4547(InterfaceC2427 interfaceC2427, InterfaceC1827 interfaceC1827, long j) {
        long j2;
        if (interfaceC1827.mo3599(C3693.m6551(j)) < C3693.m6556(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = C3693.m6550(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        AbstractC0275 abstractC0275Mo3597 = interfaceC1827.mo3597(j);
        int iMin = Math.min(abstractC0275Mo3597.f985, C3693.m6556(j2));
        return interfaceC2427.mo755(iMin, abstractC0275Mo3597.f984, C0204.f751, new C3298(this, interfaceC2427, abstractC0275Mo3597, iMin));
    }
}
