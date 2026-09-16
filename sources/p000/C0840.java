package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۥًؙؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0840 extends AbstractC5673 implements Iterator {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ int f3001;

    /* JADX INFO: renamed from: ۦ۟ */
    public C2985 f3002;

    /* JADX INFO: renamed from: ۦۨ */
    public C2985 f3003;

    public C0840(C2985 c2985, C2985 c2986, int i) {
        this.f3001 = i;
        this.f3003 = c2986;
        this.f3002 = c2985;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3002 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2985 c2985 = this.f3002;
        C2985 c2986 = this.f3003;
        this.f3002 = (c2985 == c2986 || c2986 == null) ? null : m1751(c2985);
        return c2985;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C2985 m1751(C2985 c2985) {
        switch (this.f3001) {
            case 0:
                return c2985.f10037;
            default:
                return c2985.f10038;
        }
    }

    @Override // p000.AbstractC5673
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1752(C2985 c2985) {
        C2985 c2986;
        C2985 c2987 = this.f3003;
        C2985 c2985M1751 = null;
        if (c2987 == c2985 && c2985 == this.f3002) {
            this.f3002 = null;
            this.f3003 = null;
            c2987 = null;
        }
        C2985 c2988 = c2987;
        if (c2987 == c2985) {
            switch (this.f3001) {
                case 0:
                    c2986 = c2987.f10038;
                    break;
                default:
                    c2986 = c2987.f10037;
                    break;
            }
            c2988 = c2986;
            this.f3003 = c2988;
        }
        C2985 c2989 = this.f3002;
        if (c2989 == c2985) {
            if (c2989 != c2988 && c2988 != null) {
                c2985M1751 = m1751(c2989);
            }
            this.f3002 = c2985M1751;
        }
    }
}
