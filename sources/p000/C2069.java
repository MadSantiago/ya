package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۥۖؔۨ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2069 implements InterfaceC0814, InterfaceC0770 {

    /* JADX INFO: renamed from: ۥْ */
    public final C3639 f6832;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C5108 f6833;

    /* JADX INFO: renamed from: ۦۨ */
    public final C5762 f6834;

    public C2069(InterfaceC0814 interfaceC0814, Map map, C5108 c5108) {
        C0091 c0091 = new C0091(16, interfaceC0814);
        C4216 c4216 = AbstractC3198.f10737;
        this.f6834 = new C5762(map, c0091);
        this.f6833 = c5108;
        C3639 c3639 = AbstractC5705.f18789;
        this.f6832 = new C3639();
    }

    @Override // p000.InterfaceC0814
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo1712(Object obj) {
        return this.f6834.mo1712(obj);
    }

    @Override // p000.InterfaceC0814
    /* JADX INFO: renamed from: ۥُ */
    public final Object mo1713(String str) {
        return this.f6834.mo1713(str);
    }

    @Override // p000.InterfaceC0770
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo1661(Object obj, C0857 c0857, C5362 c5362, int i) {
        int i2;
        c5362.m8979(-858296452);
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
            this.f6833.mo1661(obj, c0857, c5362, i2 & 126);
            boolean zM8977 = c5362.m8977(this) | c5362.m8977(obj);
            Object objM8999 = c5362.m8999();
            if (zM8977 || objM8999 == C2850.f9517) {
                objM8999 = new C0079(17, this, obj);
                c5362.m8987(objM8999);
            }
            AbstractC3925.m7028(obj, (InterfaceC4745) objM8999, c5362);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0021(i, 9, this, obj, c0857);
        }
    }

    @Override // p000.InterfaceC0814
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC0468 mo1714(String str, InterfaceC4448 interfaceC4448) {
        return this.f6834.mo1714(str, interfaceC4448);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004e A[LOOP:0: B:5:0x000d->B:17:0x004e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0051 A[EDGE_INSN: B:21:0x0051->B:18:0x0051 BREAK  A[LOOP:0: B:5:0x000d->B:17:0x004e], SYNTHETIC] */
    @Override // p000.InterfaceC0814
    /* JADX INFO: renamed from: ۦؑ */
    public final Map mo1715() {
        C3639 c3639 = this.f6832;
        Object[] objArr = c3639.f12174;
        long[] jArr = c3639.f12175;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            C5108 c5108 = this.f6833;
                            if (c5108.f16953.m6026(obj) == null) {
                                c5108.f16954.remove(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.f6834.mo1715();
    }
}
