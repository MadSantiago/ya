package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ۦۧؖؐؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5829 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ InterfaceC4745 f19200;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C1916 f19201;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ InterfaceC1437 f19202;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ float f19203;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f19204;

    public /* synthetic */ C5829(float f, C1916 c1916, InterfaceC1437 interfaceC1437, InterfaceC4745 interfaceC4745, int i) {
        this.f19204 = i;
        this.f19203 = f;
        this.f19201 = c1916;
        this.f19202 = interfaceC1437;
        this.f19200 = interfaceC4745;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        float fMo927;
        int i = this.f19204;
        C2358 c2358 = C2358.f7817;
        InterfaceC4745 interfaceC4745 = this.f19200;
        InterfaceC1437 interfaceC1437 = this.f19202;
        C1916 c1916 = this.f19201;
        float f = this.f19203;
        C5535 c5535 = (C5535) obj;
        switch (i) {
            case 0:
                float fAbs = Math.abs(((Number) c5535.f18269.getValue()).floatValue());
                float fAbs2 = Math.abs(f);
                C4852 c4852 = c5535.f18269;
                if (fAbs < fAbs2) {
                    AbstractC2164.m4201(c5535, interfaceC1437, interfaceC4745, ((Number) c4852.getValue()).floatValue() - c1916.f6312);
                    c1916.f6312 = ((Number) c4852.getValue()).floatValue();
                } else {
                    float fM4183 = AbstractC2164.m4183(((Number) c4852.getValue()).floatValue(), f);
                    AbstractC2164.m4201(c5535, interfaceC1437, interfaceC4745, fM4183 - c1916.f6312);
                    c5535.m9211();
                    c1916.f6312 = fM4183;
                }
                break;
            default:
                float fM4184 = AbstractC2164.m4183(((Number) c5535.f18269.getValue()).floatValue(), f);
                float f2 = fM4184 - c1916.f6312;
                try {
                    fMo927 = interfaceC1437.mo927(f2);
                } catch (CancellationException unused) {
                    c5535.m9211();
                    fMo927 = 0.0f;
                }
                interfaceC4745.mo211(Float.valueOf(fMo927));
                if (Math.abs(f2 - fMo927) > 0.5f || fM4184 != ((Number) c5535.f18269.getValue()).floatValue()) {
                    c5535.m9211();
                }
                c1916.f6312 += fMo927;
                break;
        }
        return c2358;
    }
}
