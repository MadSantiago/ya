package p000;

/* JADX INFO: renamed from: ۦٜؒؓ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4671 implements InterfaceC1796 {

    /* JADX INFO: renamed from: ۥۣ */
    public final String f15392;

    public C4671(String str) {
        this.f15392 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4671) && AbstractC3831.m6874(this.f15392, ((C4671) obj).f15392);
    }

    @Override // p000.InterfaceC1796
    public final String getValue() {
        return this.f15392;
    }

    public final int hashCode() {
        return this.f15392.hashCode();
    }

    public final String toString() {
        return this.f15392;
    }
}
