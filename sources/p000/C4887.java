package p000;

/* JADX INFO: renamed from: ۦْۖؑۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4887 extends AbstractC0868 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public long f16069;

    /* JADX INFO: renamed from: ۥْ */
    public C4994 f16070;

    /* JADX INFO: renamed from: ۥٓ */
    public EnumC3834 f16071;

    /* JADX INFO: renamed from: ۥٖ */
    public int f16072;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ C4153 f16073;

    /* JADX INFO: renamed from: ۦٗ */
    public /* synthetic */ Object f16074;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ InterfaceC4643 f16075;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4887(InterfaceC4643 interfaceC4643, C4153 c4153, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f16075 = interfaceC4643;
        this.f16073 = c4153;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        C4887 c4887 = new C4887(this.f16075, this.f16073, interfaceC0443);
        c4887.f16074 = obj;
        return c4887;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c3 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #2 {all -> 0x0019, blocks: (B:8:0x0014, B:41:0x00bf, B:43:0x00c3), top: B:52:0x0014 }] */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) throws Throwable {
        C4994 c4994M3349;
        EnumC3834 enumC3834;
        long j;
        C5475 c5475;
        C4994 c4994;
        C4994 c4995;
        C3536 c3536;
        int i = this.f16072;
        int i2 = 1;
        InterfaceC0443 interfaceC0443 = null;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (i == 0) {
            AbstractC0186.m409(obj);
            C5475 c5476 = (C5475) this.f16074;
            c4994M3349 = AbstractC1605.m3349(Boolean.FALSE);
            long jMo3252 = c5476.m9175().mo3252();
            this.f16074 = c5476;
            this.f16070 = c4994M3349;
            enumC3834 = EnumC3834.f12725;
            this.f16071 = enumC3834;
            this.f16069 = jMo3252;
            this.f16072 = 1;
            Object objM6008 = AbstractC3257.m6008(c5476, this, 1);
            if (objM6008 != enumC2282) {
                j = jMo3252;
                c5475 = c5476;
                obj = objM6008;
            }
            return enumC2282;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c4995 = (C4994) this.f16074;
                try {
                    AbstractC0186.m409(obj);
                    c3536 = (C3536) obj;
                    if (c3536 != null) {
                        c3536.m6327();
                    }
                    Boolean bool = Boolean.FALSE;
                    c4995.getClass();
                    c4995.m8388(null, bool);
                    return C2358.f7817;
                } catch (Throwable th) {
                    th = th;
                    Boolean bool2 = Boolean.FALSE;
                    c4995.getClass();
                    c4995.m8388(null, bool2);
                    throw th;
                }
            }
            EnumC3834 enumC3835 = this.f16071;
            c4994 = this.f16070;
            c5475 = (C5475) this.f16074;
            try {
                AbstractC0186.m409(obj);
                Boolean bool3 = Boolean.FALSE;
                c4994.getClass();
                c4994.m8388(null, bool3);
            } catch (C4491 unused) {
                enumC3834 = enumC3835;
                c4994M3349 = c4994;
                AbstractC2765.m5135(this.f16075, null, 4, new C0061(c4994M3349, this.f16073, interfaceC0443, 6), 1);
                this.f16074 = c4994M3349;
                this.f16070 = null;
                this.f16071 = null;
                this.f16072 = 3;
                obj = AbstractC3257.m6012(c5475, enumC3834, this);
                if (obj != enumC2282) {
                    c4995 = c4994M3349;
                    c3536 = (C3536) obj;
                    if (c3536 != null) {
                        c3536.m6327();
                    }
                    Boolean bool4 = Boolean.FALSE;
                    c4995.getClass();
                    c4995.m8388(null, bool4);
                }
                return enumC2282;
            } catch (Throwable th2) {
                th = th2;
                c4995 = c4994;
                Boolean bool5 = Boolean.FALSE;
                c4995.getClass();
                c4995.m8388(null, bool5);
                throw th;
            }
            return C2358.f7817;
        }
        long j2 = this.f16069;
        EnumC3834 enumC3836 = this.f16071;
        C4994 c4996 = this.f16070;
        C5475 c5477 = (C5475) this.f16074;
        AbstractC0186.m409(obj);
        enumC3834 = enumC3836;
        c4994M3349 = c4996;
        j = j2;
        c5475 = c5477;
        long j3 = j;
        int i3 = ((C3536) obj).f11737;
        if (i3 == 1 || i3 == 3) {
            try {
                try {
                    C0565 c0565 = new C0565(enumC3834, interfaceC0443, i2);
                    this.f16074 = c5475;
                    this.f16070 = c4994M3349;
                    this.f16071 = enumC3834;
                    this.f16072 = 2;
                    if (c5475.m9174(j3, c0565, this) != enumC2282) {
                        c4994 = c4994M3349;
                        Boolean bool6 = Boolean.FALSE;
                        c4994.getClass();
                        c4994.m8388(null, bool6);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c4995 = c4994M3349;
                    Boolean bool7 = Boolean.FALSE;
                    c4995.getClass();
                    c4995.m8388(null, bool7);
                    throw th;
                }
            } catch (C4491 unused2) {
                AbstractC2765.m5135(this.f16075, null, 4, new C0061(c4994M3349, this.f16073, interfaceC0443, 6), 1);
                this.f16074 = c4994M3349;
                this.f16070 = null;
                this.f16071 = null;
                this.f16072 = 3;
                obj = AbstractC3257.m6012(c5475, enumC3834, this);
                if (obj != enumC2282) {
                    c4995 = c4994M3349;
                    c3536 = (C3536) obj;
                    if (c3536 != null) {
                        c3536.m6327();
                    }
                    Boolean bool8 = Boolean.FALSE;
                    c4995.getClass();
                    c4995.m8388(null, bool8);
                    return C2358.f7817;
                }
            }
            return enumC2282;
        }
        return C2358.f7817;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C4887) mo217((InterfaceC0443) obj2, (C5475) obj)).mo218(C2358.f7817);
    }
}
