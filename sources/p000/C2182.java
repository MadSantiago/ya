package p000;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: renamed from: ۥَؘۘؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2182 extends AbstractC5265 {

    /* JADX INFO: renamed from: ۥؗ */
    public float f7212 = 1.0f;

    /* JADX INFO: renamed from: ۥَ */
    public C0935 f7213;

    /* JADX INFO: renamed from: ۥُ */
    public float f7214;

    /* JADX INFO: renamed from: ۥّ */
    public float f7215;

    /* JADX INFO: renamed from: ۥْ */
    public C3579 f7216;

    /* JADX INFO: renamed from: ۥٓ */
    public final C0935 f7217;

    /* JADX INFO: renamed from: ۥٖ */
    public C0935 f7218;

    /* JADX INFO: renamed from: ۥۗ */
    public AbstractC0548 f7219;

    /* JADX INFO: renamed from: ۥۜ */
    public int f7220;

    /* JADX INFO: renamed from: ۦؑ */
    public List f7221;

    /* JADX INFO: renamed from: ۦؚ */
    public float f7222;

    /* JADX INFO: renamed from: ۦٌ */
    public float f7223;

    /* JADX INFO: renamed from: ۦِ */
    public float f7224;

    /* JADX INFO: renamed from: ۦٗ */
    public final InterfaceC5130 f7225;

    /* JADX INFO: renamed from: ۦٛ */
    public int f7226;

    /* JADX INFO: renamed from: ۦۗ */
    public float f7227;

    /* JADX INFO: renamed from: ۦۙ */
    public AbstractC0548 f7228;

    /* JADX INFO: renamed from: ۦۚ */
    public boolean f7229;

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean f7230;

    /* JADX INFO: renamed from: ۦۨ */
    public boolean f7231;

    public C2182() {
        int i = AbstractC0184.f672;
        this.f7221 = C2340.f7777;
        this.f7214 = 1.0f;
        this.f7220 = 0;
        this.f7226 = 0;
        this.f7224 = 4.0f;
        this.f7222 = 1.0f;
        this.f7229 = true;
        this.f7231 = true;
        C0935 c0935M669 = AbstractC0317.m669();
        this.f7217 = c0935M669;
        this.f7213 = c0935M669;
        this.f7225 = AbstractC3933.m7095(3, C3709.f12358);
    }

    public final String toString() {
        return this.f7217.toString();
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m4237() {
        float f = this.f7227;
        C0935 c0935 = this.f7217;
        if (f == 0.0f && this.f7222 == 1.0f) {
            this.f7213 = c0935;
            return;
        }
        C0935 c0936 = this.f7213;
        if (c0936 != c0935) {
            Path.FillType fillType = c0936.f3328.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.f7213.f3328.rewind();
            Path path = this.f7213.f3328;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        } else {
            this.f7213 = AbstractC0317.m669();
        }
        InterfaceC5130 interfaceC5130 = this.f7225;
        ((C1706) interfaceC5130.getValue()).f5676.setPath(c0935.f3328, false);
        float length = ((C1706) interfaceC5130.getValue()).f5676.getLength();
        float f2 = this.f7227;
        float f3 = this.f7223;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.f7222 + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((C1706) interfaceC5130.getValue()).m3526(f4, f5, this.f7213);
            return;
        }
        C0935 c0935M669 = this.f7218;
        if (c0935M669 == null) {
            c0935M669 = AbstractC0317.m669();
            this.f7218 = c0935M669;
        }
        c0935M669.m1907();
        ((C1706) interfaceC5130.getValue()).m3526(f4, length, c0935M669);
        C0935.m1905(this.f7213, c0935M669);
        c0935M669.m1907();
        ((C1706) interfaceC5130.getValue()).m3526(0.0f, f5, c0935M669);
        C0935.m1905(this.f7213, c0935M669);
    }

    @Override // p000.AbstractC5265
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2982(InterfaceC2442 interfaceC2442) {
        InterfaceC2442 interfaceC2443;
        C3579 c3579;
        if (this.f7229) {
            AbstractC3831.m6871(this.f7221, this.f7217);
            m4237();
        } else if (this.f7230) {
            m4237();
        }
        this.f7229 = false;
        this.f7230 = false;
        AbstractC0548 abstractC0548 = this.f7219;
        if (abstractC0548 != null) {
            interfaceC2443 = interfaceC2442;
            InterfaceC2442.m4565(interfaceC2443, this.f7213, abstractC0548, this.f7212, null, 56);
        } else {
            interfaceC2443 = interfaceC2442;
        }
        AbstractC0548 abstractC0549 = this.f7228;
        if (abstractC0549 != null) {
            C3579 c35710 = this.f7216;
            if (this.f7231 || c35710 == null) {
                C3579 c35711 = new C3579(this.f7215, this.f7224, this.f7220, this.f7226, 16);
                this.f7216 = c35711;
                this.f7231 = false;
                c3579 = c35711;
            } else {
                c3579 = c35710;
            }
            InterfaceC2442.m4565(interfaceC2443, this.f7213, abstractC0549, this.f7214, c3579, 48);
        }
    }
}
