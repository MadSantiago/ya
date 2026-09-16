package p000;

/* JADX INFO: renamed from: ۥؚؚؖٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0793 implements InterfaceC4161 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C5450 f2855;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC4161 f2856;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f2857 = 0;

    public C0793(C3173 c3173, C5450 c5450, InterfaceC4161 interfaceC4161) {
        this.f2855 = c5450;
        this.f2856 = interfaceC4161;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // p000.InterfaceC4161
    /* JADX INFO: renamed from: ۦۚ */
    public final Object mo978(Object obj, InterfaceC0443 interfaceC0443) {
        C4506 c4506;
        C1998 c1998;
        int i = this.f2857;
        C5450 c5450 = this.f2855;
        Object obj2 = C2358.f7817;
        InterfaceC4161 interfaceC4161 = this.f2856;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        switch (i) {
            case 0:
                if (interfaceC0443 instanceof C4506) {
                    c4506 = (C4506) interfaceC0443;
                    int i2 = c4506.f14901;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c4506.f14901 = i2 - Integer.MIN_VALUE;
                    } else {
                        c4506 = new C4506(this, interfaceC0443);
                    }
                } else {
                    c4506 = new C4506(this, interfaceC0443);
                }
                Object obj3 = c4506.f14900;
                int i3 = c4506.f14901;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC0186.m409(obj3);
                        return obj2;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj3);
                Object obj4 = c5450.f17965;
                if (obj4 != AbstractC2776.f9256 && AbstractC3831.m6874(obj4, obj)) {
                    return obj2;
                }
                c5450.f17965 = obj;
                c4506.f14901 = 1;
                return interfaceC4161.mo978(obj, c4506) == enumC2282 ? enumC2282 : obj2;
            default:
                if (interfaceC0443 instanceof C1998) {
                    c1998 = (C1998) interfaceC0443;
                    int i4 = c1998.f6585;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c1998.f6585 = i4 - Integer.MIN_VALUE;
                    } else {
                        c1998 = new C1998(this, interfaceC0443);
                    }
                } else {
                    c1998 = new C1998(this, interfaceC0443);
                }
                Object obj5 = c1998.f6584;
                int i5 = c1998.f6585;
                try {
                    if (i5 == 0) {
                        AbstractC0186.m409(obj5);
                        c1998.f6585 = 1;
                        if (interfaceC4161.mo978(obj, c1998) == enumC2282) {
                            obj2 = enumC2282;
                        }
                    } else {
                        if (i5 != 1) {
                            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC0186.m409(obj5);
                    }
                    return obj2;
                } catch (Throwable th) {
                    c5450.f17965 = th;
                    throw th;
                }
        }
    }

    public C0793(InterfaceC4161 interfaceC4161, C5450 c5450) {
        this.f2856 = interfaceC4161;
        this.f2855 = c5450;
    }
}
