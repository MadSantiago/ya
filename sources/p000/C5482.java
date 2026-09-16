package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۦًَۡؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5482 implements InterfaceC5370 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ Map f18083;

    /* JADX INFO: renamed from: ۥُ */
    public final /* synthetic */ C4509 f18084;

    /* JADX INFO: renamed from: ۥّ */
    public final /* synthetic */ C0851 f18085;

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ int f18086;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f18087;

    /* JADX INFO: renamed from: ۦؑ */
    public final /* synthetic */ InterfaceC4745 f18088;

    /* JADX INFO: renamed from: ۦۙ */
    public final /* synthetic */ InterfaceC4745 f18089;

    public C5482(int i, int i2, Map map, InterfaceC4745 interfaceC4745, C4509 c4509, C0851 c0851, InterfaceC4745 interfaceC4746) {
        this.f18087 = i;
        this.f18086 = i2;
        this.f18083 = map;
        this.f18088 = interfaceC4745;
        this.f18084 = c4509;
        this.f18085 = c0851;
        this.f18089 = interfaceC4746;
    }

    @Override // p000.InterfaceC5370
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo618() {
        return this.f18086;
    }

    @Override // p000.InterfaceC5370
    /* JADX INFO: renamed from: ۥُ */
    public final int mo619() {
        return this.f18087;
    }

    @Override // p000.InterfaceC5370
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo620() {
        C2242 c2242;
        C0605 c0605 = this.f18085.f3155;
        boolean zMo323 = this.f18084.mo323();
        InterfaceC4745 interfaceC4745 = this.f18089;
        if (!zMo323 || (c2242 = ((C2935) c0605.f2256.f8206).f9865) == null) {
            interfaceC4745.mo211(((C2935) c0605.f2256.f8206).f12090);
        } else {
            interfaceC4745.mo211(c2242.f12090);
        }
    }

    @Override // p000.InterfaceC5370
    /* JADX INFO: renamed from: ۥۣ */
    public final Map mo621() {
        return this.f18083;
    }

    @Override // p000.InterfaceC5370
    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC4745 mo2711() {
        return this.f18088;
    }
}
