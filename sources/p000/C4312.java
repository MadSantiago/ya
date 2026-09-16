package p000;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: renamed from: ۦٖؖ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4312 implements InterfaceC4707 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C3875 f14253;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ WorkDatabase f14254;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ InterfaceC4707 f14255;

    public C4312(InterfaceC4707 interfaceC4707, WorkDatabase workDatabase, C3875 c3875) {
        this.f14255 = interfaceC4707;
        this.f14254 = workDatabase;
        this.f14253 = c3875;
    }

    @Override // p000.InterfaceC4707
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo1575(InterfaceC4161 interfaceC4161, InterfaceC0443 interfaceC0443) {
        Object objMo1575 = this.f14255.mo1575(new C0670(interfaceC4161, this.f14254, this.f14253, 4), interfaceC0443);
        return objMo1575 == EnumC2282.f7590 ? objMo1575 : C2358.f7817;
    }
}
