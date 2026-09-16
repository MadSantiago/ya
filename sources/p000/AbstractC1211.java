package p000;

import android.content.Context;
import android.os.Build;

/* JADX INFO: renamed from: ۥْٖؔۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1211 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C5236 f4185;

    static {
        f4185 = new C5236(1, 0, (30 & 1) == 0, true);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final void m2579(C0843 c0843, InterfaceC3320 interfaceC3320, InterfaceC4448 interfaceC4448, C5362 c5362, int i) {
        int i2;
        c5362.m8979(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c5362.m8963(c0843) : c5362.m8977(c0843) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? c5362.m8963(interfaceC3320) : c5362.m8977(interfaceC3320) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c5362.m8977(interfaceC4448) ? 256 : 128;
        }
        boolean z = false;
        if (c5362.m9011(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && c5362.m8963(interfaceC3320));
            Object objM8999 = c5362.m8999();
            C4036 c4036 = C2850.f9517;
            if (z2 || objM8999 == c4036) {
                objM8999 = new C5820(new C5086(14, new C1225(9, interfaceC3320, interfaceC4448)));
                c5362.m8987(objM8999);
            }
            C5820 c5820 = (C5820) objM8999;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && c5362.m8977(c0843))) {
                z = true;
            }
            Object objM89910 = c5362.m8999();
            if (z || objM89910 == c4036) {
                objM89910 = new C0101(12, c0843);
                c5362.m8987(objM89910);
            }
            AbstractC3026.m5617(c5820, (InterfaceC4448) objM89910, f4185, AbstractC3925.m7034(1315155414, new C4762(6, interfaceC3320, c0843), c5362), c5362, 3456, 0);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0021(i, 7, c0843, interfaceC3320, interfaceC4448);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m2580(final int i, final long j, C5362 c5362, final int i2) {
        final int i3;
        int i4;
        C5863 c5863M8965;
        InterfaceC5731 interfaceC5731;
        c5362.m8979(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = i2 | (c5362.m8988(i3) ? 4 : 2);
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c5362.m8961(j) ? 32 : 16;
        }
        if (c5362.m9011(i4 & 1, (i4 & 19) != 18)) {
            Context context = (Context) c5362.m8997(AbstractC4354.f14355);
            boolean zM8963 = ((i4 & 14) == 4) | c5362.m8963(context);
            Object objM8999 = c5362.m8999();
            Object obj = C2850.f9517;
            if (zM8963 || objM8999 == obj) {
                objM8999 = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                c5362.m8987(objM8999);
            }
            int iIntValue = ((Number) objM8999).intValue();
            if (iIntValue == -1) {
                c5863M8965 = c5362.m8965();
                if (c5863M8965 == null) {
                    return;
                }
                final int i5 = 1;
                interfaceC5731 = new InterfaceC5731() { // from class: ۦٖٜٛ
                    @Override // p000.InterfaceC5731
                    /* JADX INFO: renamed from: ۥۜ */
                    public final Object mo219(Object obj2, Object obj3) {
                        int i6 = i5;
                        C2358 c2358 = C2358.f7817;
                        int i7 = i2;
                        long j2 = j;
                        int i8 = i3;
                        C5362 c5363 = (C5362) obj2;
                        ((Integer) obj3).getClass();
                        switch (i6) {
                            case 0:
                                AbstractC1211.m2580(i8, j2, c5363, AbstractC3831.m6835(i7 | 1));
                                break;
                            default:
                                AbstractC1211.m2580(i8, j2, c5363, AbstractC3831.m6835(i7 | 1));
                                break;
                        }
                        return c2358;
                    }
                };
            } else {
                AbstractC0643 abstractC0643M5131 = AbstractC2765.m5131(iIntValue, c5362);
                boolean z = (i4 & 112) == 32;
                Object objM89910 = c5362.m8999();
                if (z || objM89910 == obj) {
                    objM89910 = j == 16 ? null : new C1516(j, 5);
                    c5362.m8987(objM89910);
                }
                AbstractC1089.m2299(AbstractC4593.m7986(AbstractC4410.m7702(C4217.f13994, AbstractC1773.f5913), abstractC0643M5131, null, C5473.f18060, 0.0f, (C1516) objM89910, 22), c5362, 0);
            }
            c5863M8965.f19365 = interfaceC5731;
        }
        c5362.m8982();
        c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            final int i6 = 0;
            interfaceC5731 = new InterfaceC5731() { // from class: ۦٖٜٛ
                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj2, Object obj3) {
                    int i7 = i6;
                    C2358 c2358 = C2358.f7817;
                    int i8 = i2;
                    long j2 = j;
                    int i9 = i;
                    C5362 c5363 = (C5362) obj2;
                    ((Integer) obj3).getClass();
                    switch (i7) {
                        case 0:
                            AbstractC1211.m2580(i9, j2, c5363, AbstractC3831.m6835(i8 | 1));
                            break;
                        default:
                            AbstractC1211.m2580(i9, j2, c5363, AbstractC3831.m6835(i8 | 1));
                            break;
                    }
                    return c2358;
                }
            };
            c5863M8965.f19365 = interfaceC5731;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m2581(C0843 c0843, C1197 c1197, C5362 c5362, int i) {
        C5362 c5363;
        Context context;
        c5362.m8979(1904307118);
        int i2 = (c5362.m8963(c0843) ? 4 : 2) | i | (c5362.m8977(c1197) ? 32 : 16);
        if (c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                c5362.m8957(-1009482584);
                context = (Context) c5362.m8997(AbstractC4354.f14355);
                c5362.m9009(false);
            } else {
                c5362.m8957(-1009433480);
                c5362.m9009(false);
                context = null;
            }
            boolean zM8977 = c5362.m8977(c1197) | ((i2 & 14) == 4) | c5362.m8977(context);
            Object objM8999 = c5362.m8999();
            if (zM8977 || objM8999 == C2850.f9517) {
                objM8999 = new C3464(c1197, context, c0843, 6);
                c5362.m8987(objM8999);
            }
            c5363 = c5362;
            AbstractC3109.m5690(null, null, (InterfaceC4745) objM8999, c5363, 0, 3);
        } else {
            c5363 = c5362;
            c5363.m8982();
        }
        C5863 c5863M8965 = c5363.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4762(i, 7, c0843, c1197);
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final void m2582(InterfaceC0705 interfaceC0705, C0857 c0857, C5362 c5362, int i) {
        int i2;
        c5362.m8979(1392105195);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (c5362.m8963(interfaceC0705) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m8977(c0857) ? 32 : 16;
        }
        if (c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
            AbstractC0949.m1943(interfaceC0705, AbstractC0405.f1488, c0857, c5362, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C3690(interfaceC0705, c0857, i, i3);
        }
    }
}
