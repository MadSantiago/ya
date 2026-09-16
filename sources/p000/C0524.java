package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥًؖؓٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0524 extends AbstractC1193 {

    /* JADX INFO: renamed from: ۥؗ */
    public final List f1859;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f1860;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f1861;

    public C0524(int i, String str, List list) {
        this.f1861 = str;
        this.f1860 = i;
        this.f1859 = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1193) {
            C0524 c0524 = (C0524) ((AbstractC1193) obj);
            if (this.f1861.equals(c0524.f1861) && this.f1860 == c0524.f1860 && this.f1859.equals(c0524.f1859)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1859.hashCode() ^ ((((this.f1861.hashCode() ^ 1000003) * 1000003) ^ this.f1860) * 1000003);
    }

    public final String toString() {
        return "Thread{name=" + this.f1861 + ", importance=" + this.f1860 + ", frames=" + this.f1859 + "}";
    }
}
