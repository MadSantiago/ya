package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۦۦؗۤۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5790 implements Iterable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C1829 f19082;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ String f19083;

    public C5790(C1829 c1829, String str) {
        this.f19082 = c1829;
        this.f19083 = str;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1829 c1829 = this.f19082;
        C1039 c1039 = (C1039) c1829.f6064;
        c1039.getClass();
        return new C3903(c1039, c1829, this.f19083);
    }

    public final String toString() {
        C5536 c5536 = new C5536(1, ", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        c5536.m9212(sb, iterator());
        sb.append(']');
        return sb.toString();
    }
}
