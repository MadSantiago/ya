package p000;

/* JADX INFO: renamed from: ۥُٜ۠ؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2505 extends C4688 {

    /* JADX INFO: renamed from: ۦٌ */
    public final C0907 f8325;

    /* JADX INFO: renamed from: ۦۚ */
    public final C2432 f8326;

    public C2505(int i, String str) {
        super(str, null, i);
        this.f8325 = C0907.f3259;
        this.f8326 = new C2432(new C4701(i, str, this));
    }

    @Override // p000.C4688
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof InterfaceC0103)) {
            return false;
        }
        InterfaceC0103 interfaceC0103 = (InterfaceC0103) obj;
        return interfaceC0103.mo183() == C0907.f3259 && this.f15437.equals(interfaceC0103.mo186()) && AbstractC3831.m6874(AbstractC0186.m424(this), AbstractC0186.m424(interfaceC0103));
    }

    @Override // p000.C4688
    public final int hashCode() {
        int iHashCode = this.f15437.hashCode();
        C0084 c0084 = new C0084(this);
        int iHashCode2 = 1;
        while (c0084.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) c0084.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // p000.C4688
    public final String toString() {
        return AbstractC0973.m2056(new C2222(3, this), ", ", this.f15437.concat("("), ")", null, 56);
    }

    @Override // p000.C4688, p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC0487 mo183() {
        return this.f8325;
    }

    @Override // p000.C4688, p000.InterfaceC0103
    /* JADX INFO: renamed from: ۦِ */
    public final InterfaceC0103 mo190(int i) {
        return ((InterfaceC0103[]) this.f8326.getValue())[i];
    }
}
