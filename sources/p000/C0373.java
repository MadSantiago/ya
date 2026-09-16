package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.view.Display;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۥؔؑۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0373 implements InterfaceC1027, InterfaceC2003, InterfaceC2218, InterfaceC5346, InterfaceC0241, InterfaceC1646 {

    /* JADX INFO: renamed from: ۦ۟ */
    public static C0373 f1385;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f1387;

    /* JADX INFO: renamed from: ۥْ */
    public static final C0373 f1366 = new C0373(1);

    /* JADX INFO: renamed from: ۥٓ */
    public static final C0373 f1367 = new C0373(3);

    /* JADX INFO: renamed from: ۥَ */
    public static final C1078 f1365 = new C1078(8);

    /* JADX INFO: renamed from: ۥٖ */
    public static final /* synthetic */ C0373 f1369 = new C0373(5);

    /* JADX INFO: renamed from: ۦٗ */
    public static final C0373 f1381 = new C0373(6);

    /* JADX INFO: renamed from: ۦۛ */
    public static final C0373 f1383 = new C0373(7);

    /* JADX INFO: renamed from: ۥۖ */
    public static final C0373 f1371 = new C0373(8);

    /* JADX INFO: renamed from: ۦٕ */
    public static final C0373 f1379 = new C0373(9);

    /* JADX INFO: renamed from: ۥٙ */
    public static final C2793 f1370 = new C2793(Float.NaN, Float.NaN, Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: ۥؖ */
    public static final /* synthetic */ C0373 f1363 = new C0373(11);

    /* JADX INFO: renamed from: ۥؓ */
    public static final C0373 f1361 = new C0373(12);

    /* JADX INFO: renamed from: ۥۧ */
    public static final /* synthetic */ C0373 f1374 = new C0373(13);

    /* JADX INFO: renamed from: ۥً */
    public static final C0373 f1364 = new C0373(14);

    /* JADX INFO: renamed from: ۦٚ */
    public static final C0373 f1382 = new C0373(15);

    /* JADX INFO: renamed from: ۥٕ */
    public static final /* synthetic */ C0373 f1368 = new C0373(16);

    /* JADX INFO: renamed from: ۥۙ */
    public static final C0373 f1372 = new C0373(17);

    /* JADX INFO: renamed from: ۦؙ */
    public static final C0373 f1377 = new C0373(18);

    /* JADX INFO: renamed from: ۦؖ */
    public static final C0178 f1375 = new C0178(14);

    /* JADX INFO: renamed from: ۥۦ */
    public static final C0178 f1373 = new C0178(15);

    /* JADX INFO: renamed from: ۦؗ */
    public static final C0178 f1376 = new C0178(16);

    /* JADX INFO: renamed from: ۦُ */
    public static final C0178 f1378 = new C0178(17);

    /* JADX INFO: renamed from: ۦٖ */
    public static final C0373 f1380 = new C0373(20);

    /* JADX INFO: renamed from: ۥؔ */
    public static final C0373 f1362 = new C0373(21);

    /* JADX INFO: renamed from: ۦۜ */
    public static final C0373 f1384 = new C0373(22);

    /* JADX INFO: renamed from: ۦۣ */
    public static final C4871 f1386 = new C4871();

    public C0373() {
        this.f1387 = 27;
        new C2094(16);
        long[] jArr = AbstractC5064.f16815;
        new C3262();
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static C2154 m796(C2917 c2917, C5362 c5362) {
        boolean z;
        C2154 c2154M4178 = c2917.f9751;
        if (c2154M4178 == null) {
            c5362.m8957(390452338);
            c5362.m9009(false);
            c2154M4178 = null;
            z = false;
        } else {
            c5362.m8957(390452339);
            C5480 c5480 = (C5480) c5362.m8997(AbstractC4457.f14701);
            if (AbstractC3831.m6874(c2154M4178.f7108, c5480)) {
                z = false;
            } else {
                c2154M4178 = c2154M4178.m4178(c2154M4178.f7092, c2154M4178.f7089, c2154M4178.f7076, c2154M4178.f7095, c2154M4178.f7079, c2154M4178.f7080, c2154M4178.f7109, c2154M4178.f7091, c2154M4178.f7107, c2154M4178.f7102, c5480, c2154M4178.f7099, c2154M4178.f7100, c2154M4178.f7110, c2154M4178.f7115, c2154M4178.f7113, c2154M4178.f7081, c2154M4178.f7082, c2154M4178.f7078, c2154M4178.f7084, c2154M4178.f7105, c2154M4178.f7111, c2154M4178.f7088, c2154M4178.f7103, c2154M4178.f7086, c2154M4178.f7075, c2154M4178.f7073, c2154M4178.f7094, c2154M4178.f7077, c2154M4178.f7106, c2154M4178.f7083, c2154M4178.f7090, c2154M4178.f7098, c2154M4178.f7096, c2154M4178.f7093, c2154M4178.f7097, c2154M4178.f7101, c2154M4178.f7104, c2154M4178.f7074, c2154M4178.f7112, c2154M4178.f7114, c2154M4178.f7085, c2154M4178.f7087);
                c2917.f9751 = c2154M4178;
                z = false;
            }
            c5362.m9009(z);
        }
        if (c2154M4178 != null) {
            c5362.m8957(-1788515437);
            c5362.m9009(z);
            return c2154M4178;
        }
        c5362.m8957(-1788321191);
        long jM212 = AbstractC0118.m212(c2917, 18);
        long jM213 = AbstractC0118.m212(c2917, 18);
        long jM2826 = C1327.m2826(AbstractC0118.m212(c2917, 18), 0.38f, 14);
        long jM214 = AbstractC0118.m212(c2917, 18);
        long j = C1327.f4592;
        C2154 c2154 = new C2154(jM212, jM213, jM2826, jM214, j, j, j, j, AbstractC0118.m212(c2917, 26), AbstractC0118.m212(c2917, 2), (C5480) c5362.m8997(AbstractC4457.f14701), AbstractC0118.m212(c2917, 26), AbstractC0118.m212(c2917, 24), C1327.m2826(AbstractC0118.m212(c2917, 18), 0.12f, 14), AbstractC0118.m212(c2917, 2), AbstractC0118.m212(c2917, 19), AbstractC0118.m212(c2917, 19), C1327.m2826(AbstractC0118.m212(c2917, 18), 0.38f, 14), AbstractC0118.m212(c2917, 19), AbstractC0118.m212(c2917, 19), AbstractC0118.m212(c2917, 19), C1327.m2826(AbstractC0118.m212(c2917, 18), 0.38f, 14), AbstractC0118.m212(c2917, 2), AbstractC0118.m212(c2917, 26), AbstractC0118.m212(c2917, 19), C1327.m2826(AbstractC0118.m212(c2917, 18), 0.38f, 14), AbstractC0118.m212(c2917, 2), AbstractC0118.m212(c2917, 19), AbstractC0118.m212(c2917, 19), C1327.m2826(AbstractC0118.m212(c2917, 18), 0.38f, 14), AbstractC0118.m212(c2917, 19), AbstractC0118.m212(c2917, 19), AbstractC0118.m212(c2917, 19), C1327.m2826(AbstractC0118.m212(c2917, 18), 0.38f, 14), AbstractC0118.m212(c2917, 2), AbstractC0118.m212(c2917, 19), AbstractC0118.m212(c2917, 19), C1327.m2826(AbstractC0118.m212(c2917, 19), 0.38f, 14), AbstractC0118.m212(c2917, 19), AbstractC0118.m212(c2917, 19), AbstractC0118.m212(c2917, 19), C1327.m2826(AbstractC0118.m212(c2917, 19), 0.38f, 14), AbstractC0118.m212(c2917, 19));
        c2917.f9751 = c2154;
        c5362.m9009(z);
        return c2154;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static synchronized C0373 m797() {
        C0373 c0373;
        c0373 = f1385;
        if (c0373 == null) {
            c0373 = new C0373(0);
            f1385 = c0373;
        }
        return c0373;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static InterfaceC0705 m798(InterfaceC0705 interfaceC0705, C3039 c3039) {
        return interfaceC0705.mo1571(new C5414(c3039));
    }

    public String toString() {
        switch (this.f1387) {
            case 14:
                return "NeverEqualPolicy";
            case 20:
                return "Start";
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0241
    /* JADX INFO: renamed from: ۥؗ */
    public boolean mo502(Object obj, Object obj2) {
        return false;
    }

    /* JADX INFO: renamed from: ۥُ */
    public void m799(Drawable drawable, C5362 c5362, int i) {
        c5362.m8979(257732500);
        int i2 = (c5362.m8977(drawable) ? 4 : 2) | i;
        if (c5362.m9011(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC0705 interfaceC0705M7702 = AbstractC4410.m7702(C4217.f13994, AbstractC1773.f5913);
            boolean zM8977 = c5362.m8977(drawable);
            Object objM8999 = c5362.m8999();
            if (zM8977 || objM8999 == C2850.f9517) {
                objM8999 = new C4884(17, drawable);
                c5362.m8987(objM8999);
            }
            AbstractC1089.m2299(AbstractC1434.m3037(interfaceC0705M7702, (InterfaceC4745) objM8999), c5362, 0);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4762(i, 16, this, drawable);
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public void m800(final Icon icon, C5362 c5362, final int i) {
        C5863 c5863M8965;
        InterfaceC5731 interfaceC5731;
        c5362.m8979(2116504409);
        int i2 = (c5362.m8977(icon) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) c5362.m8997(AbstractC4354.f14355);
            boolean zM8963 = c5362.m8963(icon) | c5362.m8963(context);
            Object objM8999 = c5362.m8999();
            if (zM8963 || objM8999 == C2850.f9517) {
                objM8999 = icon.loadDrawable(context);
                c5362.m8987(objM8999);
            }
            Drawable drawable = (Drawable) objM8999;
            if (drawable == null) {
                c5863M8965 = c5362.m8965();
                if (c5863M8965 == null) {
                    return;
                } else {
                    interfaceC5731 = new InterfaceC5731(this, icon, i, i3) { // from class: ۥٕؔؕۦ

                        /* JADX INFO: renamed from: ۥْ */
                        public final /* synthetic */ Icon f4804;

                        /* JADX INFO: renamed from: ۦ۟ */
                        public final /* synthetic */ C0373 f4805;

                        /* JADX INFO: renamed from: ۦۨ */
                        public final /* synthetic */ int f4806;

                        {
                            this.f4806 = i3;
                            this.f4805 = this;
                        }

                        @Override // p000.InterfaceC5731
                        /* JADX INFO: renamed from: ۥۜ */
                        public final Object mo219(Object obj, Object obj2) {
                            int i5 = this.f4806;
                            C2358 c2358 = C2358.f7817;
                            Icon icon2 = this.f4804;
                            C0373 c0373 = this.f4805;
                            C5362 c5363 = (C5362) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    c0373.m800(icon2, c5363, AbstractC3831.m6835(49));
                                    break;
                                default:
                                    c0373.m800(icon2, c5363, AbstractC3831.m6835(49));
                                    break;
                            }
                            return c2358;
                        }
                    };
                }
            } else {
                m799(drawable, c5362, 48);
            }
            c5863M8965.f19365 = interfaceC5731;
        }
        c5362.m8982();
        c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            interfaceC5731 = new InterfaceC5731(this, icon, i, i4) { // from class: ۥٕؔؕۦ

                /* JADX INFO: renamed from: ۥْ */
                public final /* synthetic */ Icon f4804;

                /* JADX INFO: renamed from: ۦ۟ */
                public final /* synthetic */ C0373 f4805;

                /* JADX INFO: renamed from: ۦۨ */
                public final /* synthetic */ int f4806;

                {
                    this.f4806 = i4;
                    this.f4805 = this;
                }

                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    int i5 = this.f4806;
                    C2358 c2358 = C2358.f7817;
                    Icon icon2 = this.f4804;
                    C0373 c0373 = this.f4805;
                    C5362 c5363 = (C5362) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            c0373.m800(icon2, c5363, AbstractC3831.m6835(49));
                            break;
                        default:
                            c0373.m800(icon2, c5363, AbstractC3831.m6835(49));
                            break;
                    }
                    return c2358;
                }
            };
            c5863M8965.f19365 = interfaceC5731;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void m801(final String str, final InterfaceC5731 interfaceC5731, final boolean z, final boolean z2, final C2316 c2316, final C2243 c2243, final InterfaceC5731 interfaceC5732, final C2154 c2154, InterfaceC1291 interfaceC1291, final C0857 c0857, C5362 c5362, final int i) {
        int i2;
        boolean z3;
        boolean z4;
        Object obj;
        final InterfaceC1291 interfaceC1292;
        InterfaceC1291 c1393;
        int i3;
        c5362.m8979(-1732281618);
        if ((i & 6) == 0) {
            i2 = (c5362.m8963(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m8977(interfaceC5731) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z3 = z;
            i2 |= c5362.m9006(z3) ? 256 : 128;
        } else {
            z3 = z;
        }
        if ((i & 3072) == 0) {
            z4 = z2;
            i2 |= c5362.m9006(z4) ? 2048 : 1024;
        } else {
            z4 = z2;
        }
        if ((i & 24576) == 0) {
            obj = c2316;
            i2 |= c5362.m8963(obj) ? 16384 : 8192;
        } else {
            obj = c2316;
        }
        if ((i & 196608) == 0) {
            i2 |= c5362.m8963(c2243) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= c5362.m9006(false) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= c5362.m8977(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= c5362.m8977(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= c5362.m8977(null) ? 536870912 : 268435456;
        }
        int i4 = 14155776 | (c5362.m8977(interfaceC5732) ? 4 : 2) | (c5362.m8977(null) ? 32 : 16) | (c5362.m8977(null) ? 256 : 128) | (c5362.m8977(null) ? 2048 : 1024) | (c5362.m8963(c2154) ? 16384 : 8192) | 65536;
        if (c5362.m9011(i2 & 1, ((306783379 & i2) == 306783378 && (4793491 & i4) == 4793490) ? false : true)) {
            c5362.m8971();
            if ((i & 1) == 0 || c5362.m8969()) {
                c1393 = new C1393(16.0f, 16.0f, 16.0f, 16.0f);
                i3 = i4 & (-458753);
            } else {
                c5362.m8982();
                i3 = i4 & (-458753);
                c1393 = interfaceC1291;
            }
            c5362.m8964();
            boolean z5 = ((i2 & 14) == 4) | ((i2 & 57344) == 16384);
            Object objM8999 = c5362.m8999();
            if (z5 || objM8999 == C2850.f9517) {
                C1249 c1249 = new C1249(str);
                obj.getClass();
                objM8999 = new C3263(c1249, C2980.f10014);
                c5362.m8987(objM8999);
            }
            String str2 = ((C3263) objM8999).f10951.f4307;
            C3176 c3176 = new C3176();
            c5362.m8957(1927058812);
            c5362.m9009(false);
            int i5 = i2 >> 9;
            int i6 = i3 << 21;
            int i7 = ((i3 >> 9) & 14) | ((i2 >> 6) & 112) | (i2 & 896) | (i5 & 7168) | ((i2 >> 3) & 57344) | ((i3 << 6) & 3670016) | 12582912;
            boolean z6 = z3;
            boolean z7 = z4;
            InterfaceC1291 interfaceC1293 = c1393;
            AbstractC0487.m1057(str2, interfaceC5731, c3176, null, interfaceC5732, z7, z6, c2243, interfaceC1293, c2154, c0857, c5362, ((i2 << 3) & 896) | 6 | (i5 & 458752) | (i5 & 3670016) | (i6 & 29360128) | (i6 & 234881024) | (i6 & 1879048192), i7);
            interfaceC1292 = interfaceC1293;
        } else {
            c5362.m8982();
            interfaceC1292 = interfaceC1291;
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731() { // from class: ۥۣؗؓۜ
                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    this.f2219.m801(str, interfaceC5731, z, z2, c2316, c2243, interfaceC5732, c2154, interfaceC1292, c0857, (C5362) obj2, AbstractC3831.m6835(i | 1));
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0176  */
    /* JADX WARN: Code duplicated, block: B:104:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:110:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:113:0x0209  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x011a  */
    /* JADX WARN: Code duplicated, block: B:87:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x011f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0122  */
    /* JADX WARN: Code duplicated, block: B:92:0x012c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0145  */
    /* JADX WARN: Code duplicated, block: B:96:0x015f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0167  */
    /* JADX WARN: Code duplicated, block: B:99:0x016a  */
    /* JADX INFO: renamed from: ۥۣ */
    public void m802(final boolean z, final C2243 c2243, InterfaceC0705 interfaceC0705, final C2154 c2154, final InterfaceC2864 interfaceC2864, float f, float f2, C5362 c5362, final int i, final int i2) {
        InterfaceC0705 interfaceC0706;
        int i3;
        int i4;
        int i5;
        float f3;
        float f4;
        boolean z2;
        final InterfaceC0705 interfaceC0707;
        final float f5;
        final float f6;
        C5863 c5863M8965;
        InterfaceC0705 interfaceC0708;
        float f7;
        int i6;
        float f8;
        boolean zBooleanValue;
        long j;
        C0969 c0969M4817;
        float f9;
        InterfaceC5372 interfaceC5372M5175;
        C0969 c0969M4818;
        float f10;
        InterfaceC5372 interfaceC5372M5176;
        long j2;
        float f11;
        c5362.m8979(1035477640);
        int i7 = (c5362.m9006(z) ? 4 : 2) | i | (c5362.m9006(false) ? 32 : 16) | (c5362.m8963(c2243) ? 256 : 128);
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                interfaceC0706 = interfaceC0705;
                i7 |= c5362.m8963(interfaceC0706) ? 2048 : 1024;
            }
            if (c5362.m8963(c2154)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            int i9 = i7 | i3;
            if (c5362.m8963(interfaceC2864)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i5 = i9 | i4;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    f3 = f;
                    int i10 = c5362.m8956(f3) ? 1048576 : 524288;
                    i5 |= i10;
                } else {
                    f3 = f;
                }
                i5 |= i10;
            } else {
                f3 = f;
            }
            if ((12582912 & i) == 0) {
                if ((i2 & 128) == 0) {
                    f4 = f2;
                    int i11 = c5362.m8956(f4) ? 8388608 : 4194304;
                    i5 |= i11;
                } else {
                    f4 = f2;
                }
                i5 |= i11;
            } else {
                f4 = f2;
            }
            if ((38347923 & i5) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c5362.m9011(i5 & 1, z2)) {
                c5362.m8971();
                if ((i & 1) != 0 || c5362.m8969()) {
                    if (i8 != 0) {
                        interfaceC0708 = C4217.f13994;
                    } else {
                        interfaceC0708 = interfaceC0706;
                    }
                    if ((i2 & 64) != 0) {
                        i5 &= -3670017;
                        f7 = 2.0f;
                    } else {
                        f7 = f3;
                    }
                    if ((i2 & 128) != 0) {
                        InterfaceC0705 interfaceC0709 = interfaceC0708;
                        i6 = i5 & (-29360129);
                        interfaceC0707 = interfaceC0709;
                        f8 = f7;
                        f4 = 1.0f;
                    } else {
                        InterfaceC0705 interfaceC07010 = interfaceC0708;
                        i6 = i5;
                        interfaceC0707 = interfaceC07010;
                        f8 = f7;
                    }
                } else {
                    c5362.m8982();
                    if ((i2 & 64) != 0) {
                        i5 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        i5 &= -29360129;
                    }
                    i6 = i5;
                    interfaceC0707 = interfaceC0706;
                    f8 = f3;
                }
                c5362.m8964();
                zBooleanValue = ((Boolean) AbstractC0186.m433(c2243, c5362, (i6 >> 6) & 14).getValue()).booleanValue();
                if (!z) {
                    j = c2154.f7110;
                } else if (zBooleanValue) {
                    j = c2154.f7099;
                } else {
                    j = c2154.f7100;
                }
                c0969M4817 = AbstractC2552.m4817(5, c5362);
                if (z) {
                    c5362.m8957(-1674507999);
                    f9 = f4;
                    interfaceC5372M5175 = AbstractC2214.m4275(j, c0969M4817, null, c5362, 0, 12);
                    c5362.m9009(false);
                } else {
                    f9 = f4;
                    c5362.m8957(-1674427244);
                    interfaceC5372M5175 = AbstractC2774.m5175(new C1327(j), c5362);
                    c5362.m9009(false);
                }
                c0969M4818 = AbstractC2552.m4817(2, c5362);
                if (z) {
                    c5362.m8957(-1674245832);
                    if (zBooleanValue) {
                        f11 = f8;
                    } else {
                        f11 = f9;
                    }
                    interfaceC5372M5176 = AbstractC1152.m2409(f11, c0969M4818, c5362);
                    c5362.m9009(false);
                    f10 = f9;
                } else {
                    c5362.m8957(-1674063769);
                    f10 = f9;
                    interfaceC5372M5176 = AbstractC2774.m5175(new C4497(f10), c5362);
                    c5362.m9009(false);
                }
                InterfaceC4367 interfaceC4367M5175 = AbstractC2774.m5175(new C3966(((C4497) interfaceC5372M5176.getValue()).f14871, new C0547(((C1327) interfaceC5372M5175.getValue()).f4595)), c5362);
                if (!z) {
                    j2 = c2154.f7109;
                } else if (zBooleanValue) {
                    j2 = c2154.f7079;
                } else {
                    j2 = c2154.f7080;
                }
                InterfaceC5372 interfaceC5372M4275 = AbstractC2214.m4275(j2, AbstractC2552.m4817(5, c5362), null, c5362, 0, 12);
                C3966 c3966 = (C3966) interfaceC4367M5175.getValue();
                AbstractC1089.m2299(AbstractC1434.m3034(interfaceC0707.mo1571(new C4860(c3966.f13263, c3966.f13262, interfaceC2864)), new C1708(8, interfaceC2864, new C4505(new C2589(0, 3, InterfaceC5372.class, interfaceC5372M4275, "value", "getValue()Ljava/lang/Object;")))), c5362, 0);
                f6 = f10;
                f5 = f8;
            } else {
                c5362.m8982();
                interfaceC0707 = interfaceC0706;
                f5 = f3;
                f6 = f4;
            }
            c5863M8965 = c5362.m8965();
            if (c5863M8965 != null) {
                c5863M8965.f19365 = new InterfaceC5731() { // from class: ۦؚّؗۢ
                    @Override // p000.InterfaceC5731
                    /* JADX INFO: renamed from: ۥۜ */
                    public final Object mo219(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        this.f12088.m802(z, c2243, interfaceC0707, c2154, interfaceC2864, f5, f6, (C5362) obj, AbstractC3831.m6835(i | 1), i2);
                        return C2358.f7817;
                    }
                };
            }
        }
        i7 |= 3072;
        interfaceC0706 = interfaceC0705;
        if (c5362.m8963(c2154)) {
            i3 = 16384;
        } else {
            i3 = 8192;
        }
        int i12 = i7 | i3;
        if (c5362.m8963(interfaceC2864)) {
            i4 = 131072;
        } else {
            i4 = 65536;
        }
        i5 = i12 | i4;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                f3 = f;
                if (c5362.m8956(f3)) {
                }
                i5 |= i10;
            } else {
                f3 = f;
            }
            i5 |= i10;
        } else {
            f3 = f;
        }
        if ((12582912 & i) == 0) {
            if ((i2 & 128) == 0) {
                f4 = f2;
                if (c5362.m8956(f4)) {
                }
                i5 |= i11;
            } else {
                f4 = f2;
            }
            i5 |= i11;
        } else {
            f4 = f2;
        }
        if ((38347923 & i5) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c5362.m9011(i5 & 1, z2)) {
            c5362.m8971();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    interfaceC0708 = C4217.f13994;
                } else {
                    interfaceC0708 = interfaceC0706;
                }
                if ((i2 & 64) != 0) {
                    i5 &= -3670017;
                    f7 = 2.0f;
                } else {
                    f7 = f3;
                }
                if ((i2 & 128) != 0) {
                    InterfaceC0705 interfaceC07011 = interfaceC0708;
                    i6 = i5 & (-29360129);
                    interfaceC0707 = interfaceC07011;
                    f8 = f7;
                    f4 = 1.0f;
                } else {
                    InterfaceC0705 interfaceC07012 = interfaceC0708;
                    i6 = i5;
                    interfaceC0707 = interfaceC07012;
                    f8 = f7;
                }
            } else {
                if (i8 != 0) {
                    interfaceC0708 = C4217.f13994;
                } else {
                    interfaceC0708 = interfaceC0706;
                }
                if ((i2 & 64) != 0) {
                    i5 &= -3670017;
                    f7 = 2.0f;
                } else {
                    f7 = f3;
                }
                if ((i2 & 128) != 0) {
                    InterfaceC0705 interfaceC07013 = interfaceC0708;
                    i6 = i5 & (-29360129);
                    interfaceC0707 = interfaceC07013;
                    f8 = f7;
                    f4 = 1.0f;
                } else {
                    InterfaceC0705 interfaceC07014 = interfaceC0708;
                    i6 = i5;
                    interfaceC0707 = interfaceC07014;
                    f8 = f7;
                }
            }
            c5362.m8964();
            zBooleanValue = ((Boolean) AbstractC0186.m433(c2243, c5362, (i6 >> 6) & 14).getValue()).booleanValue();
            if (!z) {
                j = c2154.f7110;
            } else if (zBooleanValue) {
                j = c2154.f7099;
            } else {
                j = c2154.f7100;
            }
            c0969M4817 = AbstractC2552.m4817(5, c5362);
            if (z) {
                c5362.m8957(-1674507999);
                f9 = f4;
                interfaceC5372M5175 = AbstractC2214.m4275(j, c0969M4817, null, c5362, 0, 12);
                c5362.m9009(false);
            } else {
                f9 = f4;
                c5362.m8957(-1674427244);
                interfaceC5372M5175 = AbstractC2774.m5175(new C1327(j), c5362);
                c5362.m9009(false);
            }
            c0969M4818 = AbstractC2552.m4817(2, c5362);
            if (z) {
                c5362.m8957(-1674245832);
                if (zBooleanValue) {
                    f11 = f8;
                } else {
                    f11 = f9;
                }
                interfaceC5372M5176 = AbstractC1152.m2409(f11, c0969M4818, c5362);
                c5362.m9009(false);
                f10 = f9;
            } else {
                c5362.m8957(-1674063769);
                f10 = f9;
                interfaceC5372M5176 = AbstractC2774.m5175(new C4497(f10), c5362);
                c5362.m9009(false);
            }
            InterfaceC4367 interfaceC4367M5176 = AbstractC2774.m5175(new C3966(((C4497) interfaceC5372M5176.getValue()).f14871, new C0547(((C1327) interfaceC5372M5175.getValue()).f4595)), c5362);
            if (!z) {
                j2 = c2154.f7109;
            } else if (zBooleanValue) {
                j2 = c2154.f7079;
            } else {
                j2 = c2154.f7080;
            }
            InterfaceC5372 interfaceC5372M4276 = AbstractC2214.m4275(j2, AbstractC2552.m4817(5, c5362), null, c5362, 0, 12);
            C3966 c3967 = (C3966) interfaceC4367M5176.getValue();
            AbstractC1089.m2299(AbstractC1434.m3034(interfaceC0707.mo1571(new C4860(c3967.f13263, c3967.f13262, interfaceC2864)), new C1708(8, interfaceC2864, new C4505(new C2589(0, 3, InterfaceC5372.class, interfaceC5372M4276, "value", "getValue()Ljava/lang/Object;")))), c5362, 0);
            f6 = f10;
            f5 = f8;
        } else {
            c5362.m8982();
            interfaceC0707 = interfaceC0706;
            f5 = f3;
            f6 = f4;
        }
        c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731() { // from class: ۦؚّؗۢ
                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f12088.m802(z, c2243, interfaceC0707, c2154, interfaceC2864, f5, f6, (C5362) obj, AbstractC3831.m6835(i | 1), i2);
                    return C2358.f7817;
                }
            };
        }
    }

    @Override // p000.InterfaceC1646
    /* JADX INFO: renamed from: ۦؑ */
    public byte[] mo803(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // p000.InterfaceC5346
    /* JADX INFO: renamed from: ۦٌ */
    public Object mo400(C2813 c2813) {
        return AbstractC4489.m7819((Executor) c2813.mo5376(new C1166(InterfaceC3171.class, Executor.class)));
    }

    @Override // p000.InterfaceC2003
    /* JADX INFO: renamed from: ۦِ */
    public Object mo804(Object obj) {
        return (AbstractC2978) obj;
    }

    @Override // p000.InterfaceC1027
    /* JADX INFO: renamed from: ۦٛ */
    public Rect mo805(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
                return rect;
            }
            int i2 = rect.right + dimensionPixelSize;
            if (i2 == point.x) {
                rect.right = i2;
            }
        }
        return rect;
    }

    public /* synthetic */ C0373(int i) {
        this.f1387 = i;
    }
}
