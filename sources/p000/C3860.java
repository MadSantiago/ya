package p000;

/* JADX INFO: renamed from: ۦَۣؖؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3860 implements InterfaceC5876 {

    /* JADX INFO: renamed from: ۥْ */
    public boolean f12889;

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean f12891;

    /* JADX INFO: renamed from: ۦۨ */
    public boolean f12892 = true;

    /* JADX INFO: renamed from: ۥٓ */
    public final C3262 f12890 = new C3262();

    /* JADX WARN: Code duplicated, block: B:18:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0051 A[LOOP:0: B:5:0x000d->B:19:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0054 A[EDGE_INSN: B:23:0x0054->B:20:0x0054 BREAK  A[LOOP:0: B:5:0x000d->B:19:0x0051], SYNTHETIC] */
    /* JADX INFO: renamed from: ۥۣ */
    public final void m6893() {
        C3262 c3262 = this.f12890;
        Object[] objArr = c3262.f10944;
        long[] jArr = c3262.f10948;
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
                            if (obj instanceof C2730) {
                                C2730 c2730 = (C2730) obj;
                                Object[] objArr2 = c2730.f9041;
                                int i4 = c2730.f9040;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    Object obj2 = objArr2[i5];
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        c3262.m6020();
    }
}
