package p000;

/* JADX INFO: renamed from: ۦؓؖۢٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3189 extends C1083 {

    /* JADX INFO: renamed from: ۥٖ */
    public final InterfaceC5731 f10714;

    public C3189(InterfaceC5731 interfaceC5731, InterfaceC3534 interfaceC3534, int i, int i2) {
        super(interfaceC5731, interfaceC3534, i, i2, 0);
        this.f10714 = interfaceC5731;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.C1083, p000.AbstractC0938
    /* JADX INFO: renamed from: ۥؗ */
    public final Object mo1910(C3002 c3002, InterfaceC0443 interfaceC0443) {
        C5005 c5005;
        if (interfaceC0443 instanceof C5005) {
            c5005 = (C5005) interfaceC0443;
            int i = c5005.f16571;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5005.f16571 = i - Integer.MIN_VALUE;
            } else {
                c5005 = new C5005(this, (AbstractC0772) interfaceC0443);
            }
        } else {
            c5005 = new C5005(this, (AbstractC0772) interfaceC0443);
        }
        Object obj = c5005.f16568;
        int i2 = c5005.f16571;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            c5005.f16569 = c3002;
            c5005.f16571 = 1;
            Object objMo1910 = super.mo1910(c3002, c5005);
            Object obj2 = EnumC2282.f7590;
            if (objMo1910 == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c3002 = c5005.f16569;
            AbstractC0186.m409(obj);
        }
        if (c3002.f10101.m9324()) {
            return C2358.f7817;
        }
        C1078.m2276("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        return null;
    }

    @Override // p000.C1083, p000.AbstractC0938
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC0938 mo1813(InterfaceC3534 interfaceC3534, int i, int i2) {
        return new C3189(this.f10714, interfaceC3534, i, i2);
    }
}
