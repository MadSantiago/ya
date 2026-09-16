package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۥٌ۠ٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2534 extends C0735 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C4397 f8387;

    public C2534(C4397 c4397) {
        super(2, new ArrayList());
        this.f8387 = c4397;
    }

    @Override // p000.C0735
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo1623(C3131 c3131) {
        if (!c3131.equals(AbstractC5041.m8557(C1106.class))) {
            return super.mo1623(c3131);
        }
        try {
            return AbstractC2765.m5136(this.f8387);
        } catch (IllegalArgumentException e) {
            throw new IllegalStateException("Koin could not create a SavedStateHandle: the ViewModel's CreationExtras has no SavedStateRegistryOwner. Resolve the ViewModel via koinViewModel()/koinNavViewModel() with a proper owner (e.g. a NavBackStackEntry), and inject SavedStateHandle directly in the ViewModel constructor (not lazily/outside construction).", e);
        }
    }
}
