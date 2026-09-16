package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۥۣؒؖؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0274 implements Iterator, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥْ */
    public boolean f977;

    /* JADX INFO: renamed from: ۥٓ */
    public int f978;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f979;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f980;

    public C0274(int i, int i2, int i3) {
        this.f980 = i3;
        this.f979 = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f977 = z;
        this.f978 = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f977;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i = this.f978;
        if (i != this.f979) {
            this.f978 = this.f980 + i;
            return i;
        }
        if (this.f977) {
            this.f977 = false;
            return i;
        }
        C0178.m381();
        return 0;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
