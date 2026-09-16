package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۥْؑٙۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1190 implements Iterator {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ Iterator f4099;

    public C1190(Iterator it) {
        this.f4099 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4099.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new C2485((String) this.f4099.next());
    }
}
