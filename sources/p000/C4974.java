package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۦؚۗؖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4974 implements InterfaceC5370 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ Map f16457;

    /* JADX INFO: renamed from: ۥُ */
    public final /* synthetic */ InterfaceC4745 f16458;

    /* JADX INFO: renamed from: ۥّ */
    public final /* synthetic */ AbstractC3625 f16459;

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ int f16460;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f16461;

    /* JADX INFO: renamed from: ۦؑ */
    public final /* synthetic */ InterfaceC4745 f16462;

    public C4974(int i, int i2, Map map, InterfaceC4745 interfaceC4745, InterfaceC4745 interfaceC4746, AbstractC3625 abstractC3625) {
        this.f16461 = i;
        this.f16460 = i2;
        this.f16457 = map;
        this.f16462 = interfaceC4745;
        this.f16458 = interfaceC4746;
        this.f16459 = abstractC3625;
    }

    @Override // p000.InterfaceC5370
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo618() {
        return this.f16460;
    }

    @Override // p000.InterfaceC5370
    /* JADX INFO: renamed from: ۥُ */
    public final int mo619() {
        return this.f16461;
    }

    @Override // p000.InterfaceC5370
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo620() {
        this.f16458.mo211(this.f16459.f12090);
    }

    @Override // p000.InterfaceC5370
    /* JADX INFO: renamed from: ۥۣ */
    public final Map mo621() {
        return this.f16457;
    }

    @Override // p000.InterfaceC5370
    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC4745 mo2711() {
        return this.f16462;
    }
}
