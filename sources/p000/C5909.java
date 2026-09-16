package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: ۦًۨٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5909 extends AbstractC0001 implements Set, Collection, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥٓ */
    public static final C5909 f19493;

    /* JADX INFO: renamed from: ۥْ */
    public final C0588 f19494;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f19495;

    /* JADX INFO: renamed from: ۦۨ */
    public final Object f19496;

    static {
        C0373 c0373 = C0373.f1371;
        f19493 = new C5909(c0373, c0373, C0588.f2191);
    }

    public C5909(Object obj, Object obj2, C0588 c0588) {
        this.f19496 = obj;
        this.f19495 = obj2;
        this.f19494 = c0588;
    }

    @Override // p000.AbstractC0096, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f19494.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0754(this.f19496, this.f19494);
    }

    @Override // p000.AbstractC0096
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo624() {
        return this.f19494.f2192;
    }
}
