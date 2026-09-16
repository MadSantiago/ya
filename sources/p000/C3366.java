package p000;

import java.util.Set;

/* JADX INFO: renamed from: ۦَؖؖٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3366 implements InterfaceC3424 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final C0863 f11243 = new C0863(new C1670[16]);

    /* JADX INFO: renamed from: ۦۨ */
    public final Set f11244;

    public C3366(Set set) {
        this.f11244 = set;
    }

    @Override // p000.InterfaceC3424
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo3769() {
        C0863 c0863 = this.f11243;
        Object[] objArr = c0863.f3182;
        int i = c0863.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC3424 interfaceC3424 = ((C1670) objArr[i2]).f5567;
            this.f11244.remove(interfaceC3424);
            interfaceC3424.mo3769();
        }
    }

    @Override // p000.InterfaceC3424
    /* JADX INFO: renamed from: ۥُ */
    public final void mo3770() {
    }

    @Override // p000.InterfaceC3424
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo3772() {
    }
}
