package p000;

/* JADX INFO: renamed from: ۦٍَّؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3821 implements InterfaceC2880 {

    /* JADX INFO: renamed from: ۥْ */
    public boolean f12652;

    /* JADX INFO: renamed from: ۥٓ */
    public final C1387 f12653 = new C1387();

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean f12654;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ InterfaceC2880 f12655;

    public C3821(InterfaceC2880 interfaceC2880) {
        this.f12655 = interfaceC2880;
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥؖ */
    public final float mo741(float f) {
        return this.f12655.mo741(f);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m6815() {
        this.f12654 = true;
        C1387 c1387 = this.f12653;
        if (c1387.m2948()) {
            c1387.mo2950(null);
        }
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥٌ */
    public final long mo742(float f) {
        return this.f12655.mo742(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥُ */
    public final Object m6816(AbstractC0772 abstractC0772) {
        C4896 c4896;
        if (abstractC0772 instanceof C4896) {
            c4896 = (C4896) abstractC0772;
            int i = c4896.f16139;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4896.f16139 = i - Integer.MIN_VALUE;
            } else {
                c4896 = new C4896(this, abstractC0772);
            }
        } else {
            c4896 = new C4896(this, abstractC0772);
        }
        Object obj = c4896.f16138;
        int i2 = c4896.f16139;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            c4896.f16139 = 1;
            Object objMo2949 = this.f12653.mo2949(c4896);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objMo2949 == enumC2282) {
                return enumC2282;
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC0186.m409(obj);
        }
        this.f12654 = false;
        this.f12652 = false;
        return C2358.f7817;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥّ */
    public final Object m6817(AbstractC0772 abstractC0772) {
        C1478 c1478;
        if (abstractC0772 instanceof C1478) {
            c1478 = (C1478) abstractC0772;
            int i = c1478.f5029;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1478.f5029 = i - Integer.MIN_VALUE;
            } else {
                c1478 = new C1478(this, abstractC0772);
            }
        } else {
            c1478 = new C1478(this, abstractC0772);
        }
        Object obj = c1478.f5028;
        int i2 = c1478.f5029;
        C1387 c1387 = this.f12653;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            if (!this.f12654 && !this.f12652) {
                c1478.f5029 = 1;
                Object objMo2949 = c1387.mo2949(c1478);
                EnumC2282 enumC2282 = EnumC2282.f7590;
                if (objMo2949 == enumC2282) {
                    return enumC2282;
                }
            }
            return Boolean.valueOf(this.f12654);
        }
        if (i2 != 1) {
            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC0186.m409(obj);
        c1387.mo2950(null);
        return Boolean.valueOf(this.f12654);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥٝ */
    public final int mo743(float f) {
        return this.f12655.mo743(f);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥٞ */
    public final float mo744(long j) {
        return this.f12655.mo744(j);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۖ */
    public final long mo745(float f) {
        return this.f12655.mo745(f);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۗ */
    public final float mo746() {
        return this.f12655.mo746();
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۢ */
    public final long mo747(long j) {
        return this.f12655.mo747(j);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m6818() {
        this.f12652 = true;
        C1387 c1387 = this.f12653;
        if (c1387.m2948()) {
            c1387.mo2950(null);
        }
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۦ */
    public final int mo749(long j) {
        return this.f12655.mo749(j);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦُ */
    public final float mo751(long j) {
        return this.f12655.mo751(j);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦٕ */
    public final long mo752(long j) {
        return this.f12655.mo752(j);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۖ */
    public final float mo753(float f) {
        return this.f12655.mo753(f);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۚ */
    public final float mo754() {
        return this.f12655.mo754();
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۦ */
    public final float mo756(int i) {
        return this.f12655.mo756(i);
    }
}
