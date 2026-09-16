package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۦۖؔۗۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4910 implements InterfaceC2880 {

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ AbstractC3625 f16204;

    /* JADX INFO: renamed from: ۦۨ */
    public boolean f16206;

    /* JADX INFO: renamed from: ۦ۟ */
    public long f16205 = 9223372034707292159L;

    /* JADX INFO: renamed from: ۥْ */
    public long f16203 = 0;

    public C4910(AbstractC3625 abstractC3625) {
        this.f16204 = abstractC3625;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m8312(C0341 c0341, float f) {
        AbstractC3625 abstractC3625 = this.f16204;
        C2186 c2186 = abstractC3625.f12089;
        if (c2186 == null) {
            c2186 = new C2186();
            abstractC3625.f12089 = c2186;
        }
        int iM518 = AbstractC0246.m518((C0341[]) c2186.f7249, c0341);
        if (iM518 >= 0) {
            float[] fArr = (float[]) c2186.f7246;
            if (fArr[iM518] != f) {
                fArr[iM518] = f;
                ((byte[]) c2186.f7251)[iM518] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) c2186.f7251;
                if (bArr[iM518] == 2) {
                    bArr[iM518] = 0;
                    return;
                }
                return;
            }
        }
        int i = c2186.f7250;
        C0341[] c0341Arr = (C0341[]) c2186.f7249;
        if (i == c0341Arr.length) {
            int i2 = i * 2;
            c2186.f7249 = (C0341[]) Arrays.copyOf(c0341Arr, i2);
            c2186.f7246 = Arrays.copyOf((float[]) c2186.f7246, i2);
            c2186.f7251 = Arrays.copyOf((byte[]) c2186.f7251, i2);
        }
        ((C0341[]) c2186.f7249)[i] = c0341;
        ((byte[]) c2186.f7251)[i] = 3;
        ((float[]) c2186.f7246)[i] = f;
        c2186.f7250++;
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۗ */
    public final float mo746() {
        return this.f16204.mo746();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC2015 m8313() {
        this.f16206 = true;
        AbstractC3625 abstractC3625 = this.f16204;
        InterfaceC2015 interfaceC2015Mo2798 = abstractC3625.mo2798();
        if (C0873.m1863(this.f16205, 9223372034707292159L)) {
            this.f16205 = C5063.m8635(interfaceC2015Mo2798.mo2779(0L));
            this.f16203 = interfaceC2015Mo2798.mo2799();
        }
        abstractC3625.mo2790().f2261.m2601();
        return interfaceC2015Mo2798;
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۚ */
    public final float mo754() {
        return this.f16204.mo754();
    }
}
