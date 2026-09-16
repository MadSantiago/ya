package p000;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import java.util.Locale;

/* JADX INFO: renamed from: ۦِۖؒۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4893 {

    /* JADX INFO: renamed from: ۥَ */
    public boolean f16113;

    /* JADX INFO: renamed from: ۥّ */
    public Outline f16115;

    /* JADX INFO: renamed from: ۥْ */
    public int f16116;

    /* JADX INFO: renamed from: ۥٖ */
    public long f16118;

    /* JADX INFO: renamed from: ۥۖ */
    public boolean f16119;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC3053 f16122;

    /* JADX INFO: renamed from: ۦؚ */
    public C0935 f16124;

    /* JADX INFO: renamed from: ۦٌ */
    public C0935 f16125;

    /* JADX INFO: renamed from: ۦِ */
    public float f16126;

    /* JADX INFO: renamed from: ۦٕ */
    public RectF f16127;

    /* JADX INFO: renamed from: ۦٗ */
    public long f16128;

    /* JADX INFO: renamed from: ۦۗ */
    public AbstractC3925 f16130;

    /* JADX INFO: renamed from: ۦۚ */
    public boolean f16132;

    /* JADX INFO: renamed from: ۦۛ */
    public long f16133;

    /* JADX INFO: renamed from: ۦ۟ */
    public C0376 f16134;

    /* JADX INFO: renamed from: ۦۨ */
    public C2004 f16135;

    /* JADX INFO: renamed from: ۥۗ */
    public InterfaceC2880 f16120 = AbstractC0186.f684;

    /* JADX INFO: renamed from: ۥؗ */
    public EnumC2459 f16112 = EnumC2459.f8215;

    /* JADX INFO: renamed from: ۦؑ */
    public InterfaceC4745 f16123 = C1931.f6375;

    /* JADX INFO: renamed from: ۥُ */
    public final C2932 f16114 = new C2932(17, this);

    /* JADX INFO: renamed from: ۦۙ */
    public boolean f16131 = true;

    /* JADX INFO: renamed from: ۥۜ */
    public long f16121 = 0;

    /* JADX INFO: renamed from: ۦٛ */
    public long f16129 = 9205357640488583168L;

    /* JADX INFO: renamed from: ۥٓ */
    public final C4752 f16117 = new C4752();

    static {
        Build.FINGERPRINT.toLowerCase(Locale.ROOT).equals("robolectric");
    }

    public C4893(InterfaceC3053 interfaceC3053) {
        this.f16122 = interfaceC3053;
        interfaceC3053.mo1202(false);
        this.f16118 = 0L;
        this.f16128 = 0L;
        this.f16133 = 9205357640488583168L;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[LOOP:0: B:20:0x0059->B:30:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[EDGE_INSN: B:34:0x0099->B:31:0x0099 BREAK  A[LOOP:0: B:20:0x0059->B:30:0x0096], SYNTHETIC] */
    /* JADX INFO: renamed from: ۥؗ */
    public final void m8230(InterfaceC2442 interfaceC2442) {
        C4752 c4752 = this.f16117;
        c4752.f15684 = (C4893) c4752.f15686;
        C3639 c3639 = (C3639) c4752.f15688;
        if (c3639 != null && c3639.m6494()) {
            C3639 c36310 = (C3639) c4752.f15685;
            if (c36310 == null) {
                C3639 c36311 = AbstractC5705.f18789;
                c36310 = new C3639();
                c4752.f15685 = c36310;
            }
            c36310.m6499(c3639);
            c3639.m6493();
        }
        c4752.f15687 = true;
        this.f16123.mo211(interfaceC2442);
        c4752.f15687 = false;
        C4893 c4893 = (C4893) c4752.f15684;
        if (c4893 != null) {
            c4893.f16116--;
            c4893.m8232();
        }
        C3639 c36312 = (C3639) c4752.f15685;
        if (c36312 == null || !c36312.m6494()) {
            return;
        }
        Object[] objArr = c36312.f12174;
        long[] jArr = c36312.f12175;
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
                            C4893 c4894 = (C4893) objArr[(i << 3) + i3];
                            c4894.f16116--;
                            c4894.m8232();
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
        c36312.m6493();
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m8231(long j, long j2, float f) {
        if (C1553.m3306(this.f16121, j) && C3291.m6053(this.f16129, j2) && this.f16126 == f && this.f16124 == null) {
            return;
        }
        this.f16130 = null;
        this.f16124 = null;
        this.f16131 = true;
        this.f16132 = false;
        this.f16121 = j;
        this.f16129 = j2;
        this.f16126 = f;
        m8233();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:0: B:14:0x002d->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:0: B:14:0x002d->B:24:0x006a], SYNTHETIC] */
    /* JADX INFO: renamed from: ۥۗ */
    public final void m8232() {
        if (this.f16113 && this.f16116 == 0) {
            C4752 c4752 = this.f16117;
            C4893 c4893 = (C4893) c4752.f15686;
            if (c4893 != null) {
                c4893.f16116--;
                c4893.m8232();
                c4752.f15686 = null;
            }
            C3639 c3639 = (C3639) c4752.f15688;
            if (c3639 != null) {
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
                                    C4893 c4894 = (C4893) objArr[(i << 3) + i3];
                                    c4894.f16116--;
                                    c4894.m8232();
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
                c3639.m6493();
            }
            this.f16122.mo1228();
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m8233() {
        Outline outline;
        if (this.f16131) {
            boolean z = this.f16119;
            Outline outline2 = null;
            InterfaceC3053 interfaceC3053 = this.f16122;
            if (z || interfaceC3053.mo1213() > 0.0f) {
                C0935 c0935 = this.f16124;
                if (c0935 != null) {
                    RectF rectF = this.f16127;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f16127 = rectF;
                    }
                    boolean z2 = c0935 instanceof C0935;
                    if (!z2) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    Path path = c0935.f3328;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f16115;
                        if (outline == null) {
                            outline = new Outline();
                            this.f16115 = outline;
                        }
                        if (i >= 30) {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setPath(path);
                        } else {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(path);
                        }
                        this.f16132 = !outline.canClip();
                    } else {
                        Outline outline3 = this.f16115;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f16132 = true;
                        outline = null;
                    }
                    this.f16124 = c0935;
                    if (outline != null) {
                        outline.setAlpha(interfaceC3053.mo1208());
                        outline2 = outline;
                    }
                    interfaceC3053.mo1223(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.f16132 && this.f16119) {
                        interfaceC3053.mo1202(false);
                        interfaceC3053.mo1228();
                    } else {
                        interfaceC3053.mo1202(this.f16119);
                    }
                } else {
                    interfaceC3053.mo1202(this.f16119);
                    Outline outline4 = this.f16115;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f16115 = outline4;
                    }
                    Outline outline5 = outline4;
                    long jM9235 = AbstractC5537.m9235(this.f16128);
                    long j = this.f16121;
                    long j2 = this.f16129;
                    if (j2 != 9205357640488583168L) {
                        jM9235 = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (jM9235 >> 32);
                    int i5 = (int) (jM9235 & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i5) + Float.intBitsToFloat(i3)), this.f16126);
                    outline5.setAlpha(interfaceC3053.mo1208());
                    interfaceC3053.mo1223(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i5)))) | (((long) Math.round(Float.intBitsToFloat(i4))) << 32));
                }
            } else {
                interfaceC3053.mo1202(false);
                interfaceC3053.mo1223(null, 0L);
            }
        }
        this.f16131 = false;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC3925 m8234() {
        AbstractC3925 c2490;
        AbstractC3925 abstractC3925 = this.f16130;
        C0935 c0935 = this.f16124;
        if (abstractC3925 != null) {
            return abstractC3925;
        }
        if (c0935 != null) {
            C0889 c0889 = new C0889(c0935);
            this.f16130 = c0889;
            return c0889;
        }
        long jM9235 = AbstractC5537.m9235(this.f16128);
        long j = this.f16121;
        long j2 = this.f16129;
        if (j2 != 9205357640488583168L) {
            jM9235 = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM9235 >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jM9235 & 4294967295L)) + fIntBitsToFloat2;
        float f = this.f16126;
        if (f > 0.0f) {
            c2490 = new C4996(AbstractC1631.m3418(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            c2490 = new C2490(new C2793(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f16130 = c2490;
        return c2490;
    }
}
