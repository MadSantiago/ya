package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦٍۡؖٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5484 extends AbstractC2557 {

    /* JADX INFO: renamed from: ۥّ */
    public final C5559 f18091;

    /* JADX INFO: renamed from: ۦۙ */
    public C2127 f18092;

    public C5484(C4545 c4545, C2283 c2283, InterfaceC2880 interfaceC2880) {
        super(c4545, c2283, interfaceC2880);
        this.f18091 = AbstractC1631.m3405(Integer.MAX_VALUE, 0, 6);
    }

    /* JADX INFO: renamed from: ۥُ */
    public static C5256 m9178(C5559 c5559) {
        C5256 c5256 = null;
        C0156 c0156M1924 = AbstractC0949.m1924(new C1294(new C4222(c5559, 1), 0 == true ? 1 : 0, 2));
        while (c0156M1924.hasNext()) {
            C5256 c5256M8892 = (C5256) c0156M1924.next();
            if (c5256 != null) {
                c5256M8892 = c5256.m8892(c5256M8892);
            }
            c5256 = c5256M8892;
        }
        return c5256;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00da, code lost:
    
        if (r16.f8531.mo219(r0, r6) == r10) goto L25;
     */
    /* JADX INFO: renamed from: ۥؗ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m9179(p000.C4545 r17, p000.C5256 r18, p000.AbstractC0772 r19) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5484.m9179(ۦٚؓۧۦ, ۦٟۛۛ, ۥؚؒۥؔ):java.lang.Object");
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean m9180(C5639 c5639) {
        boolean z;
        boolean z2;
        boolean z3;
        C5559 c5559;
        C4545 c4545;
        C3536 c3536 = (C3536) AbstractC0973.m2058(c5639.f18583);
        if (c3536 != null) {
            List list = c3536.f11735;
            if (list == null) {
                list = C2340.f7777;
            }
            int size = list.size();
            int i = 0;
            z3 = false;
            while (true) {
                c5559 = this.f18091;
                c4545 = this.f8532;
                if (i >= size) {
                    break;
                }
                C0545 c0545 = (C0545) list.get(i);
                long j = c0545.f1964 ^ (-9223372034707292160L);
                if (!(c4545.m7873(c4545.m7867(j)) == 0.0f)) {
                    z3 = !(c5559.mo5597(new C5256(j, c0545.f1963, false)) instanceof C1259) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = c3536.f11734 ^ (-9223372034707292160L);
            boolean z4 = c5639.f18581 == 12;
            if (!(c4545.m7873(c4545.m7867(j2)) == 0.0f) || z4) {
                if (!(c5559.mo5597(new C5256(j2, c3536.f11730, z4)) instanceof C1259) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.f8533) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}
