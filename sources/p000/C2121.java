package p000;

import android.view.ViewStructure;

/* JADX INFO: renamed from: ۥۗؖؕۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2121 extends AbstractC1127 implements InterfaceC3275 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ ViewStructure f6974;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2121(ViewStructure viewStructure) {
        super(4);
        this.f6974 = viewStructure;
    }

    @Override // p000.InterfaceC3275
    /* JADX INFO: renamed from: ۦ۟ */
    public final Object mo1822(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue() - iIntValue2;
        this.f6974.setDimens(iIntValue, iIntValue2, 0, 0, iIntValue3 - iIntValue, iIntValue4);
        return C2358.f7817;
    }
}
