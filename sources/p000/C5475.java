package p000;

/* JADX INFO: renamed from: ۦٜٖۡؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5475 implements InterfaceC2880, InterfaceC0443 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ C2439 f18065;

    /* JADX INFO: renamed from: ۥْ */
    public C2600 f18066;

    /* JADX INFO: renamed from: ۥٓ */
    public EnumC3834 f18067 = EnumC3834.f12724;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C2600 f18068;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ C2439 f18069;

    public C5475(C2439 c2439, C2600 c2600) {
        this.f18065 = c2439;
        this.f18069 = c2439;
        this.f18068 = c2600;
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥؖ */
    public final float mo741(float f) {
        return this.f18069.mo746() * f;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final long m9171() {
        C2439 c2439 = this.f18065;
        long jMo747 = c2439.mo747(AbstractC5537.m9270(c2439).f2275.mo4660());
        long j = c2439.f8122;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo747 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo747 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥٌ */
    public final long mo742(float f) {
        return this.f18069.mo742(f);
    }

    @Override // p000.InterfaceC0443
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC3534 mo334() {
        return C4794.f15814;
    }

    @Override // p000.InterfaceC0443
    /* JADX INFO: renamed from: ۥّ */
    public final void mo335(Object obj) {
        C2439 c2439 = this.f18065;
        synchronized (c2439.f8117) {
            c2439.f8118.m1848(this);
        }
        this.f18068.mo335(obj);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥٝ */
    public final int mo743(float f) {
        return this.f18069.mo743(f);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥٞ */
    public final float mo744(long j) {
        return this.f18069.mo744(j);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۖ */
    public final long mo745(float f) {
        return this.f18069.mo745(f);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۗ */
    public final float mo746() {
        return this.f18069.mo746();
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۢ */
    public final long mo747(long j) {
        return this.f18069.mo747(j);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final Object m9172(EnumC3834 enumC3834, AbstractC2870 abstractC2870) {
        C2600 c2600 = new C2600(1, AbstractC2776.m5232(abstractC2870));
        c2600.m4913();
        this.f18067 = enumC3834;
        this.f18066 = c2600;
        return c2600.m4909();
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۦ */
    public final int mo749(long j) {
        return this.f18069.mo749(j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۦؚ */
    public final Object m9173(long j, InterfaceC5731 interfaceC5731, AbstractC0772 abstractC0772) {
        C1371 c1371;
        if (abstractC0772 instanceof C1371) {
            c1371 = (C1371) abstractC0772;
            int i = c1371.f4692;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1371.f4692 = i - Integer.MIN_VALUE;
            } else {
                c1371 = new C1371(this, abstractC0772);
            }
        } else {
            c1371 = new C1371(this, abstractC0772);
        }
        Object obj = c1371.f4691;
        int i2 = c1371.f4692;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    AbstractC0186.m409(obj);
                    return obj;
                }
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC0186.m409(obj);
            c1371.f4692 = 1;
            Object objM9174 = m9174(j, interfaceC5731, c1371);
            Object obj2 = EnumC2282.f7590;
            return objM9174 == obj2 ? obj2 : objM9174;
        } catch (C4491 unused) {
            return null;
        }
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦُ */
    public final float mo751(long j) {
        return this.f18069.mo751(j);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦٕ */
    public final long mo752(long j) {
        return this.f18069.mo752(j);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۖ */
    public final float mo753(float f) {
        return f / this.f18069.mo746();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [ۦۦؙؑؑ] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, ۦٜٖۡؕ] */
    /* JADX WARN: Type inference failed for: r9v1, types: [ۦًؘؓ] */
    /* JADX WARN: Type inference failed for: r9v4, types: [ۦًؘؓ] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: ۦۗ */
    public final Object m9174(long j, InterfaceC5731 interfaceC5731, AbstractC2870 abstractC2870) {
        C2849 c2849;
        C2600 c2600;
        if (abstractC2870 instanceof C2849) {
            c2849 = (C2849) abstractC2870;
            int i = c2849.f9516;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2849.f9516 = i - Integer.MIN_VALUE;
            } else {
                c2849 = new C2849(this, abstractC2870);
            }
        } else {
            c2849 = new C2849(this, abstractC2870);
        }
        Object objMo219 = c2849.f9513;
        int i2 = c2849.f9516;
        try {
            if (i2 == 0) {
                AbstractC0186.m409(objMo219);
                if (j <= 0 && (c2600 = this.f18066) != null) {
                    c2600.mo335(new C4535(new C4491(j)));
                }
                C2127 c2127M5135 = AbstractC2765.m5135(this.f18065.m9076(), null, 0, new C2079(j, (Object) this, (InterfaceC0443) null, 3), 3);
                c2849.f9514 = c2127M5135;
                c2849.f9516 = 1;
                objMo219 = interfaceC5731.mo219(this, c2849);
                EnumC2282 enumC2282 = EnumC2282.f7590;
                this = c2127M5135;
                if (objMo219 == enumC2282) {
                    return enumC2282;
                }
            } else {
                if (i2 != 1) {
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                C2127 c2127 = c2849.f9514;
                AbstractC0186.m409(objMo219);
                this = c2127;
            }
            this.mo871(C0105.f422);
            return objMo219;
        } catch (Throwable th) {
            this.mo871(C0105.f422);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final InterfaceC2509 m9175() {
        return AbstractC5537.m9270(this.f18065).f2275;
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۚ */
    public final float mo754() {
        return this.f18069.mo754();
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۦ */
    public final float mo756(int i) {
        return this.f18069.mo756(i);
    }
}
