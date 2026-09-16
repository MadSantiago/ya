package p000;

import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۥٗؔ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1528 extends AbstractC2577 {

    /* JADX INFO: renamed from: ۥُ */
    public static final C0822 f5174;

    /* JADX INFO: renamed from: ۥّ */
    public static final C0822 f5175;

    /* JADX INFO: renamed from: ۥۜ */
    public static final byte[] f5176;

    /* JADX INFO: renamed from: ۦٛ */
    public static final byte[] f5177;

    /* JADX INFO: renamed from: ۦۙ */
    public static final byte[] f5178;

    /* JADX INFO: renamed from: ۥؗ */
    public final C0822 f5179;

    /* JADX INFO: renamed from: ۥۗ */
    public final List f5180;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1007 f5181;

    /* JADX INFO: renamed from: ۦؑ */
    public long f5182;

    static {
        Pattern pattern = C0822.f2914;
        f5174 = AbstractC5378.m9040("multipart/mixed");
        AbstractC5378.m9040("multipart/alternative");
        AbstractC5378.m9040("multipart/digest");
        AbstractC5378.m9040("multipart/parallel");
        f5175 = AbstractC5378.m9040("multipart/form-data");
        f5178 = new byte[]{58, 32};
        f5176 = new byte[]{13, 10};
        f5177 = new byte[]{45, 45};
    }

    public C1528(C1007 c1007, C0822 c0822, List list) {
        this.f5181 = c1007;
        this.f5180 = list;
        Pattern pattern = C0822.f2914;
        this.f5179 = AbstractC5378.m9040(c0822 + "; boundary=" + c1007.m2214());
        this.f5182 = -1L;
    }

    @Override // p000.AbstractC2577
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo3258(InterfaceC2674 interfaceC2674) {
        m3261(interfaceC2674, false);
    }

    @Override // p000.AbstractC2577
    /* JADX INFO: renamed from: ۥۗ */
    public final C0822 mo3259() {
        return this.f5179;
    }

    @Override // p000.AbstractC2577
    /* JADX INFO: renamed from: ۥۣ */
    public final long mo3260() {
        long j = this.f5182;
        if (j != -1) {
            return j;
        }
        long jM3261 = m3261(null, true);
        this.f5182 = jM3261;
        return jM3261;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۦؑ */
    public final long m3261(InterfaceC2674 interfaceC2674, boolean z) {
        C1270 c1270;
        InterfaceC2674 c1271;
        if (z) {
            c1271 = new C1270();
            c1270 = c1271;
        } else {
            c1270 = 0;
            c1271 = interfaceC2674;
        }
        List list = this.f5180;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            C1007 c1007 = this.f5181;
            byte[] bArr = f5177;
            byte[] bArr2 = f5176;
            if (i >= size) {
                c1271.write(bArr);
                c1271.mo2696(c1007);
                c1271.write(bArr);
                c1271.write(bArr2);
                if (!z) {
                    return j;
                }
                long j2 = j + c1270.f4340;
                c1270.m2678();
                return j2;
            }
            C3394 c3394 = (C3394) list.get(i);
            C4714 c4714 = c3394.f11294;
            AbstractC2577 abstractC2577 = c3394.f11293;
            c1271.write(bArr);
            c1271.mo2696(c1007);
            c1271.write(bArr2);
            int size2 = c4714.size();
            for (int i2 = 0; i2 < size2; i2++) {
                c1271.mo2660(c4714.m8049(i2)).write(f5178).mo2660(c4714.m8047(i2)).write(bArr2);
            }
            C0822 c0822Mo3259 = abstractC2577.mo3259();
            if (c0822Mo3259 != null) {
                c1271.mo2660("Content-Type: ").mo2660(c0822Mo3259.f2917).write(bArr2);
            }
            long jMo3260 = abstractC2577.mo3260();
            if (jMo3260 != -1) {
                c1271.mo2660("Content-Length: ").mo2699(jMo3260).write(bArr2);
            } else if (z) {
                c1270.m2678();
                return -1L;
            }
            c1271.write(bArr2);
            if (z) {
                j += jMo3260;
            } else {
                abstractC2577.mo3258(c1271);
            }
            c1271.write(bArr2);
            i++;
        }
    }
}
