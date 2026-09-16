package p000;

/* JADX INFO: renamed from: ۥؙۛؕۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2327 extends AbstractC0219 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f7701;

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean f7702;

    public C2327(Object obj) {
        super(0);
        this.f7701 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f7702;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f7702) {
            C0178.m381();
            return null;
        }
        this.f7702 = true;
        return this.f7701;
    }
}
