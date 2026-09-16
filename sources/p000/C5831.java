package p000;

/* JADX INFO: renamed from: ۦٍۧؖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5831 extends AbstractC0772 {

    /* JADX INFO: renamed from: ۥَ */
    public /* synthetic */ Object f19209;

    /* JADX INFO: renamed from: ۥٓ */
    public C1893 f19210;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC4316 f19211;

    /* JADX INFO: renamed from: ۦٗ */
    public int f19212;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5831(ViewOnAttachStateChangeListenerC4316 viewOnAttachStateChangeListenerC4316, AbstractC0772 abstractC0772) {
        super(abstractC0772);
        this.f19211 = viewOnAttachStateChangeListenerC4316;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        this.f19209 = obj;
        this.f19212 |= Integer.MIN_VALUE;
        return this.f19211.m7609(this);
    }
}
