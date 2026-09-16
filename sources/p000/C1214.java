package p000;

/* JADX INFO: renamed from: ۥْؔ۠ٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1214 implements InterfaceC0712 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ Object f4196;

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ C0851 f4197;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0482 f4198;

    public C1214(C0851 c0851, Object obj) {
        this.f4197 = c0851;
        this.f4196 = obj;
        int[] iArr = AbstractC5291.f17428;
        this.f4198 = new C0482();
    }

    @Override // p000.InterfaceC0712
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo1577(long j, int i) {
        C0851 c0851 = this.f4197;
        C0605 c0605 = (C0605) c0851.f3150.m6027(this.f4196);
        if (c0605 == null || !c0605.m1348()) {
            return;
        }
        int i2 = ((C0863) ((C3482) c0605.m1361()).f11560).f3180;
        if (i < 0 || i >= i2) {
            AbstractC3480.m6280("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (c0605.m1342()) {
            AbstractC3480.m6279("Pre-measure called on node that is not placed");
        }
        C0605 c0606 = c0851.f3155;
        c0606.f2245 = true;
        ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(c0605)).m1793((C0605) ((C3482) c0605.m1361()).get(i), j);
        c0606.f2245 = false;
        this.f4198.m1032(i);
    }

    @Override // p000.InterfaceC0712
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo1578() {
        C0605 c0605 = (C0605) this.f4197.f3150.m6027(this.f4196);
        if (c0605 != null) {
            return ((C0863) ((C3482) c0605.m1361()).f11560).f3180;
        }
        return 0;
    }

    @Override // p000.InterfaceC0712
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1579() {
        this.f4197.m1803(this.f4196);
    }

    @Override // p000.InterfaceC0712
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo1580(C0091 c0091) {
        C2457 c2457;
        C0605 c0605 = (C0605) this.f4197.f3150.m6027(this.f4196);
        AbstractC5381 abstractC5381 = (c0605 == null || (c2457 = c0605.f2256) == null) ? null : (AbstractC5381) c2457.f8210;
        if (abstractC5381 == null || !abstractC5381.f17786) {
            return;
        }
        AbstractC5378.m9061(abstractC5381, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", c0091);
    }
}
