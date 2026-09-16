package p000;

import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ۥٍٓۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1304 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f4480 = 0;

    /* JADX INFO: renamed from: ۥٖ */
    public C1916 f4481;

    /* JADX INFO: renamed from: ۥٙ */
    public final /* synthetic */ InterfaceC1437 f4482;

    /* JADX INFO: renamed from: ۥۖ */
    public Object f4483;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ Object f4484;

    /* JADX INFO: renamed from: ۦٗ */
    public int f4485;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ float f4486;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1304(C1604 c1604, float f, InterfaceC4745 interfaceC4745, InterfaceC1437 interfaceC1437, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f4483 = c1604;
        this.f4486 = f;
        this.f4484 = interfaceC4745;
        this.f4482 = interfaceC1437;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f4480;
        Object obj2 = this.f4484;
        switch (i) {
            case 0:
                C5113 c5113 = (C5113) this.f4482;
                return new C1304(this.f4486, (C3645) obj2, c5113, interfaceC0443);
            default:
                InterfaceC1437 interfaceC1437 = this.f4482;
                return new C1304((C1604) this.f4483, this.f4486, (InterfaceC4745) obj2, interfaceC1437, interfaceC0443);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [ۥ٘ؖۜٔ] */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        C1916 c1916;
        C3411 c3411;
        float f;
        EnumC2282 enumC2282;
        float fSignum;
        final C1916 c1917;
        Object objM3329;
        float f2;
        int i = this.f4480;
        EnumC2282 enumC2283 = EnumC2282.f7590;
        float f3 = this.f4486;
        Object obj2 = this.f4484;
        final int i2 = 0;
        switch (i) {
            case 0:
                int i3 = this.f4485;
                if (i3 != 0) {
                    if (i3 != 1) {
                        C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c3411 = (C3411) this.f4483;
                    c1916 = this.f4481;
                    try {
                        AbstractC0186.m409(obj);
                    } catch (CancellationException unused) {
                        c1916.f6312 = ((Number) c3411.m6174()).floatValue();
                    }
                    f3 = c1916.f6312;
                    break;
                } else {
                    AbstractC0186.m409(obj);
                    if (Math.abs(f3) > 1.0f) {
                        c1916 = new C1916();
                        c1916.f6312 = f3;
                        C1916 c1918 = new C1916();
                        C3411 c3411M7901 = AbstractC4554.m7901(0.0f, f3, 28);
                        try {
                            C3645 c3645 = (C3645) obj2;
                            C5468 c5468 = c3645.f12206;
                            C3464 c3464 = new C3464(c1918, (C5113) this.f4482, c1916, c3645);
                            this.f4481 = c1916;
                            this.f4483 = c3411M7901;
                            this.f4485 = 1;
                            if (AbstractC3831.m6843(c3411M7901, c5468, false, c3464, this) == enumC2283) {
                                return enumC2283;
                            }
                        } catch (CancellationException unused2) {
                            c3411 = c3411M7901;
                            c1916.f6312 = ((Number) c3411.m6174()).floatValue();
                        }
                        f3 = c1916.f6312;
                    }
                }
                return new Float(f3);
            default:
                final InterfaceC4745 interfaceC4745 = (InterfaceC4745) obj2;
                C1604 c1604 = (C1604) this.f4483;
                C3369 c3369 = c1604.f5382;
                int i4 = this.f4485;
                if (i4 == 0) {
                    AbstractC0186.m409(obj);
                    float f4 = ((C3893) new C1489(18, c1604.f5381.f18029).m3173(new C3893(0.0f), new C3893(f3))).f13013;
                    C2384 c2384 = (C2384) c3369.f11255;
                    C4852 c4852 = c2384.f2351;
                    int iM1408 = ((C2257) c4852.getValue()).f7483 + c2384.m1408();
                    if (iM1408 == 0) {
                        fSignum = 0.0f;
                        f = 0.0f;
                        enumC2282 = enumC2283;
                    } else {
                        int i5 = c2384.f2337;
                        if (f3 < 0.0f) {
                            i5++;
                        }
                        int iM7934 = AbstractC4554.m7934(((int) (f4 / iM1408)) + i5, 0, c2384.mo1406());
                        c2384.m1408();
                        int i6 = ((C2257) c4852.getValue()).f7483;
                        f = 0.0f;
                        enumC2282 = enumC2283;
                        long j = i5;
                        long j2 = j - 1;
                        int i7 = (int) (j2 < 0 ? 0L : j2);
                        long j3 = j + 1;
                        if (j3 > 2147483647L) {
                            j3 = 2147483647L;
                        }
                        int iAbs = Math.abs((AbstractC4554.m7934(AbstractC4554.m7934(iM7934, i7, (int) j3), 0, c2384.mo1406()) - i5) * iM1408) - iM1408;
                        if (iAbs < 0) {
                            iAbs = 0;
                        }
                        fSignum = iAbs == 0 ? iAbs : Math.signum(f3) * iAbs;
                    }
                    if (Float.isNaN(fSignum)) {
                        AbstractC4690.m8035("calculateApproachOffset returned NaN. Please use a valid value.");
                    }
                    c1917 = new C1916();
                    float fSignum2 = Math.signum(f3) * Math.abs(fSignum);
                    c1917.f6312 = fSignum2;
                    interfaceC4745.mo211(new Float(fSignum2));
                    float f5 = c1917.f6312;
                    ?? r4 = new InterfaceC4745() { // from class: ۥ٘ؖۜٔ
                        @Override // p000.InterfaceC4745
                        /* JADX INFO: renamed from: ۦؚ */
                        public final Object mo211(Object obj3) {
                            int i8 = i2;
                            C2358 c2358 = C2358.f7817;
                            InterfaceC4745 interfaceC4746 = interfaceC4745;
                            C1916 c1919 = c1917;
                            float fFloatValue = ((Float) obj3).floatValue();
                            switch (i8) {
                                case 0:
                                    float f6 = c1919.f6312 - fFloatValue;
                                    c1919.f6312 = f6;
                                    interfaceC4746.mo211(Float.valueOf(f6));
                                    break;
                                default:
                                    float f7 = c1919.f6312 - fFloatValue;
                                    c1919.f6312 = f7;
                                    interfaceC4746.mo211(Float.valueOf(f7));
                                    break;
                            }
                            return c2358;
                        }
                    };
                    this.f4481 = c1917;
                    this.f4485 = 1;
                    objM3329 = c1604.m3329(this.f4482, f5, this.f4486, r4, this);
                    if (objM3329 == enumC2282) {
                        return enumC2282;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            AbstractC0186.m409(obj);
                            return obj;
                        }
                        C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    C1916 c1919 = this.f4481;
                    AbstractC0186.m409(obj);
                    f = 0.0f;
                    enumC2282 = enumC2283;
                    c1917 = c1919;
                    objM3329 = obj;
                }
                C3411 c3412 = (C3411) objM3329;
                float fFloatValue = ((Number) c3412.m6174()).floatValue();
                C2384 c2385 = (C2384) c3369.f11255;
                C0373 c0373 = c2385.m1402().f7501;
                List list = c2385.m1402().f7492;
                int size = list.size();
                float f6 = Float.NEGATIVE_INFINITY;
                float f7 = Float.POSITIVE_INFINITY;
                while (i2 < size) {
                    C3000 c3000 = (C3000) list.get(i2);
                    AbstractC0993.m2143(c2385.m1402());
                    int i8 = c2385.m1402().f7486;
                    int i9 = c2385.m1402().f7493;
                    int i10 = c2385.m1402().f7490;
                    int i11 = c3000.f10088;
                    c2385.mo1406();
                    c0373.getClass();
                    float f8 = i11 - f;
                    if (f8 <= f && f8 > f6) {
                        f6 = f8;
                    }
                    if (f8 >= f && f8 < f7) {
                        f7 = f8;
                    }
                    i2++;
                }
                if (f6 == Float.NEGATIVE_INFINITY) {
                    f6 = f7;
                }
                if (f7 == Float.POSITIVE_INFINITY) {
                    f7 = f6;
                }
                if (!c2385.mo1391()) {
                    if (C3133.m5789(c2385, fFloatValue)) {
                        f6 = f;
                        f7 = f6;
                    } else {
                        f7 = f;
                    }
                }
                if (c2385.mo1399()) {
                    f2 = f7;
                } else if (C3133.m5789(c2385, fFloatValue)) {
                    f6 = f;
                    f2 = f7;
                } else {
                    f2 = f;
                    f6 = f2;
                }
                float fFloatValue2 = ((Number) ((C4513) c3369.f11254).mo1173(Float.valueOf(fFloatValue), Float.valueOf(f6), Float.valueOf(f2))).floatValue();
                if (fFloatValue2 != f6 && fFloatValue2 != f2 && fFloatValue2 != f) {
                    AbstractC4690.m8035("Final Snapping Offset Should Be one of " + f6 + ", " + f2 + " or 0.0");
                }
                if (fFloatValue2 == Float.POSITIVE_INFINITY || fFloatValue2 == Float.NEGATIVE_INFINITY) {
                    fFloatValue2 = f;
                }
                if (Float.isNaN(fFloatValue2)) {
                    AbstractC4690.m8035("calculateSnapOffset returned NaN. Please use a valid value.");
                }
                c1917.f6312 = fFloatValue2;
                float f9 = f;
                C3411 c3411M7892 = AbstractC4554.m7892(c3412, f9, f9, 30);
                C0969 c0969 = c1604.f5380;
                final int i12 = 1;
                InterfaceC4745 interfaceC4746 = new InterfaceC4745() { // from class: ۥ٘ؖۜٔ
                    @Override // p000.InterfaceC4745
                    /* JADX INFO: renamed from: ۦؚ */
                    public final Object mo211(Object obj3) {
                        int i13 = i12;
                        C2358 c2358 = C2358.f7817;
                        InterfaceC4745 interfaceC4747 = interfaceC4745;
                        C1916 c19110 = c1917;
                        float fFloatValue3 = ((Float) obj3).floatValue();
                        switch (i13) {
                            case 0:
                                float f10 = c19110.f6312 - fFloatValue3;
                                c19110.f6312 = f10;
                                interfaceC4747.mo211(Float.valueOf(f10));
                                break;
                            default:
                                float f11 = c19110.f6312 - fFloatValue3;
                                c19110.f6312 = f11;
                                interfaceC4747.mo211(Float.valueOf(f11));
                                break;
                        }
                        return c2358;
                    }
                };
                this.f4481 = null;
                this.f4485 = 2;
                Object objM4202 = AbstractC2164.m4202(this.f4482, fFloatValue2, fFloatValue2, c3411M7892, c0969, interfaceC4746, this);
                return objM4202 == enumC2282 ? enumC2282 : objM4202;
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f4480;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((C1304) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1304(float f, C3645 c3645, C5113 c5113, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f4486 = f;
        this.f4484 = c3645;
        this.f4482 = c5113;
    }
}
