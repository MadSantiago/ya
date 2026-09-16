package p000;

import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥٕؖۦ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1418 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final long f4882 = AbstractC3801.m6753(0.5f, 0.0f);

    /* JADX INFO: renamed from: ۥؗ */
    public static final void m3014(final long j, final InterfaceC4448 interfaceC4448, final boolean z, C5362 c5362, final int i) {
        c5362.m8979(-391613911);
        int i2 = 2;
        int i3 = i | (c5362.m8961(j) ? 4 : 2) | (c5362.m8977(interfaceC4448) ? 32 : 16) | (c5362.m9006(z) ? 256 : 128) | (c5362.m9006(true) ? 2048 : 1024);
        if (!c5362.m9011(i3 & 1, (i3 & 1171) != 1170)) {
            c5362.m8982();
        } else if (j != 16) {
            c5362.m8957(-1438582326);
            float f = z ? 1.0f : 0.0f;
            C0969 c0969M4817 = AbstractC2552.m4817(4, c5362);
            C0969 c0969 = AbstractC1152.f4005;
            C4036 c4036 = C2850.f9517;
            if (c0969M4817 == c0969) {
                c5362.m8957(1144115775);
                boolean zM8956 = c5362.m8956(0.01f);
                Object objM8999 = c5362.m8999();
                if (zM8956 || objM8999 == c4036) {
                    objM8999 = AbstractC4489.m7811(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                    c5362.m8987(objM8999);
                }
                c0969M4817 = (C0969) objM8999;
                c5362.m9009(false);
            } else {
                c5362.m8957(1144225701);
                c5362.m9009(false);
            }
            InterfaceC5372 interfaceC5372M2408 = AbstractC1152.m2408(Float.valueOf(f), AbstractC3831.f12709, c0969M4817, null, "FloatAnimation", c5362, 0, 0);
            String strM9268 = AbstractC5537.m9268(R.string.close_sheet, c5362);
            c5362.m8957(-1438283579);
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object objM89910 = c5362.m8999();
            if (z2 || objM89910 == c4036) {
                objM89910 = new C5410(i2, interfaceC4448);
                c5362.m8987(objM89910);
            }
            InterfaceC0705 interfaceC0705M5588 = AbstractC2995.m5588(C4217.f13994, interfaceC4448, (PointerInputEventHandler) objM89910);
            boolean zM8963 = (i4 == 32) | c5362.m8963(strM9268);
            Object objM89911 = c5362.m8999();
            if (zM8963 || objM89911 == c4036) {
                objM89911 = new C0079(21, strM9268, interfaceC4448);
                c5362.m8987(objM89911);
            }
            InterfaceC0705 interfaceC0705M3510 = AbstractC1697.m3510(interfaceC0705M5588, true, (InterfaceC4745) objM89911);
            c5362.m9009(false);
            InterfaceC0705 interfaceC0705Mo1571 = AbstractC4410.f14520.mo1571(interfaceC0705M3510);
            boolean zM8964 = c5362.m8963(interfaceC5372M2408) | ((i3 & 14) == 4);
            Object objM89912 = c5362.m8999();
            if (zM8964 || objM89912 == c4036) {
                objM89912 = new C2066(i2, j, interfaceC5372M2408);
                c5362.m8987(objM89912);
            }
            AbstractC4009.m7165(interfaceC0705Mo1571, (InterfaceC4745) objM89912, c5362, 0);
            c5362.m9009(false);
        } else {
            c5362.m8957(-1437676103);
            c5362.m9009(false);
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731(j, interfaceC4448, z, i) { // from class: ۥٌٙؖۖ

                /* JADX INFO: renamed from: ۥْ */
                public final /* synthetic */ boolean f5579;

                /* JADX INFO: renamed from: ۦ۟ */
                public final /* synthetic */ InterfaceC4448 f5580;

                /* JADX INFO: renamed from: ۦۨ */
                public final /* synthetic */ long f5581;

                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM6835 = AbstractC3831.m6835(1);
                    AbstractC1418.m3014(this.f5581, this.f5580, this.f5579, (C5362) obj, iM6835);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final float m3015(C1117 c1117, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c1117.f3916 & 4294967295L));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (AbstractC4593.m7993(0.0f, Math.min(c1117.f3915.mo746() * 24.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final C1705 m3016(C5362 c5362, int i, int i2) {
        final int i3 = 1;
        final int i4 = 0;
        final boolean z = (i2 & 1) == 0;
        Object objM8999 = c5362.m8999();
        Object obj = C2850.f9517;
        Object obj2 = objM8999;
        if (objM8999 == obj) {
            Object c4618 = new C4618(21);
            c5362.m8987(c4618);
            obj2 = c4618;
        }
        final InterfaceC4745 interfaceC4745 = (InterfaceC4745) obj2;
        int i5 = (i & 14) | 384;
        C0380 c0380 = AbstractC2762.f9144;
        final InterfaceC2880 interfaceC2880 = (InterfaceC2880) c5362.m8997(AbstractC2853.f9544);
        boolean zM8963 = c5362.m8963(interfaceC2880) | c5362.m8956(56.0f);
        Object objM89910 = c5362.m8999();
        Object obj3 = objM89910;
        if (zM8963 || objM89910 == obj) {
            Object obj4 = new InterfaceC4448() { // from class: ۦؗؗؗۡ
                @Override // p000.InterfaceC4448
                /* JADX INFO: renamed from: ۥۣ */
                public final Object mo449() {
                    float fMo741;
                    int i6 = i4;
                    InterfaceC2880 interfaceC2881 = interfaceC2880;
                    switch (i6) {
                        case 0:
                            fMo741 = interfaceC2881.mo741(56.0f);
                            break;
                        default:
                            fMo741 = interfaceC2881.mo741(125.0f);
                            break;
                    }
                    return Float.valueOf(fMo741);
                }
            };
            c5362.m8987(obj4);
            obj3 = obj4;
        }
        final InterfaceC4448 interfaceC4448 = (InterfaceC4448) obj3;
        boolean zM8964 = c5362.m8963(interfaceC2880) | c5362.m8956(125.0f);
        Object objM89911 = c5362.m8999();
        Object obj5 = objM89911;
        if (zM8964 || objM89911 == obj) {
            Object obj6 = new InterfaceC4448() { // from class: ۦؗؗؗۡ
                @Override // p000.InterfaceC4448
                /* JADX INFO: renamed from: ۥۣ */
                public final Object mo449() {
                    float fMo741;
                    int i6 = i3;
                    InterfaceC2880 interfaceC2881 = interfaceC2880;
                    switch (i6) {
                        case 0:
                            fMo741 = interfaceC2881.mo741(56.0f);
                            break;
                        default:
                            fMo741 = interfaceC2881.mo741(125.0f);
                            break;
                    }
                    return Float.valueOf(fMo741);
                }
            };
            c5362.m8987(obj6);
            obj5 = obj6;
        }
        final InterfaceC4448 interfaceC4449 = (InterfaceC4448) obj5;
        Object[] objArr = {Boolean.valueOf(z), interfaceC4745, Boolean.FALSE};
        C2346 c2346 = new C2346(7, new C5338(8), new C3316(z, interfaceC4448, interfaceC4449, interfaceC4745));
        if ((((i5 & 14) ^ 6) <= 4 || !c5362.m9006(z)) && (i5 & 6) != 4) {
            i3 = 0;
        }
        boolean z2 = ((((c5362.m8963(interfaceC4448) ? 1 : 0) | i3) | (c5362.m8963(interfaceC4449) ? 1 : 0)) == true ? 1 : 0) | (c5362.m8963(interfaceC4745) ? 1 : 0) | (c5362.m9006(false) ? 1 : 0);
        Object objM89912 = c5362.m8999();
        if (z2 || objM89912 == obj) {
            final EnumC0845 enumC0845 = EnumC0845.f3016;
            Object obj7 = new InterfaceC4448() { // from class: ۦًُؓٗ
                @Override // p000.InterfaceC4448
                /* JADX INFO: renamed from: ۥۣ */
                public final Object mo449() {
                    return new C1705(z, interfaceC4448, interfaceC4449, enumC0845, interfaceC4745);
                }
            };
            c5362.m8987(obj7);
            objM89912 = obj7;
        }
        return (C1705) AbstractC5378.m9036(objArr, c2346, (InterfaceC4448) objM89912, c5362, 0);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m3017(final C5825 c5825, final InterfaceC4643 interfaceC4643, final InterfaceC4448 interfaceC4448, final InterfaceC4745 interfaceC4745, final InterfaceC0705 interfaceC0705, final C1705 c1705, final float f, final boolean z, final InterfaceC2864 interfaceC2864, final long j, final long j2, final float f2, final C0857 c0857, final InterfaceC5731 interfaceC5731, final C0857 c0858, C5362 c5362, final int i) {
        c5362.m8979(-37400432);
        int i2 = i | (c5362.m8977(c5825) ? 32 : 16) | (c5362.m8977(interfaceC4643) ? 256 : 128) | (c5362.m8977(interfaceC4448) ? 2048 : 1024) | (c5362.m8977(interfaceC4745) ? 16384 : 8192) | (c5362.m8963(interfaceC0705) ? 131072 : 65536) | (c5362.m8963(c1705) ? 1048576 : 524288) | (c5362.m8956(f) ? 8388608 : 4194304) | (c5362.m9006(z) ? 67108864 : 33554432) | (c5362.m8963(interfaceC2864) ? 536870912 : 268435456);
        int i3 = (c5362.m8961(j) ? 4 : 2) | (c5362.m8961(j2) ? 32 : 16) | (c5362.m8956(f2) ? 256 : 128) | (c5362.m8977(c0857) ? 2048 : 1024) | (c5362.m8977(interfaceC5731) ? 16384 : 8192) | (c5362.m8977(c0858) ? 131072 : 65536);
        if (c5362.m9011(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 74899) == 74898) ? false : true)) {
            c5362.m8971();
            if ((i & 1) != 0 && !c5362.m8969()) {
                c5362.m8982();
            }
            c5362.m8964();
            String strM9268 = AbstractC5537.m9268(R.string.m3c_bottom_sheet_pane_title, c5362);
            InterfaceC0705 interfaceC0705Mo1571 = AbstractC4410.m7711(C0373.m798(interfaceC0705, C1298.f4428), f).mo1571(AbstractC4410.f14521);
            InterfaceC0705 interfaceC0705M7079 = C4217.f13994;
            Object obj = C2850.f9517;
            if (z) {
                c5362.m8957(-1582035383);
                boolean z2 = (((i2 & 3670016) ^ 1572864) > 1048576 && c5362.m8963(c1705)) || (i2 & 1572864) == 1048576;
                Object objM8999 = c5362.m8999();
                if (z2 || objM8999 == obj) {
                    C0380 c0380 = AbstractC2762.f9144;
                    objM8999 = new C5819(c1705, interfaceC4745);
                    c5362.m8987(objM8999);
                }
                interfaceC0705M7079 = AbstractC3933.m7079(interfaceC0705M7079, (InterfaceC3028) objM8999, null);
                c5362.m9009(false);
            } else {
                c5362.m8957(-1582020872);
                c5362.m9009(false);
            }
            InterfaceC0705 interfaceC0705Mo1572 = interfaceC0705Mo1571.mo1571(interfaceC0705M7079);
            C4536 c4536 = c1705.f5675;
            C4536 c4537 = c1705.f5675;
            int i4 = (i2 & 3670016) ^ 1572864;
            boolean z3 = (i4 > 1048576 && c5362.m8963(c1705)) || (i2 & 1572864) == 1048576;
            Object objM89910 = c5362.m8999();
            boolean z4 = z3;
            int i5 = 13;
            if (z4 || objM89910 == obj) {
                objM89910 = new C4164(i5, c1705);
                c5362.m8987(objM89910);
            }
            InterfaceC0705 interfaceC0705M5799 = C3133.m5799(interfaceC0705Mo1572, c4536, (InterfaceC5731) objM89910);
            C0861 c0861 = c4537.f14989;
            boolean z5 = z && c1705.m3525();
            boolean z6 = c4537.f14998.getValue() != null;
            boolean z7 = (i2 & 57344) == 16384;
            Object objM89911 = c5362.m8999();
            if (z7 || objM89911 == obj) {
                objM89911 = new C3449(interfaceC4745, null);
                c5362.m8987(objM89911);
            }
            InterfaceC0705 interfaceC0705M4640 = AbstractC2481.m4640(interfaceC0705M5799, c0861, z5, z6, (InterfaceC2609) objM89911, 168);
            boolean zM8963 = c5362.m8963(strM9268);
            Object objM89912 = c5362.m8999();
            if (zM8963 || objM89912 == obj) {
                objM89912 = new C3203(5, strM9268);
                c5362.m8987(objM89912);
            }
            InterfaceC0705 interfaceC0705M3510 = AbstractC1697.m3510(interfaceC0705M4640, false, (InterfaceC4745) objM89912);
            int iM1711 = (int) c4537.f14997.m1711();
            if (iM1711 < 0) {
                iM1711 = 0;
            }
            InterfaceC0705 interfaceC0705M9357 = AbstractC5568.m9357(interfaceC0705M3510, AbstractC4225.m7442(iM1711, 13));
            boolean z8 = ((i4 > 1048576 && c5362.m8963(c1705)) || (i2 & 1572864) == 1048576) | ((i2 & 112) == 32 || c5362.m8977(c5825));
            Object objM89913 = c5362.m8999();
            if (z8 || objM89913 == obj) {
                objM89913 = new C0079(22, c1705, c5825);
                c5362.m8987(objM89913);
            }
            int i6 = i3 << 6;
            AbstractC0701.m1560(AbstractC4554.m7887(AbstractC4554.m7887(interfaceC0705M9357, (InterfaceC4745) objM89913), new C3083(c1705, 0)), interfaceC2864, j, j2, f2, 0.0f, AbstractC3925.m7034(728743275, new C1743(interfaceC5731, c5825, c1705, c0857, c0858, interfaceC4448, interfaceC4643, z), c5362), c5362, ((i2 >> 24) & 112) | 12582912 | (i6 & 896) | (i6 & 7168) | (i6 & 57344), 96);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731(interfaceC4643, interfaceC4448, interfaceC4745, interfaceC0705, c1705, f, z, interfaceC2864, j, j2, f2, c0857, interfaceC5731, c0858, i) { // from class: ۥؖؖۚؕ

                /* JADX INFO: renamed from: ۥؓ */
                public final /* synthetic */ C0857 f1969;

                /* JADX INFO: renamed from: ۥؖ */
                public final /* synthetic */ float f1970;

                /* JADX INFO: renamed from: ۥً */
                public final /* synthetic */ C0857 f1971;

                /* JADX INFO: renamed from: ۥَ */
                public final /* synthetic */ InterfaceC0705 f1972;

                /* JADX INFO: renamed from: ۥْ */
                public final /* synthetic */ InterfaceC4448 f1973;

                /* JADX INFO: renamed from: ۥٓ */
                public final /* synthetic */ InterfaceC4745 f1974;

                /* JADX INFO: renamed from: ۥٖ */
                public final /* synthetic */ C1705 f1975;

                /* JADX INFO: renamed from: ۥٙ */
                public final /* synthetic */ long f1976;

                /* JADX INFO: renamed from: ۥۖ */
                public final /* synthetic */ InterfaceC2864 f1977;

                /* JADX INFO: renamed from: ۥۧ */
                public final /* synthetic */ InterfaceC5731 f1978;

                /* JADX INFO: renamed from: ۦٕ */
                public final /* synthetic */ long f1979;

                /* JADX INFO: renamed from: ۦٗ */
                public final /* synthetic */ float f1980;

                /* JADX INFO: renamed from: ۦۛ */
                public final /* synthetic */ boolean f1981;

                /* JADX INFO: renamed from: ۦ۟ */
                public final /* synthetic */ InterfaceC4643 f1982;

                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM6835 = AbstractC3831.m6835(71);
                    AbstractC1418.m3017(this.f1983, this.f1982, this.f1973, this.f1974, this.f1972, this.f1975, this.f1980, this.f1981, this.f1977, this.f1979, this.f1976, this.f1970, this.f1969, this.f1978, this.f1971, (C5362) obj2, iM6835);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r24v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r24v0 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r24v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r24v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r24v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r24v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r26v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v0 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r26v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r47v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r47v0 ??, new type: ۦ۟ؗٙ۟
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v14 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v5 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r47v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r47v0 ??, new type: ۦ۟ؗٙ۟
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v21 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    /* JADX INFO: renamed from: ۥۣ */
    public static final void m3018(p000.InterfaceC4448 r31, p000.InterfaceC0705 r32, p000.C1705 r33, float r34, boolean r35, p000.InterfaceC2864 r36, long r37, long r39, long r41, p000.C0857 r43, p000.InterfaceC5731 r44, p000.C5348 r45, p000.C0857 r46, p000.C5362 r47, int r48) {
        /*
            Method dump skipped, instruction units count: 673
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC1418.m3018(ۦ٘ؖۛٗ, ۥؙٟؑؔ, ۥٜٚؑٙ, float, boolean, ۥٌٕۧؔ, long, long, long, ۥًؖ۠ؒ, ۦۦؙؑؑ, ۦٜ۟ؕۖ, ۥًؖ۠ؒ, ۦ۟ؗٙ۟, int):void");
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final float m3019(C1117 c1117, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c1117.f3916 >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (AbstractC4593.m7993(0.0f, Math.min(c1117.f3915.mo746() * 48.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
    }
}
