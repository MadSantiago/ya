package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۥؘ۠ؕؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2528 implements Iterator {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Iterator f8369;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ Iterator f8370;

    public C2528(C1173 c1173, Iterator it, Iterator it2) {
        this.f8370 = it;
        this.f8369 = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8370.hasNext()) {
            return true;
        }
        return this.f8369.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f8370;
        if (it.hasNext()) {
            return new C2485(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f8369;
        if (it2.hasNext()) {
            return new C2485((String) it2.next());
        }
        C0178.m381();
        return null;
    }
}
