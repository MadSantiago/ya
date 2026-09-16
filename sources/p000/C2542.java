package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۥۡؑۤۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2542 implements InterfaceC1066, Iterable, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥْ */
    public boolean f8487;

    /* JADX INFO: renamed from: ۥٓ */
    public boolean f8488;

    /* JADX INFO: renamed from: ۦ۟ */
    public C0449 f8489;

    /* JADX INFO: renamed from: ۦۨ */
    public final C3262 f8490;

    public C2542() {
        long[] jArr = AbstractC5064.f16815;
        this.f8490 = new C3262();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2542)) {
            return false;
        }
        C2542 c2542 = (C2542) obj;
        return this.f8490.equals(c2542.f8490) && this.f8487 == c2542.f8487 && this.f8488 == c2542.f8488;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8488) + AbstractC5078.m8672(this.f8490.hashCode() * 31, 31, this.f8487);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0449 c0449 = this.f8489;
        if (c0449 == null) {
            c0449 = new C0449(this.f8490);
            this.f8489 = c0449;
        }
        return ((C0304) c0449.entrySet()).iterator();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f8487) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f8488) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        C3262 c3262 = this.f8490;
        Object[] objArr = c3262.f10947;
        Object[] objArr2 = c3262.f10944;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((C3059) obj).f10295);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
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
        return AbstractC2774.m5181(this) + "{ " + ((Object) sb) + " }";
    }

    /* JADX INFO: renamed from: ۥُ */
    public final Object m4771(C3059 c3059) {
        Object objM6027 = this.f8490.m6027(c3059);
        if (objM6027 != null) {
            return objM6027;
        }
        C5028.m8446(c3059, " - consider getOrElse or getOrNull", "Key not present: ");
        return null;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m4772(C2542 c2542) {
        C3262 c3262 = c2542.f8490;
        Object[] objArr = c3262.f10947;
        Object[] objArr2 = c3262.f10944;
        long[] jArr = c3262.f10948;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        C3059 c3059 = (C3059) obj;
                        C3262 c3263 = this.f8490;
                        Object objMo219 = c3059.f10294.mo219(c3263.m6027(c3059), obj2);
                        if (objMo219 != null) {
                            c3263.m6023(c3059, objMo219);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // p000.InterfaceC1066
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo2266(C3059 c3059, Object obj) {
        boolean z = obj instanceof C0078;
        C3262 c3262 = this.f8490;
        if (z && c3262.m6015(c3059)) {
            C0078 c0078 = (C0078) c3262.m6027(c3059);
            C0078 c0079 = (C0078) obj;
            String str = c0079.f14721;
            if (str == null) {
                str = c0078.f14721;
            }
            InterfaceC0400 interfaceC0400 = c0079.f14720;
            if (interfaceC0400 == null) {
                interfaceC0400 = c0078.f14720;
            }
            c3262.m6023(c3059, new C0078(str, interfaceC0400));
        } else {
            c3262.m6023(c3059, obj);
        }
        c3059.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0055 A[LOOP:0: B:5:0x001c->B:15:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0058 A[EDGE_INSN: B:18:0x0058->B:16:0x0058 BREAK  A[LOOP:0: B:5:0x001c->B:15:0x0055], SYNTHETIC] */
    /* JADX INFO: renamed from: ۦؑ */
    public final C2542 m4773() {
        C2542 c2542 = new C2542();
        c2542.f8487 = this.f8487;
        c2542.f8488 = this.f8488;
        C3262 c3262 = this.f8490;
        Object[] objArr = c3262.f10947;
        Object[] objArr2 = c3262.f10944;
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
                            int i4 = (i << 3) + i3;
                            c2542.f8490.m6023(objArr[i4], objArr2[i4]);
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
        return c2542;
    }
}
