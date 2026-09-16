package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۦٍّۖؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4907 implements Iterable {

    /* JADX INFO: renamed from: ۦۨ */
    public final String f16199;

    public C4907(String str) {
        this.f16199 = str;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C5739(this);
    }
}
