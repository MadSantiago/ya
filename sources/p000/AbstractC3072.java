package p000;

/* JADX INFO: renamed from: ۦٍٟؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3072 extends AbstractC1605 {

    /* JADX INFO: renamed from: ۥٓ */
    public Object f10320;

    /* JADX INFO: renamed from: ۥۡ */
    public final void m5666(Object obj) {
        if (this.f10320 == null) {
            this.f10320 = obj;
            return;
        }
        throw new IllegalStateException(("Instance already set for this resolver \"" + getClass() + "\" of \"" + mo2502() + "(" + this.f10320 + ")\". To prevent problems, the instance object can only be set once in a resolver, otherwise use copy() to reuse the resolver.").toString());
    }

    /* JADX INFO: renamed from: ۦۧ */
    public abstract AbstractC3072 mo3716(Object obj);
}
