package p000;

/* JADX INFO: renamed from: ۦَؘؓؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3871 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Object f12921;

    /* JADX INFO: renamed from: ۥۗ */
    public float f12922;

    /* JADX INFO: renamed from: ۥۣ */
    public int f12923;

    public C3871(C0739 c0739) {
        this.f12921 = c0739;
        this.f12923 = -1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥۗ */
    public Object m6900(float f, AbstractC0772 abstractC0772) {
        C5652 c5652;
        if (abstractC0772 instanceof C5652) {
            c5652 = (C5652) abstractC0772;
            int i = c5652.f18610;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5652.f18610 = i - Integer.MIN_VALUE;
            } else {
                c5652 = new C5652(this, abstractC0772);
            }
        } else {
            c5652 = new C5652(this, abstractC0772);
        }
        Object objMo219 = c5652.f18609;
        int i2 = c5652.f18610;
        if (i2 == 0) {
            AbstractC0186.m409(objMo219);
            C4248 c4248 = (C4248) this.f12921;
            Float f2 = new Float(f);
            c5652.f18610 = 1;
            objMo219 = c4248.mo219(f2, c5652);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objMo219 == enumC2282) {
                return enumC2282;
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC0186.m409(objMo219);
        }
        this.f12922 += ((Number) objMo219).floatValue();
        return C2358.f7817;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX INFO: renamed from: ۥۣ */
    public float m6901(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        C0739 c0739 = (C0739) this.f12921;
        int i2 = 1;
        if (z) {
            int iM4831 = AbstractC2552.m4831(c0739.f2683, i, z);
            int lineStart = c0739.f2683.getLineStart(iM4831);
            int iM1628 = c0739.m1628(iM4831);
            if (i == lineStart || i == iM1628) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        int i3 = i * 4;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.f12923 == i4) {
            return this.f12922;
        }
        float fM1634 = z3 ? c0739.m1634(i, z) : c0739.m1633(i, z);
        if (z2) {
            this.f12923 = i4;
            this.f12922 = fM1634;
        }
        return fM1634;
    }

    public C3871(int i, C4248 c4248) {
        this.f12923 = i;
        this.f12921 = c4248;
    }
}
