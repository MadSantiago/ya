package p000;

/* JADX INFO: renamed from: ۦؘٖۖؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4934 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f16248;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C3468 f16249;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C3468 f16250;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ C5583 f16251;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ Object f16252;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f16253;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4934(C3468 c3468, C3468 c3469, Object obj, int i, C5583 c5583, int i2) {
        super(1);
        this.f16253 = i2;
        this.f16249 = c3468;
        this.f16250 = c3469;
        this.f16252 = obj;
        this.f16248 = i;
        this.f16251 = c5583;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f16253;
        C5583 c5583 = this.f16251;
        int i2 = this.f16248;
        Object obj2 = this.f16252;
        C3468 c3468 = this.f16250;
        C3468 c3469 = this.f16249;
        switch (i) {
            case 0:
                InterfaceC1800 interfaceC1800 = (InterfaceC1800) obj;
                if (c3469 != ((C2016) ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5537.m9224(c3468)).getFocusOwner()).m3926()) {
                    return Boolean.TRUE;
                }
                boolean zM7988 = AbstractC4593.m7988(c3468, (C3468) obj2, i2, c5583);
                Boolean boolValueOf = Boolean.valueOf(zM7988);
                if (zM7988 || !interfaceC1800.mo983()) {
                    return boolValueOf;
                }
                return null;
            default:
                InterfaceC1800 interfaceC1801 = (InterfaceC1800) obj;
                if (c3469 != ((C2016) ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5537.m9224(c3468)).getFocusOwner()).m3926()) {
                    return Boolean.TRUE;
                }
                boolean zM7171 = AbstractC4009.m7171(i2, c5583, c3468, (C2793) obj2);
                Boolean boolValueOf2 = Boolean.valueOf(zM7171);
                if (zM7171 || !interfaceC1801.mo983()) {
                    return boolValueOf2;
                }
                return null;
        }
    }
}
