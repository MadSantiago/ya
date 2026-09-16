package p000;

import android.content.Context;

/* JADX INFO: renamed from: ۥًِٛؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1764 implements InterfaceC5641 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final C3121 f5874;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f5875;

    public /* synthetic */ C1764(C3121 c3121, int i) {
        this.f5875 = i;
        this.f5874 = c3121;
    }

    @Override // p000.InterfaceC4895
    public final Object get() {
        int i = this.f5875;
        C3121 c3121 = this.f5874;
        switch (i) {
            case 0:
                return new C2352((InterfaceC2090) c3121.f10451);
            case 1:
                C0377 c0377 = (C0377) c3121.f10451;
                C4802 c4802 = C4802.f15841;
                return C4802.m8180(c0377);
            default:
                return new C2267((Context) c3121.f10451);
        }
    }
}
