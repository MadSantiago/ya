package p000;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;

/* JADX INFO: renamed from: ۦٍٟٔؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4179 extends AbstractC1127 implements InterfaceC3275 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ int f13911;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C0193 f13912;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4179(C0193 c0193, int i) {
        super(4);
        this.f13912 = c0193;
        this.f13911 = i;
    }

    @Override // p000.InterfaceC3275
    /* JADX INFO: renamed from: ۦ۟ */
    public final Object mo1822(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        C0193 c0193 = this.f13912;
        C3121 c3121 = c0193.f720;
        ((AutofillManager) c3121.f10451).notifyViewEntered(c0193.f713, this.f13911, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return C2358.f7817;
    }
}
