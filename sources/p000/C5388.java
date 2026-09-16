package p000;

/* JADX INFO: renamed from: ۦ۠ؓؒۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5388 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C0969 f17807;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC4745 f17808;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC5807 f17809;

    public C5388(InterfaceC5807 interfaceC5807, InterfaceC4745 interfaceC4745, C0969 c0969) {
        this.f17809 = interfaceC5807;
        this.f17808 = interfaceC4745;
        this.f17807 = c0969;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5388)) {
            return false;
        }
        C5388 c5388 = (C5388) obj;
        return AbstractC3831.m6874(this.f17809, c5388.f17809) && AbstractC3831.m6874(this.f17808, c5388.f17808) && this.f17807.equals(c5388.f17807);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f17807.hashCode() + ((this.f17808.hashCode() + (this.f17809.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f17809 + ", size=" + this.f17808 + ", animationSpec=" + this.f17807 + ", clip=true)";
    }
}
