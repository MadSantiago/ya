package p000;

/* JADX INFO: renamed from: ۥۥٌؘۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C2768 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C0863 f9186 = new C0863(new C5326[16]);

    /* JADX INFO: renamed from: ۥۗ */
    public final C2730 f9185 = new C2730(10);

    /* JADX INFO: renamed from: ۥۗ */
    public void mo5170(C5470 c5470) {
        C0863 c0863 = this.f9186;
        int i = c0863.f3180;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((C5326) c0863.f3182[i]).f17580.f1179 == 0) {
                c0863.m1850(i);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public boolean mo5171(C0638 c0638, InterfaceC2015 interfaceC2015, C5470 c5470, boolean z) {
        C0863 c0863 = this.f9186;
        Object[] objArr = c0863.f3182;
        int i = c0863.f3180;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((C5326) objArr[i2]).mo5171(c0638, interfaceC2015, c5470, z) || z2;
        }
        return z2;
    }
}
