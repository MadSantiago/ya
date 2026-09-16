package p000;

import android.content.Context;
import android.graphics.ImageDecoder;
import android.view.KeyEvent;

/* JADX INFO: renamed from: ۦۜؗۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5304 extends AbstractC1127 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f17472;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f17473;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f17474;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5304(int i, Object obj, Object obj2) {
        super(0);
        this.f17474 = i;
        this.f17472 = obj;
        this.f17473 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r1v10, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v26 */
    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        C3129 c3129;
        C0605 c0605;
        C2793 c2793;
        int i = this.f17474;
        int i2 = 0;
        C2358 c2358 = C2358.f7817;
        Object obj = this.f17473;
        Object obj2 = this.f17472;
        switch (i) {
            case 0:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj));
            case 1:
                ViewOnAttachStateChangeListenerC2392 viewOnAttachStateChangeListenerC2392 = (ViewOnAttachStateChangeListenerC2392) obj;
                C0967 c0967 = (C0967) obj2;
                C4323 c4323 = c0967.f3412;
                C4323 c4324 = c0967.f3415;
                Float f = c0967.f3413;
                Float f2 = c0967.f3414;
                float fFloatValue = (c4323 == null || f == null) ? 0.0f : ((Number) c4323.f14290.mo449()).floatValue() - f.floatValue();
                float fFloatValue2 = (c4324 == null || f2 == null) ? 0.0f : ((Number) c4324.f14290.mo449()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iM4511 = viewOnAttachStateChangeListenerC2392.m4511(c0967.f3417);
                    C1307 c1307 = (C1307) viewOnAttachStateChangeListenerC2392.m4510().m9571(viewOnAttachStateChangeListenerC2392.f7938);
                    if (c1307 != null) {
                        try {
                            C5817 c5817 = viewOnAttachStateChangeListenerC2392.f7927;
                            if (c5817 != null) {
                                c5817.f19154.setBoundsInScreen(viewOnAttachStateChangeListenerC2392.m4491(c1307));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    C1307 c1308 = (C1307) viewOnAttachStateChangeListenerC2392.m4510().m9571(viewOnAttachStateChangeListenerC2392.f7929);
                    if (c1308 != null) {
                        try {
                            C5817 c5818 = viewOnAttachStateChangeListenerC2392.f7948;
                            if (c5818 != null) {
                                c5818.f19154.setBoundsInScreen(viewOnAttachStateChangeListenerC2392.m4491(c1308));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    viewOnAttachStateChangeListenerC2392.f7934.invalidate();
                    C1307 c1309 = (C1307) viewOnAttachStateChangeListenerC2392.m4510().m9571(iM4511);
                    if (c1309 != null && (c3129 = c1309.f4492) != null && (c0605 = c3129.f10471) != null) {
                        if (c4323 != null) {
                            viewOnAttachStateChangeListenerC2392.f7958.m8319(iM4511, c4323);
                        }
                        if (c4324 != null) {
                            viewOnAttachStateChangeListenerC2392.f7935.m8319(iM4511, c4324);
                        }
                        viewOnAttachStateChangeListenerC2392.m4493(c0605);
                    }
                }
                if (c4323 != null) {
                    c0967.f3413 = (Float) c4323.f14290.mo449();
                }
                if (c4324 != null) {
                    c0967.f3414 = (Float) c4324.f14290.mo449();
                }
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                InterfaceC4448 interfaceC4448 = (InterfaceC4448) obj2;
                if (interfaceC4448 != null && (c2793 = (C2793) interfaceC4448.mo449()) != null) {
                    return c2793;
                }
                AbstractC1311 abstractC1311 = (AbstractC1311) obj;
                if (!abstractC1311.mo2787().f17786) {
                    abstractC1311 = null;
                }
                if (abstractC1311 != null) {
                    return AbstractC5568.m9368(0L, AbstractC5537.m9235(abstractC1311.f982));
                }
                return null;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                ((C3852) obj2).f12872.mo211((C5665) obj);
                return c2358;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                ((C5450) obj2).f17965 = AbstractC2552.m4807((C3448) obj, AbstractC3186.f10707);
                return c2358;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                ((C5450) obj2).f17965 = ((C3468) obj).m6250();
                return c2358;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                ((C3622) obj2).m6450((AbstractC5381) obj);
                return c2358;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                C5450 c5450 = new C5450();
                C0983 c0983 = (C0983) obj2;
                AbstractC1237 c2400 = c0983.f3477;
                InterfaceC4473 interfaceC4473Mo2610 = c2400.mo2610();
                if (interfaceC4473Mo2610.mo2694(0L, AbstractC3631.f12122) || interfaceC4473Mo2610.mo2694(0L, AbstractC3631.f12124)) {
                    c2400 = new C2400(new C4162(new C2596(c2400.mo2610())), new C1148(c0983.f3476.f5881, i2), null);
                }
                try {
                    return ImageDecoder.decodeDrawable(c0983.m2101(c2400), new C4198(c5450, c0983, (C5662) obj));
                } finally {
                    ImageDecoder imageDecoderM2557 = AbstractC1208.m2557(c5450.f17965);
                    if (imageDecoderM2557 != null) {
                        imageDecoderM2557.close();
                    }
                    c2400.close();
                }
            case 8:
                C2457 c2457 = ((C0605) obj2).f2256;
                C5450 c5451 = (C5450) obj;
                if ((((AbstractC5381) c2457.f8210).f17782 & 8) != 0) {
                    for (AbstractC5381 abstractC5381 = (C1850) c2457.f8202; abstractC5381 != null; abstractC5381 = abstractC5381.f17780) {
                        if ((abstractC5381.f17781 & 8) != 0) {
                            ?? M9233 = abstractC5381;
                            ?? c0863 = 0;
                            while (M9233 != 0) {
                                if (M9233 instanceof InterfaceC5671) {
                                    InterfaceC5671 interfaceC5671 = (InterfaceC5671) M9233;
                                    if (interfaceC5671.mo4117()) {
                                        C2542 c2542 = new C2542();
                                        c5451.f17965 = c2542;
                                        c2542.f8488 = true;
                                    }
                                    if (interfaceC5671.mo787()) {
                                        ((C2542) c5451.f17965).f8487 = true;
                                    }
                                    interfaceC5671.mo790((InterfaceC1066) c5451.f17965);
                                } else if ((M9233.f17781 & 8) != 0 && (M9233 instanceof AbstractC3019)) {
                                    AbstractC5381 abstractC5382 = ((AbstractC3019) M9233).f10167;
                                    int i3 = 0;
                                    while (abstractC5382 != null) {
                                        if ((abstractC5382.f17781 & 8) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                M9233 = M9233;
                                                c0863 = c0863;
                                                c0863 = c0863;
                                                M9233 = abstractC5382;
                                            } else {
                                                if (c0863 == 0) {
                                                    c0863 = new C0863(new AbstractC5381[16]);
                                                }
                                                if (M9233 != 0) {
                                                    c0863.m1843(M9233);
                                                    M9233 = 0;
                                                }
                                                c0863.m1843(abstractC5382);
                                            }
                                        } else {
                                            M9233 = M9233;
                                            c0863 = c0863;
                                        }
                                        abstractC5382 = abstractC5382.f17783;
                                        M9233 = M9233;
                                        c0863 = c0863;
                                    }
                                    if (i3 == 1) {
                                        M9233 = M9233;
                                        c0863 = c0863;
                                    } else {
                                        M9233 = M9233;
                                        c0863 = c0863;
                                    }
                                }
                                M9233 = AbstractC5537.m9233(c0863);
                            }
                        }
                    }
                }
                return c2358;
            case 9:
                C1117 c1117 = AbstractC1311.f4507;
                ((InterfaceC4745) obj2).mo211(c1117);
                AbstractC1311 abstractC1312 = (AbstractC1311) obj;
                boolean zM6874 = AbstractC3831.m6874(abstractC1312.f4521, c1117.f3925);
                boolean z = abstractC1312.f4524;
                boolean z2 = c1117.f3922;
                i2 = z != z2 ? 1 : 0;
                if (!zM6874 || i2 != 0) {
                    abstractC1312.f4521 = c1117.f3925;
                    abstractC1312.f4524 = z2;
                    if (abstractC1312.f4517 && (i2 != 0 || (z2 && !zM6874))) {
                        abstractC1312.f4513.m1334();
                    }
                }
                abstractC1312.f4517 = true;
                c1117.f3927 = c1117.f3925.mo1709(c1117.f3916, c1117.f3924, c1117.f3915);
                return c2358;
            case 10:
                return AbstractC2552.m4823((Context) obj2, ((C0635) obj).f2370.concat(".preferences_pb"));
            default:
                return ((Context) obj2).getSharedPreferences((String) obj, 0);
        }
    }
}
