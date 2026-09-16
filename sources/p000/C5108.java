package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۦۙؔٞۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5108 implements InterfaceC0770 {

    /* JADX INFO: renamed from: ۥَ */
    public static final C2346 f16950 = new C2346(7, new C4599(26), new C1797(29));

    /* JADX INFO: renamed from: ۥْ */
    public InterfaceC0814 f16951;

    /* JADX INFO: renamed from: ۥٓ */
    public final C4884 f16952;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C3262 f16953;

    /* JADX INFO: renamed from: ۦۨ */
    public final Map f16954;

    public C5108(Map map) {
        this.f16954 = map;
        long[] jArr = AbstractC5064.f16815;
        this.f16953 = new C3262();
        this.f16952 = new C4884(1, this);
    }

    @Override // p000.InterfaceC0770
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo1661(Object obj, C0857 c0857, C5362 c5362, int i) {
        int i2;
        c5362.m8979(533563200);
        if ((i & 6) == 0) {
            i2 = (c5362.m8977(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m8977(c0857) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c5362.m8977(this) ? 256 : 128;
        }
        if (c5362.m9011(i2 & 1, (i2 & 147) != 146)) {
            c5362.m9012(obj);
            Object objM8999 = c5362.m8999();
            C4036 c4036 = C2850.f9517;
            if (objM8999 == c4036) {
                C4884 c4884 = this.f16952;
                if (!((Boolean) c4884.mo211(obj)).booleanValue()) {
                    C2316.m4357(obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.", "Type of the key ");
                    return;
                }
                Map map = (Map) this.f16954.get(obj);
                C4216 c4216 = AbstractC3198.f10737;
                C2950 c2950 = new C2950(new C5762(map, c4884));
                c5362.m8987(c2950);
                objM8999 = c2950;
            }
            C2950 c2951 = (C2950) objM8999;
            C4773.m8123(new C3467[]{AbstractC3198.f10737.mo4313(c2951), AbstractC0802.f2868.mo4313(c2951)}, c0857, c5362, (i2 & 112) | 8);
            boolean zM8977 = c5362.m8977(this) | c5362.m8977(obj) | c5362.m8977(c2951);
            Object objM89910 = c5362.m8999();
            if (zM8977 || objM89910 == c4036) {
                objM89910 = new C3464(this, obj, c2951, 12);
                c5362.m8987(objM89910);
            }
            AbstractC3925.m7028(C2358.f7817, (InterfaceC4745) objM89910, c5362);
            if (c5362.f17655 && c5362.f17671.f10831 == c5362.f17644) {
                c5362.f17644 = -1;
                c5362.f17655 = false;
            }
            c5362.m9009(false);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0021(i, 10, this, obj, c0857);
        }
    }
}
