package p000;

import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: renamed from: ۥؙؕۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0737 extends AbstractC1127 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C4855 f2679;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f2680;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0737(C4855 c4855, int i) {
        super(0);
        this.f2680 = i;
        this.f2679 = c4855;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f2680;
        C2358 c2358 = C2358.f7817;
        C4855 c4855 = this.f2679;
        switch (i) {
            case 0:
                c4855.getLayoutNode().m1319();
                return c2358;
            case 1:
                if (c4855.f8396 && c4855.isAttachedToWindow() && c4855.getView().getParent() == c4855) {
                    C1775 snapshotObserver = c4855.getSnapshotObserver();
                    snapshotObserver.f5926.m9077(c4855, C1931.f6359, c4855.getUpdate());
                }
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                c4855.f15979.saveHierarchyState(sparseArray);
                return sparseArray;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                c4855.getReleaseBlock().mo211(c4855.f15979);
                c4855.m8220();
                return c2358;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                c4855.getResetBlock().mo211(c4855.f15979);
                return c2358;
            default:
                c4855.getUpdateBlock().mo211(c4855.f15979);
                return c2358;
        }
    }
}
