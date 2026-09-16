package p000;

import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥۣۡؖٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2578 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥؓ */
    public final /* synthetic */ C2243 f8605;

    /* JADX INFO: renamed from: ۥؖ */
    public final /* synthetic */ C2316 f8606;

    /* JADX INFO: renamed from: ۥً */
    public final /* synthetic */ InterfaceC2864 f8607;

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ boolean f8608;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C5745 f8609;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ InterfaceC4745 f8610;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ C3564 f8611;

    /* JADX INFO: renamed from: ۥٙ */
    public final /* synthetic */ int f8612;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ boolean f8613;

    /* JADX INFO: renamed from: ۥۧ */
    public final /* synthetic */ InterfaceC5731 f8614;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ int f8615;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C2826 f8616;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C0163 f8617;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C2154 f8618;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ InterfaceC0705 f8619;

    public C2578(InterfaceC0705 interfaceC0705, C2154 c2154, C5745 c5745, InterfaceC4745 interfaceC4745, boolean z, C3564 c3564, C2826 c2826, C0163 c0163, boolean z2, int i, int i2, C2316 c2316, C2243 c2243, InterfaceC5731 interfaceC5731, InterfaceC2864 interfaceC2864) {
        this.f8619 = interfaceC0705;
        this.f8618 = c2154;
        this.f8609 = c5745;
        this.f8610 = interfaceC4745;
        this.f8608 = z;
        this.f8611 = c3564;
        this.f8616 = c2826;
        this.f8617 = c0163;
        this.f8613 = z2;
        this.f8615 = i;
        this.f8612 = i2;
        this.f8606 = c2316;
        this.f8605 = c2243;
        this.f8614 = interfaceC5731;
        this.f8607 = interfaceC2864;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        C5362 c5362 = (C5362) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
            c5362.m8957(-1901156115);
            c5362.m9009(false);
            InterfaceC0705 interfaceC0705Mo1571 = this.f8619.mo1571(C4217.f13994);
            AbstractC5537.m9268(R.string.default_error_message, c5362);
            InterfaceC0705 interfaceC0705M7705 = AbstractC4410.m7705(interfaceC0705Mo1571, 280.0f, 56.0f);
            C2154 c2154 = this.f8618;
            C0547 c0547 = new C0547(c2154.f7107);
            InterfaceC5731 interfaceC5731 = this.f8614;
            InterfaceC2864 interfaceC2864 = this.f8607;
            C5745 c5745 = this.f8609;
            boolean z = this.f8608;
            boolean z2 = this.f8613;
            C2316 c2316 = this.f8606;
            C2243 c2243 = this.f8605;
            AbstractC5404.m9086(c5745, this.f8610, interfaceC0705M7705, z, this.f8611, this.f8616, this.f8617, z2, this.f8615, this.f8612, c2316, null, c2243, c0547, AbstractC3925.m7034(674541106, new C1468(c5745, z, z2, c2316, c2243, interfaceC5731, c2154, interfaceC2864), c5362), c5362, 0);
        } else {
            c5362.m8982();
        }
        return C2358.f7817;
    }
}
