package p000;

/* JADX INFO: renamed from: ۦٞؑ۠ٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4781 implements InterfaceC0633 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C2372 f15774;

    /* JADX INFO: renamed from: ۥۗ */
    public final C1765 f15775;

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC1237 f15776;

    public C4781(AbstractC1237 abstractC1237, C1765 c1765, C2372 c2372) {
        this.f15776 = abstractC1237;
        this.f15775 = c1765;
        this.f15774 = c2372;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.InterfaceC0633
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo1409(InterfaceC0443 interfaceC0443) throws Throwable {
        C1130 c1130;
        C2372 c2372;
        Throwable th;
        C2372 c2373;
        if (interfaceC0443 instanceof C1130) {
            c1130 = (C1130) interfaceC0443;
            int i = c1130.f3966;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1130.f3966 = i - Integer.MIN_VALUE;
            } else {
                c1130 = new C1130(this, (AbstractC0772) interfaceC0443);
            }
        } else {
            c1130 = new C1130(this, (AbstractC0772) interfaceC0443);
        }
        Object obj = c1130.f3964;
        int i2 = c1130.f3966;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        try {
            if (i2 == 0) {
                AbstractC0186.m409(obj);
                c1130.f3963 = this;
                c2372 = this.f15774;
                c1130.f3962 = c2372;
                c1130.f3966 = 1;
                if (c2372.m9531(c1130) != enumC2282) {
                }
                return enumC2282;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c2373 = (C2372) c1130.f3963;
                try {
                    AbstractC0186.m409(obj);
                    C5303 c5303 = (C5303) obj;
                    c2373.m9532();
                    return c5303;
                } catch (Throwable th2) {
                    th = th2;
                    c2373.m9532();
                    throw th;
                }
            }
            C2372 c2374 = c1130.f3962;
            C4781 c4781 = (C4781) c1130.f3963;
            AbstractC0186.m409(obj);
            c2372 = c2374;
            this = c4781;
            C5285 c5285 = new C5285(3, this);
            c1130.f3963 = c2372;
            c1130.f3962 = null;
            c1130.f3966 = 2;
            Object objM7909 = AbstractC4554.m7909(c5285, c1130);
            if (objM7909 != enumC2282) {
                C2372 c2375 = c2372;
                obj = objM7909;
                c2373 = c2375;
                C5303 c5304 = (C5303) obj;
                c2373.m9532();
                return c5304;
            }
            return enumC2282;
        } catch (Throwable th3) {
            C2372 c2376 = c2372;
            th = th3;
            c2373 = c2376;
            c2373.m9532();
            throw th;
        }
    }
}
