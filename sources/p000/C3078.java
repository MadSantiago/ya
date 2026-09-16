package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۦؑۦۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3078 implements InterfaceC3862, Iterable, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥْ */
    public final C3634 f10328;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f10329;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2575 f10330;

    public C3078(C2575 c2575, int i, AbstractC5020 abstractC5020, C3634 c3634) {
        this.f10330 = c2575;
        this.f10329 = i;
        this.f10328 = c3634;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3078)) {
            return false;
        }
        C3078 c3078 = (C3078) obj;
        return c3078.f10329 == this.f10329 && c3078.f10330 == this.f10330 && c3078.f10328.equals(this.f10328);
    }

    public final int hashCode() {
        return this.f10328.hashCode() + ((this.f10330.hashCode() + (this.f10329 * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2960(this.f10330, this.f10329, null, this.f10328);
    }
}
