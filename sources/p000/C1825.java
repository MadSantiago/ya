package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۥٜٟؓۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1825 extends AbstractC5381 implements InterfaceC0951 {

    /* JADX INFO: renamed from: ۥً */
    public C0474 f6060;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1825) && AbstractC3831.m6874(this.f6060, ((C1825) obj).f6060);
    }

    public final int hashCode() {
        return this.f6060.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f6060 + ')';
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۥ */
    public final void mo780() {
        this.f6060.getClass();
    }

    @Override // p000.InterfaceC0951
    /* JADX INFO: renamed from: ۥٛ */
    public final void mo1726(C2497 c2497) {
        ArrayList arrayList = (ArrayList) this.f6060.f1726;
        if (arrayList.size() <= 0) {
            c2497.m4644();
        } else {
            AbstractC2049.m4001(arrayList.get(0));
            throw null;
        }
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٓ */
    public final void mo788() {
        C0474 c0474 = this.f6060;
        c0474.m1025();
        c0474.f1725 = null;
    }
}
