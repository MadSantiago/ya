package p000;

/* JADX INFO: renamed from: ۦّٟؔۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4032 implements InterfaceC1652 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C1571 f13454;

    public C4032(C1571 c1571) {
        this.f13454 = c1571;
    }

    @Override // p000.InterfaceC1652
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo3440(C2711 c2711, C5008 c5008) {
        C5728 c5728 = (C5728) c2711.f8985;
        C0220 c0220 = AbstractC0487.f1776;
        Object obj = Boolean.FALSE;
        Object obj2 = c5008.f16580.get(c0220);
        if (obj2 != null) {
            obj = obj2;
        }
        return new C4651(c5728, this.f13454, ((Boolean) obj).booleanValue());
    }
}
